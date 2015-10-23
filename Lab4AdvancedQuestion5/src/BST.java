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
	public int combinations(int n,int r){
		if(n==r) return 1;
		if(r==1) return n;
		if(r==0) return 1;
		return combinations(n-1,r)+ combinations(n-1,r-1);
	}
	public int subtreeSize(Link node){
		if(node!= null){
			return 1+ subtreeSize(node.left)+ subtreeSize(node.right);
		}
		return 0;
	}
	int l,r;
	public int orderings(Link node){
		if(node==null){	
			return 1;
		}
		l= subtreeSize(node.left);
		r=subtreeSize(node.right);
		return combinations(l+r,l)*orderings(node.left)*orderings(node.right);
	}
}