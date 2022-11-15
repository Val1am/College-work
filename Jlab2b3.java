class minimum {

    // Student Name : 		Jacob
    // Student Id Number : 	C00284377
    // Date :				14/10/2022
    // Purpose : 			to calculate minimum
    public static void main(String args[]) 

        { 
            double num1;
            double num2;
            double num3;
            double high = 0;
            double mid = 0;
            double low = 0;

            System.out.print("enter your first no.  "); 
            num1 = EasyIn.getInt();

            System.out.print("enter your second no.  "); 
            num2 = EasyIn.getInt();

            System.out.print("enter your third no.  "); 
            num3 = EasyIn.getInt();


            System.out.println("The lowest number is: " + Math.min(Math.min(num1, num2), num3));
            
            if (num1 > high)
            {
                high = num1;
            }
            if (num2 > high)
            {
                high = num2;
                mid = num1;
            }   
            else if (num2 < high)
            {
                high = num1;
                mid = num2;
            } 

            if (num3 > high)
            {
                high = num3;
                if (num2 > mid)
                {
                    mid = num2;
                    low = num1;
                }   
                else if (num2 < mid)
                {
                    mid = num1;
                    low = num2;
                } 

            }
            else if (num3 > mid)
            {
                mid = num3;
                if (num2 > high)
                {
                    high = num2;
                    low = num1;
                }   
                else if (num2 < high)
                {
                    high = num1;
                    low = num2;
                } 

            }

            else if (num3 > low)
            {
                low = num3;
                if (num2 > high)
                {
                    if (num2 > high)
                    {
                        high = num2;
                        mid = num1;
                    }   
                    else if (num1 > high)
                    {
                        high = num1;
                        mid = num2;
                    } 
                }   

            }

            if (num1 < mid)
            {
                if (num1 > low)
                {
                    low = num1;
                }
            }
            
            
            System.out.println("The numbers go: " + high + " " + mid + " " + low);

             
        }

} 



