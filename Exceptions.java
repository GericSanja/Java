
public class ArrayStoreE {

    public static void main(String args[]) {
        try {

            int divideByZero = 7 / 0;
            Object a[] = new Double[2];
            a[0] = 4;
        } catch (ArrayStoreException | ArithmeticException e) {
            System.out.println("Exception happened "
                    + e.get.Message();
        }
    }
}
