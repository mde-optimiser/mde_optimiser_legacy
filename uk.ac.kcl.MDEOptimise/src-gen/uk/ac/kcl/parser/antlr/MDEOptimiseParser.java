/*
 * generated by Xtext
 */
package uk.ac.kcl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.kcl.services.MDEOptimiseGrammarAccess;

public class MDEOptimiseParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MDEOptimiseGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected uk.ac.kcl.parser.antlr.internal.InternalMDEOptimiseParser createParser(XtextTokenStream stream) {
		return new uk.ac.kcl.parser.antlr.internal.InternalMDEOptimiseParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Optimisation";
	}
	
	public MDEOptimiseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MDEOptimiseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
