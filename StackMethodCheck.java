package com.collections;

import java.util.Stack;
import java.util.ArrayList;

public class StackMethodCheck
{
	public static void main(String[] args)
	{
			Stack stkObj = new Stack();
			ArrayList aListObj = new ArrayList();
			aListObj.add("Z");
			aListObj.add(10); //Collection Method
			System.out.println(stkObj.empty()); //Stack Method
			stkObj.push("A");
			stkObj.push("B");
			stkObj.add(1,"C"); //List Method
			System.out.println(stkObj);
			stkObj.addAll(1,aListObj);
			System.out.println(stkObj);
			
			System.out.println(stkObj.peek());
			System.out.println(stkObj);
			
			System.out.println(stkObj.pop());
			System.out.println(stkObj);
			
			System.out.println(stkObj.empty());
			
			System.out.println(stkObj.search("Z"));
			System.out.println(stkObj);
			
			System.out.println(stkObj.search("B")); //"B" isalready popped out hence it return -1
	}
}