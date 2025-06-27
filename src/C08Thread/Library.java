package C08Thread;

public class Library {
    private static int bookCount = 100;

    public static void borrow() { // 많은 사용자들이 동시에 접근하면 문제 (동시성 이슈)
    // RDB의 재고관리를 할 경우에는 syncronized를 통한다 하더라도, 쿼리와 Commit 실행 시점에 차이로 인해 동시성 이슈 발생.
    // synchronized : 메서드 내에서 1개의 스레드만 실행되도록 강제.
    // 스레드들이 메서드 앞에서 기다린다.
//    public synchronized static void borrow() {
        if(bookCount > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookCount -= 1;
            System.out.println("대출 완료");
        } else {
            System.out.println("대출 불가");
        }
    }
    public static int getBookCount() {
        return bookCount;
    }
}
