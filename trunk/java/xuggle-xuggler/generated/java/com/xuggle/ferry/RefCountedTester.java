/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.37
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.ferry;

/**
 * This object exists in order for the ferry test  
 * libraries to test the memory management functionality  
 * of the RefCounted class from Java.  
 * It is NOT part of the public API.  
 */
public class RefCountedTester extends RefCounted {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  protected RefCountedTester(long cPtr, boolean cMemoryOwn) {
    super(FerryJNI.SWIGRefCountedTesterUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(RefCountedTester obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new RefCountedTester object that is actually referring to the
   * exact same underlying Native object.
   *
   * This method increases the ref count of the underlying Native object.
   *
   * @return the new Java object.
   */
  public RefCountedTester copyReference() {
    if (swigCPtr == 0)
      return null;
    else
    {
      RefCountedTester retval = new RefCountedTester(swigCPtr, false);
      retval.acquire();
      return retval;
    }
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof RefCountedTester)
      equal = (((RefCountedTester)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      throw new UnsupportedOperationException("C++ destructor does not have public access");
    }
    swigCPtr = 0;
    super.delete();
  }

  public static RefCountedTester make() {
    long cPtr = FerryJNI.RefCountedTester_make__SWIG_0();
    return (cPtr == 0) ? null : new RefCountedTester(cPtr, false);
  }

/**
 * Acquires a reference to a passed in object,  
 * and returns the new object. This, when wrapped  
 * by Swig, will be wrapped in a new Java object.  
 */
  public static RefCountedTester make(RefCountedTester objToAcquire) {
    long cPtr = FerryJNI.RefCountedTester_make__SWIG_1(RefCountedTester.getCPtr(objToAcquire), objToAcquire);
    return (cPtr == 0) ? null : new RefCountedTester(cPtr, false);
  }

}