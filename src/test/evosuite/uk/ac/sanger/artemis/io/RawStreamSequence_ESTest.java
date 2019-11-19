/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 18:44:09 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PipedReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.batik.gvt.text.GVTAttributedCharacterIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.EmblStreamSequence;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.io.PartialSequence;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.io.RangeVector;
import uk.ac.sanger.artemis.io.RawStreamSequence;
import uk.ac.sanger.artemis.io.StreamSequence;
import uk.ac.sanger.artemis.util.LinePushBackReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class RawStreamSequence_ESTest extends RawStreamSequence_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(linePushBackReader0);
      char[] charArray0 = new char[1];
      rawStreamSequence0.setFromChar(charArray0);
      RangeVector rangeVector0 = new RangeVector();
      rawStreamSequence0.setFastaHeaderPositionsOnReverseComplement(rangeVector0);
      assertEquals(1, rawStreamSequence0.getOtherCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(linePushBackReader0);
      String[] stringArray0 = rawStreamSequence0.getFastaHeaderStrings();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("IH:\"uCSx1YB", "IH:\"uCSx1YB");
      String[] stringArray0 = fastaStreamSequence0.getFastaHeaderStrings();
      assertEquals(0, stringArray0.length);
      assertEquals(11, fastaStreamSequence0.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(linePushBackReader0);
      int[] intArray0 = new int[3];
      intArray0[0] = (-2);
      int[] intArray1 = rawStreamSequence0.getFastaHeaderPositions();
      // Undeclared exception!
      try { 
        rawStreamSequence0.setFastaHeaderPosition(intArray0, intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("uk.ac.sanger.artemis.io.RawStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("6v^?Te>VaN1&w3R1", "6v^?Te>VaN1&w3R1");
      // Undeclared exception!
      try { 
        fastaStreamSequence0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RawStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = null;
      try {
        rawStreamSequence0 = new RawStreamSequence((LinePushBackReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RawStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(pipedReader0);
      RawStreamSequence rawStreamSequence0 = null;
      try {
        rawStreamSequence0 = new RawStreamSequence(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[2];
      Short short0 = new Short((short)1447);
      Integer integer0 = GVTAttributedCharacterIterator.TextAttribute.WRITING_MODE_LTR;
      PartialSequence partialSequence0 = new PartialSequence(charArray0, (-2118), 0, short0, integer0);
      RawStreamSequence rawStreamSequence0 = null;
      try {
        rawStreamSequence0 = new RawStreamSequence(partialSequence0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.PartialSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = null;
      try {
        rawStreamSequence0 = new RawStreamSequence((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RawStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("~*");
      RawStreamSequence rawStreamSequence0 = null;
      try {
        rawStreamSequence0 = new RawStreamSequence(fastaStreamSequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RawStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(linePushBackReader0);
      RangeVector rangeVector0 = new RangeVector();
      rangeVector0.add((Range) null);
      // Undeclared exception!
      try { 
        rawStreamSequence0.setFastaHeaderPositionsOnReverseComplement(rangeVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RawStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\n");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(linePushBackReader0);
      RangeVector rangeVector0 = new RangeVector();
      rawStreamSequence0.setFastaHeaderPositionsOnReverseComplement(rangeVector0);
      assertEquals(0, rawStreamSequence0.getOtherCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("IH:\"uCSx1YB", "IH:\"uCSx1YB");
      Range range0 = new Range(1351, 5000);
      RangeVector rangeVector0 = new RangeVector(range0);
      fastaStreamSequence0.setFastaHeaderPositionsOnReverseComplement(rangeVector0);
      assertEquals(11, fastaStreamSequence0.length());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(linePushBackReader0);
      int[] intArray0 = new int[3];
      int[] intArray1 = rawStreamSequence0.getFastaHeaderPositions();
      rawStreamSequence0.setFastaHeaderPosition(intArray0, intArray1);
      assertArrayEquals(new int[] {0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence("tNCHg7(vN+M;{E~n");
      int[] intArray0 = new int[1];
      rawStreamSequence0.setFastaHeaderPosition((int[]) null, intArray0);
      assertEquals(1, rawStreamSequence0.getTCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(linePushBackReader0);
      int[] intArray0 = new int[3];
      rawStreamSequence0.setFastaHeaderPosition(intArray0, intArray0);
      assertEquals(0, rawStreamSequence0.getACount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(linePushBackReader0);
      char[] charArray0 = new char[1];
      rawStreamSequence0.setFromChar(charArray0);
      // Undeclared exception!
      try { 
        rawStreamSequence0.writeToStream((Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.RawStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("cG)cwoM*19");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(bufferedReader0);
      linePushBackReader0.pushBack("cG)cwoM*19");
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence(linePushBackReader0);
      assertEquals(1, linePushBackReader0.getLineNumber());
      assertEquals(0, fastaStreamSequence0.length());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("cG)cwoM*19");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(bufferedReader0);
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence(linePushBackReader0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("cG)cwoM*19");
      fastaStreamSequence0.writeToStream(mockPrintWriter0);
      assertEquals(0, fastaStreamSequence0.getCCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\n");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(linePushBackReader0);
      int[] intArray0 = new int[3];
      int[] intArray1 = rawStreamSequence0.getFastaHeaderPositions();
      rawStreamSequence0.setFastaHeaderPosition(intArray0, intArray1);
      assertEquals(0, rawStreamSequence0.getCCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("lWn<8");
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(emblStreamSequence0);
      StringWriter stringWriter0 = new StringWriter();
      rawStreamSequence0.writeToStream(stringWriter0);
      assertEquals("nnnnnn\n", stringWriter0.toString());
      assertEquals(6, rawStreamSequence0.getOtherCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(linePushBackReader0);
      StreamSequence streamSequence0 = rawStreamSequence0.copy();
      assertEquals(0, streamSequence0.getOtherCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(linePushBackReader0);
      rawStreamSequence0.readHeader(linePushBackReader0);
      assertEquals(3, rawStreamSequence0.getFormatType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      RawStreamSequence rawStreamSequence0 = new RawStreamSequence(linePushBackReader0);
      int int0 = rawStreamSequence0.getFormatType();
      assertEquals(3, int0);
  }
}