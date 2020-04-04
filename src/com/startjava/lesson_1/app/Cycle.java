public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("-------------------------");

        int j = 6;
        while (j >= -6) {
            System.out.println("j = " + j);
            j = j - 2;
        }
        System.out.println("-------------------------");

        int k = 11;
        int sum = 0;
        do {
            sum = sum + k;
            //System.out.println("sum = " + sum + " i = " + k);
            k = k + 2;
        } while (k <= 20);
        System.out.println("сумма всех нечетных чисел от [10, 20] = " + sum);

    }
}