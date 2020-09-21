package com.abhinavraj.demo;

import lombok.Data;

@Data
public class LifeCycle {
	boolean initialized,destroy;
	
	public void init() {
		initialized =true;
	}
	
	public void destroyed() {
		destroy=true;
	}

}
