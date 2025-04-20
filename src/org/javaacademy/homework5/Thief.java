package org.javaacademy.homework5;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class Thief {
    private BigDecimal money;

    private Thief(BigDecimal money) {
        this.money = BigDecimal.ZERO;
    }

    private void stealMoney(Bank bank) {
        try {
            Field bankMoneyField = bank.getClass().getDeclaredField("money");
            bankMoneyField.setAccessible(true);
            BigDecimal bankMoney = (BigDecimal) bankMoneyField.get(bank);
            bankMoneyField.set(bank, BigDecimal.ZERO);
            this.money = this.money.add(bankMoney);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Thief{" + "money=" + money + '}';
    }
}
