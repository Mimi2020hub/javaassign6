import java.util.Arrays;

/* For exercise 4, the algorithm runs on the order of N, or O(N),
 * because whenever an array is given, its length is a certain number N,  
 * and the new array is built basing on the original array,
 * making the new array's length two times of the original one,
 * and elements with the pattern suggested in the code at odd and even positions,
 * therefore the algorithm runs 2N times, which is linear,belongs to O(N).
 * 
 * 
 * For exercise 5, the algorithm runs on the order of N, or O(N),
 * because when the array is give, its length is a certain number N,
 * with i < list.length/2, list[i] represents elements in the first half of the array,
 * with j = list.length-1-i, list[j] represents elements in the second half of the array,
 * list[i]=list[j] runs N/2 times, list[j] = temp also runs N/2 times, 
 * in total, the algorithm runs N times, belong to the linear group O(N)
 */


//This modified version of selection sorting still needs to run n^2 times(O(N^2)),
//which is same run time to find the smallest element and put it to the front,
//because for every item of i items, it has to run j times,
//therefore i*j times belongs to N^2 complexity class
public class modiselection {
	public static void main(String[] args) {
		int[] a = {1,2,8,9,4,6,7};
		mSelection(a);
		System.out.print(Arrays.toString(a));
	}
	
	public static int[] mSelection(int[] a) {
		for (int i=a.length-1;i>0; i--) {
			//find index of largest remaining value
			int max =i;
			for (int j=0;j<=i;j++) {
				if (a[j] > a[max]) {
					max=j;	
				}
			int	temp = a[max];
			a[max]=a[i];
			a[i]=temp;
			
			}
		}
		return a;
	}
	
	
}
