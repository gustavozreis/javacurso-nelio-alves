package services;

import java.util.Date;

public interface PaymentService {
	
	void monthlyPayments(Date date, Double value, Integer installments);

}
