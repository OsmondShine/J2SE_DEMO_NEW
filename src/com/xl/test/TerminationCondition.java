package com.xl.test;

/*
 * @author 作者:xl
 * @data   创建时间:2017-8-20
 * @description 
 * @version 1.0
 */

class Book {
	boolean checkedOut = false;
	Book(Boolean checkedOut){
		checkedOut = checkedOut;
	}
	
	void checkIn(){
		checkedOut = false;
	}
	
	@Override
	protected void finalize() {
		if (checkedOut){
			System.out.println("Error:checked out");
			try {
				//super.finalize();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class TerminationCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();
		
		new Book(true);
		System.gc();
		}
}