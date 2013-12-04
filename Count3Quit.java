public class Count3Quit {
	public static void main(String[] args) {
		boolean[] a = new boolean[500];
		for (int i = 0; i < a.length; i++) {
			a[i] = true;
		}
		
		int index = 0;
		int countNum = 0;
		int leftNum = a.length;
		
		while (leftNum > 1) {
			if (a[index] == true) {
				countNum++;		// 只有true的时候countNum才加
				if (countNum == 3) {
					a[index] = false;
					countNum = 0;
					leftNum--;	// 记得要--
				}	
			}
			index++;
			if (index == 500) {
				index = 0;	
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == true) {
				System.out.println(i);
			}
		}	
	}
}
