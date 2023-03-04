import java.util.Scanner;

class node{
  node next = null;
  int data = 0;

  public node(){
  }

  public node(int data,node next){
    this.data = data;
    this.next = next;
  }

  public node(int data){
    this.data = data;
  }
}

public class basic{
  public static void main(String arg[]){
    //Create :
    Scanner sca = new Scanner(System.in);
    System.out.println("How many Node you want :");
    int count = sca.nextInt();
    int data=0;
    node list=null;
    node head = null;

    for(int i=0;i<count;i++){
      System.out.print(i+" : ");
      data = sca.nextInt();
      if(head == null){
        node temp = new node(data,null);
        head = temp;
        list = head;
      }
      else{
        node temp = new node(data,null);
        list.next = temp;
        list = list.next;
      }
    }
    travels(head);

    //Delete :

    // System.out.println("Enter the postion :");
    // int pos = sca.nextInt();
    // head = delete(head,pos);
    // System.out.println("\nAfter Deleted:");
    // travels(head);


    System.out.println("\nMiddle : "+runningTechToFindMin(head));
    travels(head);
  }

  public static node delete(node head,int pos){
    node temp = head;
    if(temp.data == pos){
      System.out.println("Deleted");
      return temp.next;
    }

    while(temp.next != null){
      if(temp.next.data == pos){
        System.out.println("Deleted");
        temp.next =temp.next.next;
        return head;
      }
      temp = temp.next;
    }
    System.out.println("Not Found");
    return head;
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

    public static int runningTechToFindMin(node head) {
      node temp = head;
      node fast = head;
      node slow = head;

      while(fast!=null){
        System.out.println(slow.data);
        fast = fast.next.next;
        slow = slow.next;

        if(fast.next == null || fast.next.next==null){
          slow = slow.next;
          System.out.println("here");
          break;
        }
        // if(fast.next.next==null){
        //   slow = slow.next.next;
        //   System.out.println("here");
        //   break;
        // }
      }
      return slow.data;
    }
}

/*
  If we having trouble to solving a LL you should explore if a Recursion Approach will work
*/
