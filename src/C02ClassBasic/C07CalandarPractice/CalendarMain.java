package C02ClassBasic.C07CalandarPractice;

public class CalendarMain {
    public static void main(String[] args) {
        // 초기화
        Calendar calendar = new Calendar("2025", "06", "18");
        System.out.println(calendar.printDate()); // 출력

        // 일자 바꿔서, 일 만 출력
        calendar.setDay("19");
        System.out.println("오늘은 " + calendar.getDay() + "일 입니다.");

        // toString() 메서드는 특별한 메서드로 객체명을 출력할 때 자동으로 실행
        System.out.println(calendar.toString());
    }
}
