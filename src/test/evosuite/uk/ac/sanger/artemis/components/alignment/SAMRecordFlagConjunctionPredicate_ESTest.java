/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:19:55 GMT 2018
 */

package uk.ac.sanger.artemis.components.alignment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import htsjdk.samtools.SAMRecord;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.alignment.SAMRecordFlagConjunctionPredicate;
import uk.ac.sanger.artemis.components.alignment.SAMRecordPredicate;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class SAMRecordFlagConjunctionPredicate_ESTest extends SAMRecordFlagConjunctionPredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SAMRecordFlagConjunctionPredicate sAMRecordFlagConjunctionPredicate0 = new SAMRecordFlagConjunctionPredicate((Vector<SAMRecordPredicate>) null, 19);
      SAMRecordFlagConjunctionPredicate sAMRecordFlagConjunctionPredicate1 = new SAMRecordFlagConjunctionPredicate(sAMRecordFlagConjunctionPredicate0, sAMRecordFlagConjunctionPredicate0, 19);
      SAMRecord sAMRecord0 = mock(SAMRecord.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        sAMRecordFlagConjunctionPredicate1.testPredicate(sAMRecord0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.SAMRecordFlagConjunctionPredicate", e);
      }
  }
}