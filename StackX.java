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

		topValue++;
		stackArray[topValue]=value;
	}

	public void pop(){

		stackArray[—topValue]=null;
		
		
	}

}
