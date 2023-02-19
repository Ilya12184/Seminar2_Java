import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(scanner.nextLine());

        char[] arr = new char[stringBuilder.length()];
        boolean bool = false;

        for (int i = 0; i < stringBuilder.length(); i++) {
            arr[i] = stringBuilder.charAt(i);
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == arr[arr.length-j-1]) bool = true;
            else bool = false;
        }
        System.out.println(bool);
    }
}