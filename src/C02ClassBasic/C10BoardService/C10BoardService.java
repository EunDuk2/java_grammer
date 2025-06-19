package C02ClassBasic.C10BoardService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C10BoardService {
    public static BufferedReader br;
    public static AuthorManagement authorManagement = new AuthorManagement();
    public static PostManagement postManagement = new PostManagement();

    // 로그인한 회원
    public static long loginAuthorId = -1;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));


        while(true) {
            System.out.println("서비스 번호를 입력하세요. " +
                    "(1:회원가입 2:로그인 3:회원전체목록 조회 4:회원상세정보 5:게시글작성 6:게시글전체조회 7:게시글상세조회 8:로그아웃)");
            int input = Integer.parseInt(br.readLine());

            switch (input) {
                case 1:
                    createAuthor();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    showAuthorList();
                    break;
                case 4:
                    showAuthorDetail();
                    break;
                case 5:
                    createPost();
                    break;
                case 6:
                    showPostList();
                    break;
                case 7:
                    showPostDetail();
                    break;
                case 8:
                    logout();
                    break;
                default:
                    System.out.println("잘못된 번호 입니다.");
                    break;
            }
        }
    }

    // 회원가입
    public static void createAuthor() throws IOException {
        if(loginAuthorId != -1) {
            System.out.println("로그아웃 먼저 해주세요.");
            return;
        }
        System.out.println("이름, 이메일, 비밀번호를 공백을 기준으로 입력해주세요");
        String[] s = br.readLine().split(" ");
        String name = s[0];
        String email = s[1];
        String password = s[2];

        authorManagement.addAuthor(name, email, password);
        System.out.println("회원가입이 완료되었습니다.");
    }
    // 로그인
    public static void login() throws IOException {
        if(loginAuthorId != -1) {
            System.out.println("로그아웃 먼저 해주세요.");
            return;
        }
        System.out.println("이메일, 비밀번호를 공백을 기준으로 입력해주세요");
        String[] s = br.readLine().split(" ");
        String email = s[0];
        String password = s[1];

        // 로그인 검증
        long check = authorManagement.checkAuthor(email, password);
        if(check == -1) {
            System.out.println("없는 계정입니다.");
        } else {
            loginAuthorId = check;
            System.out.println(authorManagement.getAuthorDetail(check).getName() + "님 로그인 되었습니다.");
        }
    }
    // 회원전체목록 조회
    public static void showAuthorList() {
        if(loginAuthorId == -1) {
            System.out.println("로그인 먼저 해주세요.");
            return;
        }
        List<Author> list = authorManagement.getAuthorList();

        for(int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i).getId() + ": " + list.get(i).getName());
        }
    }
    // 회원상세정보 조회 / (id로 조회) : id, email, name, password, 작성글 수
    public static void showAuthorDetail() {
        if(loginAuthorId == -1) {
            System.out.println("로그인 먼저 해주세요.");
            return;
        }
        Author author = authorManagement.getAuthorDetail(loginAuthorId);

        System.out.println(author.getId() + ": 이름: " + author.getName()
                + " 이메일: " + author.getEmail() + " 비밀번호: " + author.getPassword()
                + " 작성글 수: " + author.getAuthorPostList().size());
    }
    // 게시글 작성 // 제목, 내용, 작성자 Email 또는 Author 객체
    public static void createPost() throws IOException {
        if(loginAuthorId == -1) {
            System.out.println("로그인 먼저 해주세요.");
            return;
        }
        System.out.println("제목, 내용을 공백을 기준으로 입력해주세요");
        String[] s = br.readLine().split(" ");
        String title = s[0];
        String content = s[1];
        Author author = authorManagement.getAuthorDetail(loginAuthorId);
        postManagement.addPost(title, content, author);
        System.out.println("게시글 작성이 완료되었습니다.");
    }
    // 게시글 전체 조회 id(post), title, 작성자
    public static void showPostList() {
        if(loginAuthorId == -1) {
            System.out.println("로그인 먼저 해주세요.");
            return;
        }
        List<Post> list = postManagement.getPostList();

        for(int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i).getId() + ": 제목: " + list.get(i).getTitle() + " 작성자: " + list.get(i).getAuthor().getName());
        }
    }
    // 게시글 상세 조회 id(post), title, contents, 작성자email (작성자 이름)
    public static void showPostDetail() throws IOException {
        if(loginAuthorId == -1) {
            System.out.println("로그인 먼저 해주세요.");
            return;
        }
        System.out.println("상세 조회할 게시글의 id를 입력하세요.");
        long id = Long.parseLong(br.readLine());

        Post post = postManagement.getPostDetail(id);
        System.out.println(post.getId() + ": 제목: " + post.getTitle()
                + " 내용: " + post.getContent() + " 작성자 이름: " + post.getAuthor().getName());
    }
    // 로그아웃
    public static void logout() {
        if(loginAuthorId == -1) {
            System.out.println("이미 로그아웃 된 상태입니다.");
        } else {
            loginAuthorId = -1;
            System.out.println("로그아웃 되었습니다.");
        }
    }
}

class PostManagement {
    public static List<Post> postList = new ArrayList<>();

    // 게시글 작성
    public static void addPost(String title, String content, Author author) {
        Post post = new Post(title, content, author);
        postList.add(post);
        author.addAuthorsPost(post);
    }

    // 게시글 전체 목록 조회
    public static List<Post> getPostList() {
        return postList;
    }

    // 게시글 상세 조회
    public static Post getPostDetail(long id) {
        for(int i = 0 ; i < postList.size() ; i++) {
            if(postList.get(i).getId() == id) {
                return postList.get(i);
            }
        }
        return null;
    }
}

class AuthorManagement {
    public static List<Author> authorList = new ArrayList<>();

    // 회원 추가
    public static void addAuthor(String name, String email, String password) {
        authorList.add(new Author(name, email, password));
    }

    // 로그인 검증
    public static long checkAuthor(String email, String password) {
        for(int i = 0 ; i < authorList.size() ; i++) {
            if(authorList.get(i).getEmail().equals(email) && authorList.get(i).getPassword().equals(password)) {
                return i;
            }
        }
        return -1;
    }

    // 회원 전체 목록 조회
    public static List<Author> getAuthorList() {
        return authorList;
    }

    // 회원 상세 조회
    public static Author getAuthorDetail(long id) {
        for(int i = 0 ; i < authorList.size() ; i++) {
            if(authorList.get(i).getId() == id) {
                return authorList.get(i);
            }
        }
        return null;
    }
}


class Author {
    private static long totalAuthorId = 0;
    private long id;
    private String name;
    private String email;
    private String password;
    private List<Post> authorPostList = new ArrayList<>();

    public Author(String name, String email, String password) {
        this.id = totalAuthorId++;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void addAuthorsPost(Post post) {
        authorPostList.add(post);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Post> getAuthorPostList() {
        return authorPostList;
    }
}

class Post{
    private static long totalPostId = 0;
    private long id;
    private String title;
    private String content;
    private Author author;

    public Post(String title, String content, Author author) {
        this.id = totalPostId++;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Author getAuthor() {
        return author;
    }
}
