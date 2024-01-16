public class sb {
    public static void main(String[] args) {
        char str[] = "aabcdddssnndwwecedsssdcccdw".toCharArray();
        removeduplicate(str);
    }

    public static void removeduplicate(char str[]) {
        char[] arr = str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            boolean repeated = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeated = true;
                    break;
                }
            }
            if (repeated == false) {
                sb.append(arr[i]);
            }
            // System.out.println(sb);

        }
        System.out.println(sb);
    }
}