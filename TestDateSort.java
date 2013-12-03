public class TestDateSort {
	public static void main(String[] args) {
		Date[] days = new Date[5];
		days[0] = new Date(2006, 5, 4);
		days[1] = new Date(2006, 7, 4);
		days[2] = new Date(2008, 5, 4);
		days[3] = new Date(2004, 5, 9);
		days[4] = new Date(2004, 5, 4);
		
		bubbleSort(days);
		
		print(days);
		
		public static Date[] bubbleSort(Date[] a) {
			int len = a.length;
			Date[] temp;
			for (int m = 0; m < len; m++) {
				for (int n = 1; n < (len-m); n++) {
					if (a[n-1].compare(a[n]) == 1) {
						temp = a[n];
						a[n] = a[n-1];
						a[n-1] = temp;
					}
				}
			}	
			return a;
		}
		
		public static void print(Date[] a) {
			for (int n = 0; n < a.length; n++) {
				System.out.print(a[n] + " ");
			}	
		}
		
	}
}

class Date {
	int year, month, day;
	
	Date(int _year, int _month, int _day) {
		year = _year;
		month = _month;
		day = _day;	
	}	
	
	public int compare(Date a) {
		return year > a.year ? 1
						: year < a.year ? -1
						: month > a.month ? 1
						: month < a.month ? -1
						: day > a.day ? 1
						: day < a.day ? -1 : 0;
	}
	
	public String toString() {
		return "Year:Month:Day--" + year + month + day;
	}
}




TestDateSort.java:14: 错误: 非法的表达式开始
                public static Date[] bubbleSort(Date[] a) {
                ^
TestDateSort.java:14: 错误: 非法的表达式开始
                public static Date[] bubbleSort(Date[] a) {
                       ^
TestDateSort.java:14: 错误: 需要';'
                public static Date[] bubbleSort(Date[] a) {
                                    ^
TestDateSort.java:14: 错误: 需要 '.class'
                public static Date[] bubbleSort(Date[] a) {
                                                       ^
TestDateSort.java:14: 错误: 需要';'
                public static Date[] bubbleSort(Date[] a) {
                                                        ^
TestDateSort.java:29: 错误: 非法的表达式开始
                public static void print(Date[] a) {
                ^
TestDateSort.java:29: 错误: 非法的表达式开始
                public static void print(Date[] a) {
                       ^
TestDateSort.java:29: 错误: 需要';'
                public static void print(Date[] a) {
                             ^
TestDateSort.java:29: 错误: 需要 '.class'
                public static void print(Date[] a) {
                                                ^
TestDateSort.java:29: 错误: 需要';'
                public static void print(Date[] a) {
                                                 ^
10 个错误
