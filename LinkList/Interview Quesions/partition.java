import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Node
{
  int data;
  Node next;
  Node(int key)
  {
      data = key;
      next = null;
  }
}

public class partition{
  public static void main(String arg[]){
    Node node=null;
    Node temp = null;
    Scanner sca = new Scanner(System.in);
    System.out.println("Enter the Data :");
    for(int i=0;i<7;i++){
        int data = sca.nextInt();
        Node nod = new Node(data);
        nod.next = null;
        if(node == null){
            // node nod = new node(lis.get(i),null);
            temp = nod;
            node = temp;
        }else{
            temp.next = nod;
            temp = temp.next;
        }
    }

    // while(node != null){
    //   System.out.print(node.data+" ");
    //     node = node.next;
    // }
      int x =getPoit(node,3);
      node = getSort(node,x);

       temp = node;
       while(temp != null){
         System.out.println(temp.data);
         temp = temp.next;
       }
    }

    public static int getPoit(Node node,int x){
        while(--x>=1){
            node = node.next;
        }
        return node.data;
    }

    public static Node getSort(Node node,int piot){
        // ArrayList<Integer> lis = new ArrayList<Integer>();
        Node right=null;
        Node midd=null;
        Node lef=null;
        Node tempr=null;
        Node tempm=null;
        Node templ=null;
        while(node != null){
            Node tempNode = new Node(node.data);
            tempNode.next = null;
            if(tempNode.data >= piot){
                if(right == null){
                    // node nod = new node(lis.get(i),null);
                    tempr = tempNode;
                    right = tempr;
                }else{
                    tempr.next = tempNode;
                    tempr = tempr.next;
                }
            }else if(tempNode.data <= piot){
              if(lef == null){
                  // node nod = new node(lis.get(i),null);
                  templ = tempNode;
                  lef = templ;
              }else{
                  templ.next = tempNode;
                  templ = templ.next;
              }
            }else{
              System.out.println("here");
              if(midd == null){
                    // node nod = new node(lis.get(i),null);
                    tempm = tempNode;
                    midd = tempm;
                }else{
                    tempm.next = tempNode;
                    tempm = tempm.next;
                }
            }
            node = node.next;
        }
        templ.next = midd;
        midd.next = tempr;
        return lef;
      }
}
