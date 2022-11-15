class Taxes

// Student Name : 		Jacob
// Student Id Number : 	C00284377
// Date :				27/09/2022
// Purpose : 			Calc taxes


{   

      public static void main(String args[]) 

        { 

			int net ;
			int child ;
			int gross ;
			
			
				System.out.print("enter your net earnings  "); 

        		net = EasyIn.getInt();
        		
        		System.out.print("enter your number of children  "); 

        		child = EasyIn.getInt();

				gross  = net - ((net/100)*24) + child*1000 + 5000;

				System.out.println("Your taxes are  " + gross); 



        } 

} 