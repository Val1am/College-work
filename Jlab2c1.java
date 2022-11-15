class earthquake 
{
    
    // Student Name : 		Jacob
    // Student Id Number : 	C00284377
    // Date :				04/10/2022
    // Purpose : 			Display earthquake magnitude



public static void main(String args[]) 

        { 

			double magnitude;	
			
			System.out.print("enter the earthquakes magnitude:  "); 
        	magnitude = EasyIn.getDouble();

			if (magnitude > 8)
            {
                System.out.print("great");
            }
            else if (magnitude >= 7)
            {
                System.out.print("major");
            }
			else if (magnitude >= 6)
            {
                System.out.print("strong");
            }
            else if (magnitude >= 5)
            {
                System.out.print("moderate");
            }
            else if (magnitude >= 4)
            {
                System.out.print("light");
            }
            else if (magnitude >= 3)
            {
                System.out.print("minor");
            }
            else if (magnitude <= 2)
            {
                System.out.print("micro");
            }


        } 


}
