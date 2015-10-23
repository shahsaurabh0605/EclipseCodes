
public class BST{
	public Link head;
	public Link current;
	public void insert(int data){
		Link temp= new Link(data);
		if(head==null){
			head= temp;
			head.right= null;
			head.left= null;
			head.parent= null;
		}
		else{
			current= head;
			while(true){
				if(temp.data>= current.data){  
					if(current.right!=null){
						current= current.right;	
					}
					else{
						current.right= temp;
						temp.parent= current;
						temp.right= null;
						temp.left= null;
						break;
					}
				}
				else if(temp.data< current.data){
					if(current.left!=null){
						current= current.left;
					}
					else{
						current.left= temp;
						temp.parent= current;
						temp.right= null;
						temp.left= null;
						break;
					}
				}
			}
		}
	}
	public void Inorder(Link head){
		if(head!=null){
			Inorder(head.left);
			System.out.print(head.data);
			Inorder(head.right);
			
		}
	}
}