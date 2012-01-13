package aroliveira.core.beans;

import java.io.Serializable;
import java.util.Locale;
import java.util.Set;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

@Named("form")
@SessionScoped
public class EventBean implements Serializable{

	private static final long serialVersionUID = -8807114402569827412L;

	private String streetAddress;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private static final Locale[] countries = {Locale.US, Locale.ITALY};
	
	static{
		System.out.println("INiciando o form bean");
	}
	
	public Locale[] getCountries() {
		return countries;
	}
	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void countryChanged(ValueChangeEvent event) {		
	
		
		System.out.println("new value: " + event.getNewValue());
		System.out.println("old value: " + event.getOldValue());
		System.out.println("component: " + event.getComponent());
		System.out.println("viewRoot: " + FacesContext.getCurrentInstance().getViewRoot());

		Set<String> keySet = FacesContext.getCurrentInstance().getViewRoot().getFacets().keySet();
		
		System.out.println(keySet.size());
		System.out.println(keySet);
		
		
		for (Locale locale : countries){
			if (locale.getCountry().equals(event.getNewValue())){
				FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
			}
		}
	}
	
}
