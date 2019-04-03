package com.example.spring.Spring实验四_使用注解IOC改造账户CURD.service.accountService;

import com.example.spring.Spring实验四_使用注解IOC改造账户CURD.dao.accountDao.AccountDaoImpl;
import com.example.spring.Spring实验四_使用注解IOC改造账户CURD.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDaoImpl accountDao;


    //业务需求一，不能添加相同的username，即保存时先查询有没有相同的username，
    //业务需求二，username，password只能是数字加字母，用正则
    @Override
    public boolean save(Account account) {
        String regUsername = "[a-zA-Z0-9\\_]*";
        String regPassword = "^[a-zA-Z\\_][a-zA-Z0-9\\_]*";

        boolean isUsername = Pattern.matches(regUsername, account.getUsername());
        boolean isPassword = Pattern.matches(regPassword, account.getPassword());
        if (!isUsername || !isPassword) {
            System.out.println("用户或者密码格式错误！！！");
            return false;
        } else {
            List<Account> accountList = accountDao.findAll();
            if (accountList != null) {
                ListIterator<Account> iterator = accountList.listIterator();
                while (iterator.hasNext()) {
                    boolean flag = iterator.next().getUsername().equals(account.getUsername());
                    if (flag) {
                        System.out.println("accountServiceImpl.save(Account account) 该username已被占用！！！");
                        return false;
                    }
                }
                return accountDao.save(account);
            } else
                return false;
        }
    }

    //业务需求一，不能添加相同的username，即保存时先查询有没有相同的username，
    //业务需求二，username，password只能是数字加字母，用正则
    @Override
    public boolean update(Account account) {
        String regUsername = "[a-zA-Z0-9\\_]*";
        String regPassword = "^[a-zA-Z\\_][a-zA-Z0-9\\_]*";

        boolean isUsername = Pattern.matches(regUsername, account.getUsername());
        boolean isPassword = Pattern.matches(regPassword, account.getPassword());
        if (!isUsername || !isPassword) {
            System.out.println("用户或者密码格式错误！！！");
            return false;
        } else {
            List<Account> accountList = accountDao.findAll();
            if (accountList != null) {
                ListIterator<Account> iterator = accountList.listIterator();
                while (iterator.hasNext()) {
                    Account next = iterator.next();
                    if (next.getId() == account.getId()) {
                        continue;
                    }
                    boolean flag = next.getUsername().equals(account.getUsername());
                    if (flag) {
                        System.out.println("accountServiceImpl.update(Account account) 该username已被占用！！！");
                        return false;
                    }
                }
                return accountDao.update(account);
            } else
                return false;
        }
    }

    //业务需求，accountId 必须大于0
    @Override
    public boolean delete(long accountId) {
        if (accountId > 0) {
            return accountDao.delete(accountId);
        }
        return false;
    }

    //业务需求，accountId 必须大于0
    @Override
    public Account findById(long accountId) {
        if (accountId > 0) {
            return accountDao.findById(accountId);
        }
        return null;
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
}