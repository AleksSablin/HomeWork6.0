import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        System.out.println("Задание 8");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную:");
        String variable = scanner.nextLine();
        if (isJavaIdentifier(variable)) {
            String cPlusPlusVariable = convertJavaToCPlusPlus(variable);
            System.out.println("Переменная на языке C++: " + cPlusPlusVariable);
        } else if (isCPlusPlusIdentifier(variable)) {
            String javaVariable = convertCPlusPlusToJava(variable);
            System.out.println("Переменная на языке Java: " + javaVariable);
        } else {
            System.out.println("Некорректный идентификатор переменной.");
        }
    }

    public static boolean isJavaIdentifier(String variable) {
        return variable.matches("[a-z][a-zA-Z]*");
    }

    public static boolean isCPlusPlusIdentifier(String variable) {
        return variable.matches("[a-z_][a-z_]*");
    }

    public static String convertJavaToCPlusPlus(String javaVariable) {
        String[] words = javaVariable.split("(?=[A-Z])");
        StringBuilder cPlusPlusVariable = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                cPlusPlusVariable.append("_");
            }
            cPlusPlusVariable.append(words[i].toLowerCase());
        }
        return cPlusPlusVariable.toString();
    }

    public static String convertCPlusPlusToJava(String cPlusPlusVariable) {
        String[] words = cPlusPlusVariable.split("_");
        StringBuilder javaVariable = new StringBuilder();
        for (String word : words) {
            javaVariable.append(Character.toUpperCase(word.charAt(0)));
            javaVariable.append(word.substring(1));
        }
        return javaVariable.toString();
    }
}
