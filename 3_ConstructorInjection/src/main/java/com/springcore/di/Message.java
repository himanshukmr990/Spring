package com.springcore.di;
 

public class Message{	
	private int id;
	private String msg; 
	
	public Message() {  
		System.out.println("no args constructor");
    }
	
	public Message(int id) {  
		System.out.println("*int id*");
		this.id = id;
	}
	public Message(String msg) {   
		System.out.println("*String msg*");
		this.msg = msg;
	}
	
	public Message(int id, String msg) {  
		System.out.println("*int id, String msg*");
		this.id = id;
		this.msg = msg;
	} 
		
	public void getMsg() { 
		System.out.println("MSG :"+ msg +" "+ "ID :"+id);
		
	}
	 
	

}
