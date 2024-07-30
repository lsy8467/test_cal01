package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        List<Integer> results = new ArrayList<>();
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
            results.add(result);
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료) 가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) 저장된 결과를 조회하려면 'inquiry'를 입력하세요:");
            String input = sc.next();
            if (input.equals("exit")) {
                break;
            } else if (input.equals("remove")) {
                if (!results.isEmpty()) { // !results.isEmpty() = 리스트가 비어있지 않은 경우
                    results.remove(0);  // 리스트가 비어있지 않다면 리스트의 첫번째 삭제 실행.
                    System.out.println("가장 오래된 결과가 삭제되었습니다.");
                } else {
                    System.out.println("삭제할 결과가 없습니다.");
                }
            } else if (input.equals("inquiry")) {
                if (!results.isEmpty()) {
                    System.out.println("저장된 연산 결과:");
                    for (int res : results) {
                        System.out.println(res);
                    }
                } else {
                    System.out.println("저장된 결과가 없습니다.");
                }
            }
            System.out.println("연산 저장:");
            for (int i = 0; i < results.size(); i++) {
                System.out.println("결과 " + (i + 1) + ": " + results.get(i));
            }
        }
    }
}