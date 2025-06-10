package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C01InputOutput {
    public static void main(String[] args) throws IOException {
        // 출력 : System.out을 통해 콘솔 출력
        // System 클래스
//        System.out.println(20); // 줄바꿈 있는 출력
//        System.out.print("hello world1"); // 줄 바꿈이 없는 출력
//        System.out.println("hello world2");

        // 입력 : Scanner 클래스는 입력을 위한 클래스
        // System.in : 키보드 입력
//        Scanner myScanner = new Scanner(System.in);
//        String input = myScanner.nextLine(); // 입력받은 데이터를 한 줄로 읽어서, String 으로 리턴
//        System.out.println("입력사항 : " + input);

        // 예를 들어 아래와 같은 입력 값이 주어질 때 처리 방법
        /*
            abc
            bcd
            2
         */
//        Scanner myScanner2 = new Scanner(System.in); // camel case
//        String input1 = myScanner2.nextLine();
//        String input2 = myScanner2.nextLine();
//        int input3 = myScanner2.nextInt();
//        System.out.println("입력사항1 : " + input1);
//        System.out.println("입력사항2 : " + input2);
//        System.out.println("입력사항3 : " + input3);

        // 입력 : BufferReader + System.in

//        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//        String input1 = br1.readLine(); // 한줄씩 읽어서 문자열로 리턴 // 외부와의 통신으로 인해 예외 발생 가능
//        System.out.println(input1);

        // 입력값: abc bcd fgd
//        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
//        String input2 = br2.readLine();
//        String[] arr = input2.split(" ");
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        // BufferedReader + System.in + StringTokenizer
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        String input3 = br3.readLine();
        StringTokenizer st = new StringTokenizer(input3); // 공백을 기준으로 알아서 잘라줌
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
    }
}
