/*
 * generated by Xtext 2.12.0
 */
package dk.itu.dsl.roboprose.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RoboProseAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("dk/itu/dsl/roboprose/parser/antlr/internal/InternalRoboProse.tokens");
	}
}
