package ex;

import java.sql.Date;

public class MemberVO {
	
	private String id;
	private String pwd;
	private String name;
	private Date joindate;
	
	public String getId(){
		return id;
	}
	public String getPw(){
		return pwd;
	}
	public String getName(){
		return name;
	}
	public Date getjoinDate(){
		return joindate;
	}
	
	
	
	public String setId(String id) {
		this.id = id;
		return id;
	}
	public String setPwd(String pwd) {
		this.pwd = pwd;
		return pwd;
	}
	public String setName(String name) {
		this.name = name;
		return name;
	}
	public Date setjoinDate(Date joindate) {
		this.joindate = joindate;
		return joindate;
	}
	
	
}
