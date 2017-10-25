package com.xl.interview;

/**
 * @author 作者:xl
 * @data   创建时间:2017-10-20
 * @description 求满足数列1-2+3-4......+n的和(n>0)
 * @version 1.0
 */

public class ForSum{
	public static void main(String[] args) {
		int value = getSum(1001);
		System.out.println("和为：" + value);
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1==str2);
	}
	public static int getSum(int n){
		int sum = 0;
		for (int i=1; i<=n;i++){
			sum += (i%2==1)?i:(-i);
		}
		return sum;
	}
	public static int getSum1(int n){
		int sum = 0;
		if (n<=0){
			System.out.println("请输入正整数！");
			return -1;
		}
		if(n%2==1){
			sum = (n+1) >> 1;
		}
		sum = -n >> 1;
		return sum;
	}
}

