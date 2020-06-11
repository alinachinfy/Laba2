public class Fact {
    public static void fact(int n, int i, int result) {
        if ((n > 1) && (i <= n)) {
            result = result * i;
            fact(n, i + 1, result);
        }else{
            System.out.println("Факториал "+ n + " = "+result);
        }
    }

    public static void main(String[] args) {

    }

    {
             fact(8, 2, 1);
    }
}
