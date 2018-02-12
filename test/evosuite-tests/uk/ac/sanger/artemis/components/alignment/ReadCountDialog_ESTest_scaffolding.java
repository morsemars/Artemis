/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 12 11:27:02 GMT 2018
 */

package uk.ac.sanger.artemis.components.alignment;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ReadCountDialog_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.alignment.ReadCountDialog"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/London"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ReadCountDialog_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.components.LogViewer$1",
      "org.biojava.bio.seq.AcceptNoneFilter",
      "org.biojava.bio.seq.io.SymbolTokenization$TokenType",
      "org.biojava.bio.seq.ByHierarchy",
      "org.apache.log4j.AppenderSkeleton",
      "uk.ac.sanger.artemis.OptionChangeEvent",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox",
      "org.biojava.utils.stax.SAX2StAXAdaptor",
      "uk.ac.sanger.artemis.components.ListSelectionPanel",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.plot.CodonUsageAlgorithm",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "org.biojava.utils.ListTools$Triplet",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "org.biojava.bio.symbol.DoubleAlphabet$SubDoubleAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$AlphabetHandler$1",
      "uk.ac.sanger.artemis.Selectable",
      "org.biojava.bio.seq.io.NameTokenization",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "htsjdk.variant.vcf.VCFIDHeaderLine",
      "org.biojava.bio.seq.FramedFeature$ReadingFrame",
      "uk.ac.sanger.artemis.plot.NcAlgorithm",
      "org.biojava.bio.seq.io.CharacterTokenization",
      "org.biojava.bio.seq.homol.SimilarityPairFeature$EmptyPairwiseAlignment",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.util.StringVector",
      "org.emboss.jemboss.JembossParams",
      "org.biojava.bio.seq.Feature$Template",
      "htsjdk.samtools.AbstractSAMHeaderRecord",
      "uk.ac.sanger.artemis.plot.CumulativeATSkewAlgorithm",
      "org.biojava.bio.symbol.SimpleAlphabet",
      "uk.ac.sanger.artemis.components.genebuilder.gff.RemoveButton",
      "uk.ac.sanger.artemis.components.genebuilder.gff.PropertiesPanel",
      "org.apache.log4j.Hierarchy",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "org.emboss.jemboss.gui.Browser$3",
      "org.emboss.jemboss.gui.Browser$4",
      "org.biojava.utils.Changeable",
      "uk.ac.sanger.artemis.plot.GCFrameAlgorithm",
      "org.emboss.jemboss.gui.Browser$6",
      "uk.ac.sanger.artemis.components.genebuilder.ReferencesPanel",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "org.apache.log4j.spi.OptionHandler",
      "org.biojava.bio.symbol.SimpleManyToOneTranslationTable",
      "org.biojava.utils.stax.DelegationManager",
      "uk.ac.sanger.artemis.plot.PositionalAsymmetryAlgorithm",
      "org.biojava.bio.seq.StrandedFeature",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "org.biojava.utils.lsid.LifeScienceIdentifier",
      "org.biojava.utils.ChangeVetoException",
      "org.biojava.bio.symbol.IllegalAlphabetException",
      "org.biojava.bio.symbol.DoubleAlphabet$DoubleRange",
      "uk.ac.sanger.artemis.components.Splash$2",
      "org.biojava.bio.symbol.AbstractTranslationTable",
      "org.gmod.schema.dao.GeneralDaoI",
      "org.gmod.schema.dao.BaseDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "org.biojava.bio.seq.SimpleFeatureRealizer$TemplateImpl",
      "org.biojava.bio.symbol.Edit",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "uk.ac.sanger.artemis.editor.MultiLineToolTipUI",
      "uk.ac.sanger.artemis.io.LazyQualifierValue",
      "uk.ac.sanger.artemis.components.FeatureDisplay$11",
      "org.biojava.bio.symbol.AbstractSymbol",
      "org.biojava.utils.bytecode.CodeGenerator",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "org.biojava.utils.bytecode.CodeMethod",
      "org.biojava.bio.seq.impl.FeatureImpl$1",
      "uk.ac.sanger.artemis.components.genebuilder.cv.CVPanel",
      "org.biojava.bio.Annotation",
      "org.biojava.bio.symbol.IntegerAlphabet$IntegerSymbol",
      "org.biojava.utils.lsid.LifeScienceIdentifierParseException",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$CharacterTokenizationHandler",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "org.biojava.utils.ListTools$Mapper",
      "htsjdk.samtools.SAMException",
      "org.biojava.bio.seq.io.StreamParser",
      "uk.ac.sanger.artemis.util.FastVector",
      "org.biojava.bio.symbol.SimpleSymbol",
      "org.apache.log4j.helpers.ThreadLocalMap",
      "org.biojava.bio.symbol.AbstractSimpleBasisSymbol",
      "org.biojava.utils.ChangeEvent",
      "uk.ac.sanger.artemis.components.variant.AbstractVCFReader",
      "org.gmod.schema.pub.Pub",
      "uk.ac.sanger.artemis.io.ChadoCanonicalGene",
      "org.biojava.utils.stax.SAX2StAXAdaptor$S2SDelegationManager",
      "org.biojava.bio.molbio.RestrictionMapper",
      "uk.ac.sanger.artemis.io.IndexedGFFDocumentEntry$IndexContig",
      "org.biojava.bio.symbol.SimpleCrossProductAlphabet",
      "uk.ac.sanger.artemis.components.Plot",
      "org.biojava.bio.seq.DNATools",
      "org.biojava.bio.symbol.AbstractManyToOneTranslationTable",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "uk.ac.sanger.artemis.components.SegmentBorder",
      "uk.ac.sanger.artemis.plot.CodonUsageWeight",
      "org.biojava.bio.molbio.RestrictionEnzyme",
      "org.biojava.bio.BioRuntimeException",
      "org.biojava.bio.seq.AcceptAllFilter",
      "org.apache.log4j.HTMLLayout",
      "org.biojava.bio.symbol.IntegerAlphabet$SubIntegerAlphabet",
      "org.biojava.bio.seq.homol.SimilarityPairFeature",
      "uk.ac.sanger.artemis.plot.KarlinSigAlgorithm",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "uk.ac.sanger.artemis.plot.EntropyAlgorithm",
      "htsjdk.samtools.SAMSequenceDictionary",
      "org.apache.log4j.spi.AppenderAttachable",
      "uk.ac.sanger.artemis.j2ssh.FTProgress",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "uk.ac.sanger.artemis.util.PushBackException",
      "uk.ac.sanger.artemis.components.FeatureDisplay$12",
      "org.biojava.utils.ParseErrorListener",
      "org.biojava.utils.SingletonList",
      "org.biojava.bio.symbol.SymbolList",
      "org.biojava.bio.BioException",
      "uk.ac.sanger.artemis.plot.CodonUsageFormatException",
      "org.biojava.bio.seq.FramedFeature$Template",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.plot.Codon12CorrelationAlgorithm",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "org.biojava.utils.ChangeType$1",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAlphabet",
      "org.biojava.bio.seq.io.AbstractGenEmblFileFormer",
      "htsjdk.variant.vcf.VCFCompoundHeaderLine",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.SelectionChangeEvent",
      "uk.ac.sanger.artemis.plot.BaseAlgorithm",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.Options",
      "org.biojava.bio.seq.impl.SimpleHomologyFeature",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "htsjdk.variant.vcf.VCFSimpleHeaderLine",
      "org.biojava.bio.symbol.BasisSymbol",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "org.biojava.bio.seq.RNATools",
      "uk.ac.sanger.artemis.plot.ATDeviationAlgorithm",
      "org.biojava.bio.seq.io.WordTokenization",
      "uk.ac.sanger.artemis.ChangeListener",
      "org.biojava.bio.taxa.Taxon",
      "uk.ac.sanger.artemis.io.FeatureTree",
      "uk.ac.sanger.artemis.plot.LineAttributes",
      "org.apache.log4j.helpers.Loader",
      "org.biojava.utils.stax.SAX2StAXAdaptor$HandlerBinding",
      "org.biojava.bio.seq.impl.SimpleFeature",
      "org.apache.log4j.helpers.FileWatchdog",
      "uk.ac.sanger.artemis.components.genebuilder.GeneEditorPanel",
      "uk.ac.sanger.artemis.components.KeyChoice",
      "org.biojava.bio.symbol.AbstractSymbolList$ListView",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "org.biojava.bio.seq.GappedSequence",
      "org.biojava.bio.symbol.Alignment",
      "org.apache.log4j.MDC",
      "org.biojava.bio.seq.impl.SimpleRestrictionSite",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "org.gmod.schema.dao.SequenceDaoI",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "org.biojava.utils.SmallMap",
      "org.biojava.bio.seq.StrandedFeature$Template",
      "org.biojava.bio.symbol.Symbol",
      "org.biojava.bio.seq.RealizingFeatureHolder",
      "org.biojava.bio.molbio.RestrictionSite$Template",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "org.biojava.bio.seq.FramedFeature",
      "org.biojava.utils.ListTools",
      "uk.ac.sanger.artemis.components.genebuilder.gff.AddButton",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$AlphabetHandler",
      "uk.ac.sanger.artemis.io.DatabaseStreamFeature",
      "org.gmod.schema.dao.CvDaoI",
      "uk.ac.sanger.artemis.plot.GCWindowAlgorithm",
      "uk.ac.sanger.artemis.util.CacheHashMap",
      "htsjdk.tribble.TribbleException",
      "org.biojava.bio.seq.Feature",
      "uk.ac.sanger.artemis.io.InvalidKeyException",
      "uk.ac.sanger.artemis.io.Packing",
      "org.biojava.bio.symbol.AlphabetManager$ImmutableWellKnownAlphabetWrapper",
      "org.biojava.bio.seq.Sequence",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentListener",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "org.biojava.utils.stax.StAXContentHandlerBase",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.GFF3AttributeBuilder",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.EntryGroupChangeListener",
      "uk.ac.sanger.artemis.components.LogViewer",
      "uk.ac.sanger.artemis.io.BetweenRange",
      "uk.ac.sanger.artemis.ExternalProgramMonitor",
      "org.biojava.bio.EmptyAnnotation",
      "uk.ac.sanger.artemis.plot.CumulativeGCSkewAlgorithm",
      "org.apache.log4j.PropertyConfigurator",
      "htsjdk.tribble.TribbleException$InvalidHeader",
      "uk.ac.sanger.artemis.util.Document",
      "org.biojava.bio.seq.io.ParseException",
      "org.biojava.bio.symbol.AlphabetManager",
      "uk.ac.sanger.artemis.components.variant.TabixReader",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.Selection",
      "org.biojava.utils.walker.WalkerFactory",
      "org.biojava.bio.seq.FeatureRealizer",
      "org.biojava.utils.bytecode.CodeException",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "htsjdk.variant.vcf.VCFFilterHeaderLine",
      "org.biojava.bio.seq.io.SequenceFormat",
      "org.biojava.bio.symbol.SparseCrossProductAlphabet",
      "uk.ac.sanger.artemis.components.QualifierTextArea",
      "uk.ac.sanger.artemis.plot.ICDIAlgorithm",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownBasisSymbol",
      "org.biojava.bio.seq.impl.SimpleRemoteFeature",
      "org.apache.log4j.spi.LoggerRepository",
      "htsjdk.samtools.SAMSequenceRecord",
      "uk.ac.sanger.artemis.components.Splash",
      "org.biojava.bio.taxa.EbiFormat",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "uk.ac.sanger.artemis.FeatureSegmentVector",
      "uk.ac.sanger.artemis.components.genebuilder.OpenSectionButton",
      "htsjdk.samtools.util.Log$LogLevel",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "org.biojava.bio.seq.impl.SimpleSimilarityPairFeature",
      "org.biojava.bio.symbol.SimpleSymbolList$SSLIOListener",
      "org.biojava.bio.seq.RemoteFeature$Template",
      "uk.ac.sanger.artemis.plot.GCDeviationAlgorithm",
      "org.apache.log4j.Level",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAtomicSymbol",
      "org.biojava.bio.symbol.AbstractReversibleTranslationTable",
      "org.biojava.bio.seq.io.SeqIOAdapter",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "org.biojava.bio.symbol.SimpleGeneticCodeTable",
      "htsjdk.samtools.util.BlockCompressedInputStream",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "org.biojava.bio.seq.io.SeqIOListener",
      "org.biojava.utils.ChangeType",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "htsjdk.variant.variantcontext.VariantContextComparator",
      "org.biojava.utils.ChangeListener",
      "uk.ac.sanger.artemis.components.BasePlot",
      "uk.ac.sanger.artemis.GotoEvent",
      "org.biojava.utils.AbstractChangeable",
      "uk.ac.sanger.artemis.EntrySourceVector",
      "org.apache.log4j.Layout",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "org.gmod.schema.dao.SchemaDaoI",
      "uk.ac.sanger.artemis.LastSegmentException",
      "uk.ac.sanger.artemis.ChangeEvent",
      "org.biojava.bio.seq.SimpleFeatureRealizer",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "org.emboss.jemboss.gui.MemoryComboBox",
      "org.biojava.bio.symbol.SimpleBasisSymbol",
      "org.biojava.utils.lsid.Identifiable",
      "org.biojava.bio.seq.io.CharacterTokenization$TPStreamParser",
      "org.biojava.bio.seq.DNATools$DNAComplementTranslationTable",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "org.emboss.jemboss.gui.Browser",
      "uk.ac.sanger.artemis.components.FeatureEdit",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "uk.ac.sanger.artemis.io.Sequence",
      "uk.ac.sanger.artemis.components.variant.BCFReader",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "htsjdk.variant.vcf.VCFFormatHeaderLine",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "org.biojava.utils.bytecode.GeneratedClassLoader",
      "uk.ac.sanger.artemis.io.Location",
      "org.biojava.utils.stax.StAXContentHandler",
      "uk.ac.sanger.artemis.components.SwingWorker",
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "org.biojava.bio.seq.SequenceAnnotator",
      "org.apache.log4j.or.ObjectRenderer",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "uk.ac.sanger.artemis.io.FeatureEnumeration",
      "uk.ac.sanger.artemis.components.QualifierTextArea$2",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownTokenizationWrapper",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "org.biojava.utils.ChangeForwarder",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.biojava.bio.symbol.GappedSymbolList",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.components.PlotMouseListener",
      "org.biojava.bio.symbol.HashedAlphabetIndex$HashComparator",
      "org.biojava.bio.seq.FeatureFilter",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "org.biojava.utils.cache.KeyedWeakReference",
      "org.biojava.bio.seq.homol.HomologyFeature$Template",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "org.biojava.bio.SimpleAnnotation",
      "org.biojava.bio.symbol.IntegerAlphabet",
      "com.sshtools.j2ssh.FileTransferProgress",
      "org.biojava.bio.taxa.TaxonParser",
      "uk.ac.sanger.artemis.plot.Algorithm",
      "org.biojava.bio.seq.impl.FeatureImpl",
      "org.apache.log4j.spi.LoggerFactory",
      "org.biojava.bio.symbol.DoubleAlphabet$DoubleSymbol",
      "org.apache.log4j.spi.Configurator",
      "htsjdk.variant.vcf.VCFInfoHeaderLine",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "org.biojava.bio.seq.impl.SimpleFramedFeature",
      "org.biojava.bio.seq.io.ReferenceAnnotation",
      "org.gmod.schema.sequence.Feature",
      "org.biojava.bio.symbol.FiniteAlphabet",
      "org.biojava.bio.seq.homol.SimilarityPairFeature$Template",
      "org.biojava.bio.seq.FeatureFilter$OnlyChildren",
      "org.apache.log4j.PropertyWatchdog",
      "uk.ac.sanger.artemis.io.KeyVector",
      "org.biojava.bio.Annotatable",
      "org.gmod.schema.utils.Rankable",
      "org.biojava.utils.ParseErrorEvent",
      "uk.ac.sanger.artemis.components.FileViewer$2",
      "org.biojava.bio.seq.io.EmblLikeFormat",
      "uk.ac.sanger.artemis.FeatureVector",
      "org.biojava.bio.seq.io.SequenceBuilderBase",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "org.biojava.utils.stax.StringElementHandlerBase",
      "org.biojava.bio.seq.io.CrossProductTokenization",
      "htsjdk.tribble.TribbleException$InternalCodecException",
      "org.biojava.bio.seq.FeatureHolder",
      "org.biojava.bio.symbol.FundamentalAtomicSymbol",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$CharacterTokenizationHandler$MappingHandler",
      "org.biojava.utils.ChangeForwarder$Retyper",
      "org.gmod.schema.dao.OrganismDaoI",
      "org.biojava.bio.seq.io.SymbolTokenization",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "htsjdk.samtools.util.LocationAware",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.io.IndexedGFFDocumentEntry$1",
      "org.biojava.utils.Unchangeable",
      "org.apache.log4j.Priority",
      "uk.ac.sanger.artemis.components.FeatureDisplay$3",
      "org.biojava.bio.seq.RNATools$RNAComplementTranslationTable",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "org.biojava.bio.symbol.AlphabetIndex",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$SymbolHandler",
      "uk.ac.sanger.artemis.components.FeatureDisplay$2",
      "org.biojava.bio.seq.FeatureHolder$EmptyFeatureHolder",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "org.biojava.bio.symbol.SimpleAtomicSymbol",
      "htsjdk.variant.vcf.VCFHeader",
      "org.biojava.bio.symbol.EmptySymbolList",
      "uk.ac.sanger.artemis.components.alignment.ReadCountDialog",
      "org.apache.log4j.DefaultCategoryFactory",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "org.biojava.bio.symbol.AbstractAlphabet",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "org.biojava.utils.ChangeListener$AlwaysVetoListener",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.plot.ScaledChiAlgorithm",
      "uk.ac.sanger.artemis.Entry",
      "org.biojava.bio.symbol.AlphabetManager$SizeQueen",
      "org.biojava.bio.symbol.HashedAlphabetIndex",
      "org.biojava.utils.ClassTools",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "org.biojava.utils.cache.WeakValueHashMap",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.plot.MRIAlgorithm",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "org.biojava.bio.seq.RemoteFeature",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "org.biojava.bio.symbol.TranslationTable",
      "uk.ac.sanger.artemis.io.DocumentEntryAutosaveThread",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "org.biojava.bio.symbol.CrossProductAlphabetIndex",
      "org.biojava.bio.seq.impl.SimpleStrandedFeature",
      "uk.ac.sanger.artemis.sequence.Marker",
      "org.biojava.bio.seq.Feature$ByLocationComparator",
      "uk.ac.sanger.artemis.plot.CSCSAlgorithm",
      "org.biojava.bio.symbol.DoubleAlphabet",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "org.biojava.bio.symbol.AbstractSymbolList$EditTranslater",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler",
      "org.biojava.bio.symbol.AtomicSymbol",
      "org.biojava.bio.dist.Distribution",
      "org.biojava.bio.seq.io.IntegerTokenization",
      "uk.ac.sanger.artemis.components.QualifierChoice",
      "org.apache.log4j.spi.RootLogger",
      "org.emboss.jemboss.gui.Browser$JIconButton",
      "org.biojava.bio.BioError",
      "htsjdk.variant.vcf.VCFContigHeaderLine",
      "org.apache.log4j.spi.ErrorHandler",
      "uk.ac.sanger.artemis.ExternalProgramException",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "org.apache.log4j.spi.RendererSupport",
      "uk.ac.sanger.artemis.components.variant.TabixReader$Iterator",
      "org.biojava.bio.seq.OptimizableFilter",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "htsjdk.samtools.util.Log",
      "uk.ac.sanger.artemis.plot.CodonWeight",
      "org.biojava.bio.symbol.AlphabetManager$GapSymbol",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.GotoEventSource",
      "org.biojava.bio.taxa.TaxonFactory",
      "org.biojava.utils.ChangeSupport",
      "org.biojava.bio.seq.io.AlternateTokenization",
      "org.biojava.bio.molbio.RestrictionSite",
      "uk.ac.sanger.artemis.io.IndexedGFFDocumentEntry",
      "org.biojava.bio.seq.StrandedFeature$Strand",
      "org.biojava.bio.seq.io.SeqFileFormer",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel$3",
      "uk.ac.sanger.artemis.plot.GCSDWindowAlgorithm",
      "org.biojava.bio.symbol.AlphabetManager$1",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.FeatureSegment",
      "org.biojava.bio.seq.homol.HomologyFeature",
      "uk.ac.sanger.artemis.EntryGroup",
      "uk.ac.sanger.artemis.io.Feature",
      "org.biojava.bio.AbstractAnnotation",
      "org.biojava.bio.symbol.ManyToOneTranslationTable",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "org.biojava.bio.seq.io.SwissprotFileFormer",
      "uk.ac.sanger.artemis.components.DisplayComponent",
      "org.apache.log4j.spi.RepositorySelector",
      "org.biojava.utils.ListTools$SeriesList",
      "org.biojava.bio.symbol.SimpleSymbolList",
      "uk.ac.sanger.artemis.io.GFF3AttributeBuilder$1",
      "uk.ac.sanger.artemis.plot.AGWindowAlgorithm",
      "org.biojava.utils.ChangeListener$LoggingListener",
      "org.biojava.bio.symbol.SingletonAlphabet",
      "uk.ac.sanger.artemis.io.ReadEvent",
      "org.biojava.bio.SmallAnnotation",
      "org.biojava.bio.symbol.ReversibleTranslationTable",
      "uk.ac.sanger.artemis.io.Entry",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "org.biojava.utils.ParseErrorSource",
      "org.apache.log4j.or.DefaultRenderer",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "org.biojava.bio.seq.io.SequenceBuilder",
      "htsjdk.variant.vcf.VCFHeaderLine",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "org.biojava.bio.symbol.LinearAlphabetIndex",
      "org.biojava.bio.symbol.AlphabetManager$AlphabetManagerHandler$SymbolHandler$1",
      "org.biojava.bio.taxa.CircularReferenceException",
      "org.gmod.schema.organism.Organism",
      "org.apache.log4j.Appender",
      "org.biojava.bio.symbol.SimpleReversibleTranslationTable",
      "org.biojava.bio.symbol.Alphabet",
      "org.biojava.bio.symbol.AbstractSymbolList$EditScreener",
      "org.biojava.bio.seq.io.EmblFileFormer",
      "org.biojava.utils.ListTools$5",
      "org.biojava.bio.seq.Frame",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "org.biojava.utils.AssertionFailure",
      "uk.ac.sanger.artemis.FeaturePredicate",
      "uk.ac.sanger.artemis.Logger",
      "org.biojava.bio.seq.IsTopLevel",
      "org.apache.log4j.spi.LoggingEvent",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownGapSymbol",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.FeatureEnumeration",
      "org.biojava.bio.symbol.AbstractSymbolList",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "uk.ac.sanger.artemis.SelectionChangeListener",
      "org.gmod.schema.dao.PubDaoI",
      "uk.ac.sanger.artemis.GotoListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ReadCountDialog_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.alignment.ReadCountDialog",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.io.IndexedGFFDocumentEntry",
      "uk.ac.sanger.artemis.util.CacheHashMap",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "org.emboss.jemboss.JembossParams",
      "org.emboss.jemboss.gui.Browser",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "org.biojava.bio.AbstractAnnotation",
      "org.biojava.bio.SimpleAnnotation",
      "org.biojava.bio.seq.SimpleFeatureRealizer",
      "org.biojava.bio.seq.impl.FeatureImpl$1",
      "org.biojava.bio.seq.impl.FeatureImpl",
      "org.biojava.bio.symbol.AlphabetManager$GapSymbol",
      "org.biojava.bio.symbol.AlphabetManager$SizeQueen",
      "org.biojava.bio.symbol.IntegerAlphabet",
      "org.biojava.bio.symbol.DoubleAlphabet",
      "org.biojava.bio.symbol.SimpleSymbol",
      "org.biojava.bio.symbol.AbstractSimpleBasisSymbol",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownGapSymbol",
      "org.biojava.utils.ChangeType",
      "org.biojava.bio.EmptyAnnotation",
      "org.biojava.bio.Annotation",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "org.biojava.bio.symbol.Alphabet",
      "org.biojava.utils.ListTools",
      "org.biojava.utils.SingletonList",
      "org.biojava.bio.SmallAnnotation",
      "org.biojava.utils.lsid.LifeScienceIdentifier",
      "org.biojava.utils.SmallMap",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownBasisSymbol",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAtomicSymbol",
      "org.biojava.bio.symbol.FundamentalAtomicSymbol",
      "org.biojava.utils.ChangeListener",
      "org.biojava.utils.ChangeSupport",
      "org.biojava.bio.Annotatable",
      "org.biojava.bio.symbol.AbstractAlphabet",
      "org.biojava.bio.symbol.SingletonAlphabet",
      "org.biojava.bio.symbol.SimpleAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownAlphabet",
      "org.biojava.bio.symbol.AlphabetManager$ImmutableWellKnownAlphabetWrapper",
      "org.biojava.bio.seq.io.CharacterTokenization",
      "org.biojava.bio.symbol.SimpleBasisSymbol",
      "org.biojava.bio.seq.io.AlternateTokenization",
      "org.biojava.bio.symbol.AlphabetManager",
      "org.biojava.bio.symbol.AlphabetManager$WellKnownTokenizationWrapper",
      "org.biojava.bio.symbol.SimpleSymbolList",
      "org.biojava.bio.seq.io.SymbolTokenization",
      "org.biojava.bio.symbol.SimpleReversibleTranslationTable",
      "org.biojava.bio.symbol.SimpleCrossProductAlphabet",
      "org.biojava.utils.ListTools$Triplet",
      "org.biojava.bio.symbol.SimpleAtomicSymbol",
      "org.biojava.bio.seq.io.WordTokenization",
      "org.biojava.bio.seq.io.NameTokenization",
      "org.biojava.bio.symbol.SimpleManyToOneTranslationTable",
      "org.biojava.bio.symbol.SimpleGeneticCodeTable",
      "org.biojava.bio.symbol.AbstractSymbolList$ListView",
      "org.biojava.bio.BioException",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "org.biojava.bio.BioError",
      "org.biojava.bio.seq.RNATools",
      "org.biojava.bio.seq.DNATools",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.components.Plot",
      "uk.ac.sanger.artemis.components.BasePlot",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "org.biojava.bio.seq.Feature",
      "org.biojava.bio.seq.io.IntegerTokenization",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "org.biojava.bio.seq.io.EmblLikeFormat",
      "uk.ac.sanger.artemis.io.FeatureTree",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.io.ReadEvent",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.InvalidKeyException",
      "uk.ac.sanger.artemis.SelectionChangeEvent",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "org.biojava.bio.seq.homol.SimilarityPairFeature",
      "htsjdk.variant.vcf.VCFHeader",
      "org.apache.log4j.Layout",
      "org.apache.log4j.HTMLLayout",
      "org.biojava.bio.taxa.EbiFormat",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "uk.ac.sanger.artemis.util.DatabaseLocationParser",
      "org.apache.log4j.MDC",
      "htsjdk.samtools.AbstractSAMHeaderRecord",
      "htsjdk.samtools.SAMSequenceRecord",
      "org.biojava.bio.molbio.RestrictionMapper",
      "org.biojava.bio.seq.io.SequenceBuilderBase"
    );
  }
}