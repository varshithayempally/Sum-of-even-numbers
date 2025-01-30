public class Sumofevennumbers {
    public static void main(String[] args) {
        int start = 1; 
        int sum = 0;   
        while (start <= 100) { 
            if (start % 2 == 0) { 
                sum += start;    
            }
            start++; 
        }
        System.out.println("The sum of all even numbers between 1 and 100 is: " + sum);
    }
}
