class Factorial {
    int factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }
    void factorial(int[] nums) {
        for (int n : nums)
            System.out.println("Factorial of " + n + " = " + factorial(n));
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println("Factorial of 5: " + obj.factorial(5));
        int[] arr = {3, 4, 5};
        obj.factorial(arr);
    }
}
