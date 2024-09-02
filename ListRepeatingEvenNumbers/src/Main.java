public class Main {
    public static void main(String[] args) {
        int[] list = {4, 23, 123, 45, 343, 88, 32, 767, 4, 46, 78, 32, 78, 64, 321, 54, 54};
        int[] repeated = new int[list.length];
        int repeatedIndex = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        boolean alreadyPrinted = false;
                        for (int k = 0; k < repeatedIndex; k++) {
                            if (repeated[k] == list[i]) {
                                alreadyPrinted = true;
                                break;
                            }
                        }
                        if (!alreadyPrinted) {
                            repeated[repeatedIndex++] = list[i];
                            System.out.println(list[i]);
                        }
                        break;
                    }
                }
            }
        }
    }
}
