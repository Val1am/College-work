class electricity
{
    
    // Student Name : 		Jacob
    // Student Id Number : 	C00284377
    // Date :				04/10/2022
    // Purpose : 			calculate electricity cost



public static void main(String args[]) 

        { 

			double units;	
			
			System.out.print("enter your electricity units:  "); 
        	units = EasyIn.getDouble();

			if (units  <= 50)
            {
                System.out.print("Your bill is: " + ((units*0.5) + ((units/100)*20)));
            }
            else if (units <= 150)
            {
                System.out.print("Your bill is: " + (((units*0.5)) + (((units - 50)*0.75) + ((units/100)*20))));
            }
            else if (units <= 250)
            {
                System.out.print("Your bill is: " + (((units*0.5)) + (((units - 50)*0.75)) + (((units - 150)*1.2) + ((units/100)*20))));
            }
            else if (units <= 250)
            {
                System.out.print("Your bill is: " + (((units*0.5)) + (((units - 50)*0.75)) + (((units - 150)*1.2)) + (((units - 250)*1.5) + ((units/100)*20))));
            }

        } 


}
