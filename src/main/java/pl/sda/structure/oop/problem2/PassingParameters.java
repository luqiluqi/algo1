package pl.sda.structure.oop.problem2;

import java.math.BigDecimal;

public class PassingParameters {


    /**
     * Jak zastąpić wywołanie z wieloma parametrami ?
     */


    public class Parameter{
        int sum;
        String name;
        String title;
        BigDecimal amount;
        BigDecimal credit;
        String surname;
        String address;
        public Parameter sum(int sum){
            this.sum = sum;
            return this;
        }
        public Parameter title(String title){
            this.title = title;
            return this;
        }

    }

}
