package C07ExceptionFileParsing.MemberException;

import java.util.*;

// 핵심 로직을 구현하는 계층
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService() {
        this.memberRepository = new MemberRepository();
    }

    // 회원가입
    public void register(String name, String email, String password) throws IllegalStateException, IllegalArgumentException {
        // DB에 이메일 중복일 경우 예외 발생
        boolean isEmailExists = memberRepository.isEmailExists(email);
        if(isEmailExists) {
            throw new IllegalStateException("이미 존재하는 이메일입니다.");
        }

        // 비밀번호가 너무 짧은 경우 예외 발생 (2자리 이하)
        boolean isPasswordValid = isPasswordValid(password);
        if(!isPasswordValid) {
            throw new IllegalArgumentException("잘못된 패스워드 입니다.");
        }

        // 객체를 조립 후 repository를 통해 register
        memberRepository.register(new Member(name, email, password));
    }

    public boolean isPasswordValid(String password) {
        if(password.length() < 3) return false;
        else return true;
    }

    // 회원 상세조회
    public Member findById(Long id) throws NoSuchElementException {
        // Optional 객체의 값이 없을 경우 예외 발생. 있으면 Member를 꺼내서 return.
        Optional<Member> optionalMember = memberRepository.findById(id);

        return optionalMember.orElseThrow(() -> new NoSuchElementException("존재하지 않는 계정입니다."));
    }

    // 회원 목록조회
    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
