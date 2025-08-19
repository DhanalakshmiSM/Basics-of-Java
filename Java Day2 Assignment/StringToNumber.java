public class StringToNumber {
    public static void main(String[] args) {
        String str = "123";
        int numInt = Integer.parseInt(str);
        double numDouble = Double.parseDouble(str);
        float numFloat = Float.parseFloat(str);
        System.out.println("Int: " + numInt + ", Double: " + numDouble + ", Float: " + numFloat);
    }
}
