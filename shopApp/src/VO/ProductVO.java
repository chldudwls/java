package VO;

public class ProductVO {
	private int prodNo;
	private String prodName;
	private int stocok;
	private int price;
	private String company;
	
	public ProductVO(){
	}

	public ProductVO(int prodNo, String prodName, int stocok, int price, String company) {
		super();
		this.prodNo = prodNo;
		this.prodName = prodName;
		this.stocok = stocok;
		this.price = price;
		this.company = company;
	}

	@Override
	public String toString() {
		return "ProductVO [prodNo=" + prodNo + ", prodName=" + prodName + ", stocok=" + stocok + ", price=" + price
				+ ", company=" + company + "]";
	}

	public int getProdNo() {
		return prodNo;
	}

	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getStocok() {
		return stocok;
	}

	public void setStocok(int stocok) {
		this.stocok = stocok;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}

