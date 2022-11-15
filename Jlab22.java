class Marks 
{
    
    // Student Name : 		Jacob
    // Student Id Number : 	C00284377
    // Date :				04/10/2022
    // Purpose : 			Show average grade mark



public static void main(String args[]) 

        { 

			double prog;	
            double maths; 
            double hard; 
            double average; 

			
			System.out.print("enter your programming grade:  "); 
        	prog = EasyIn.getDouble();

            System.out.print("enter your maths grade:  "); 
        	maths = EasyIn.getDouble();

            System.out.print("enter the hardware grade:   "); 
        	hard = EasyIn.getDouble();
            
            average = ((prog + maths + hard )/ 3);


			if (average > 70)
            {
                System.out.print("Distinction");
            }
            else if (average >= 63)
            {
                System.out.print("Merit1");
            }
			else if (average >= 55)
            {
                System.out.print("Merit2");
            }
            else if (average >= 40)
            {
                System.out.print("Pass");
            }
            else if (average <= 40)
            {
                System.out.print("Fail");
            }


        } 


}
