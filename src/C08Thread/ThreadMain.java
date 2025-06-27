package C08Thread;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        // 단일 스레드 실행
//        for(int i = 0 ; i < 1000 ; i++) {
//            Library.borrow();
//        }
//        System.out.println(Library.getBookCount());

//        // 멀티 스레드 생성 (생성하는거 자체는 안 중요 / 스프링에는 다 만들어져 있음)
//        // 방법1. 스레드 클래스 상속방식
//        Thread t1 = new MyThread();
//        Thread t2 = new MyThread();
//        Thread t3 = new MyThread();
//        Thread t4 = new MyThread();
//        // Thread 클래스 안에 start 메서드가 내장되어 있고, start 메서드는 run 메서드 호출하면서 스레드 생성
//        // 각 스레드의 코드의 실행 순서는 보장되지 않음.
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start(); // 4개 + 원래 1개 => 5개
//        System.out.println("hello world"); // Thread 들 간의 순서가 보장이 안 됨 (코드 순이 아님)

        // 방법2. Runnable을 직접 구현한 객체를 Thread 클래스 생성자에 주입하는 방식
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("실행 시작(MyThread)");
//            }
//        });
//        new Thread(() -> System.out.println("실행 시작1(Lambda)")).start();
//        new Thread(() -> System.out.println("실행 시작2(Lambda)")).start();
//        new Thread(() -> System.out.println("실행 시작3(Lambda)")).start();
//        new Thread(() -> System.out.println("실행 시작4(Lambda)")).start();
//        System.out.println("hello world");

        // 멀티 스레드 동시성 이슈 테스트
        for(int i = 0 ; i < 1000 ; i++) {
            Thread t1 = new Thread(() -> Library.borrow());
            t1.start();
            t1.join(); // 한 스레드의 작업이 모두 완료될 때, 다른 스레드 생성하여 작업 수행. -> 사실상 단일스레드처럼 동작되므로 성능 저하
        }

        Thread.sleep(20000);
        System.out.println(Library.getBookCount());
    }
}
