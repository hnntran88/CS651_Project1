package com.project1.com.profile;

import java.io.Serializable;

public class Profile_Bean implements Serializable {
	private String user_name;
	private String email;
	private String profile_picture;
	private String id;
	private String access_token;
	
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfile_picture() {
		return profile_picture;
	}
	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
}

