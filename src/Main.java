import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }
    //Linear complexity, O(n)
    public static void task1(){
        int n;
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(min(n, arr));
    }
    public static int min(int n, int[] arr){
        if (n == 1) {
            return arr[0];
        }
        int rest = min(n - 1, arr);
        return Math.min(arr[n - 1], rest);
    }
    //Linear complexity, O(n)
    public static void task2(){
        int n;
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(average(n, arr));
    }
    public static double average(int n, int[] arr){
        if (n == 0) {
            return 0;
        }
        return (arr[n - 1] + (n - 1) * average(n - 1, arr)) / n;
    }
    //Square root complexity, O(sqrt(n))
    public static void task3(){
        int n;
        n = scanner.nextInt();
        if (isPrime(n, 2)) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Composite");
        }
    }
    public static boolean isPrime(int n, int start){
        if (n <= 2) {
            return true;
        }
        if (n % start == 0){
            return false;
        }
        if (start * start > n) {
            return true;
        }
        return isPrime(n, start + 1);

    }
    //Exponential complexity, O(2^n)
    public static void task4(){
        int n;
        n = scanner.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    //Exponential complexity, O(2^n)
    public static void task5(){
        int n;
        n = scanner.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    //Linear complexity, O(n)
    public static void task6(){
        int a, n;
        a = scanner.nextInt();
        n = scanner.nextInt();
        System.out.println(power(a, n));
    }
    public static int power(int a, int n){
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }
    //Factorial complexity, O(n!)
    public static void task7(){
        String str;
        str = scanner.nextLine();
        perm(str, "");
    }
    public static void perm(String str, String pr){
        int n = str.length();
        if (n == 0)
            System.out.println(pr);
        else {
            for (int i = 0; i < n; i++)
                perm(str.substring(0, i) + str.substring(i + 1), pr + str.charAt(i));
        }
    }
    //Linear complexity, O(n)
    public static void task8(){
        String s;
        s = scanner.nextLine();
        if (isAllDigit(s)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static boolean isAllDigit(String s){
        if (s.isEmpty()){
            return true;
        }
        return Character.isDigit(s.charAt(0)) && isAllDigit(s.substring(1));
    }
    //Exponential complexity, O(2^n)
    public static void task9(){
        int n, k;
        n = scanner.nextInt();
        k = scanner.nextInt();
        System.out.println(bincoeff(n, k));
    }
    public static int bincoeff(int n, int k){
        if (k == 0 || n == k) {
            return 1;
        }
        return bincoeff(n - 1, k - 1) + bincoeff(n - 1, k);
    }
    //Logarithmic complexity, O(log(n))
    public static void task10(){
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(gcd(a, b));
    }
    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
