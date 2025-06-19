package C02ClassBasic.C09BankService;

//import java.util.ArrayList;
//import java.util.List;
//
//public class AccountManagement {
//    // 계좌 리스트
//    List<Account> accountList = new ArrayList<>();
//
//    // 계좌 개설/추가
//    public void addAccount(Account account) {
//        accountList.add(account);
//    }
//
//    // 계좌 검증 후 반환
//    public Account checkAccount(String accountNumber) {
//        for(int i = 0 ; i < accountList.size() ; i++) {
//            if(accountList.get(i).getAccountNumber().equals(accountNumber)) {
//                return accountList.get(i);
//            }
//        }
//        return null;
//    }
//
//    // 잔고 조회
//    public int getBlanace(Account account) {
//        return account.getBalance();
//    }
//
//    // 입금
//    public void deposit(Account account, int money) {
//        account.plusBalance(money);
//    }
//
//    // 출금 ( 잔고 관리 )
//    public boolean withdraw(Account account, int money) {
//        return account.minusBalance(money);
//    }
//
//    // 송금
//    public void transfer(Account account1, Account account2, int money) {
//        account1.minusBalance(money);
//        account2.plusBalance(money);
//    }
//}
