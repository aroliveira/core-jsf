package aroliveira.core.beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Named;


@Named("userBean")
@SessionScoped
public class UserBean implements Serializable{

	private static final long serialVersionUID = 4104649237350594402L;

	private String name;
	
	private String password;
	
	private Boolean loggedIn = false;
	
	public UserBean() {}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		System.out.println("Setando o nome: " + name);
		this.name = name;
	}
	
	public String login(){
		System.out.println("UserBean.login(), usuario: " + name + " pass: " + password);
		loggedIn = true;
		return "index";
	}
	
	public String logOut(){
		System.out.println("UserBean.logOut()");
		loggedIn = false;
		return "login";
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		System.out.println("setando a senha: " + password);
		this.password = password;
	}
	
	public void checkLogin(ComponentSystemEvent event){
		
		System.out.println("checando o login");
		
		if (!loggedIn){
			FacesContext context = FacesContext.getCurrentInstance();
			
			ConfigurableNavigationHandler handler = (ConfigurableNavigationHandler)
				context.getApplication().getNavigationHandler();
			
			handler.performNavigation("login");
		}
	}
}
