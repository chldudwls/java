package test02;

import java.util.ArrayList;
import java.util.List;

public class Product {
	List<Integer> updatePrice = new ArrayList<>();
	List<Integer> addStock = new ArrayList<>();
	String productId;
	String productName;
	int price;
	int quantity;

	public Product(String productId, String productName, int price, int quanticy) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.updatePrice.add(price);
		this.addStock.add(quantity);
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void updatePrice(int newPrice) {
		
		this.price = newPrice;
		updatePrice.add(newPrice);
		System.out.println("키보드 가격 수정됨");
	}
	public void addStock(int newquantity) {
		this.quantity += newquantity;

		addStock.add(newquantity);
		System.out.println("키보드"+newquantity+"개 재고 추가 됨");
	
	}
	public void printProductInfo(){
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);
		System.out.println(quantity);
	}
}
