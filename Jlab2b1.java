class insurance {

    // Student Name : 		Jacob
    // Student Id Number : 	C00284377
    // Date :				14/10/2022
    // Purpose : 			to calculate insurance
    public static void main(String args[]) 

        { 

			double insurance;
            double claims; 
            double basic;
            double charge; 
            double if_claims; 
            double payment;

            System.out.print("enter your insurance ammount  "); 
            insurance = EasyIn.getInt();
    
            System.out.print("enter your ammount of claims "); 
            claims = EasyIn.getInt();

            charge = 0;
            if_claims = ((insurance/100)*20);
            basic = ((insurance/100)* 5);
            payment = 0;

            if (claims == 0)
            {
                charge = (basic/100*60 );
                payment = charge + insurance + basic;
                System.out.println("Your ammount is " + payment); 
            }
            else if (claims >= 1)
            {
                while (claims >= 1)
                {
                    charge = charge + if_claims;
                    claims = claims - 1 ;
                }
                payment = insurance + charge + basic;
                System.out.println("Your ammount is " + payment); 
            }



        } 


}
