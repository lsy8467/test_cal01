package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int[] intArray = new int[10];
        int index = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            int result = 0;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                }
            } else {
                System.out.println("잘못된 값을 입력했습니다.");
            }

            System.out.println("결과 :" + result);
            intArray[index] = result;
            index++;
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            String input = sc.next();
            if (input.equals("exit")) {
                break;
            }
        }
        System.out.println("연산 저장:");
        for (int i = 0; i < index; i++) {
            System.out.println(i + 1 + ": " + intArray[i]);
        }
    }
}