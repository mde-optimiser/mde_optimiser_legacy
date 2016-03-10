package uk.ac.kcl.values;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import uk.ac.kcl.values.URLConverterImplementation;

@SuppressWarnings("all")
public class MDEOptimiseValueConverter extends DefaultTerminalConverters {
  @ValueConverter(rule = "URL")
  public IValueConverter<String> getURLConverter() {
    return new URLConverterImplementation();
  }
}
