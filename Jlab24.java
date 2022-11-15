class divide

    // Student Name : 		Jacob Lynam pedoe
    // Student Id Number : 	COM1234
    // Date :				11/10/2022
    // Purpose : 			To tell if no. can divide into another
    
    {
        
        public static void main(String[] args)
        {
            double user_in; 
            double user_in2;
            double user_in3;

            System.out.print("Enter the your first number ->  "); 
            user_in = EasyIn.getInt(); 
            System.out.print("Enter the your second number ->  "); 
            user_in2 = EasyIn.getInt();
            System.out.print("Enter the your third number ->  "); 
            user_in3 = EasyIn.getInt();

            if (user_in % user_in2 == 0)
            {
                if (user_in % user_in3 == 0)
                {
                    System.out.print("your first number is divisible by both numbers ");
                }
            }
            if (user_in % user_in2 != 0)
            {
                if (user_in % user_in3 != 0)
                {
                    System.out.print("your first number is not divisible by either number ");
                }
            }
            if (user_in % user_in2 == 0 )
            {
                System.out.print("your first number is divisible by your second number");
            }
            if (user_in % user_in3 == 0 )
            {
                System.out.print("your first number is divisible by your third number");
            }

        }
    }

