package com.array;
/*replace each number by its next bigger number in right side*/
public class ReplaceNumber {
	public static void main(String[] args) {
		int array[] = { 2, 4, 10, 3, 6, 9, 7, 8, 11, 1 };						
		ReplaceNumber rn = new ReplaceNumber();
		rn.replaceNumber(array);
	}

	void replaceNumber(int array[]) {
		int len = array.length;
		int out[] = new int[10];
		for (int i = 0; i < len; i++) {
			Boolean found = false;
			int ntr = array[i];
			for (int j = len - 1; j > i; j--) {
				if(array[j] > array[i]) {
					if (!found) {					
							ntr = array[j];
							found = true;						
					} else {
						if (array[j] < ntr) {
							ntr = array[j];
						}	
				}				
				}
			}

			out[i] = ntr;
		}
		// System.out.println("After replacement");
		for (int i = 0; i < len; i++) {
			System.out.print("," + out[i]);
		}
	}
}
