/**
 * generated by Xtext 2.12.0
 */
package dk.itu.dsl.roboprose.formatting2;

import com.google.inject.Inject;
import dk.itu.dsl.roboprose.model.Action;
import dk.itu.dsl.roboprose.model.EventListener;
import dk.itu.dsl.roboprose.model.Main;
import dk.itu.dsl.roboprose.model.RoboProse;
import dk.itu.dsl.roboprose.services.RoboProseGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class RoboProseFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private RoboProseGrammarAccess _roboProseGrammarAccess;
  
  protected void _format(final RoboProse roboProse, @Extension final IFormattableDocument document) {
    document.<Main>format(roboProse.getMain());
    EList<EventListener> _listeners = roboProse.getListeners();
    for (final EventListener eventListener : _listeners) {
      document.<EventListener>format(eventListener);
    }
  }
  
  protected void _format(final Main main, @Extension final IFormattableDocument document) {
    EList<Action> _actions = main.getActions();
    for (final Action action : _actions) {
      document.<Action>format(action);
    }
  }
  
  public void format(final Object main, final IFormattableDocument document) {
    if (main instanceof XtextResource) {
      _format((XtextResource)main, document);
      return;
    } else if (main instanceof Main) {
      _format((Main)main, document);
      return;
    } else if (main instanceof RoboProse) {
      _format((RoboProse)main, document);
      return;
    } else if (main instanceof EObject) {
      _format((EObject)main, document);
      return;
    } else if (main == null) {
      _format((Void)null, document);
      return;
    } else if (main != null) {
      _format(main, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(main, document).toString());
    }
  }
}