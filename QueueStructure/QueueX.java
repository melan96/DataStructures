public class QueueX{

	//initializatation of queue elements
	private int front;
	private int rear;
	private int[] queueList;
	private int queueMaxSize;
	private int queueCurrentSize;


	//constructor
	public QueueX(int queueMaxSize){
		
		this.queueMaxSize=queueMaxSize;
		queueList[] = new int[this.queueMaxSize];
		front=0;
		rear=-1;
		queueCurrentSize=0;
		
	}

	//add an element to queue
	// in add method queue started increment rearValue one by one

	public void addQueue(int value){
		//in this method, verify current queueStack not full
		if(queueCurrentSize==queueMaxSize-1){
			System.out.println("Queue is full");
		}else{
			
			queueList[++rear]=value;
			queueCurrentSize++;	
		} 	
	}
	
	// in add method queue started increment rearValue one by one

	public void removeQueue(){
		//in this method should verify queue is not empty
		if(queueCurrentSize==0){
			System.out.println("Queue is empty");
		}else{
			queueCurrentSize--;
			queueList[front++]=null;
		}
	}

	//peek method check CurrentFrontValueSize	

	public void peekQueue(){
		if(queueCurrentSize==0){
			System.out.println("Queue is Empty");
		}else{
			System.out.println("Peek Value  :"+queueList[front]);
		}
	}
}
