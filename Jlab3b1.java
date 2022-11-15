class register {
    
    // Student Name : 		Jacob
    // Student Id Number : 	C00284377
    // Date :				07/10/2022
    // Purpose : 			Simple cash register

	
public static void main(String[] args)
    {

        double bread = 0; 
        double milk = 0;  
        double coffee = 0; 
        double butter = 0; 
        double bill = 0;  
        double  loop = 0;
        int user_in;



        while (loop < 5)
         {
           System.out.println(" Choose a number to add it to the bill ");
           System.out.println("1. Bread : 1.50 ");
           System.out.println("2. Milk : 1.95 ");
           System.out.println("3. Coffee : 1.15 ");
           System.out.println("4. Butter : 2 ");
           System.out.println("5. Exit and Display Bill  number ");

            user_in = EasyIn.getInt();

            if (user_in <= 1)
            {
                bread  = (bread + 1);
                bill =  (bill + 1.5); 
            }
            else if (user_in < 3)
            {
                milk  = (milk + 1);
                bill  = (bill + 1.95); 
            }
            else if (user_in < 4)
            {
                coffee  = (coffee + 1);
                bill = (bill + 1.15); 
            }
            else if (user_in < 5)
            {
                butter  = (butter + 1);
                bill = (bill + 2); 
            }
            else if (user_in < 6)
            {
                loop = (loop + 6);
            }
        }

        System.out.println("   Receipt ");
        System.out.println(" ----------- ");
        System.out.println("Bread (" + bread + "):   "+ (bread * 1.5));
        System.out.println("Milk (" + milk + "):    " + (milk * 1.95));
        System.out.println("Coffee (" + coffee + "):  " + (coffee * 1.15));
        System.out.println("Butter (" + butter + "):  " + (butter * 2));
        System.out.println("-------------------");
        System.out.println("Total bill:    " + bill);
    }



}




