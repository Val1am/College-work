class dog_age
    
    // Student Name : 		Jacob
    // Student Id Number : 	C00284377
    // Date :				04/10/2022
    // Purpose : 			Calculate a dogs age


{
	
    public static void main(String[] args)
    {
    	double dog_age ;

        System.out.print("enter your dogs age:  "); 
        dog_age = EasyIn.getDouble();

        if(dog_age < 0)
        {
            System.out.print("Error, age entered is negative");
        }
    	else if (dog_age <= 2)
        {
            if (dog_age < 2)
            {
                System.out.print("Your dogs age is: " + 10.5/2 );
            }
            else if (dog_age < 3)
            {
                System.out.print("Your dogs age is " + 10.5);
            }
        }
        else 
        {
            System.out.print("Your dogs age is " + ((dog_age-2)*4+10.5));
        }
    }



}
