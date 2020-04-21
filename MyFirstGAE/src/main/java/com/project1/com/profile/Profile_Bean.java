package com.project1.com.profile;

import java.io.Serializable;

//User profile of Facebook app
public class Profile_Bean implements Serializable {
	//class variables
	private String user_name; //user's name
	private String email; //user's email
	private String profile_picture; //user's profile picture
	private String id; //user's ID
	private String access_token; //user's access token
	
	//methods
	//get user access token
	public String getAccess_token() {
		return access_token;
	}
	//set access token
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	//get user's name
	public String getUser_name() {
		return user_name;
	}
	//set user's name
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	// get user's email
	public String getEmail() {
		return email;
	}
	//set user's email
	public void setEmail(String email) {
		this.email = email;
	}
	//get user Facebook profile picture
	public String getProfile_picture() {
		return profile_picture;
	}
	//set user Facebook profile picture
	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
	}
	//get user ID
	public String getId() {
		return id;
	}
	//set user ID
	public void setId(String id) {
		this.id = id;
	}	
}

