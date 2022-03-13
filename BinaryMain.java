import java.util.*;

public class BinaryMain{
    public static void main(String args[]){
        Node T = null;
        int choice, c=0 ,i=0, n, data;
        
        Scanner in = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        
        System.out.print("Enter the total number of integers you want to insert : ");
        n = in.nextInt();
        System.out.print("Enter the Integers : ");
        
        while(i<n){
            data = in.nextInt();
            T = Insert(data,T);
            i++;
        }
        while(true){
            System.out.print("\n1. Inorder\n2. Preorder\n3. Postorder\n4. Exit\nEnter your choice : ");
            choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Inorder traversal of the Tree : ");
                    bt.inorder(T);
                    break;
                case 2:
                    System.out.print("Preorder traversal of the Tree : ");
                    bt.preorder(T);
                    break;
                case 3:
                    System.out.print("Postorder traversal of the Tree : ");
                    bt.postorder(T);
                    break;
                case 4:
                    System.out.print("GoodBye!!! \n");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }                    
        }    
    }   

    public static Node Insert(int data, Node T) {      
        
        Node node = new Node();
        if(node == null){
            System.out.println("Out of space");
        }
        else{
            if(T == null){
                node.data = data;
                node.left = null;
                node.right = null;
                T = node;                
            }
            else{
                if(data < T.data){
                    T.left = Insert(data, T.left);                  
                }
                else{
                    T.right = Insert(data, T.right);
                }
            }
        }
        return T;
    }    
}