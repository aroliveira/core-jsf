package aroliveira.core.beans;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

/*@ManagedBean(name="user")
@SessionScoped*/

@Named("user")
@SessionScoped
public class UserBean implements Serializable {

	private static final long serialVersionUID = 3494887057699474043L;
	
	private String name = "";
	
	private String password;
	
	private String greeting;
	
	private Double vDouble;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getGreeting() {
		if (name.length() == 0) return "";
		
		return "Welcome to JSF2 + AJAX - , " + name + "!";
	}

	public void setGreeting(String greeting) {		
	}
	
	public String opa(String t){
		return t.toUpperCase();
	}
	
	public Double getvDouble() {
		return vDouble;
	}
	
	public void setvDouble(Double vDouble) {
		this.vDouble = vDouble;
	}
}