/*
 * generated by Xtext 2.14.0
 */
package org.atlanmod.analysis.ui.tests;

import com.google.inject.Injector;
import org.atlanmod.analysis.algae.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class AlgaeUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("org.atlanmod.analysis.Algae");
	}

}
