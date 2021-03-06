/**
 * generated by Xtext 2.12.0
 */
package dk.itu.dsl.roboprose.tests;

import com.google.inject.Inject;
import dk.itu.dsl.roboprose.model.Action;
import dk.itu.dsl.roboprose.tests.RoboProseInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(RoboProseInjectorProvider.class)
@SuppressWarnings("all")
public class RoboProseParsingTest {
  @Inject
  private ParseHelper<Action> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final Action result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
