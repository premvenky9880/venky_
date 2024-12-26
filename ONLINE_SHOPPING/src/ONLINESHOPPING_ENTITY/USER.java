package ONLINESHOPPING_ENTITY;
public abstract class USER{
	private int userid;
	private String username;
	private String emailid;
	public USER(int userid, String username, String emailid) {
		super();
		this.userid = userid;
		this.username = username;
		this.emailid = emailid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "USER [userid=" + userid + ", username=" + username + ", emailid=" + emailid + "]";
	}	

}


	
	
	
	
	

