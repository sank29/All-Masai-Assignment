package com.ques6;

public class ChildOfParent extends Parent {

	public static void main(String[] args) {

		Parent parent = null;

		try {
			parent = new Parent();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		parent.fun1();

	}
}
