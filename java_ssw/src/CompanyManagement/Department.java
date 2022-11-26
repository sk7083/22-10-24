package CompanyManagement;

public class Department {
	private String depName;
	private int depNum, depPersonnel;
	
	public Department(String depName, int depNum, int depPersonnel) {
		this.depName = depName;
		this.depNum = depNum;
		this.depPersonnel = depPersonnel;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public int getDepNum() {
		return depNum;
	}

	public void setDepNum(int depNum) {
		this.depNum = depNum;
	}

	public int getDepPersonnel() {
		return depPersonnel;
	}

	public void setDepPersonnel(int depPersonnel) {
		this.depPersonnel = depPersonnel;
	}
	
	
}
