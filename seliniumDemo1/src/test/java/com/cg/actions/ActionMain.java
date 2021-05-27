package com.cg.actions;

public class ActionMain {
	public static void main(String[] args) throws InterruptedException{
		ActionsDemo ad =new ActionsDemo();
		ad.loadUrl();
		ad.getTitle();
		ad.hoverMouse();		
	}
}