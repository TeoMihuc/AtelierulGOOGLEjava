public class CodeChallenge4 {
    public static void main(String[] args) {
        int[] array = {-1, 2, -1, -1};

        hasArrayPair(array);
    }

    public static int hasArrayPair(int a[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                        i++;
                        j++;
                        System.out.println(count);
                    }
                }
            }
        }
        return count;
    }
}
