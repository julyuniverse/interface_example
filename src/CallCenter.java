import java.io.IOException;

public class CallCenter {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담원 할당 방식을 선택해 주세요.");
        System.out.println("R: 한 명씩 차례대로");
        System.out.println("L: 대기가 작은 상담원 우선");
        System.out.println("P: 우선순위가 높은 고객 우선. 숙련도 높은 상담원");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("지원하지 않는 기능입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();

        // 결과
        // 전화 상담원 할당 방식을 선택해 주세요.
        // R: 한 명씩 차례대로
        // L: 대기가 작은 상담원 우선
        // P: 우선순위가 높은 고객 우선. 숙련도 높은 상담원
        // p
        // 고객 등급이 높은 고객의 call을 먼저 가져옵니다.
        // 업무 숙련도가 높은 상담원에게 먼저 배분합니다.
    }
}
