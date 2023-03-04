//Remove dups in unsorted linklist

//Solved in 2 Loops [Completed]

//In solution using hashmap => O(n)

//how to solve without temp   // Not working for me


import java.util.Scanner;
import java.util.HashSet;

class node{
  node next = null;
  int data;
  node(int data,node next){
    this.data = data;
    this.next = next;
  }
}

class removeDup{
  public static void main(String arg[]){
    Scanner sca = new Scanner(System.in);
    node list = null;
    node head = null;

    for(int i=0;i<7;i++){
      System.out.println("Enter the data :");
      int val = sca.nextInt();
      if(head == null){
        node temp = new node(val,null);
        list = head = temp;
      }
      else{
        node temp = new node(val,null);
        list.next = temp;
        list = list.next;
      }
    }
    travels(head);
    RemoveUsingHash(head);
    // RemoveDup(head);
    // removeWithoutBuffer(head); // Not working
    travels(head);
  }

  public static void removeWithoutBuffer(node head){
    node prev = head;
    while(prev != null){
      node temp = prev;
      while(temp.next != null){
        if(temp.next.data == prev.data){
          System.out.println("->"+prev.data);
          temp = temp.next.next;
        }else{
          temp = temp.next;
        }
      }
      prev = prev.next;
    }
  }

  public static void RemoveUsingHash(node head){
    HashSet<Integer> list = new HashSet<Integer>();
    node prev = null;
    // node temp = head;
    while(head != null){
        if(list.contains(head.data)){
          prev.next = head.next;
        }else{
          list.add(head.data);
          prev = head;
        }
        head = head.next;
    }
  }

  public static void RemoveDup(node head){
    System.out.println("Searching...");
    node temp = head;
    node head1 = head;
    node che = head1;
    int data = 0;
    while(temp.next != null){
      node innLoop = temp.next;
      while(innLoop != null){
        if(innLoop.data == temp.data){
          innLoop.data = -1;
        }
          innLoop = innLoop.next;

      }
      if(temp.data == -1){
        head1.next = temp.next;
        // temp.next = temp.next.next; Not Working
        System.out.println("->"+head1.data);
      }else{
        head1 = temp;
      }
      temp = temp.next;
    }
    if(temp.data == -1){
      head1.next = null;
    }
    // travels(che);
  }

  public static void travels(node head)
  {
    System.out.println("Travels :");
    node temp = head;
    while(temp.next != null){
      System.out.println(temp.data);
      temp = temp.next;
    }
    System.out.println(temp.data);
  }
}
