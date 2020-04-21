package com.project1.com.posts;

//User posts class
public class Post_Use_Bean {
	private String message; //post content
	private String story; //post to story
	private String created_time; //time of the post
	private String id; //post ID
	private String paging_previous; //previous page
	private String paging_next; //next page
	
	//methods
	//just basic get value and set value for each class variables
	public String getPaging_previous() {
		return paging_previous;
	}
	public void setPaging_previous(String paging_previous) {
		this.paging_previous = paging_previous;
	}
	public String getPaging_next() {
		return paging_next;
	}
	public void setPaging_next(String paging_next) {
		this.paging_next = paging_next;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getCreated_time() {
		return created_time;
	}
	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
