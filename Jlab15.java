class loan {

    // Student Name : 		Jacob
    // Student Id Number : 	C00284377
    // Date :				27/09/2022
    // Purpose : 			to calculate loan
    public static void main(String args[]) 

        { 

			double loan;
            double interest;
            double years; 
            double repay; 


            System.out.print("enter your loan amount  "); 
            loan = EasyIn.getInt();
    
            System.out.print("enter your interest rate  "); 
            interest = EasyIn.getInt();

            System.out.print("enter your amount of years  "); 
            years = EasyIn.getInt();

            repay  = loan + ((loan/100)*interest) * years ;
            System.out.println("Your amount repayed is " + repay); 


        } 


}
