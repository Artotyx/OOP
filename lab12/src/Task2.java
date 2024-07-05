public class Task2 {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        int count = 0;
        int number = 2;

        while (count < 50) {
            if (isPrime(number)) {
                stack.push(number);
                count++;
            }
            number++;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

