package tje.jdbc.model;

import java.io.Serializable;
import java.util.*;

public class Notice implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String msg;
	private Date date;
	
	
	public Notice(int id, String msg, Date date) {
		super();
		this.id = id;
		this.msg = msg;
		this.date = date;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
