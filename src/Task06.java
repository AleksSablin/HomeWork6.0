public class Task06 {
    public static void main(String[] args) {
        System.out.println("Задание 6");
        int count = 0;

        for (int i = 0; i < 100000; i++) {
            String number = String.format("%05d", i);

            if (number.contains("4") || number.contains("13")) {
                count++;
            }
        }
        System.out.println("Количество номеров, которые нужно исключить: " + count);
    }
}
