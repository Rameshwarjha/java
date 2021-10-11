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
                    
                    // display(root);
                    display1(root);



                }
                public static Node construct(Integer[]arr ){
                    Stack<Pair> st = new Stack<>();
                    Node root = new Node(arr[0]);
                    Pair first = new Pair(root,1);

                    st.push(first);
                    int pointer =0;   // as 0th already done
                    while(st.size()>0){
                        // System.out.println("hi");

                        Pair peek = st.peek();
                            

                            if(peek.state==1){
                                pointer++;
                                if(arr[pointer]!=null){
                                    Node currentnode =new Node(arr[pointer]);
                                    peek.node.left =currentnode;
                                    Pair current = new Pair(currentnode,1);
                                    st.push(current);
                                }
                                    
                                    peek.state++;

                            }else if(peek.state==2){
                                pointer++;
                                if(arr[pointer]!=null){
                                    Node currentnode =new Node(arr[pointer]);
                                    peek.node.right =currentnode;
                                    Pair current = new Pair(currentnode,1);
                                    st.push(current);
                                }
                                
                                peek.state++;

                            }else{
                                System.out.println(st.pop().node.data);
                            }
                        
                    }
                    return root;
                }
                public static void display1(Node root){

                    if(root==null){
                        return;
                    }

                    String str= "";
                    str=root.left!=null?root.left.data+"<-":".<-";
                    str+=root.data+"";
                    str+=root.right!=null?"->"+root.right.data:"->.";

                    System.out.println(str);

                    display1(root.left);
                    display1(root.right);

                }
                public static void display(Node root){
                    Stack<Node> st = new Stack<>();

                    st.push(root);
                    while(st.size()>0){
                        Node rem= st.pop();
                        String str="";
                        str =rem.left!=null?rem.left.data+"<-" :"."+"<-";
                        str+=rem.data;

                        str+= rem.right!=null?"->"+rem.right.data:"->.";
                        System.out.println(str);
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
