class FindMax {
    int max(int a, int b) { 
        return Math.max(a, b); 
    }
    int max(int a, int b, int c) { 
        return Math.max(a, Math.max(b, c)); 
    }

    public static void main(String[] args) {
        FindMax obj = new FindMax();
        System.out.println("Max of 10,20: " + obj.max(10, 20));
        System.out.println("Max of 5,15,25: " + obj.max(5, 15, 25));
    }
}
