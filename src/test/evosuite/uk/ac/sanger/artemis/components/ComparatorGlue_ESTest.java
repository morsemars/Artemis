/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 19:04:25 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.EntryGroup;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.components.AlignmentViewer;
import uk.ac.sanger.artemis.components.ComparatorGlue;
import uk.ac.sanger.artemis.components.FeatureDisplay;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ComparatorGlue_ESTest extends ComparatorGlue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntryGroup entryGroup0 = mock(EntryGroup.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(entryGroup0).toString();
      Selection selection0 = mock(Selection.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(selection0).toString();
      FeatureDisplay featureDisplay0 = mock(FeatureDisplay.class, new ViolatedAssumptionAnswer());
      doReturn("};urTE? na6AAV", "", (String) null, (String) null).when(featureDisplay0).toString();
      doReturn(entryGroup0, (EntryGroup) null).when(featureDisplay0).getEntryGroup();
      doReturn(selection0, (Selection) null).when(featureDisplay0).getSelection();
      AlignmentViewer alignmentViewer0 = mock(AlignmentViewer.class, new ViolatedAssumptionAnswer());
      JFrame jFrame0 = mock(JFrame.class, new ViolatedAssumptionAnswer());
      ComparatorGlue comparatorGlue0 = null;
      try {
        comparatorGlue0 = new ComparatorGlue(jFrame0, featureDisplay0, featureDisplay0, alignmentViewer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.ComparatorGlue", e);
      }
  }
}