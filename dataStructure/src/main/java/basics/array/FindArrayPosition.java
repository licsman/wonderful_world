package basics.array;

public class FindArrayPosition {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
        char key = 'g';
        System.out.println(find(arr, arr.length, key));
    }

    public static int find(char[] charArray, int length, char key) {
        if (charArray == null || length <= 0) {
            return -1;
        }
        if (charArray[length - 1] == key) {
            return length - 1;
        }
        charArray[length - 1] = key;
        int i = 0;
        while (charArray[i] != key) {
             i ++;
        }
        if (i == length - 1) {
            return -1;
        } else {
            return i;
        }
    }
}
