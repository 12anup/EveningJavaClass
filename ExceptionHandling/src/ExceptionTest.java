public class ExceptionTest {
    public static void method2() throws CUstomException {

        String str = null;

        if (str != null) {

            str.length();

        } else {
            throw new CUstomException("String is found null");
        }

    }

    public static void main(String[] args) {

        try {

            method2();

        } catch (CUstomException e) {

            e.printStackTrace();

        }

    }
}
