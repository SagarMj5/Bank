package com.app.Bank.dao.Account;

import com.app.Bank.model.Account;
import com.app.Bank.model.MyResponse;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

    public ResponseEntity<MyResponse<Account>> updateAccount(Account account);

    public ResponseEntity<?> UnauthorizedAccess();

    public ResponseEntity<MyResponse<String>> deleteAccount(String accountNumber);

    public ResponseEntity<?> activeAndInactiveAccount(String accNo);

    public Page<Account> getAllAccounts(int page, int size);

    ResponseEntity<?> checkBalance(String accNo);
}