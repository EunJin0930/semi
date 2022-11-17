package com.git.model.vo;

public class Member {
	private String memberid;
	private String memberPwd;
	private String memberName;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Member(String memberid, String memberPwd, String memberName) {
		super();
		this.memberid = memberid;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
	}


	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
}
