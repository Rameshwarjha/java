import java.util.*;

public class App{
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

    }
    public static Node construct(int[]data){
        Stack<Node>st= new Stack<>();
        Node root =null;

        for(int i=0; i<data.length;i++){
            int val= data[i];

            if(val==-1){
                st.pop();

            }
            else{
                Node n = new Node();
                n.data= val;
                //if something is already in the stack then push n into the stack and then also push it in 
                //the arraylist of the element present on the peek of the stack

                if(st.size()>0){
                    st.peek().children.add(n);


                }else{
                    root =n;
                }
                st.push(n);

            }
        }
        return root;



    }
    public static void display(Node root){
        System.out.print(root.data + "->");

        for(int i=0; i<root.children.size();i++){
            //print root and its children
           // System.out.print(root.children.get(i).data);       //could be used directly
           Node child = root.children.get(i);
           System.out.print(child.data+ ",");


        }
        System.out.println(".");
        // faith that all the childrens would get their child print 
        for(int i= 0; i<root.children.size();i++ ){
            Node child = root.children.get(i);
            display(child);

        }


    }
    public static void main(String[]args){
        int[]arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1};

        Node root =construct(arr);
        display(root);


    }
}