package com.collections.linkedlist;

public class Node
{
	Node next = null;
	int data = -1;
	public Node(int d)
	{
		data= d;
	}
	
	void appendToTail(int d)
	{
		Node end = new Node(d);
		Node n = this;
		while(n.next != null)
			n = n.next;
		n.next = end;
	}
	
	void printAllNodes()
	{
		Node temp = this;
		while(temp != null)
		{
			System.out.print(temp.data);
			System.out.print((temp.next != null) ? "-->" : "");
			temp = temp.next;	
		}	
	}
}