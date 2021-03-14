
public class FizzBuzz {
    public String fizzBuzz(Integer number) {
        if ((number % 5) == 0 && (number % 3) == 0){
            return "FizzBuzz";
        }
        if ((number % 3) == 0){
            return "Fizz";
        }
        if ((number % 5) == 0){
            return "Buzz";
        }
        
        else{
            return number.toString();
        }
    }
}