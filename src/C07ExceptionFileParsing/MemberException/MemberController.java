package C07ExceptionFileParsing.MemberException;

import java.io.IOException;
import java.util.Scanner;

// 사용자의 입력을 처리하여 출력하는 계층 (상호작용)
public class MemberController {
    public static void main(String[] args) throws IOException {
        MemberService memberService = new MemberService();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1: 회원가입, 2: 회원상세조회, 3: 회원목록조회");
            String input = sc.nextLine();
            if(input.equals("1")) {
                // 이름, 이메일, 패스워드 입력받아서 service에 전달
                System.out.println("이름, 이메일, 패스워드를 공백으로 입력해주세요.");
                String[] s1 = sc.nextLine().split(" ");
                String name = s1[0];
                String email = s1[1];
                String password = s1[2];

                // 예외 발생 시, 적절한 문구를 사용자에게 출력.
                try {
                    memberService.register(name, email, password);
                } catch (MemberException e) {
                    if(e.getErrorCode() == MemberErrorCode.EMAIL_ALREADY_EXISTS) {
                        System.out.println("이메일이 중복되었습니다.");
                    } else if(e.getErrorCode() == MemberErrorCode.INVALID_PASSWORD) {
                        System.out.println("잘못된 비밀번호입니다.");
                    }
                }
            } else if(input.equals("2")) {
                // 회원 정보 출력 (id받아서)
                // 적절한 예외 처리 (Optional)
                System.out.println("상세 조회할 회원 id를 입력해주세요.");
                Long inputId = Long.parseLong(sc.nextLine());

                try {
                    Member member = memberService.findById(inputId);
                    System.out.println(member.toString());
                } catch (MemberException e) {
                    if(e.getErrorCode() == MemberErrorCode.MEMBER_NOT_FOUND) {
                        System.out.println("존재하지 않는 계정입니다.");
                    }
                }

            } else if(input.equals("3")) {
                // 회원 정보 목록 출력
                for(Member m : memberService.findAll()) {
                    System.out.println(m.toString());
                }
            } else {
                System.out.println("잘못된 번호 입니다.");
            }
        }
    }
}
