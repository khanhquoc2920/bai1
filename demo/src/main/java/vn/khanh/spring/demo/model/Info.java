package vn.khanh.spring.demo.model;

public class Info {
	private int id;
	private String name;
    private String address;
    private String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Info() {
		super();
	}
	
	public Info(int id, String name, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public Info( String name, String address, String phone) {
		super();
		
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
}
