import java.util.*;
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

  public static void preOrder(node root){
    if(root == null)return;
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
  }
  public static void postOrder(node root){
    if(root == null)return;
    preOrder(root.left);
    preOrder(root.right);
    System.out.print(root.data+" ");
  }
  public static void inOrder(node root){
    if(root == null)return;
    preOrder(root.left);
    System.out.print(root.data+" ");
    preOrder(root.right);
  }
  
  public static node binarytree(){
    Scanner sc = new Scanner(System.in);
    int val = sc.nextInt();
    
    if(val == -1)return null;
    node newnode = new node(val);
    System.out.println("Enter the left child Node : "+ newnode.data);
    newnode.left = binarytree();
    System.out.println("Enter the right child Node : "+ newnode.data);
    newnode.right = binarytree();
    return newnode;
  }
  
    public static void main(String[] args) {
    System.out.println("Enter the Root Node : ");
      node root = binarytree();
      System.out.println();
      System.out.println("Preorder traversal of Tree: ");
      preOrder(root);
      System.out.println();
      System.out.println("Inorder traversal of Tree: ");
      inOrder(root);
      System.out.println();
      System.out.println("Postorder traversal of Tree: ");
      postOrder(root);
      
  }
}