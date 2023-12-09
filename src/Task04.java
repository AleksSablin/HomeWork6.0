import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        String regex = "\\b[aeiouAEIOU][a-zA-Z]*[^aeiouAEIOU\\W]\\b";

        String[] words = inputString.split(" ");
        for (String word : words) {
            if (word.matches(regex)) {
                System.out.println(word);
            }
        }
    }
}
