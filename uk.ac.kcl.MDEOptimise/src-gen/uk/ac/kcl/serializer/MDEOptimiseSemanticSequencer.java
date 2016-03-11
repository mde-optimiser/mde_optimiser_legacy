/*
 * generated by Xtext
 */
package uk.ac.kcl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.mDEOptimise.EvolverSpec;
import uk.ac.kcl.mDEOptimise.FitnessFunctionSpec;
import uk.ac.kcl.mDEOptimise.MDEOptimisePackage;
import uk.ac.kcl.mDEOptimise.MetaModelSpec;
import uk.ac.kcl.mDEOptimise.Optimisation;
import uk.ac.kcl.services.MDEOptimiseGrammarAccess;

@SuppressWarnings("all")
public class MDEOptimiseSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MDEOptimiseGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MDEOptimisePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MDEOptimisePackage.EVOLVER_SPEC:
				sequence_EvolverSpec(context, (EvolverSpec) semanticObject); 
				return; 
			case MDEOptimisePackage.FITNESS_FUNCTION_SPEC:
				sequence_FitnessFunctionSpec(context, (FitnessFunctionSpec) semanticObject); 
				return; 
			case MDEOptimisePackage.META_MODEL_SPEC:
				sequence_MetaModelSpec(context, (MetaModelSpec) semanticObject); 
				return; 
			case MDEOptimisePackage.OPTIMISATION:
				sequence_Optimisation(context, (Optimisation) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     rule_location=URL
	 */
	protected void sequence_EvolverSpec(EObject context, EvolverSpec semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MDEOptimisePackage.Literals.EVOLVER_SPEC__RULE_LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MDEOptimisePackage.Literals.EVOLVER_SPEC__RULE_LOCATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEvolverSpecAccess().getRule_locationURLTerminalRuleCall_2_0(), semanticObject.getRule_location());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     class=STRING
	 */
	protected void sequence_FitnessFunctionSpec(EObject context, FitnessFunctionSpec semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MDEOptimisePackage.Literals.FITNESS_FUNCTION_SPEC__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MDEOptimisePackage.Literals.FITNESS_FUNCTION_SPEC__CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFitnessFunctionSpecAccess().getClassSTRINGTerminalRuleCall_1_0(), semanticObject.getClass_());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     location=URL
	 */
	protected void sequence_MetaModelSpec(EObject context, MetaModelSpec semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MDEOptimisePackage.Literals.META_MODEL_SPEC__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MDEOptimisePackage.Literals.META_MODEL_SPEC__LOCATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMetaModelSpecAccess().getLocationURLTerminalRuleCall_1_0(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (metamodel=MetaModelSpec fitness=FitnessFunctionSpec evolvers+=EvolverSpec+)
	 */
	protected void sequence_Optimisation(EObject context, Optimisation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
