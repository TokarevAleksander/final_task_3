import java.util.HashSet;
import java.util.Scanner;

public class final_task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int maxUniqueChars = 0;

        String maxUniqueString = "";

        for (int i = 1; i <= n; i++) {
            System.out.print("Строка " + i + ": ");
            String inputString = scanner.nextLine();

            HashSet<Character> uniqueChars = new HashSet<>();
            for (char ch : inputString.toCharArray()) {
                uniqueChars.add(ch);
            }

            if (uniqueChars.size() > maxUniqueChars) {
                maxUniqueChars = uniqueChars.size();
                maxUniqueString = inputString;
            }
        }

        System.out.println("Ответ: " + maxUniqueString);
    }
}