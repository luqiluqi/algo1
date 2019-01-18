package pl.sda.structure.map.bank;

import pl.sda.structure.map.bank.model.AccountType;
import pl.sda.structure.map.bank.model.BankAccount;
import pl.sda.structure.map.bank.model.CardType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

    private UserService userService;
    private List<BankAccount> accounts;

    public BankService(UserService userService) {
        this.userService = userService;
        this.accounts = new ArrayList<>();
    }

    public void createBankAccount(CardType cardType, AccountType accountType, Long userId){
        //TODO
    }

    public Map<AccountType, List<BankAccount>> getAllByAccountType(Long userId){
        Map<AccountType, List<BankAccount>> byAccountType = new HashMap<>();

        //TODO uzupełnij mape

        return byAccountType;
    }

    public Map<CardType, List<BankAccount>> getAllByCardType(Long userId){
        Map<CardType, List<BankAccount>> byCardType = new HashMap<>();

        //TODO uzupełnij mape

        return byCardType;
    }


}
