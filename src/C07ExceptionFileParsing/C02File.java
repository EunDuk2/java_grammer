package C07ExceptionFileParsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C02File {
    public static void main(String[] args) throws IOException {
        // 콘솔창에 입출력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        System.out.println(input);

        // 파일에서 읽기 : IO패키지
//        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\Playdata\\Desktop\\java\\java_grammer\\java_grammer\\src\\C07ExceptionFileParsing\\test.txt.txt"));
//        String line = br2.readLine();
//        while(line != null) {
//            System.out.println(line);
//            line = br2.readLine();
//        }
//
//        // 파일에서 읽기 : NIO 패키지
//        Path filePath = Paths.get("C:\\Users\\Playdata\\Desktop\\java\\java_grammer\\java_grammer\\src\\C07ExceptionFileParsing\\test.txt.txt");
//        // readString : 문자열 전체를 통째로 read
//        String st1 = Files.readString(filePath);
//        System.out.println(st1);
//        // readAllLines : 문자열을 라인별로 split 하여 list 형태로 저장
//        List<String> st2 = Files.readAllLines(filePath);
//        for(String l : st2) {
//            System.out.println(l);
//        }

        // 파일 쓰기
        Path filePath = Paths.get("C:\\Users\\Playdata\\Desktop\\java\\java_grammer\\java_grammer\\src\\C07ExceptionFileParsing\\test1.txt.txt");
        Files.write(filePath, "홍길동0\n".getBytes(), StandardOpenOption.CREATE_NEW); // 파일을 만들면서 새로입력
        Files.write(filePath, "홍길동1\n".getBytes(), StandardOpenOption.WRITE); // 덮어쓰기
        Files.write(filePath, "홍길동2\n".getBytes(), StandardOpenOption.APPEND); // 추가모드

    }
}
