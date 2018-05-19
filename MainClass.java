//package pachet;

import java.util.Random;

public class MainClass {


	public static int cmmdc( int a, int b){
		
		if(b == 0) return a;
		else return cmmdc(b, a%b);
	}

	public static void main(String[] args){
		
		HomeworkReader reader = new HomeworkReader(args[0]);
		ProblemData result = reader.readData();
		HomeworkWriter writer = new HomeworkWriter(args[1]);
		
		
		String cacheType = result.getCacheType();
	   	int cacheCapacity = result.getCacheCapacity();
	    	String schedulerType = result.getSchedulerType();
	    	ProcessStructure[] processes = result.getProcesses();
	    	int[] numbersToBeProcessed = result.getNumbersToBeProcessed();
		
		int var;   //rezultatul unui proces
		String s2; //variabila in care se face conversia rezultatului unui proces din int in String

		switch(schedulerType){
		
		case "RandomScheduler": 
			for (int i = 0; i < numbersToBeProcessed.length ; i++) {
				 int rnd = new Random().nextInt(processes.length);
				 String s1 = String.valueOf(numbersToBeProcessed[i]);
				 Process pro = new Process(numbersToBeProcessed[i]);
				 
				 switch(processes[rnd].getType()){
				 case "CheckPrime":
			
					 var = pro.CheckPrime(numbersToBeProcessed[i]);
					 s2 = String.valueOf(var);
					 writer.println(s1 + " CheckPrime " + s2 + " Computed");
				 	 break;
				 
				 case "Fibonacci":
					 var = pro.Fibonacci(numbersToBeProcessed[i]);
					 s2 = String.valueOf(var);
					 writer.println(s1 + " Fibonacci " + s2 + " Computed");
				 	 break;
				 
				 case "NextPrime":
					 var = pro.NextPrime(numbersToBeProcessed[i]);
					 s2 = String.valueOf(var);
					 writer.println(s1 + " NextPrime " + s2 + " Computed");
				 	 break;
				 
				 case "Sqrt" :
					 var = pro.Sqrt(numbersToBeProcessed[i]);
					 s2 = String.valueOf(var);
					 writer.println(s1 + " Sqrt " + s2 + " Computed");
				 	 break;
				 
				 case "Cube":
					 var = pro.Cube(numbersToBeProcessed[i]);
					  s2 = String.valueOf(var);
					 writer.println(s1 + " Cube " + s2 + " Computed");
				 	 break;
				 
				 case "Square":
					 var = pro.Square(numbersToBeProcessed[i]);
					 s2 = String.valueOf(var);
					 writer.println(s1 + " Square " + s2 + " Computed");
				 	 break;
				 
				 case "Factorial":
					 var = pro.Factorial(numbersToBeProcessed[i]);
					 s2 = String.valueOf(var);
					 writer.println(s1 + " Factorial " + s2 + " Computed");
				 	 break;
				}
			}
		
			break;
		
		case "RoundRobinScheduler": 
			for (int i = 0; i < numbersToBeProcessed.length ; i++) {
				
				String s1 = String.valueOf(numbersToBeProcessed[i]);
				Process pro = new Process(numbersToBeProcessed[i]);
				
				if (i < processes.length) {
					switch(processes[i].getType()){
					case "CheckPrime":
						
						 var = pro.CheckPrime(numbersToBeProcessed[i]);
						 s2 = String.valueOf(var);
						 writer.println(s1 + " CheckPrime " + s2 + " Computed");
					 	 break;
					 
					 case "Fibonacci":
						 var = pro.Fibonacci(numbersToBeProcessed[i]);
						 s2 = String.valueOf(var);
						 writer.println(s1 + " Fibonacci " + s2 + " Computed");
					 	 break;
					 
					 case "NextPrime" :
						 var = pro.NextPrime(numbersToBeProcessed[i]);
						 s2 = String.valueOf(var);
						 writer.println(s1 + " NextPrime " + s2 + " Computed");
					 	 break;
					 
					case "Sqrt":
						 var = pro.Sqrt(numbersToBeProcessed[i]);
						 s2 = String.valueOf(var);
						 writer.println(s1 + " Sqrt " + s2 + " Computed");
					 	 break;
					 
					 case "Cube":
						 var = pro.Cube(numbersToBeProcessed[i]);
						 s2 = String.valueOf(var);
						 writer.println(s1 + " Cube " + s2 + " Computed");
					 	 break;
					 
					 case "Square":
						 var = pro.Square(numbersToBeProcessed[i]);
						 s2 = String.valueOf(var);
						 writer.println(s1 + " Square " + s2 + " Computed");
					 	 break;
					 
					 case "Factorial":
						 var = pro.Factorial(numbersToBeProcessed[i]);
						 s2 = String.valueOf(var);
						 writer.println(s1 + " Factorial " + s2 + " Computed");
					 	 break;
				}
				}
				
				else {

					switch(processes[i - (i / processes.length) * processes.length].getType()){
					case "CheckPrime":
						
						 var = pro.CheckPrime(numbersToBeProcessed[i]);
						 s2 = String.valueOf(var);
						 writer.println(s1 + " CheckPrime " + s2 + " Computed");
					 	 break;
					 
					 case "Fibonacci":
						 var = pro.Fibonacci(numbersToBeProcessed[i]);
						 s2 = String.valueOf(var);
						 writer.println(s1 + " Fibonacci " + s2 + " Computed");
					 	 break;
					 
					 case "NextPrime":
						 var = pro.NextPrime(numbersToBeProcessed[i]);
						 s2 = String.valueOf(var);
						 writer.println(s1 + " NextPrime " + s2 + " Computed");
					 	 break;
					 
					 case "Sqrt":
						 var = pro.Sqrt(numbersToBeProcessed[i]);
						 s2 = String.valueOf(var);
						 writer.println(s1 + " Sqrt " + s2 + " Computed");
					 	 break;
					 
					 case "Cube":
						 var = pro.Cube(numbersToBeProcessed[i]);
						 s2 = String.valueOf(var);
						 writer.println(s1 + " Cube " + s2 + " Computed");
					 	 break;
					 
					 case "Square":
						 var = pro.Square(numbersToBeProcessed[i]);
						 s2 = String.valueOf(var);
						 writer.println(s1 + " Square " + s2 + " Computed");
					 	 break;
					 
					 case "Factorial":
						 var = pro.Factorial(numbersToBeProcessed[i]);
						 s2 = String.valueOf(var);
						 writer.println(s1 + " Factorial " + s2 + " Computed");
					 	 break;
					}
				}
			
		}

		break;

		case "WeightedScheduler":


			int s = 0;    //suma cotelor
			int div = 1; //variabila pentru cmmdc
			int j = 0;
			int x = 0;   // cota procesului

			for (int i = 0; i < processes.length; i++){
			
				s = s + processes[i].getWeight();
				
			}
			
			div= cmmdc(processes[0].getWeight(), processes[1].getWeight());

			for ( int i = 2; i < processes.length; i++){
			
				 div = cmmdc(div, processes[i].getWeight());
			}

			int t = s / div;  
						
			
			while(j < numbersToBeProcessed.length){
			

				for (int i = 0; i < processes.length; i++){

					
					x = processes[i].getWeight();
					if(x > t) x = x / div;  // daca valoarea cotei e mai mare decat t, pentru a afla cat reprezinta un proces din nr total de rulari am impartit cota la cmmdc-ul cotelor

					while(x > 0){

						String s1 = String.valueOf(numbersToBeProcessed[j]);
						Process pro = new Process(numbersToBeProcessed[j]);

						switch(processes[i].getType()){
						case "CheckPrime":
						
						 	var = pro.CheckPrime(numbersToBeProcessed[j]);
							s2 = String.valueOf(var);
							writer.println(s1 + " CheckPrime " + s2 + " Computed");
					 	 	break;
					 
					 	case "Fibonacci":
						 	var = pro.Fibonacci(numbersToBeProcessed[j]);
						 	s2 = String.valueOf(var);
						 	writer.println(s1 + " Fibonacci " + s2 + " Computed");

					 	 	break;
					 
					 	case "NextPrime" :
						 	var = pro.NextPrime(numbersToBeProcessed[j]);
						 	s2 = String.valueOf(var);
						 	writer.println(s1 + " NextPrime " + s2 + " Computed");
					 	 	break;
					 
						case "Sqrt":
						 	var = pro.Sqrt(numbersToBeProcessed[j]);
						 	s2 = String.valueOf(var);
						 	writer.println(s1 + " Sqrt " + s2 + " Computed");
					 	 	break;
					 
					 	case "Cube":
							var = pro.Cube(numbersToBeProcessed[j]);
						 	s2 = String.valueOf(var);
						 	writer.println(s1 + " Cube " + s2 + " Computed");
					 	 	break;
					 
					 	case "Square":
						 	var = pro.Square(numbersToBeProcessed[j]);
							s2 = String.valueOf(var);
						 	writer.println(s1 + " Square " + s2 + " Computed");
					 	 	break;
					 
					 	case "Factorial":
						 	var = pro.Factorial(numbersToBeProcessed[j]);
						 	s2 = String.valueOf(var);
						 	writer.println(s1 + " Factorial " + s2 + " Computed");
					 	 	break;
						}

						x--;
						j++;
						if(j >= numbersToBeProcessed.length) break;
					}
				}
			}		
		
		
	}
		reader.close();
		writer.close();
		
}
}
