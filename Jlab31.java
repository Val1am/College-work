
class Jlab31 {

    // Student Name : 		Jacob
    // Student Id Number : 	C00284377
    // Date :				18/10/2022
    // Purpose : 			conversion menu
    public static void main(String args[]) 

        { 

            int option;
            System.out.print(
            "1. Fahrenheit to celcius  " +

            "2. Celcius to Fahrenheit  " +
            
            "3. Inches to centimetres  " +
            
            "4. Centimetres to inches  " +
            
            "5. Pounds to Kilograms  " +
            
            "6. Kilograms to Pounds  " +

            "7. Exit program  "); 
            option = EasyIn.getInt();
            int loop = 1;
            switch (option) {
            case 1:
                int Farenheit;
                int Celcius;
                System.out.print("enter your temperatur(farenheit)  "); 
                Farenheit = EasyIn.getInt();
                Celcius = (Farenheit - 32) * 5/9;
                System.out.println("The temperature in celcius is " + Celcius);
                do{
                System.out.print(
                    "1. Fahrenheit to celcius  " +
        
                    "2. Celcius to Fahrenheit  " +
                    
                    "3. Inches to centimetres  " +
                    
                    "4. Centimetres to inches  " +
                    
                    "5. Pounds to Kilograms  " +
                    
                    "6. Kilograms to Pounds  " +

                    "7. Exit program  "); 
                    option = EasyIn.getInt();
                    loop -= 1;
                    option = 0;
                }
                while(loop > 0);
                

            case 2:
                int Farenheit2;
                int Celcius2;
                System.out.print("enter your temperatur(Celcius)  "); 
                Farenheit2 = EasyIn.getInt();
                Celcius2 = (Farenheit2 * 5/9) + 32;
                System.out.println("The temperature in celcius is " + Celcius2);
                do{
                    System.out.print(
                        "1. Fahrenheit to celcius  " +
            
                        "2. Celcius to Fahrenheit  " +
                        
                        "3. Inches to centimetres  " +
                        
                        "4. Centimetres to inches  " +
                        
                        "5. Pounds to Kilograms  " +
                        
                        "6. Kilograms to Pounds  " +
    
                        "7. Exit program  "); 
                        option = EasyIn.getInt();
                        loop -= 1;
                        option = 0;
                    }
                    while(loop<0);
            case 3:
                double cm;	
                double inch;
                System.out.print("enter inchess  "); 
                inch = EasyIn.getInt();
                cm = inch*2.54;
                System.out.println("The inches to centimeters is " + cm);
                do{
                    System.out.print(
                        "1. Fahrenheit to celcius  " +
            
                        "2. Celcius to Fahrenheit  " +
                        
                        "3. Inches to centimetres  " +
                        
                        "4. Centimetres to inches  " +
                        
                        "5. Pounds to Kilograms  " +
                        
                        "6. Kilograms to Pounds  " +
    
                        "7. Exit program  "); 
                        option = EasyIn.getInt();
                        loop -= 1;
                        option = 0;
                    }
                    while(loop<0);
            case 4:
                double cm2;	
                double inch2;
                System.out.print("enter contimeters  "); 
                inch2 = EasyIn.getDouble();
                cm2 = inch2/2.54;
                System.out.println("The centimeters to inches is " + cm2);
                do{
                    System.out.print(
                        "1. Fahrenheit to celcius  " +
            
                        "2. Celcius to Fahrenheit  " +
                        
                        "3. Inches to centimetres  " +
                        
                        "4. Centimetres to inches  " +
                        
                        "5. Pounds to Kilograms  " +
                        
                        "6. Kilograms to Pounds  " +
    
                        "7. Exit program  "); 
                        option = EasyIn.getInt();
                        loop -= 1;
                        option = 0;
                    }
                    while(loop<0);
            case 5:
                double pound;	
                double kilo;
                System.out.print("enter pounds  "); 
                pound = EasyIn.getDouble();
                kilo = pound/2.205;
                System.out.println("The pounds to Kilograms is " + kilo);
                do{
                    System.out.print(
                        "1. Fahrenheit to celcius  " +
            
                        "2. Celcius to Fahrenheit  " +
                        
                        "3. Inches to centimetres  " +
                        
                        "4. Centimetres to inches  " +
                        
                        "5. Pounds to Kilograms  " +
                        
                        "6. Kilograms to Pounds  " +
    
                        "7. Exit program  "); 
                        option = EasyIn.getInt();
                        loop -= 1;
                        option = 0;
                    }
                    while(loop<0);
            case 6:
                double pound2;	
                double kilo2;
                System.out.print("enter kilograms "); 
                pound2 = EasyIn.getDouble();
                kilo2 = pound2*2.205;
                System.out.println("The kilograms to pounds is " + kilo2);
                do{
                    System.out.print(
                        "1. Fahrenheit to celcius  " +
            
                        "2. Celcius to Fahrenheit  " +
                        
                        "3. Inches to centimetres  " +
                        
                        "4. Centimetres to inches  " +
                        
                        "5. Pounds to Kilograms  " +
                        
                        "6. Kilograms to Pounds  " +
    
                        "7. Exit program  "); 
                        option = EasyIn.getInt();
                        loop -= 1;
                        option = 0;
                    }
                    while(loop<0);

            case 7:
                break;
            }


             
        }

} 



