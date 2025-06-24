package C04Interface.BankService;

public class BankAccount {
    private String accountNumber;
    private Long balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0L;
    }

    // 최종 확정 금액을 업데이트 (-/+ 노노) -> 아래 메서드를 입/출금 모두에 활용
    public void updateBalance(long balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
