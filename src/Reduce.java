public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int i = 100;

        while (i != 0) {
            boolean isEven = i % 2 == 0;

            if (isEven) {
                i /= 2;
            }
            else {
                i -= 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
