package aroliveira.core.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass=MAD.class)
public class MADConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {

		System.out.println("MADConverter.getAsObject(): " + value);
		
		String att = (String) component.getAttributes().get("dateFormat");
		
		System.out.println("DateFormat: " + att);
		
		String[] values = value.split(" - ");
		
			try {
				String name = values[0];
				String bornDate = values[1];
				String job = values[2];
				
				return new MAD(name, new SimpleDateFormat(att).parse(bornDate), job);
			} catch (ParseException e) {
				FacesMessage message = new FacesMessage("Conversion Error occurred", "Invalid conversion");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ConverterException(message);
			}
	}

	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		System.out.println("MADConverter.getAsString(): " + value);
		
		return value.toString();
	}
}
