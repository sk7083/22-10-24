package studyTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bill {
	private String product;
	private int price;
	private Date date;
	
	public Bill() {
		// TODO Auto-generated constructor stub
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(String strDate) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		try {
			this.date = format.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
