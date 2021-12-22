package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	static SimpleDateFormat manuDate = new SimpleDateFormat("dd/MM/yyyy");	
	
	public Date manufactureDate;

	// constructors
	
	public UsedProduct() {		
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	// getters and setters
	
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	// método para imprimir price tag sobrescrito
	public String priceTag() {
		return this.getName()
				+ " (used) "
				+ " $ " 
				+ String.format("%.2f", this.getPrice())
				+ " (Manufacture date: " 
				+ manuDate.format(this.getManufactureDate())
				+ ")";
	}
	
	
	
	
}
