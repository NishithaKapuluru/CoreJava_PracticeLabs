package io.practice;

public class CalSum {

	int calSum(int n){
		int result=0;
		if(n%3==0 && n%5==0){
			result=(n*(n+1))/2;
		}
		return result;
	}
}
