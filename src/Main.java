public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 1;
        int first = numbers[0];
        numbers[1] = 2;
        int second = numbers[1];
        numbers[2] = 3;
        int third = numbers[2];
        System.out.println(first + ", " + second + ", " + third + ".");
        for (int m = 3 - 1; m >= 0; m--) {
            if (m == 0) {
                System.out.print(numbers[m] + ". ");
            } else {
                System.out.print(numbers[m] + ", ");
            }
        }
        System.out.println(" ");
        for (int n = 0; n <= numbers.length - 1; n++) {
            if (numbers[n] % 2 != 0) {
                System.out.print(numbers[n] + 1 + ", ");
            } else {
                System.out.print(numbers[n] + ", ");
            }
            }
        System.out.println();
        {
                    }
                    System.out.println();
                    System.out.println();

                    float[] fractional = {1.57f, 7.654f, 9.986f};
                    System.out.println(fractional[0] + ", " + fractional[1] + ", " + fractional[2] + ".");
                    for (int t = fractional.length - 1; t >= 0; t--) {
                        if (t == 0) {
                            System.out.print(fractional[t] + ". ");
                        } else {
                            System.out.print(fractional[t] + ", ");
                        }
                    }

                    System.out.println();
                    System.out.println();

                    int[] random = {1, 13, 25, 36, 48, 58, 69, 72, 75, 81, 83, 86, 88, 92};
                    for (int k = 0; k < random.length; k++) {
                        if (k == random.length - 1) {
                            System.out.print(random[k] + ".");
                        } else {
                            System.out.print(random[k] + " ,");
                        }
                    }
                    System.out.println();
                    for (int r = random.length - 1; r >= 0; r--) {
                        if (r == random[0]) {
                            System.out.print(random[r] + ". ");
                        } else {
                            System.out.print(random[r] + ", ");
                        }
                    }
                }
        }