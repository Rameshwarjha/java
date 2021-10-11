            import java.util.*;
            public class construct {
                
                public static class Node{
                    int data; 
                    Node left;
                    Node right;

                    Node(){

                    }
                    Node(int data){
                        this.data=data;
                    }

                }
                public static class Pair{
                    Node node;
                    int state;

                    Pair(){

                    }
                    Pair(Node node,int state){
                        this.node =node;
                        this.state =state;


                    }
                }
                public static void main(String[] args){
                    //Scanner scn = new Scanner(System.in);
                    //int n = scn.nextInt();
                    // Integer[] arr=new Integer[n];
                    // for(int i=0; i<n;i++){
                    //     arr[i]=scn.nextInt();
                    // }
                    Integer[]arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

                    Node root = construct(arr);
                    System.out.println(root.data);
                    System.out.println(root.left.data +"<-"+ root.data +"->" +root.right.data);
                    
                    display(root);



                }
                public static Node construct(Integer[]arr ){
                    Stack<Pair> st = new Stack<>();
                    Node root = new Node(arr[0]);
                    Pair first = new Pair(root,1);

                    st.push(first);
                    int pointer =1;   // as 0th already done
                    while(st.size()>0){
                        // System.out.println("hi");

                        Pair peek = st.peek();
                            

                            if(peek.state==1){
                                if(arr[pointer]!=null){
                                    Node currentnode =new Node(arr[pointer]);
                                    peek.node.left =currentnode;
                                    Pair current = new Pair(currentnode,1);
                                    st.push(current);
                                }
                                    pointer++;
                                    peek.state++;

                            }else if(peek.state==2){
                                if(arr[pointer]!=null){
                                    Node currentnode =new Node(arr[pointer]);
                                    peek.node.right =currentnode;
                                    Pair current = new Pair(currentnode,1);
                                    st.push(current);
                                }
                                pointer++;
                                peek.state++;

                            }else{
                                System.out.println(st.pop().node.data);
                            }
                        
                    }
                    return root;
                }
                public static void display(Node root){
                    Stack<Node> st = new Stack<>();

                    st.push(root);
                    while(st.size()>0){
                        Node rem= st.pop();
                        rem.left!=null?
                        if(rem.right!=null){
                            Node right=rem.right;        //first right as so that it will go lower in the stack and executed later
                            st.push(right);
                        }
                        if(rem.left!=null){
                            Node left= rem.left;         //after right the left so that it will be on top and executed first 
                            st.push(left);

                        }

                    }

                }
            }
