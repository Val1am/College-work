class odd

    // Student Name : 		Jacob Lynam pedoe
    // Student Id Number : 	COM1234
    // Date :				11/10/2022
    // Purpose : 			To tell if no. is odd or even
    
    {
        
        public static void main(String[] args)
        {
            double user_in; 

            System.out.print("Enter the your number ->  "); 

        		user_in = EasyIn.getInt(); 

            if (user_in % 2 == 0 )
            {
                System.out.print("your number is even");
            }
            else if (user_in % 2 == 1 )
            {
                System.out.print("your number is odd");
            }

        }
    }

