package com.project1.com.posts;

public class Post_Use_Bean {
	private String message;
	private String story;
	private String created_time;
	private String id;
	private String paging_previous;
	private String paging_next;
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
