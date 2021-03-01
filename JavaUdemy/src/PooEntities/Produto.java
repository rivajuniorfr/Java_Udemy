package PooEntities;

public class Produto {
	
	// Atributos
	
     public String name;
	 public double price;
	 public int quantity;
	
	
	// Construtor
	
	public Produto() {
		super();
		
	}
	
	// Getters and Setters
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// Operacoes
	
	public double totalValueInStock () {
		
		return price * quantity;
	}
	
	public void addProduct ( int quantity ) {
		
		this.quantity += quantity;
	}
	
	public void removeProducts (int quantity) {
		
		this.quantity -= quantity;
	}

}
