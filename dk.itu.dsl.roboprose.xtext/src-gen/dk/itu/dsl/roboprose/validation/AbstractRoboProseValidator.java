/*
 * generated by Xtext 2.12.0
 */
package dk.itu.dsl.roboprose.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractRoboProseValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.itu.dk/dsl/roboprose"));
		return result;
	}
	
}
