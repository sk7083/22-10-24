package example.shopping;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class SalesServiceImp implements SalesService {

	@Override
	public Sales inputSales(String saleType) {
		Scanner sc = new Scanner(System.in);
		System.out.println("일시 : ");
		String date = sc.nextLine();
		System.out.print("분류 : ");
		String type = sc.nextLine();
		System.out.print("제품명 : ");
		String title = sc.nextLine();
		System.out.println("수량 : ");
		int amount = sc.nextInt();
		if(amount <= 0)
			return null;
		Product product = new Product(type, title, 0, 0);
		Sales sales = new Sales(product, amount, 0, date, SalesType.valueOf(saleType));
		
		return sales;
	}

	@Override
	public void printByYear(List<Sales> salesList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도 : ");
		String year = sc.nextLine();
		printSales(salesList, s->{
			String salesYear = s.getDateStr().substring(0,4);
			return salesYear.equals(year);
		});
		
	}

	@Override
	public void printSales(List<Sales> salesList, Predicate<Sales> p) {
		if(salesList == null || salesList.size() == 0) {
			System.out.println("결과가 없습니다.");
			return;
		}
		int count = 0;
		for(Sales sales : salesList) {
			if(p.test(sales)) {
				System.out.println(sales);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("결과가 없습니다.");
		}
	}

	@Override
	public void printByMonth(List<Sales> salesList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도 : ");
		String year = sc.nextLine();
		System.out.println("월 : ");
		String month = sc.nextLine();
		printSales(salesList, s->{
			String salesYear = s.getDateStr().substring(0,4);
			return salesYear.equals(year);
		});
		
	}

	@Override
	public void printByDay(List<Sales> salesList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도 : ");
		String year = sc.nextLine();
		printSales(salesList, s->{
			String salesYear = s.getDateStr().substring(0,4);
			return salesYear.equals(year);
		});
		
	}
	
}
