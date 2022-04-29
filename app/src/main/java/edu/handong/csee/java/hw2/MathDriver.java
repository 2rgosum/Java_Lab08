package edu.handong.csee.java.hw2;

import edu.handong.csee.java.hw2.math.MathCalculator;


/**
 * @author Kangsik Lim - 2rgosum@gmail.com
 * This is MathDriver Class
 */
public class MathDriver {
    
    /**
    * This is 'main' method
    * @param args >> Input String from user (UserName Operator Input1 Input2) >> (Ex. JC Max 2 1) 
    */
    public static void main(String[] args){
        MathDriver myDriver = new MathDriver();
        myDriver.run(args);
    }

    /**
    * This is 'run' method 
    * @param args String from Main
    */
    public void run(String[] args){

        MathCalculator myCalculator = new MathCalculator();

        myCalculator.setName(args[0]);

        switch(args[1]){
            case "Max" : 
                System.out.println("Driver Name: " 
                                    + myCalculator.getName() 
                                    + ", Answer: " 
                                    + myCalculator.getMax(Integer.parseInt(args[2]), Integer.parseInt(args[3]) ));
                break;


            case "Min" : 
                System.out.println("Driver Name: " 
                                    + myCalculator.getName() 
                                    + ", Answer: " 
                                    + myCalculator.getMin(Integer.parseInt(args[2]), Integer.parseInt(args[3]) ));
                break;

            case "Abs" : 
                System.out.println("Driver Name: " 
                                    + myCalculator.getName() 
                                    + ", Answer: " 
                                    + myCalculator.getAbs(Integer.parseInt(args[2]) ));
                break;

            case "Sum" : 
                System.out.println("Driver Name: " 
                                    + myCalculator.getName() 
                                    + ", Answer: " 
                                    + myCalculator.getSum(Integer.parseInt(args[2]), Integer.parseInt(args[3]) ));
                break;

            case "Diff" : 
                System.out.println("Driver Name: " 
                                    + myCalculator.getName() 
                                    + ", Answer: " 
                                    + myCalculator.getDiff(Integer.parseInt(args[2]), Integer.parseInt(args[3]) ));
                break;
            
            case "Product" : 
                System.out.println("Driver Name: " 
                                    + myCalculator.getName() 
                                    + ", Answer: " 
                                    + myCalculator.getProduct(Integer.parseInt(args[2]), Integer.parseInt(args[3]) ));
                break;
            
            case "Quotient" : 
                System.out.println("Driver Name: " 
                                    + myCalculator.getName() 
                                    + ", Answer: " 
                                    + myCalculator.getQuotient(Integer.parseInt(args[2]), Integer.parseInt(args[3]) ));
                break;

            case "Remainder" : 
                System.out.println("Driver Name: " 
                                    + myCalculator.getName() 
                                    + ", Answer: " 
                                    + myCalculator.getRemainder(Integer.parseInt(args[2]), Integer.parseInt(args[3]) ));
                break;

            case "Power" : 
                System.out.println("Driver Name: " 
                                    + myCalculator.getName() 
                                    + ", Answer: " 
                                    + myCalculator.getPower(Integer.parseInt(args[2]), Integer.parseInt(args[3]) ));
                break;
            
            case "Factorial" : 
                System.out.println("Driver Name: " 
                                    + myCalculator.getName() 
                                    + ", Answer: " 
                                    + myCalculator.getFactorial(Integer.parseInt(args[2]) ));
                break;

            case "Gcd" : 
                System.out.println("Driver Name: " 
                                    + myCalculator.getName() 
                                    + ", Answer: " 
                                    + myCalculator.getGcd(Integer.parseInt(args[2]), Integer.parseInt(args[3]) ));
                break;

            case "Lcm" : 
                System.out.println("Driver Name: " 
                                    + myCalculator.getName() 
                                    + ", Answer: " 
                                    + myCalculator.getLcm(Integer.parseInt(args[2]), Integer.parseInt(args[3]) ));
                break;

            case "Square" : 
                System.out.println("Driver Name: " 
                                    + myCalculator.getName() 
                                    + ", Answer: " 
                                    + myCalculator.getSquare(Integer.parseInt(args[2]) ));
                break;

            default :
                System.out.println("Invalid command");

        }
        
    }
}
