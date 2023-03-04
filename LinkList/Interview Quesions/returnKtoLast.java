//   Return Kth to Last :

/*
    return the kth value and the last postion in the  linklist
*/

//Recursive : O(n)

import java.util.Scanner;
class node{
  int data;
  node next;

  node(int data,node next){
    this.data = data;
    this.next = next;
  }
}

class returnKtoLast{
  public static void main(String arg[]){
    Scanner sca = new Scanner(System.in);
    node head = null;
    node temp = null;
    for(int i=0;i<7;i++){
      System.out.println("Enter the data :");
      int val = sca.nextInt();
      node newNode = new node(val,null);
      if(head == null){
        head = newNode;
        temp = head;
      }else{
        // while(temp.next!= null){
        //     temp = temp.next;
        // }
        temp.next = newNode;
        temp = temp.next;
      }
    }

    System.out.println("From which position you want to print :");
    int k=sca.nextInt();

    travels(head);
    System.out.println("Own");
    System.out.println("-> "+kToLastData(k,head));

    System.out.println("Recursive");
    System.out.println("-> "+kToLastDataRec(k,head));
  }

  public static int kToLastDataRec(int k,node temp){
    if(temp == null)
        return 0;

    int i=kToLastDataRec(k,temp.next)+1;
    if(i == k){
      System.out.println("-> "+temp.data);
    }
    return i;
  }

  public static int kToLastData(int k,node temp){
    int i=0;
    System.out.println("After the Kth position");
      while(temp != null){
        ++i;
        if(i == k){
          System.out.println(temp.data);
        }
        temp = temp.next;
      }
      return i;
  }

  public static void travels(node temp){
    // node temp = head;
    System.out.println("Travels : ");
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}
