import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("Задание 9");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String string1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String string2 = scanner.nextLine();
        boolean isAnagram = checkIfAnagram(string1, string2);
        if (isAnagram) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean checkIfAnagram(String string1, String string2) {

        string1 = string1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        string2 = string2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
        }
    }

