package entity;

public class Admin {
	private int id;
	private String career;
	private String adminName;
	private String adminPassword;
	private String adminPhone;
	public Admin(int id, String career, String adminName, String adminPassword, String adminPhone) {
		super();
		this.id = id;
		this.career = career;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.adminPhone = adminPhone;
	}
	public Admin(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminPhone() {
		return adminPhone;
	}
	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}
	
}
