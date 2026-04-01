package iter;

public class TestWhile01 {

    public static void main(String[] args) {
        
        // 1. 기본 반복: 1부터 10까지 출력
        System.out.println("--- 1. 1부터 10까지 ---");
        int i = 1; // 초기값
        while (i <= 10) { // 조건식
            System.out.print(i + " ");
            i++; // 증감식 (누락하면 무한 루프!)
        }
        System.out.println();

        
        // 2. 조건부 반복: 10부터 2씩 감소하며 출력
        System.out.println("\n--- 2. 10부터 2씩 감소 ---");
        int j = 10;
        while (j >= 2) {
            System.out.print(j + " ");
            j -= 2; 
        }
        System.out.println();

        
        // 3. 누적 합계: 합이 100을 넘기 전까지 더하기
        System.out.println("\n--- 3. 합계가 100 근처까지 더하기 ---");
        int num = 1;
        int sum = 0;
        while (sum + num <= 100) {
            sum += num;
            num++;
        }
        System.out.println("마지막으로 더한 숫자: " + (num - 1));
        System.out.println("최종 합계: " + sum);
    }
}
