package Customerinfo;

public class Customer {
	private String buyers;
	private String phnnu;


    public Customer (String Buyers, String phnnu){
		this.buyers= buyers;
		this.phnnu = phnnu;
	}
	
	public String getBuyers(){
		return buyers;
	}
	
	public String getphnnu(){
		return phnnu;
	}
	
	public void showcustomer() {
        System.out.println("BUYER NAME: " + buyers);
        System.out.println("Phone Number " + phnnu);
    }
	
	
	public String getStudentInfo() {
        return "BUYER NAME: " + buyers + ",Phone Number " + phnnu;
		
    }
public String toString() {
    return getStudentInfo();
}
}