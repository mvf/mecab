/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace MeCab {

using System;
using System.Runtime.InteropServices;

public class DictionaryInfo : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal DictionaryInfo(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(DictionaryInfo obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~DictionaryInfo() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          MeCabPINVOKE.delete_DictionaryInfo(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public string filename {
    get {
      string ret = MeCabPINVOKE.DictionaryInfo_filename_get(swigCPtr);
      if (MeCabPINVOKE.SWIGPendingException.Pending) throw MeCabPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public string charset {
    get {
      string ret = MeCabPINVOKE.DictionaryInfo_charset_get(swigCPtr);
      if (MeCabPINVOKE.SWIGPendingException.Pending) throw MeCabPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public uint size {
    get {
      uint ret = MeCabPINVOKE.DictionaryInfo_size_get(swigCPtr);
      if (MeCabPINVOKE.SWIGPendingException.Pending) throw MeCabPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public int type {
    get {
      int ret = MeCabPINVOKE.DictionaryInfo_type_get(swigCPtr);
      if (MeCabPINVOKE.SWIGPendingException.Pending) throw MeCabPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public uint lsize {
    get {
      uint ret = MeCabPINVOKE.DictionaryInfo_lsize_get(swigCPtr);
      if (MeCabPINVOKE.SWIGPendingException.Pending) throw MeCabPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public uint rsize {
    get {
      uint ret = MeCabPINVOKE.DictionaryInfo_rsize_get(swigCPtr);
      if (MeCabPINVOKE.SWIGPendingException.Pending) throw MeCabPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public ushort version {
    get {
      ushort ret = MeCabPINVOKE.DictionaryInfo_version_get(swigCPtr);
      if (MeCabPINVOKE.SWIGPendingException.Pending) throw MeCabPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public DictionaryInfo next {
    get {
      IntPtr cPtr = MeCabPINVOKE.DictionaryInfo_next_get(swigCPtr);
      DictionaryInfo ret = (cPtr == IntPtr.Zero) ? null : new DictionaryInfo(cPtr, false);
      if (MeCabPINVOKE.SWIGPendingException.Pending) throw MeCabPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public DictionaryInfo() : this(MeCabPINVOKE.new_DictionaryInfo(), true) {
    if (MeCabPINVOKE.SWIGPendingException.Pending) throw MeCabPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
