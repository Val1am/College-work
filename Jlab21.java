class zero 

    // Student Name : 		Jacob Lynam pedoe
    // Student Id Number : 	COM1234
    // Date :				11/10/2022
    // Purpose : 			To tell if no. is greater or less than 0
    
    {
        
        public static void main(String[] args)
        {
            double user_in; 

            System.out.print("Enter the your number ->  "); 

        		user_in = EasyIn.getInt(); 

            if (user_in > 0 )
            {
                System.out.print("your number is greater than zero");
            }

            else if (user_in < 0 )
            {
                System.out.print("your number is less than zero");
            }

            else if (user_in == 0 )
            {
                System.out.print("your number is  zero");
            }


        }
    }
