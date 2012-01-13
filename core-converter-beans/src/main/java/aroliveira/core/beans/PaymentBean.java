package aroliveira.core.beans;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import aroliveira.core.beans.validators.MyValidation;

@Named("payment")
@SessionScoped
public class PaymentBean implements Serializable {
	
	private static final long serialVersionUID = -7782046713414743697L;
	
	private double amount;
	
	//@Size(min=20)
	@MyValidation
	private String card = "10";
	
	private Date date = new Date();

	private MAD pegaUmMad;
	
	public PaymentBean() {
	}

	
	public double getAmount() {
		System.out.println("PaymentBean.getAmount()");
		return amount;
	}
	
	public void setAmount(double amount) {
		System.out.println("PaymentBean.setAmount()");
		this.amount = amount;
	}
	
	public Date getDate() {
		System.out.println("PaymentBean.getDate()");
		return date;
	}
	
	public void setDate(Date date) {
		System.out.println("PaymentBean.setDate()");
		this.date = date;
	}
	
	
	public String getCard() {
		System.out.println("PaymentBean.getCard()");
		return card;
	}
	
	public void setCard(String card) {
		System.out.println("PaymentBean.setCard()");
		this.card = card;
	}
	
	public MAD getPegaUmMad(){
		pegaUmMad = new MAD("Anderson", new Date(), "Developer");
		return pegaUmMad;
	}
	
	public void convertOMad(MAD mad){
		System.out.println("Recebi o mad: " + mad);
	}
}
