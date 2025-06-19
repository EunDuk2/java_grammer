package C02ClassBasic.C09BankService;

//        계좌개설 및 입출금 서비스 : id(auto_increment), accountNumber(String), balance(int).
//        주의사항1 : main메서드에서 입출력 처리를 하고, deposit, withdraw, transfer 메서드는 BankAccount클래스에 생성.
//        주의사항2 : 프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
//        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
//        1.계좌개설 : 계좌번호와 현재가지고 계신돈을 입력하세요. -> 자동으로 id값 증가되어 세팅
//        2.계좌조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
//        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요. -> 현재 계좌에 얼마가 있습니다. 출력.
//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증) -> 남은 금액은 얼마입니다. 출력.
//        5.송금 : 송금서비스입니다. 본인의 계좌번호를 입력해주세요. 보내고자 하는 상대방의 계좌번호를 입력해주세요. 송금금액을 입력해주세요.(잔액검증)

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankSystem {
    public static AccountManagement accountManagement;
    public static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        accountManagement = new AccountManagement();

        while(true) {
            System.out.println("서비스 번호를 입력하세요. (1. 개설 2. 조회 3. 입금 4. 출금 5. 송금)");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    BankSystem.createAccount();
                    break;
                case 2:
                    BankSystem.showAccount();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    transfer();
                    break;
                default:
                    System.out.println("잘못된 번호 입니다.");
                    break;
            }
        }
    }
    // 개설
    static void createAccount() {
        System.out.println("계좌번호를 입력하세요");
        sc.nextLine();
        String accountNumber = sc.nextLine();
        System.out.println("현재 가지고 계신돈을 입력하세요");
        int money = sc.nextInt();
        accountManagement.addAccount(new Account(accountNumber, money));
        System.out.println("계좌 개설이 완료되었습니다.");
    }

    // 조회
    static void showAccount() {
        System.out.println("계좌번호를 입력하세요");
        sc.nextLine();
        String accountNumber = sc.nextLine();
        Account account = accountManagement.checkAccount(accountNumber);
        if(account == null) {
            System.out.println("없는 계좌 번호 입니다.");
        } else {
            System.out.println("잔고는 " + accountManagement.getBlanace(account) + " 입니다.");
        }
    }

    // 입금
    static void deposit() {
        System.out.println("계좌번호를 입력하세요");
        sc.nextLine();
        String accountNumber = sc.nextLine();
        Account account = accountManagement.checkAccount(accountNumber);
        if(account == null) {
            System.out.println("없는 계좌 번호 입니다.");
        } else {
            System.out.println("입금하실 금액을 입력하세요.");
            int money = sc.nextInt();
            accountManagement.deposit(account, money);
            System.out.println("잔고는 " + accountManagement.getBlanace(account) + " 입니다.");
        }
    }

    // 출금
    static void withdraw() {}


    // 송금
    static void transfer() {
        System.out.println("본인 계좌번호를 입력하세요");
        sc.nextLine();
        String accountNumber1 = sc.nextLine();
        Account account1 = accountManagement.checkAccount(accountNumber1);
        System.out.println("상대방 계좌번호를 입력하세요");
        String accountNumber2 = sc.nextLine();
        Account account2 = accountManagement.checkAccount(accountNumber2);
        if(account1 == null || account2 == null) {
            System.out.println("없는 계좌 번호 입니다.");
        } else {
            System.out.println("입금하실 금액을 입력하세요.");
            int money = sc.nextInt();
            accountManagement.transfer(account1, account2, money);
            System.out.println("잔고는 " + accountManagement.getBlanace(account1) + " 입니다.");
        }
    }
}

// static 으로 깔아주기 (다양한 객체를 위한 클래스가 아니니)
class AccountManagement {
    // 계좌 리스트
    List<Account> accountList = new ArrayList<>();

    // 계좌 개설/추가
    public void addAccount(Account account) {
        accountList.add(account);
    }

    // 계좌 검증 후 반환
    public Account checkAccount(String accountNumber) {
        for(int i = 0 ; i < accountList.size() ; i++) {
            if(accountList.get(i).getAccountNumber().equals(accountNumber)) {
                return accountList.get(i);
            }
        }
        return null;
    }

    // 잔고 조회
    public int getBlanace(Account account) {
        return account.getBalance();
    }

    // 입금
    public void deposit(Account account, int money) {
        account.plusBalance(money);
    }

    // 출금 ( 잔고 관리 )
    public boolean withdraw(Account account, int money) {
        return account.minusBalance(money);
    }

    // 송금
    public void transfer(Account account1, Account account2, int money) {
        account1.minusBalance(money);
        account2.plusBalance(money);
    }
}

class Account {
    private static long totalId = 0;
    private long id;
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.id = totalId++;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void plusBalance(int money) {
        this.balance += money;
    }
    public boolean minusBalance(int money) {
        if(this.balance < money) {
            return false;
        } else {
            this.balance -= money;
            return true;
        }
    }
}