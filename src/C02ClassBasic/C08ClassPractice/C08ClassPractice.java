package C02ClassBasic.C08ClassPractice;

import java.util.ArrayList;
import java.util.List;

public class C08ClassPractice {
    public static void main(String[] args) {
        // 객체 선언 및 List에 2개 정도 add
        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("hong1", "1234", 50000));
        accountList.add(new Account("hong2", "1234234", 70000));
    }
}

// Account 클래스. 계좌주명(name : String), 계좌번호(accountNumber : String), 잔고(balance : long)
//
