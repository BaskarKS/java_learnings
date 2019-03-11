package com.collections.linkedlist;
public class SingleLinkedList
{
	public static void main(String[] args)
	{
		Node head = new Node(10);
		head.appendToTail(9);
		head.appendToTail(8);
		head.appendToTail(7);
		head.appendToTail(6);
		head.appendToTail(5);
		head.appendToTail(4);
		head.printAllNodes();
	}
}