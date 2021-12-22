package entities;

public class ImportedProduct extends Product {
	
	Double customsFee;
	
	// constructors	
	
	public ImportedProduct() {
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	// getters and setters	
	
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	// método para imprimir price tag sobrescrito
	public String priceTag() {
		return this.getName() 
				+ " $ " 
				+ String.format("%.2f", this.getPrice()) 
				+ " (Customs fee: $ " 
				+ String.format("%.2f", this.getCustomsFee()) 
				+ ")";
	}
	

}
