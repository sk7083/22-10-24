package example.shopping;

import java.util.Date;

import lombok.Data;

@Data
public class Sales {
	//제품 구매와 판매의 대한 정보를 가진 class
	
	//제품 정보, 수량, 타입(구매/판매), 총 금액, 일시
	private Product product;
	private int amount, price;
	private String date;
	private SalesType type;

	public Sales(Product product, int amount, int price, String date, SalesType type) {
		this.product = product;
		this.amount = amount;
		this.price = price;
		this.date = date;
		this.type = type;
	}
	
	public void calculate() {
		if(product == null)
			return;
		int price = 0;
		
		if(SalesType.valueOf(type) == SalesType.구매)
			price = product.getBuyPrice()* amount;
		else if(SalesType.valueOf(type) == SalesType.판매)
			price = product.getSellPrice()*amount;
		
		this.price = price;
	}

	@Override
	public String toString() {
		return "Sales [product=" + product.getTitle()+ ", amount=" + amount + ", price=" + price + ", date=" + date + ", type="
				+ type + "]";
	}
	
	
}

//열거형
enum SalesType{
	판매, 구매
}