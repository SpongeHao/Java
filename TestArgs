public class TestArgs {
	public static void main(String[] args) {
		if (args.length < 9) {  // 输入错误时的命令行提示
			System.out.println(
				"Usage: java TestArgs \"n1\" \"n2\" \"n3\" \"n4\" \"n5\" \"n6\" \"n7\" \"n8\" \"n9\"");
			System.exit(-1);
		}
		
		int[] i = new int[9];
		for (int n = 0; n < 9; n++) {
			i[n] = Integer.parseInt(args[n]); // String to Integer
		}
		
		int temp;         // Bubble Sort
		for (int m = 0; m < 9; m++) {
			for (int n = 1; n < (9-m); n++) {
				if (i[n-1] > i[n]) {
					temp = i[n];
					i[n] = i[n-1];
					i[n-1] = temp;
				}
			}
		}
		
		for (int n = 0; n < 9; n++) {
			System.out.println(i[n]);
		}
	}
}
