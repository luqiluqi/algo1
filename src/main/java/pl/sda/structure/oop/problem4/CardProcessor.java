package pl.sda.structure.oop.problem4;

public class CardProcessor {



    public CardProcessor() {
    }

    /**
     *
     * Metoda zwraca :
     *
     * MASTERCARD -         prefixy 34,35,36
     *                      długość 16,17,18
     *                      czyli np. 34 0000 1000 9890 111 (17 znaków)
     *
     * VISA                 -prefixy 45, 46
     *                      długość 18
     *                      czyli np 45 0000 1000 9890 6511 (18 znaków)
     *
     * AmericanExpress      -prefixy 60,65
     *                      długość 16
     *                      czyli np. 6011111111111111 (16 znakow)
     *                                6511111111111111 (16 znakow)
     *
     *
     * W przeciwnym wypadku zwraca "Unknown"
     *
     *
     */
    public String getCardType(String cardNumber){
        return "Unknown";
    }

}
