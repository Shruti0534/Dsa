
 import java.util.*;
public class preorder{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;


        }
        public static void preorder(Node root){// root, left ,right
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){//inorder= left, root, right
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            
            inorder(root.right);
        }
        public static void postorder(Node root){//postorder= left,right,root
            if(root==null){
                return;
            }
            postorder(root.left);
            
            
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelorder(Node root){//levelorder= level wise data
            if(root==null){
                return;
            }
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode= q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+"");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
                

            }

            
        }
        public static int height( Node root){
            if(root==null){
                return 0;
            }
           int l=height(root.left);
            int r=height(root.right);
            return Math.max(l,r)+1;
        }
        public static int countNode(Node root){
            if(root==null){
                return 0;
            }
            int l=countNode(root.left);
            int r=countNode(root.right);
            return l+r+1;
        }
        public static int sumNode(Node root){
            if(root==null){
                return 0;
            }
            int l=sumNode(root.left);
            int r=sumNode(root.right);
            return l+r+root.data;
        }
        public static int Diameter(Node root){
            if(root==null){
                return 0;
            }
            int l=height(root.left);
            int r=height(root.right);
             int selfDiameter=l+r+1;
            int ld=Diameter(root.left);
            int rd=Diameter(root.right);
            return Math.max(selfDiameter,Math.max(ld,rd));
        }

    }
    public static void main(String args[]){
        int nodes[]={ 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        //output 1;
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
       tree.levelorder(root);
       System.out.println("height=" + tree.height(root));
       System.out.println("count of node"+tree.countNode(root));
       System.out.println("sum of node"+tree.sumNode(root));
       System.out.println("Diameter"+tree.Diameter(root));





    }
    /* output
   1
1 2 4 5 3 6 
4 2 5 1 3 6 
4 5 2 6 3 1 
1
23
456
height=3
count of node6
sum of node21
Diameter5
 */
}
