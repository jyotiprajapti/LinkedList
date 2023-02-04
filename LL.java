package com.practice.dataStructures;

import java.util.LinkedList;

public class LL {
	Node head;	
class Node{
	String data;
	Node next;
	
	Node(String data){
		this.data = data;
		next = null;
	}
	
}
// ADD FIRST
public void addFirst( String data) {
	Node newNode = new Node(data);
	   if(head == null) {
		   head=  newNode;
		   return;
		   }
	   newNode.next = head;
	   head = newNode;
}


// ADD LAST
public void addLast(String data) {
	Node newNode = new  Node(data);
	if(head==null) {
		head=	newNode;
		return;
	}
	
	Node currNode=head;
	while(currNode.next!=null) {
		currNode=currNode.next;
	}
	currNode.next=newNode;
}
//PRINT LIST
public void printList() {
	if(head==null) {
		System.out.println("list is empty");
		return;
	}
	Node currNode = head;
	
	while(currNode!=null) {
		System.out.print(currNode.data +"-->");
		currNode=currNode.next;
	}
	System.out.println("null ");
}

//DELETE FIRST
public void deleteFirst() {
	if(head ==null) {
		System.out.println("list is empty");
		return;
	}
	head =head.next;
}

public void deletLast() {
	if(head ==null) {
		System.out.println("list is empty");
		return;
	}
	if(head.next==null) {
		head=null;
		return;
	}
	Node secondLast =head;
	Node lastNode = head.next;
	while(lastNode.next!=null) {
		lastNode=lastNode.next;
		secondLast=secondLast.next;
		
	}
	secondLast.next=null;
}
	public static void main(String[] args) {
	
       LL list    = new LL();
       list.addFirst("abc");
       list.addLast("fgjdgh");
       list.addFirst("abch");
       list.addFirst("abch");
       list.addFirst("abch");
       list.addFirst("abch");
       //list.printList();
//       list.deleteFirst();
//       list.printList();
//       list.deletLast();
       list.printList();
     
}
}
