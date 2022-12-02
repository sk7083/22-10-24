package day31;

public class ProductManager {
	private String sort, name;
	private int num, buy, sell;
	
	public ProductManager(String sort, String name, int num, int buy, int sell) {
		this.sort = sort;
		this.name = name;
		this.num = num;
		this.buy = buy;
		this.sell = sell;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getBuy() {
		return buy;
	}

	public void setBuy(int buy) {
		this.buy = buy;
	}

	public int getSell() {
		return sell;
	}

	public void setSell(int sell) {
		this.sell = sell;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductManager other = (ProductManager) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductManager [sort=" + sort + ", name=" + name + ", num=" + num + ", buy=" + buy + ", sell=" + sell
				+ "]";
	}
	
	
	
}
/* 제품을 관리하는 프로그램을 작성하세요.
 *  - 구매 가격, 판매 가격은 변동이 없음.
 *  기능
 *  - 제품 등록 (분류, 제품명, 수량, 구매 가격, 판매 가격)
 *  - 제품 수정
 *  - 제품 삭제
 *  - 제품 구매
 *  - 제품 판매
 *  - 매출액 확인
 *   - 년별
 *     - 제품별
 *     - 전체
 *   - 월별
 *     - 제품별
 *     - 전체
 *   - 일별
 *     - 제품별
 *     - 전체
 *
 * */