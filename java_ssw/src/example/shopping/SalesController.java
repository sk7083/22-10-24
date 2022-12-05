package example.shopping;

import java.util.List;
import java.util.Scanner;

public class SalesController {
	private List<Sales> salesList;
	private List<Product> productList;	//제품 정보 받기 위해
	private ProductService ps; // ProductService 사용하기 위해
	private SalesService ss;
	
	public SalesController(List<Sales> salesList, List<Product> productList) {
		this.salesList = salesList;
		this.productList = productList;
		ps = new ProductServiceImp();
		ss = new SalesServiceImp();
	}

	public void buy() {
		//구매할 제품 정보 입력(타입, 제품명, 수량)
		Sales sales = ss.inputSales("구매");
		
		//입력한 제품 정보를 가져옴
		Product product = ps.getProduct(productList, sales.getProduct());
		
		if(product == null) {
			System.out.println(type + "정보를 잘못 입력했습니다.");
			return;
		}
		
		sales.setProduct(new Product(product));
		product.addAmount(+sales.getAmount());
		
		//매출 금액을 계산
		type.equals("구매") ? amount : -amount);
		
		
			System.out.println("재고량이 부족");
			return;
		}

	public void print() {
		int submenu = 0;
		final int exit = 4;
		Scanner sc = new Scanner(System.in);
		do {
			printSubmenu();
			submenu = sc.nextInt();
			sc.nextLine();
			exePrintMenu(submenu);
		}while(submenu != exit);
		
	}

	private void exePrintMenu(int submenu) {
		switch (submenu) {
		case 1:
			ss.printByYear(salesList);
			break;
		case 2:
			ss.printByMonth(salesList);
			break;
		case 3:
			ss.printByDay(salesList);
			break;
		case 4:
			System.out.println("이전으로 돌아갑니다.");
			break;
		default:
			System.out.println("메뉴를 잘못 선택했습니다.");
		}
		
	}

	private void printSubmenu() {
		System.out.println("[출력 메뉴]");
		System.out.println("1. 년별");
		System.out.println("2. 월별");
		System.out.println("3. 일별");
		System.out.println("4. 이전");
		System.out.println("===========");
		System.out.println("메뉴 선택 : ");
		
	}
		
		//전체 매출에 현재 매출 정보를 추가

	
	
}
