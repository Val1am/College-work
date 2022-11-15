class Jlab32 {
    
    // Student Name : 		Jacob
    // Student Id Number : 	C00284377
    // Date :				11/11/2022
    // Purpose : 			sum of a collection of values
    public static void main(String args[]) 

    { 

        double user_in = 0;
        double sum = 0;

        System.out.print("enter a 0 to terminate.  "); 
        do{
            System.out.print("enter your no.  "); 
            user_in = EasyIn.getInt();
            sum = sum + user_in;
        } while (user_in != 0);

        System.out.print("the sum is:  " + sum); 
    }



}
