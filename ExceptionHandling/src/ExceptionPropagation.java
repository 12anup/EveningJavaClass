public class ExceptionPropagation {
    public void method() {
//		try {
        method1();
//		} catch (ArithmeticException e) {
//			System.out.println("Exception Caught");
//		}
    }

    public void method1(){
        method2();
    }

    public void method2() {
        int a = 15 / 0;
        System.out.println(a);
    }

    public static void main(String[] args) {
        ExceptionPropagation exceptionPropagation = new ExceptionPropagation();
        try {
            exceptionPropagation.method();
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught here");
        }
        finally {
            System.out.println("this is finally block");
        }
        System.out.println("Method Called here");
    }

}
