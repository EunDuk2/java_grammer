package C04Interface.BankService;

public class BankKakaoService implements BankService {
    @Override
    public void deposit(long money, BankAccount ba) {
        // 현재 얼마 있는지 조회
        // 그 금액과 money를 합산하여 update Balance
        ba.updateBalance(ba.getBalance() + money);
    }
    @Override
    public boolean withdraw(long money, BankAccount ba) {
        // 현재 얼마있는 지 조회 & 출금 금액과 비교
        // 그 금액과 money를 차감하여 update Balance
        if(ba.getBalance() >= money) {
            ba.updateBalance(ba.getBalance() - money);
            return true;
        } else {
            return false;
        }
    }
}
