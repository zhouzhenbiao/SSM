package com.example.spring.Spring实验二_使用Dbutil实现CURD;

import com.example.spring.Spring实验二_使用Dbutil实现CURD.entity.Account;
import com.example.spring.Spring实验二_使用Dbutil实现CURD.service.accountService.AccountServiceImpl;
import com.example.spring.Spring实验二_使用Dbutil实现CURD.util.ApplicationContextUtil;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.ListIterator;

public class Test {

    private static AccountServiceImpl accountService;

    public static void main(String[] args) {
        ApplicationContext applicationContext = ApplicationContextUtil.getApplicationContext();
        accountService = applicationContext.getBean("accountService", AccountServiceImpl.class);

//        testSave();
//        testDelete();
//        testUpdate();
//        testFindById();
        testFindAll();
    }
    //测试通过
    public static void testSave() {
        Account account = new Account();
        account.setUsername("16607010104");
        account.setPassword("zhouzhenkun");
        System.out.println("数据保存成功？ " + accountService.save(account));
    }
    //测试成功
    public static void testUpdate() {
        long id = 16L;
        Account account = accountService.findById(id);
//        account.setUsername("13437946626");
        account.setPassword("zhouzeming");
        System.out.println("数据更新成功？ " + accountService.update(account));
    }

    //测试成功
    public static void testDelete() {
        long id = 17L;
        System.out.println("数据删除成功？ " + accountService.delete(id));
    }

    //测试成功
    public static void testFindById() {
        long id = 5L;
        Account account = accountService.findById(id);
        System.out.println(account == null ? "" : account.toString());
    }

    //测试成功
    public static void testFindAll() {
        List<Account> accountList = accountService.findAll();
        if (!accountList.isEmpty()) {
            ListIterator<Account> iterator = accountList.listIterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next().toString());
            }
        }
    }
}
