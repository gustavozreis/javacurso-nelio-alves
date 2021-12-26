package services;

import java.util.Date;

public class InstallmentCalculator {
	
	private Date date;
	private Double value;
	Integer installments;
	
	private PaymentService paymentService;
	
	// constructor
	
	public InstallmentCalculator(Date date, Double value, Integer installments, PaymentService paymentService) {
		this.date = date;
		this.value = value;
		this.installments = installments;
		this.paymentService = paymentService;
	}
	
	// call installmente calculator method
	public void calculateInstallment() {
		paymentService.monthlyPayments(date, value, installments);
	}
	

}
