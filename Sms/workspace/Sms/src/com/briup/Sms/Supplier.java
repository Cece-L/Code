package com.briup.Sms;

public class Supplier {
	private Long Snumber;
	private String Sname;
	private String Saddress;
	private Long Stel;
	private Long Saccount;

	public Supplier() {

	}

	public Supplier(Long snumber, String sname, String saddress, Long stel,
			Long saccount) {
		super();
		Snumber = snumber;
		Sname = sname;
		Saddress = saddress;
		Stel = stel;
		Saccount = saccount;
	}

	public Long getSnumber() {
		return Snumber;
	}

	public void setSnumber(Long snumber) {
		Snumber = snumber;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getSaddress() {
		return Saddress;
	}

	public void setSaddress(String saddress) {
		Saddress = saddress;
	}

	public Long getStel() {
		return Stel;
	}

	public void setStel(Long stel) {
		Stel = stel;
	}

	public Long getSaccount() {
		return Saccount;
	}

	public void setSaccount(Long saccount) {
		Saccount = saccount;
	}

	@Override
	public String toString() {
		return "Supplier [Snumber=" + Snumber + ", Sname=" + Sname
				+ ", Saddress=" + Saddress + ", Stel=" + Stel + ", Saccount="
				+ Saccount + "]";
	}
	
}
