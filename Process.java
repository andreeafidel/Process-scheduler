//package pachet;
import java.lang.Math;

public class Process {
	

	int number;	

	public Process (int number){
		this.number = number;
	}

	public int CheckPrime(int number){
		
		if(number < 2) return 0;

		for (int i = 2; i < number; i++){
			
			if(number % i == 0) return 0;
		}
		
		return 1;
	}
	
	public int Fibonacci(int n){
		
		if(n < 0) return -1;
		if (n == 1 || n == 2) return 1;

		int n1 = 1; 
		int n2 = 1;
		int n3 = 0;
		
		for(int i = 2; i < n; i++){
			n3 = (n1 + n2) % 9973;
			n1 = n2;
			n2 = n3;
		}
		
		return n3;
	}
	
	public int NextPrime(int number){
		
		if (number < 2) return 2;
		
		
		while (CheckPrime(++number) == 0) {
			
		}
		
		return number;
	}
	
	public int Sqrt(int number){
		
		return (int)Math.floor(Math.sqrt(Math.abs(number)));
	}
	
	public int Square(int number){
		
		return number * number;
	}
	
	public int Cube(int number){
		
		return number*number*number;
	}
	
	public int Factorial(int number){
		int p = 1;
		if(number < 0){
			return 0;
		}
		
		for (int i = 1; i <= number; i++){
			p = (p * i) % 9973;
		}
		
		return p;
	}


}
