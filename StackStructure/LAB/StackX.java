public class StackX{


	private int top;
	private char array[];
	private int size;


	public StackX(int size){
		this.size = size;
		array = new char[size];
		top=-1;

	}

	public void push(char ch){

		if(isFull() == true){
			System.out.println("Stack is Full");
		}else{

				array[++top]=ch;
		}

	}
public char pop(){

	if(isEmpty()==true){
		System.out.println("Stack is Full");
		return 'a';
	}else{

		System.out.println("pull method called  "+array[top]+" removed");
		return array[top--];
	}

}

public boolean isFull(){

		if(top == size-1){
				return true;

		}else{
				return false;
		}

}
public boolean isEmpty(){

	if(top==-1){
		return true;
	}else{
		return false;
	}
}

public void removalOrder(){

	while(!isEmpty() == true){
		System.out.println(" "+array[top]+" " );
	}

}


public void insertedOrder(){


}
}
