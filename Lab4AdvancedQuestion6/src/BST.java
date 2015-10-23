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
	public Link search(Link node,int key) {
		if(key==node.data || node==null){
			return node;
		}
		if(key> node.data){
			return search(node.right,key);
		}
		else return search(node.left,key);
	}
	public void postorder(Link node){
		if(node!= null){
			postorder(node.left);
			postorder(node.right);
			System.out.println(node.data);
		}
	}
	int a,b;
	public int height(Link node) {
		if(node.left==null && node.right== null){
			return 0; 
		}
		if(node.left!= null)
			a= height(node.right);
		if(node.right!= null)
			b= height(node.left);
		return 1+ Math.max(a, b);
	}
	
	int count=0;
	public int depth(Link node) {
		while(node!= root){
			node= node.parent;
			count++;
		}
		return count;
	}
	
	public int subtreeSize(Link node){
		if(node!= null){
			return 1+ subtreeSize(node.left)+ subtreeSize(node.right);
		}
		return 0;
	}
	public int rank(Link node) {
		int localRank= subtreeSize(node.left)+1;
		Link curr= root;
		int baseRank= 1;
		while(curr!= node){
			if(node.data>curr.data){
				int tempLocalRank=0;
				//System.out.println(curr.data+"dds");
				if(curr.left!= null)
					 tempLocalRank= subtreeSize(curr.left)+1;
				else tempLocalRank=1;
				//System.out.println(tempLocalRank);
				baseRank= baseRank+tempLocalRank;
				curr= curr.right;
			}
			else{
				curr= curr.left;
			}
		}
		int rank= baseRank+localRank-1;
		
		return rank;
	}
	public boolean queryQuestion(int begin, int end) {
		Link curr= root;
		int flag=0;
		while(true){
		if(rank(curr)>begin && rank(curr)<end){
			Link tempLeft= new Link();
			Link tempRight= new Link();
			tempLeft= curr;
			tempRight= curr;
			while(tempLeft.left!= null){
				tempLeft= tempLeft.left;
			}
			if(rank(tempLeft)==begin){
				while(tempRight.right!= null){
					tempRight= tempRight.right;
				}
				if(rank(tempRight)==end){
					flag=1;
					System.out.println("YES");
					return true;
				}
				else{
					System.out.println("NO");
					return false;
				}
			}
			else{
				System.out.println("NO");
				return false;
			}
		}
		else if(rank(curr)==begin){
			Link tempRight= new Link();
			tempRight= curr;
			if(tempRight.left!= null){
				flag=1;
				System.out.println("NO");
				return false;
			}
			else{
			while(tempRight.right!= null){
				tempRight= tempRight.right;
			}
			if(rank(tempRight)==end){
				flag=1;
				System.out.println("YES");
				return true;
			}
			else{
				while(tempRight.left!= null){
					tempRight= tempRight.right;
				}
				if(rank(tempRight)==begin){
					flag=1;
					System.out.println("YES");
					return true;
				}
				else {
					System.out.println("NO");
					return false;
				}
			}
			
		}
		}
		else if(rank(curr)==end){
			Link tempLeft= new Link();
			tempLeft= curr;
			if(tempLeft.right!= null){
				flag=1;
				System.out.println("NO");
				return false;
			}
			else{
			while(tempLeft.left!= null){
				tempLeft= tempLeft.left;
			}
			if(rank(tempLeft)==begin){
				flag=1;
				System.out.println("YES");
				return true;
			}
			else{
				while(tempLeft.right!= null){
					tempLeft= tempLeft.right;
				}
				if(rank(tempLeft)==begin){
					flag=1;
					System.out.println("YES");
					return true;
				}
				else {
					System.out.println("NO");
					return false;
				}
			}
			}
		}
		else{
			if(rank(curr)>end){
				curr= curr.left;
			}
			else curr= curr.right;
		}
	}
	}
	public int find(int n) {
		int k= n/2;
		for(int i=k;i>=1;i--){
			int begin= 1;
			int end= i;
			if(queryQuestion(begin,end)){
				begin= n-i+1;
				end= n;
				if(queryQuestion(begin,end)){
					return i;
				}
			}
		}
		return -1;
	}
}