public class ExtendsCalculrations extends Calculations{
    ExtendsCalculrations(){
        System.out.println("ExtendsCalculrations - constructor");
    }
    public int multiplications(int first, int second){
        int result = first * second;
        return result;
    }
    // Public Methods subtration
    public int subtraction(int first, int second){
        int result = second - first;
        return result;
    }
}
