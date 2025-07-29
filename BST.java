 class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class BST {
    public static void main(String[] args) {
        int[] array= {1,3,4,8,9,10};
        TreeNode root=null;
        for(int i=0;i<array.length;i++){

            root=insert(root,array[i]);
        }
        display(root);
    }
    static TreeNode insert(TreeNode root,int val){
        if(root==null){
            root=new TreeNode(val);
            return root;
        }
        if(val<root.val){
           root.left= insert(root.left,val);
        }
        else{
           root.right= insert(root.right,val);
        }
        return root;
        
    }
    static void display(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
        display(root.left);}
        System.out.println(root.val);
        if(root.right!=null)
        display(root.right);
    
        
       
    }
}
