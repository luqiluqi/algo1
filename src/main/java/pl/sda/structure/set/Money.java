package pl.sda.structure.set;

import java.math.BigDecimal;

public class Money implements Comparable {

    private BigDecimal value;

    public Money(BigDecimal value) {
        this.value = value;
    }


    /**
     *  -1 - this < other
     *  = - this == other
     *  1 - this > other
     *
     * @return
     */
    @Override
    public int compareTo(Object other) {

        if(other.getClass() == this.getClass()){
            Money o = (Money)other;
            Integer thisMoney = this.value.intValue();
            int otherMoney = o.value.intValue();

            return thisMoney.compareTo(otherMoney);
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Money{" +
                "value=" + value +
                '}';
    }
}
