class Temperature

// Student Name : 		Jacob
// Student Id Number : 	C00284377
// Date :				27/09/2022
// Purpose : 			Convert temperatures



{   

      public static void main(String args[]) 

        { 

			int Farenheit;
			
			int Celcius;
			
			System.out.print("enter your temperatur(farenheit)  "); 

        		Farenheit = EasyIn.getInt();

			Celcius = (Farenheit - 32) * 5/9;
			System.out.println("The temperature in celcius is " + Celcius);
			

        } 

} 