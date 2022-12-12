public class Calculations extends Object {
    int _first = 0;
    int _second = 0;
    // Constructor
    Calculations(){
        System.out.println("Calculations - constuctor");
    }
    // Public Methods multiplication
    public int multiplication(int first, int second){
        int result = first * second;
        return result;
    }
    
    // Public Methods addition
    public int addition(int first, int second){
        int result = first + second;
        return result;
    }

    // Public Methods subtration
    public int subtraction(int first, int second){
        int result = first - second;
        return result;
    }
}
