package iter;

public class TestFor01 {

    public static void main(String[] args) {
        // 소녀시대 멤버 배열 생성
        String[] snsd = {"태연", "써니", "티파니", "효연", "유리", "수영", "윤아", "서현"};

     // 1부터 10까지 1씩 증가하며 출력
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 1. 기본 for문: 전체 멤버 출력
        System.out.println("--- 1. 전체 멤버 출력 ---");
        for (int i = 0; i < snsd.length; i++) {
            System.out.println((i + 1) + "번 멤버: " + snsd[i]);
        }

        // 2. 향상된 for문 (Enhanced for): 코드가 더 간결함
        System.out.println("\n--- 2. 향상된 for문 출력 ---");
        for (String member : snsd) {
            System.out.print(member + " ");
        }
        System.out.println();

        // 3. 특정 조건 검색: 이름이 3글자인 멤버 찾기
        System.out.println("\n--- 3. 이름이 3글자인 멤버 ---");
        for (int i = 0; i < snsd.length; i++) {
            if (snsd[i].length() == 3) {
                System.out.println(snsd[i]);
            }
        }

        // 4. 역순 출력: 마지막 멤버부터 출력
        System.out.println("\n--- 4. 역순 출력 ---");
        for (int i = snsd.length - 1; i >= 0; i--) {
            System.out.println("뒤에서 " + (snsd.length - i) + "등: " + snsd[i]);
        }

        // 5. 인덱스 건너뛰기: 홀수 번째 인덱스 멤버만 출력
        System.out.println("\n--- 5. 홀수 인덱스 멤버 ---");
        for (int i = 1; i < snsd.length; i += 2) {
            System.out.println("인덱스 " + i + ": " + snsd[i]);
        }
    }
}
