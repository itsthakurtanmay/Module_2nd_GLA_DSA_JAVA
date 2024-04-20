import java.util.Scanner;

/**
 * binaryTree
 */
public class binaryTree {
    static class node{
        int data;
        node left;
        node right;

        node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    public static node binary_Tree(){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        if(val == -1)return null;
        node newnode = new node(val);

        System.out.println("Enter the Left child Node of : "+newnode.data);
        newnode.left = binary_Tree();
        System.out.println("Enter the Right child Node of : "+newnode.data);
        newnode.right = binary_Tree();
        return newnode;
    }

    public static void inOrder(node root){
        if(root == null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void preOrder(node root){
        if(root == null)return;
        System.out.print(root.data+" ");
        preOrder(root.left); 
        preOrder(root.right);
    }

    public static void postOrder(node root){
        if(root == null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        System.out.println("Enter the Root Node : ");
        node root = binary_Tree();

        System.out.println();
        System.out.println("InOrder Traversal Of Tree");
        inOrder(root);

        System.out.println();
        System.out.println("PreOrder Traversal Of Tree");
        preOrder(root);

        System.out.println();
        System.out.println("PostOrder Traversal Of Tree");
        postOrder(root);

        
    }
}