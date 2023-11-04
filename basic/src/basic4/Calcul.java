package basic4;

public class Calcul {
	//필
	double num1;
	double num2;
	int[] arr;
	int tot;
	
	//생
	
	public Calcul() {
		
	}
	
	public Calcul(int[] arr) {
		this.arr = arr;
	}
	
	
	public Calcul(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//메
	
	double Add() {
		return num1 + num2;
	}
	
		
	int accu(int arr[]) {
		this.arr=arr;
		
		
		for(int i = 0; i < arr.length ; i++) {
			tot = tot + arr[i];
		}
		return tot;
	}
	
	double avg(int arrlength) {
		return tot/arrlength;
	}
	
}

