package uk.ac.kcl.values;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

/**
 * Value converter for URL strings. Removes leading and ending "<" ">" characters.
 * 
 * @author Steffen Zschaler
 */
@SuppressWarnings("all")
public class URLConverterImplementation implements IValueConverter<String> {
  @Override
  public String toString(final String value) throws ValueConverterException {
    return (("<" + value) + ">");
  }
  
  @Override
  public String toValue(final String string, final INode node) throws ValueConverterException {
    int _length = string.length();
    int _minus = (_length - 1);
    return string.substring(1, _minus);
  }
}
