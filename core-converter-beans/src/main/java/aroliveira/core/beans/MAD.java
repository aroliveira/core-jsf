package aroliveira.core.beans;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("mad")
@RequestScoped
public class MAD implements Serializable  {

	private static final long serialVersionUID = 8974354845831379268L;

	private String name;
	
	private Date bornDate;
	
	private String job;

	public MAD(String name, Date bornDate, String job) {
		this.name = name;
		this.bornDate = bornDate;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	public String toString() {
		return this.name + " - " + 
		new SimpleDateFormat("dd/MM/yy").format(this.bornDate) + " - " 
		+ this.job;
	}
}
