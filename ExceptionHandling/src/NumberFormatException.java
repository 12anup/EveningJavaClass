public class NumberFormatException {
    public static void main(String args[])
    {
        try {
            // "akki" is not a number
            int num = Integer.parseInt("hvjh");
            System.out.println(num);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Number format exception");
        }

        System.out.println("asdgsadgsfghf");
    }
}
