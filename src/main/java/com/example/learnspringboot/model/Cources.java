package com.example.learnspringboot.model;

public class Cources {
	private long id;
	private String courcse;
	private String author;
	private String app;
	
	public Cources(long id, String courcse, String author, String app) {
		super();
		this.id = id;
		this.courcse = courcse;
		this.author = author;
		this.app = app;
	}
	public long getId() {
		return id;
	}
	public String getCourcse() {
		return courcse;
	}
	public String getAuthor() {
		return author;
	}
	
	public String getApp() {
		return app;
	}
	
	@Override
	public String toString() {
		return "Cources [id=" + id + ", courcse=" + courcse + ", author=" + author + app+"]";
	}

}
