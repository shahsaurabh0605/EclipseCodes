import java.util.*;
public class BST {
	Link root;
	Link current;
	public void insert(int data) {
		Link node= new Link(data);
		if(root==null){
			root= node;
			root.parent= null;
			root.left= null;
			root.right= null;
			
		}
		else{
			current= root;
			while(true){
				if(node.data>= current.data){
					if(current.right==null){
						current.right= node;
						node.parent= current;
						node.left= null;
						node.right= null;
						current= node;
						break;
					}
					else current= current.right;
				}
				else{
					if(current.left==null){
						current.left= node;
						node.parent= current;
						node.left= null;
						node.right= null;
						current= node;
						break;
					}
					else current= current.left;
				}
			}
		}
	}
	public Link search(Link node, int key) {
		if(node==null || node.data==key){
				return node;
		}
		else{
			if(key>node.data) return search(node.right,key);
			else return search(node.left,key);
		}
		
	}
	public int max(Link node) {
		while(node.right!=null){
			node= node.right;
		}
		return node.data;
		//System.out.println("max= "+node.data);
	}
	public int min(Link node){
		while(node.left!=null){
			node= node.left;
		}
		return node.data;	
	}
	public int successor(Link node){
		if(node.right!= null){
			return min(node.right);
		}
		Link temp= node.parent;
		while(temp!=null && node== temp.right){
			node= temp;
			temp= node.parent;
		}
		return temp.data;
		
	}
	public int predecessor(Link node) {
		if(node.left!= null){
			return max(node.left);
		}
		Link temp= node.parent;
		while(temp!=null && node== temp.right){
			node= temp;
			temp= node.parent;
		}
		return temp.data;
	}
}