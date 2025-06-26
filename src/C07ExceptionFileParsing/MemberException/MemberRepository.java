package C07ExceptionFileParsing.MemberException;

import java.util.*;

// 저장소 역할을 하는 계층 (DB 역할)
// DB에 CRUD를 하는 수행하는 계층
public class MemberRepository {
    private static List<Member> memberList = new ArrayList<>();

    // 회원가입
    public static void register(Member member) {
        memberList.add(member);
    }

    // 회원 상세조회
    public static Optional<Member> findById(Long id) {
        Optional<Member> member = memberList.stream().filter(a -> a.getId() == id).findFirst();
        return member;
//        for (Member member : memberList) {
//            if (member.getId().equals(id)) {
//                return Optional.of(member);
//            }
//        }
//        return Optional.empty();
    }

    // 중복 여부 체크
    public static boolean isEmailExists(String email) {
        long count = memberList.stream().filter(a -> a.getEmail().equals(email)).count();

        if(count > 0) return true;
        else return false;
    }

    // 회원 목록조회
    public static List<Member> findAll() {
        return memberList;
    }

}
