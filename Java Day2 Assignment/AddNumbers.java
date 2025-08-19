class AddNumbers {
    int add(int a, int b) { 
        return a + b;
    }
    double add(double a, double b) { 
        return a + b;
    }
    float add(float a, float b) { 
        return a + b;
    }

    public static void main(String[] args) {
        AddNumbers obj = new AddNumbers();
        System.out.println("Int sum: " + obj.add(5, 7));
        System.out.println("Double sum: " + obj.add(3.5, 2.5));
        System.out.println("Float sum: " + obj.add(2.2f, 3.3f));
    }
}
