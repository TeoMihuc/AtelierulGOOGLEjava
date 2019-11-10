public class CodeChallenge3 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, -1, -1};

        hasArrayPair(array);
    }

    public static int hasArrayPair(int a[]){
        int count = 0;
        for(int i = 0; i< a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++ )
            {
                if(a[i] + a[j] == 0)
                {
                    count++;
                    i++;
                    //System.out.println(count);

                }
            }
        }
        return count;
    }
}
