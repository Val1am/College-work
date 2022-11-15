class travel 
{
// Student Name : 		Jacob
// Student Id Number : 	C00284377
// Date :				30/09/2022
// Purpose : 			Calc avg mph and mpg

public static void main(String args[]) 

{ 

    

    double miles;
    double hours;
    double gallons ;
    double mph ; 
    double gpm ;


	System.out.print("enter your distance in miles  "); 

    miles = EasyIn.getInt();

    System.out.print("enter your time in hours  "); 

    hours = EasyIn.getInt();

    System.out.print("enter your fule in gallons  "); 

    gallons = EasyIn.getInt();

    mph = (miles/hours);

    gpm = (gallons/miles);
    System.out.println("Your miles per hour is are  " + mph);
    System.out.println("Your gallons per mile  are  " + gpm);

} 


}
