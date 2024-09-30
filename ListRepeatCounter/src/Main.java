public class Main {
    public static void main(String[] args) {
        int[] a = {20, 5, 2, 54, 123, 5, 3, 5, 7, 2, 8, 3, 1, 8, 21, 75, 33, 5, 3, 8, 6};
        boolean[] visited = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            if (visited[i]) {
                continue;
            }
            int counter = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    counter++;
                    visited[j] = true;
                }

            }

            if (counter > 1) {
                System.out.println(a[i] + " counted " + counter + " times");
            }

        }
    }
}