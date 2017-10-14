public class Main {

    public static void main(String[] args) {
        String text[] = {"a", "b", "c", "a", "b", "c", "a", "b", "a", "b", "c", "a", "b", "a"};
        String key[] = {"a", "b", "c"};

        for (int i = 0; i < text.length - key.length + 1; i++) {
            int k = 0;
            for (int j = 0; j < key.length; j++) {
                k++;
                if (text[i + j] != key[j]) {
                    break;
                }
                if (k == key.length) // 文字列の長さだけ一致すれば
                    System.out.println(i + 1);
            }
        }
    }
}
