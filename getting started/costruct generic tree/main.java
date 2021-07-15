
import java.util.*;
public class main{
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

    }
    public static Node construct(int[]data){
        Stack<Node>st= new Stack<>();
        Node root=null;

        for(int i=0; i<data.length ; i++){
            int val= data[i];

            if(val==-1){
                st.pop();

            }
            else{
                Node n = new Node();
                n.data = val;
                
                if(st.size()>0){
                    // child node
                    st.peek().children.add(n);

                }
                else{
                    //first time node found so root
                    root= n;


                }
                st.push(n);

            }
        }
        return root;
    }
    public static void display(Node root){
        System.out.print(root.data + "->");

        for(int i=0; i<root.children.size();i++){
            //direct code for printing root and their data written data
           // System.out.print(root.children.get(i).data+ ",");

           //print loop and children step by step
           Node child = root.children.get(i);  // get child from children arraylist
           System.out.print(child.data + ",");  // print data of the child

        }
        System.out.println(".");  // print . at the last

        //faith to print children
        for(int i=0; i<root.children.size();i++){
            Node child = root.children.get(i);     // get the child from the children arraylist
            display(child);                        // call the display fuction for each child
        }


    }
    public static void main(String[] args){
        int[]arr1= {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1};

        Node root = construct(arr1);

        display(root);

        
    

    
    }
}