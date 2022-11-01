import static java.lang.Math.*;

 public class Main {
    public static void main(String[] args) {
        System.out.println(Task1(1, 5));
    }

    public static double Task1(int k, double s){
        double result = 0.0;
        for (int i = 0; i <= k; i++){
            double r = log10(sqrt(s * 1/(i * i)));
            result = result + r;
        }
        return result;
    }


}
