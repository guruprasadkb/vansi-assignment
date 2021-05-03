import java.util.*;

public List<Integer>PostorderTraversal(TreeNode root){

         list<Integer>output=new ArrayList<>();
         PostorderTraversal(root values){
             return values;
        }
private void PostorderTraversalRecur(TreeNode root,List<Integer>List){
        if(root==null)return;
    
        PostorderTraversalRecur(root.left,list);
        PostorderTraversalRecur(root.right,list);
        List.add(root.val);
       }

public List<Integer>iterativePostorderTraversal(TreeNode root){
      List<Integer>List=new LinkedList<>();
      stack<TreeNode>stack=new Stack<>();

      if(root==null)return List;
      stack.add(root);

      while(stack.isEmpty()==false){
      TreeNode top=stack.pop();
      List.add(0,top.val);
       if(top.left==null){
            stack.add(top.left);
        }
        if(top.right==null){
            stack.add(top.right);
        }
    }
}
}

