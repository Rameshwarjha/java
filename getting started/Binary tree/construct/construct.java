import java.util.*;

public class construct{

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(){

        }
        Node(int value){
            this.data = value;
        }
    }

    public static class Pair{
        Node node;
        int state;

        Pair(){
        }
        Pair(Node node , int state){
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[]args){
        Integer[]arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

        Node root = Buildtree(arr);

        System.out.println(root.left.data + " <- " + root.data + " -> " + root.right.data);

        display(root);

    }

    public static Node Buildtree(Integer[]arr){
        
        // Integer[]arr = {50,25,12,null,null,37,30,null,null,null,75,62,null};
        
        Node root = new Node(arr[0]);         // "0th " element is taken as root and it is done

        Stack<Pair>st = new Stack<>();

        Pair parentroot = new Pair(root,1);
        st.push(parentroot);
    
        int idx =1;       //{this mistake cost me two days}        // we have set idx as  1 as "0th" element is already pushed in the stack which is "root"  

        while(st.size()>0){
            Node top = st.peek().node;
            int state = st.peek().state;
            

            

            if(state ==1){
                st.peek().state++;

                if(arr[idx] != null){
                    Node lc = new Node(arr[idx]);

                    top.left = lc;
                    Pair left = new Pair(lc,1);
                    st.push(left);

                }
                idx++;


            }else if(state ==2){
                st.peek().state++;

                if(arr[idx] != null){
                    Node rc = new Node(arr[idx]);

                    top.right = rc;
                    Pair right = new Pair(rc,1);
                    st.push(right);

                }
                idx++;


            }
            else if(state ==3){
               
                st.pop();

            }
        }

        return root;


    }

    public static void display(Node root){
        Stack<Node>st = new Stack<>();

        st.push(root);

        while(st.size()>0){
            Node rem = st.pop();
            if(rem.left!=null){
                System.out.print(rem.left.data + " <- ");

            }else{
                System.out.print(". <- ");
            }

            // print root data
            System.out.print(rem.data);

            //print right part
            if(rem.right!=null){
                System.out.print(" -> " + rem.right.data);

            }else{
                System.out.print(" -> .");

            }

            //pudh the right child first
            if(rem.right!=null){
                st.push(rem.right);

            }

            if(rem.left !=null){
                st.push(rem.left);

            }
            System.out.println();
        }



    }
}