package com.itheima.ui;

import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImp;

public class Client {
    public static void main(String[] args) {
        IAccountService as= new AccountServiceImp();
        as.saveAccount();
    }


}
