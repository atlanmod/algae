/*
 * generated by Xtext 2.14.0
 */
package org.atlanmod.analysis.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AlgaeAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/atlanmod/analysis/parser/antlr/internal/InternalAlgae.tokens");
	}
}
