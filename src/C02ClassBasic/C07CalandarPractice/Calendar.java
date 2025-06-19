package C02ClassBasic.C07CalandarPractice;

public class Calendar {
    private String year;
    private String month;
    private String day;

    // 생성자를 통해 객체 변수 값들을 객체가 만들어지는 시점에 초기화(세팅)
    public Calendar(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 위의 별도 생성자를 추가할 경우, 초기(기본) 생성자는 무시가 되므로, 필요 시 별도로 추가
    public Calendar() {}

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String printDate() {
        return "오늘은 " + year + "연도 " + month + "월 " + day + "일 입니다.";
    }

    @Override
    public String toString() {
        return "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'';
    }
}
