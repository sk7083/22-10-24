package CompanyManagement;

public class Salary {
	private String job, company;
	private int empNum, money;
	
	public Salary(String job, String company, int empNum, int money) {
		this.job = job;
		this.company = company;
		this.empNum = empNum;
		this.money = money;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
