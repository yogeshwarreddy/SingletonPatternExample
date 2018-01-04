package me.yogeshwar.singleton;

import java.util.Date;

public class MySingleton {
	static MySingleton instance;
	private MySingleton() {
	}
	public static MySingleton getInstance() {
		if (instance == null) {
			synchronized (MySingleton.class) {
				if(instance == null)
					instance = new MySingleton();
			}
		}
		return instance;
	}	
	String name;
	Date created_on;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the created_on
	 */
	public Date getCreated_on() {
		return created_on;
	}
	/**
	 * @param created_on the created_on to set
	 */
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
}
