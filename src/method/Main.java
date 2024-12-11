package method;

public class Main {
    static void greeting(){
        System.out.println(" Hello word!");
    }

    static int sum(int a , int b){
        return a + b;
    }

    static int sumVarage(int ...valse){
        int sum = 0;
        for (var i : valse){
            sum += i;
        }
        return sum;
    }

    static int recuSivesum (int n){
        if (n == 1) return 1;
        return n + recuSivesum(n-1);
    }

    public static void main(String[] args) {
        greeting();
        int result;
        result = sum(2 , 4);
        int varage = sumVarage(3,7,6);

        System.out.println(result);
        System.out.println(varage);
        System.out.println(recuSivesum(3));
    }
}
