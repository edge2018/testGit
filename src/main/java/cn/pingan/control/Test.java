package cn.pingan.control;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(1);
		System.out.println(arr);
		
		int[] a = {134,33,31,48,25,43,32};
		for (int i = 0; i < a.length-1; i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]<a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}
