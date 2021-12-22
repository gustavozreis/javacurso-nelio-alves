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
	
	// m�todo que calcula o pre�o total com taxa
	public Double totalPrice() {
		return super.getPrice() + customsFee;
	}
	
	@Override
	// m�todo para imprimir price tag sobrescrito
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", this.totalPrice()) 
				+ " (Customs fee: $ " 
				+ String.format("%.2f", this.getCustomsFee()) 
				+ ")";
	}
	

}
