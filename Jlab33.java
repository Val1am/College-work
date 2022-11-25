class Jlab33 {
    
    // Student Name : 		Jacob
    // Student Id Number : 	C00284377
    // Date :				11/11/2022
    // Purpose : 			Read for 12
    public static void main(String args[]) 

    { 
        int current_no;
        int num_vals;
        int last_occur = 0;
        int first_occur = 0;

        System.out.print("enter number of values:  "); 
        num_vals = EasyIn.getInt();
        
        for (int  index = 1; index < num_vals; index++)
        {
            System.out.print("enter number "+ index + "  "); 
        	current_no = EasyIn.getInt();
            if (current_no == 12)
            {
                while (last_occur == 0){
                    first_occur = index;
                    last_occur = index;
                }
                last_occur = index;
                System.out.println("Last occurance : " + last_occur);
                System.out.println("First occurance : " + first_occur);
            }
        }


    }



}
