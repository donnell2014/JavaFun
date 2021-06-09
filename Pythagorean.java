public class Pythagorean {
    public static double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        double c = Math.sqrt((legA * legA)+(legB * legB));
        return c;
    }
    public static void main(String[] args){
    System.out.println(calculateHypotenuse(3,5));
    }
}


