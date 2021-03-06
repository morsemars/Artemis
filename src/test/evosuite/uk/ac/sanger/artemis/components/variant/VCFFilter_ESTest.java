/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 20:41:07 GMT 2018
 */

package uk.ac.sanger.artemis.components.variant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.awt.datatransfer.Clipboard;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.components.variant.AbstractVCFReader;
import uk.ac.sanger.artemis.components.variant.VCFFilter;
import uk.ac.sanger.artemis.components.variant.VCFRecord;
import uk.ac.sanger.artemis.components.variant.VCFview;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class VCFFilter_ESTest extends VCFFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      VCFRecord vCFRecord0 = new VCFRecord();
      Clipboard clipboard0 = new Clipboard("DIVISION");
      Selection selection0 = new Selection(clipboard0);
      FeatureVector featureVector0 = selection0.getAllFeatures();
      boolean boolean0 = VCFFilter.passFilter(hashMap0, vCFRecord0, (AbstractVCFReader) null, featureVector0, 128, 128, 128);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Hashtable<String, Boolean> hashtable0 = new Hashtable<String, Boolean>();
      VCFRecord vCFRecord0 = new VCFRecord();
      FeatureVector featureVector0 = new FeatureVector();
      // Undeclared exception!
      try { 
        VCFFilter.passFilter(hashtable0, vCFRecord0, (AbstractVCFReader) null, featureVector0, 2349, (-1), 154);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      // Undeclared exception!
      try { 
        VCFFilter.checkManualHash((Map<String, Boolean>) null, vCFRecord0, 224, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      Boolean boolean0 = Boolean.valueOf("");
      hashMap0.put("", boolean0);
      // Undeclared exception!
      try { 
        VCFFilter.checkManualHash(hashMap0, (VCFRecord) null, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.VCFFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      VCFview vCFview0 = mock(VCFview.class, new ViolatedAssumptionAnswer());
      VCFFilter vCFFilter0 = null;
      try {
        vCFFilter0 = new VCFFilter(vCFview0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Hashtable<String, Boolean> hashtable0 = new Hashtable<String, Boolean>();
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setFilter("\u2318+\u2325+\u2325");
      // Undeclared exception!
      try { 
        VCFFilter.setFilterString(hashtable0, vCFRecord0, (VCFview) null, 48, (FeatureVector) null, (AbstractVCFReader) null, 3581);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.FilteredPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VCFRecord vCFRecord0 = new VCFRecord();
      vCFRecord0.setFilter("\u2318");
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>(48);
      // Undeclared exception!
      try { 
        VCFFilter.passFilter(hashMap0, vCFRecord0, (AbstractVCFReader) null, (FeatureVector) null, (-2061584288), (-417), 'l');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.FilteredPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Hashtable<String, Boolean> hashtable0 = new Hashtable<String, Boolean>();
      VCFRecord vCFRecord0 = new VCFRecord();
      FeatureVector featureVector0 = new FeatureVector();
      boolean boolean0 = VCFFilter.passFilter(hashtable0, vCFRecord0, (AbstractVCFReader) null, featureVector0, 2349, 0, 154);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Hashtable<String, Boolean> hashtable0 = new Hashtable<String, Boolean>();
      VCFRecord vCFRecord0 = new VCFRecord();
      Boolean boolean0 = new Boolean("S[AK@");
      hashtable0.put("S[AK@", boolean0);
      int int0 = VCFFilter.checkManualHash(hashtable0, vCFRecord0, 1001);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Hashtable<String, Boolean> hashtable0 = new Hashtable<String, Boolean>();
      VCFRecord vCFRecord0 = new VCFRecord();
      int int0 = VCFFilter.checkManualHash(hashtable0, vCFRecord0, 1634, true);
      assertEquals(0, int0);
  }
}
