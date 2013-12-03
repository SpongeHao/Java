public class TestArgs {
	public static void main(String[] args) {
		if (args.length < 9) {			// Input Check
			System.out.println(
				"Usage: java TestArgs \"n1\" \"n2\" \"n3\" \"n4\" \"n5\" \"n6\" \"n7\" \"n8\" \"n9\"");
			System.exit(-1);
		}
		
		int[] i = new int[9];
		for (int n = 0; n < 9; n++) {
			i[n] = Integer.parseInt(args[n]);
		}
		
		bubbleSort(i);
		
		print(i);
	}
	
	private static void print(int[] i) {		// Print Method
		for (int n = 0; n < i.length; n++) {
			System.out.print(i[n]);
		}
	}
	
	private static void bubbleSort(int[] i) {	// Bubble Sort
		int temp;
		for (int m = 0; m < i.length; m++) {
			for (int n = 1; n < (9-m); n++) {
				if (i[n-1] > i[n]) {
					temp = i[n];
					i[n] = i[n-1];
					i[n-1] = temp;
				}
			}
		}	
	}
}
