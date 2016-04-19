package uk.ac.kcl.MDEOptimise.tests;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.henshin.model.HenshinPackage;
import uk.ac.kcl.MDEOptimiseInjectorProvider;

@SuppressWarnings("all")
public class FullTestInjector extends MDEOptimiseInjectorProvider {
  @Override
  public void setupRegistry() {
    super.setupRegistry();
    EPackage.Registry.INSTANCE.put(HenshinPackage.eNS_URI, HenshinPackage.eINSTANCE);
  }
}
