package CompanyManagement;

public class Employee {
	private String empName, empEmail, empPhone, job, empDepartment;
	private int empNum;
	
	public Employee(String empName, String empEmail, String empPhone, String job, String empDepartment, int empNum) {
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPhone = empPhone;
		this.empDepartment = empDepartment;
		this.empNum = empNum;
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	//empName;	사원 이름
//	empEmail;	사원 이메일
//	empPhone;	사원 연락처
//	empDepartment;	사원 부서 코드
//	empNum;		사원 번호
//	job;		직책 코드
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empEmail=" + empEmail + ", empPhone=" + empPhone + ", job=" + job
				+ ", empDepartment=" + empDepartment + ", empNum=" + empNum + "]";
	}
	
	
}
