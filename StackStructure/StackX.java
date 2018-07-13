 public class StackX{


	private int topValue;
	private double[] stackArray;
	private int stackSize;


	//initialize the constructor
	public StackX(int stackSize){
		
		stackArray[] = new double[stackSize];
		topValue=-1;
		
		
	}

	public void push(double value){

		
		stackArray[++topValue]=value;
	}

	public void pop(){

		stackArray[—topValue]=null;
		
		
	}

	public void peek(){
		System.out.println(“Current Peek. :: element Number :  ”+topValue+” Element Value(Peek ). :”+stackArray[topValue]);
	}

}
