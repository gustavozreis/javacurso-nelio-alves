package services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PayPal implements PaymentService {
	
	public void monthlyPayments(Date date, Double value, Integer installments) {
		
		// create StringBuilder to format output on screen
		StringBuilder instPrint = new StringBuilder();
		// create SimpleDateFormat to format date to string
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		for (int i =1; i<=installments; i++ ) {
			// calculate payments
			Double tempInst = value / 3;
			tempInst += tempInst * 0.01 * i;
			tempInst += tempInst * 0.02;
			// calculate dates
			Calendar instDate = Calendar.getInstance();
			instDate.setTime(date);
			instDate.add(Calendar.MONTH, i);
			// append to text
			instPrint.append(sdf.format(instDate.getTime()));
			instPrint.append(" - ");
			instPrint.append(tempInst + "\n");
		}
		
	 System.out.println(instPrint);
		
	}
	

}
