package aroliveira.core.beans;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("planetarium")
@RequestScoped
public class Planetarium implements Serializable {

	private static final long serialVersionUID = 2501037828585504662L;	
	
	private String selectedPlanet;
	
	public String getSelectedPlanet() {
		return selectedPlanet;
	}
	
	public String changePlanet(String newValue){
		selectedPlanet = newValue;
		return selectedPlanet;
	}
}
