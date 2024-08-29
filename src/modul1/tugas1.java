package modul1;

public class tugas1 {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 5;
//        // Panggil metode untuk penjumlahan dan tampilkan hasil
//        System.out.println("Sum: " + AddOperatioann.add(a, b));
//    }


    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int sum = 0;

        sum = getSum(numbers, sum);

        double avarage = sum / numbers.length;
        System.out.println("Rata rata = " + avarage);
    }

    private static int getSum(int[] numbers, int sum) {
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
