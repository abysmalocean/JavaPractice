	package ArrayStructures;
	
	import sun.applet.Main;
	
	public class ArrayStructures {
		private int[] theArray = new int[50]; // create an array with 50 indexes
		private int arraySize = 20 ; //Elements in theArray
		
		//Fills the Array with random values
		public void generateRandomArray()
		{
			for(int i = 0; i < arraySize; i++)
			{
				//Random number 10 through 19
				theArray[i] = (int)(Math.random()*10)+10;
			}
		}
		private void printArray() {
			// TODO Auto-generated method stub
			System.out.println("___________");
			for (int i = 0; i < arraySize; i++) {
				System.out.print("| "+i+" | ");
				System.out.println(theArray[i] + " |");
				System.out.println("___________");
			}
		}
		// return the array content
		public int[] getTheArray()
		{
			return theArray;
		}
		
		// get the array size 
		public int getArraySize() {
			return arraySize;
		}
		
		public int getValueAtIndex(int Index)
		{
			if(Index < arraySize)
				return theArray[Index];
			return 0;
		}
		public int doesArrayContainThisValue(int Value) {
			// TODO Auto-generated method stub
			boolean valueArray = false;
			int count = 0;
			for (int i = 0; i < arraySize; i++) {
				if(theArray[i] == Value)
				{
					valueArray = true;
					count = count + 1 ;
				}
			}
			return count;
		}
		public void deleteIndex(int Index) {
			// TODO Auto-generated method stub
			if(arraySize > Index)
			{
				for (int i = Index; i < theArray.length-1; i++) {
					theArray[i] = theArray[i+1];
				}
				arraySize = arraySize - 1;
			}
		}
		public void deleteElement(int Value) {
			// TODO Auto-generated method stub
			for (int i = 0; i < theArray.length-1; i++)
			{
				if(theArray[i] == Value)
				{
					for (int j = i; j < theArray.length-1; j++) {
						theArray[j] = theArray[j+1];
					}
				}
			}
		}
		public String linearSearchForValue(int Value) {
			// TODO Auto-generated method stub
			boolean valueInArray = false;
			String indexsWithVale = "";
			System.out.print("The Value was Found in the Following Indexes: ");
			for(int i = 0; i < arraySize; i++)
			{
				if(theArray[i] == Value)
				{
					valueInArray = true;
					System.out.print(i + " ");
					indexsWithVale = indexsWithVale + i + " ";
				}
			}//end for
			System.out.println();
			return indexsWithVale;

		}
		
		public static void main(String[] args) {

			ArrayStructures newArray = new ArrayStructures();
			newArray.generateRandomArray();
			newArray.printArray();
			System.out.println("The array size is " + newArray.getArraySize());
			System.out.println("The index 7 is " + newArray.getValueAtIndex(7));
			System.out.println("How many this array contain 9 ( shoud not) " + newArray.doesArrayContainThisValue(9));
			System.out.println("How many this array contain 15 ( shoud) " + newArray.doesArrayContainThisValue(15));
			newArray.deleteIndex(0);
			newArray.printArray();
			System.out.println("How many this array contain 15 ( shoud) " + newArray.doesArrayContainThisValue(15));
			System.out.println("15 index " + newArray.linearSearchForValue(15));
			newArray.deleteElement(15);
			System.out.println("How many this array contain 15 ( shoud) " + newArray.doesArrayContainThisValue(15));
		
			
		}
		
		
		
	
	
	}//end of ArrayStructures
