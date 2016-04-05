//U10416032
public class BubbleSort{
	public static void main(String[] args){
		int Array[] = new int[]{4,80,52,79,45,12};
		System.out.println("Array before doing bubble sort:");
		for(int i = 0;i < Array.length;i++){
			System.out.println(Array[i]);
		}
		//use bubble sort to sort the array
		bubbleSort(Array);
		
		System.out.println("Array after doing bubble sort:");
		for(int i = 0; i < Array.length;i++){
			System.out.println(Array[i]);
		}
	}
	
	private static void bubbleSort(int[] Array){
		
		int count = 0;
		for(int i =0;i < Array.length;i++){
			for(int j = 1;j<(Array.length);j++){
				if(Array[j-1]>Array[j]){
					count = Array[j-1];
					Array[j-1] = Array[j];
        			Array[j] = count;
				}
			}
		}
	}
	
}