//Delete Middle node

/*

input :
  c
  a->b->c->d->e->f

output :
  a->b->d->e->f
import java.util.Scanner;

*/

//I Just take the Count and assige the Middle val but

// They only Provide the pre-midd-node we want to delete the next node

import java.util.Scanner;



public class deletMidd{

  public static class node{
    int data;
    node next;

    node(int data,node next){
      this.data = data;
      this.next = next;
    }
  }

  static node head = null;
  public static void main(String arg[]){
    Scanner sca = new Scanner(System.in);

    node temp = null;
    node midd = null;
    for(int i=0;i<4;i++){
      System.out.println("Enter the data :");
      int val = sca.nextInt();
      node newNode = new node(val,null);
      if(head == null){
        head = newNode;
        temp = head;
      }else{
        temp.next = newNode;
        if(i == 2)
          midd = new node(temp.data,temp.next);
        temp = temp.next;
      }
    }

    int count = getCount(head);
    // deleteMidd(head,count);  With count
    deleteNextPreMidd(midd);
    getCount(head);
  }

  public static boolean deleteNextPreMidd(node midd){
    if(midd == null || midd.next == null){
      return false;
    }

    node temp = midd.next;
    System.out.println(midd.data+" "+midd.next);
    midd.data = temp.data;
    midd.next = temp.next;
    System.out.println(midd.data+" "+midd.next);
    getCount(head);
    return true;
  }

  public static void deleteMidd(node head,int count){
    node temp = head;
    node temp1 = head;
    int midd = count/2;
    System.out.println(count+" "+midd);

    for(int i=1;i<midd;i++){
      if(temp == null){
        System.out.println("No Midd");
        return;
      }
      temp1 = temp;
      temp = temp.next;
    }
    temp1.next = temp.next;

    System.out.println("Deleted...!");
    int i = getCount(temp1);
  }

  public static int getCount(node temp){
    // node temp = head;
    System.out.println("Travels : ");
    int i=0;
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.next;
      i++;
    }
    return i;
  }
}
