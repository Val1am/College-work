class credit {

    // Student Name : 		Jacob
    // Student Id Number : 	C00284377
    // Date :				14/10/2022
    // Purpose : 			to calculate insurance
    public static void main(String args[]) 

        { 
            double ammount = 0; 
            double interest = 0;

            System.out.print("Enter the your credit info  "); 
            ammount = EasyIn.getInt(); 


            if (ammount <= 500)
            {
                interest = ((ammount/100)*12);
            }
            else if (ammount >500)
            {
                interest = (((ammount-500)/100)*18) + ((500/100)*12) ;
            }
            System.out.print("your interest is: " + interest);

        } 


}
