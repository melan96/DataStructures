public class QueueX{

private int queueArr[];
private int maxSize;
private int rear;
private int front;
private int nItems;


//Constructor 
public QueueX(int maxSize){
  this.maxSize=maxSize;

  //default configs
  queueArr = new int[maxSize];
  rear=-1;
  front=0;
  nItems=0;
}

public void insert(int j){
  queueArr[++rear]=j;
  nItems++;
}

public int remove(){

  return queueArr[front++];
  
}
 public boolean isEmpty(){

   if(rear == -1)
    return true;
  else
    return false;
 }

 public boolean isFull(){

   if(nItems == rear+1){
     return true;
   }else{
     return false;
   }
 }

}