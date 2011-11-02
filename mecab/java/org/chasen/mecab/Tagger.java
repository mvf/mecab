/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.chasen.mecab;

public class Tagger {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Tagger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Tagger obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MeCabJNI.delete_Tagger(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static boolean parse(Model model, Lattice lattice) {
    return MeCabJNI.Tagger_parse__SWIG_0(Model.getCPtr(model), model, Lattice.getCPtr(lattice), lattice);
  }

  public boolean parse(Lattice lattice) {
    return MeCabJNI.Tagger_parse__SWIG_1(swigCPtr, this, Lattice.getCPtr(lattice), lattice);
  }

  public boolean parse(String str, Lattice lattice) {
    return MeCabJNI.Tagger_parse__SWIG_2(swigCPtr, this, str, Lattice.getCPtr(lattice), lattice);
  }

  public boolean parse(String str, long len, Lattice lattice) {
    return MeCabJNI.Tagger_parse__SWIG_3(swigCPtr, this, str, len, Lattice.getCPtr(lattice), lattice);
  }

  public String parse(String str) {
    return MeCabJNI.Tagger_parse__SWIG_4(swigCPtr, this, str);
  }

  public Node parseToNode(String str) {
    long cPtr = MeCabJNI.Tagger_parseToNode(swigCPtr, this, str);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public String parseNBest(long N, String str) {
    return MeCabJNI.Tagger_parseNBest(swigCPtr, this, N, str);
  }

  public boolean parseNBestInit(String str) {
    return MeCabJNI.Tagger_parseNBestInit(swigCPtr, this, str);
  }

  public Node nextNode() {
    long cPtr = MeCabJNI.Tagger_nextNode(swigCPtr, this);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public String next() {
    return MeCabJNI.Tagger_next(swigCPtr, this);
  }

  public String formatNode(Node node) {
    return MeCabJNI.Tagger_formatNode(swigCPtr, this, Node.getCPtr(node), node);
  }

  public void set_request_type(int request_type) {
    MeCabJNI.Tagger_set_request_type(swigCPtr, this, request_type);
  }

  public int request_type() {
    return MeCabJNI.Tagger_request_type(swigCPtr, this);
  }

  public boolean partial() {
    return MeCabJNI.Tagger_partial(swigCPtr, this);
  }

  public void set_partial(boolean partial) {
    MeCabJNI.Tagger_set_partial(swigCPtr, this, partial);
  }

  public int lattice_level() {
    return MeCabJNI.Tagger_lattice_level(swigCPtr, this);
  }

  public void set_lattice_level(int level) {
    MeCabJNI.Tagger_set_lattice_level(swigCPtr, this, level);
  }

  public boolean all_morphs() {
    return MeCabJNI.Tagger_all_morphs(swigCPtr, this);
  }

  public void set_all_morphs(boolean all_morphs) {
    MeCabJNI.Tagger_set_all_morphs(swigCPtr, this, all_morphs);
  }

  public float theta() {
    return MeCabJNI.Tagger_theta(swigCPtr, this);
  }

  public void set_theta(float theta) {
    MeCabJNI.Tagger_set_theta(swigCPtr, this, theta);
  }

  public DictionaryInfo dictionary_info() {
    long cPtr = MeCabJNI.Tagger_dictionary_info(swigCPtr, this);
    return (cPtr == 0) ? null : new DictionaryInfo(cPtr, false);
  }

  public String what() {
    return MeCabJNI.Tagger_what(swigCPtr, this);
  }

  public static Tagger create(int argc, SWIGTYPE_p_p_char argv) {
    long cPtr = MeCabJNI.Tagger_create__SWIG_0(argc, SWIGTYPE_p_p_char.getCPtr(argv));
    return (cPtr == 0) ? null : new Tagger(cPtr, false);
  }

  public static Tagger create(String arg) {
    long cPtr = MeCabJNI.Tagger_create__SWIG_1(arg);
    return (cPtr == 0) ? null : new Tagger(cPtr, false);
  }

  public static String version() {
    return MeCabJNI.Tagger_version();
  }

  public Tagger(String argc) {
    this(MeCabJNI.new_Tagger__SWIG_0(argc), true);
  }

  public Tagger() {
    this(MeCabJNI.new_Tagger__SWIG_1(), true);
  }

  public String parseToString(String str, long length) {
    return MeCabJNI.Tagger_parseToString__SWIG_0(swigCPtr, this, str, length);
  }

  public String parseToString(String str) {
    return MeCabJNI.Tagger_parseToString__SWIG_1(swigCPtr, this, str);
  }

}
