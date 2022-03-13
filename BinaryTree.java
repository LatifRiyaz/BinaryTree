public class BinaryTree{
    
    Node root;   

    public void inorder(Node T){       
        
        if(T != null){
            inorder(T.left);            
            System.out.print(T.data + " ");            
            inorder(T.right);
        }
    }
    
    public void preorder(Node T){
        
        if(T != null){
            System.out.print(T.data + " ");                       
            preorder(T.left);                        
            preorder(T.right);            
        }
    }
    
    public void postorder(Node T){
        
        if(T != null){
            postorder(T.left);                
            postorder(T.right);               
            System.out.print(T.data + " ");
        }
    }
}