//  MeCab -- Yet Another Part-of-Speech and Morphological Analyzer
//
//
//  Copyright(C) 2001-2011 Taku Kudo <taku@chasen.org>
//  Copyright(C) 2004-2006 Nippon Telegraph and Telephone Corporation
#ifndef MECAB_TOKENIZER_H_
#define MECAB_TOKENIZER_H_

#include "mecab.h"
#include "freelist.h"
#include "dictionary.h"
#include "char_property.h"
#include "scoped_ptr.h"

namespace MeCab {

class Param;

template <typename N, typename P>
class Allocator {
 public:
  N *newNode() {
    N *node = node_freelist_->alloc();
    std::memset(node, 0, sizeof(N));
    node->id = id_++;
    return node;
  }

  P *newPath() {
    if (!path_freelist_.get()) {
      // lazy evaluation
      path_freelist_.reset(new FreeList<P>(PATH_FREELIST_SIZE));
    }
    return path_freelist_->alloc();
  }

  Dictionary::result_type *mutable_results() {
    return results_.get();
  }

  size_t results_size() const {
    return kResultsSize;
  }

  void free() {
    id_ = 0;
    node_freelist_->free();
    if (path_freelist_.get()) {
      path_freelist_->free();
    }
  }

  Allocator()
      : id_(0),
        node_freelist_(new FreeList<N>(NODE_FREELIST_SIZE)),
        path_freelist_(0),
        results_(new Dictionary::result_type[kResultsSize]) {}
  virtual ~Allocator() {}

 private:
  static const size_t kResultsSize = 512;
  size_t id_;
  scoped_ptr<FreeList<N> > node_freelist_;
  scoped_ptr<FreeList<P> > path_freelist_;
  scoped_array<Dictionary::result_type>  results_;
};

template <typename N, typename P>
class Tokenizer {
 private:
  std::vector<Dictionary *>              dic_;
  Dictionary                             unkdic_;
  scoped_string                          bos_feature_;
  scoped_string                          unk_feature_;
  FreeList<DictionaryInfo>               dictionary_info_freelist_;
  std::vector<std::pair<const Token *, size_t> > unk_tokens_;
  DictionaryInfo                        *dictionary_info_;
  CharInfo                               space_;
  CharProperty                           property_;
  size_t                                 max_grouping_size_;
  whatlog                                what_;

 public:
  N *getBOSNode(Allocator<N, P> *allocator) const;
  N *getEOSNode(Allocator<N, P> *allocator) const;
  N *lookup(const char *begin, const char *end,
            Allocator<N, P> *allocator) const;

  bool open(const Param &param);
  void close();

  const DictionaryInfo *dictionary_info() const;

  const char *what() { return what_.str(); }

  explicit Tokenizer();
  virtual ~Tokenizer() { this->close(); }
};
}
#endif  // MECAB_TOKENIZER_H_
