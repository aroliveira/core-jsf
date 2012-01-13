package aroliveira.core.beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("editBean")
@SessionScoped
public class EditBean implements Serializable{

	private static final long serialVersionUID = 3399070845370562033L;


	@Inject
	private UserBean userBean;
	
	
	private String nome;


	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public String getNome() {
		return userBean.getName() + userBean.getPassword();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
