package edu.handong.csee.java.hw2.math;

/**
 * @author Kangsik Lim
 * This is MathCalculator Class
 */
public class MathCalculator {

    private String name;

    /**
     * This is setName method
     * setNmae method can save drivers name info in 'name' state
     * @param name = User's name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * This is getName method
     * setNmae method can return drivers name info in 'name' state
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * This is getMax method
     * getMax method can find what is 'Max' number and return the number
     * @param a = first input number
     * @param b = secnond input number 
     * @return What Maximum number between 'a' and 'b'
     */
    public int getMax(int a, int b){
        if(a > b){
            return a;
        }
        else if (b > a){
            return b;
        }
        else{
            return a;
        }
    }

    /**
     * This is getMin method
     * getMin method can find what is 'Min' number and return the number
     * @param a = first input number
     * @param b = secnond input number
     * @return What Minimum number between 'a' and 'b'
     */
    public int getMin(int a, int b){
        if(a < b){
            return a;
        }
        else if (b < a){
            return b;
        }
        else{
            return a;
        }
    }

    /**
     * This is getAbs method
     * getAbs method can return 'Absolute' of input number
     * @param a = first input number
     * @return What Abs of 'a'
     */
    public int getAbs(int a){
        if(a == 0){
            return 0;
        }
        else if(a < 0){
            return a * -1;
        }
        else{
            return a;
        }
    }

    /**
     * This is getSum method
     * getSum method can return 'Sum' of two input number
     * @param a = first input number
     * @param b = secnond input number
     * @return What 'a' + 'b'
     */
    public int getSum(int a, int b){
        return a + b;
    }

    /**
     * This is getDiff method
     * getDiff method can return 'Diff' of two input number
     * @param a = first input number
     * @param b = secnond input number
     * @return What 'a' - 'b'
     */
    public int getDiff(int a, int b){
        return a - b;
    }

    /**
     * This is getProduct method
     * getProduct method can return 'Product' of two input number
     * @param a = first input number
     * @param b = secnond input number
     * @return What 'a' + 'b'
     */
    public int getProduct(int a, int b){
        return a * b;
    }

    /**
     * This is getQuotient method
     * getQuotient method can return 'Quotient' of two input number
     * @param a = first input number
     * @param b = secnond input number
     * @return What Quotient of 'a' / 'b'
     */
    public int getQuotient(int a, int b){
        return a / b;
    }

    /**
     * This is getRemainder method
     * getRemainder method can return 'Remainder' of two input number
     * @param a = first input number
     * @param b = secnond input number
     * @return What Remainder of 'a' / 'b'
     */
    public int getRemainder(int a, int b){
        return a % b;
    }

     /**
     * This is getPower method
     * getPower method can return 'Power' of input number
     * EX) get(a, b) => a power of b
     * @param a = first input number
     * @param b = secnond input number
     * @return What 'a' Power of 'b'
     */
    public int getPower(int a, int b){
        int result = 1;
        
        int temp = getAbs(b);

        for(int i = 0; i < temp; i++){
            result = result * a;
        }

        if(b < 0){
            return 1/result;
        }
        else if(b > 0){
            return result;
        }
        else
        {
            return 1;
        }
    }

    /**
     * This is getFactorial method
     * getFactorial method can return 'Factorial' of input number
     * @param a = first input number
     * @return What 'a'!
     */
    public int getFactorial(int a){
        int result;

        if(a < 0) return 0;

        if(a == 0){
            result = 1;
        }
        else{
            result = a * getFactorial(a-1);
        }

        return result;
    }
    
    /**
     * This is getGcd method
     * getGcd method can return 'Greatest common divisor' of two input number
     * @param a = first input number
     * @param b = secnond input number
     * @return What Great common divisor of 'a' and 'b'
     */
    public int getGcd(int a, int b){
 
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }

        return getAbs(a);
    }

    /**
     * This is getLcm method
     * getLcm method can return 'Least common multiple' of two input number
     * @param a = first input number
     * @param b = secnond input number
     * @return What Least common multiple of 'a' and 'b'
     */
    public int getLcm(int a, int b){
        int result = a * b / getGcd(a , b);

        return result;
    }

    /**
     * This is getSpuare method
     * getSpuare method can return 'Square' of two input numberz
     * @param a = first input number
     * @return What Square of 'a'
     */
    public int getSquare(int a){
        double t;
        double sqrtroot = a/2;

        if(a == 0) return 0;

        if(a == 1) return 1;

        do{
            t = sqrtroot;
            sqrtroot = (t + (a/t))/2;
        }
        while((t - sqrtroot) != 0);

        return (int)sqrtroot;
    }
}
