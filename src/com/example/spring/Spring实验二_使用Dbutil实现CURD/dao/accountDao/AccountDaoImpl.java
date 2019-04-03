package com.example.spring.Spring实验二_使用Dbutil实现CURD.dao.accountDao;

import com.example.spring.Spring实验二_使用Dbutil实现CURD.entity.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    @Override
    public boolean save(Account account) { // 测试成功
        String sql = "insert into t_account (username, password) values (?, ?)";
        try {
            int rows = runner.update(sql, account.getUsername(), account.getPassword());
            if (rows > 0) {
                System.out.println("accountDaoImpl.save() 插入成功");
                return true;
            } else {
                System.out.println("accountDaoImpl.save() 插入失败！！！");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("accountDaoImpl.save(Account accountDao) 失败！！！");
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Account account) {
        String sql = "update t_account set username = ?, password = ? where id = ?";
        try {
            int rows = runner.update(sql, account.getUsername(), account.getPassword(), account.getId());
            if (rows > 0) {
                System.out.println("accountDaoImpl.update() 更新成功");
                return true;
            } else {
                System.out.println("accountDaoImpl.update() 更新失败！！！");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("accountDaoImpl.update(Account accountDao) 失败！！！");
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(long accountId) {  //测试成功
        String sql = "delete from t_account where id = ?";
        try {
            int rows = runner.update(sql, accountId);
            if (rows > 0) {
                System.out.println("accountDaoImpl.delete() 删除成功");
                return true;
            } else {
                System.out.println("accountDaoImpl.delete() 删除失败！！！");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("accountDaoImpl.delete(long accountId) 失败！！！");
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Account findById(long accountId) {  // 测试成功
        String sql = "select * from t_account where id = ?";
        try {
            Account query = runner.query(sql, new BeanHandler<Account>(Account.class), accountId);
            if (query != null) {
                System.out.println("accountDaoImpl.findById() 查询成功");
                return query;
            } else {
                System.out.println("accountDaoImpl.findById() 没有数据！！！");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("accountDaoImpl.findById(long accountId) 失败！！！");
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Account> findAll() {
        String sql = "select * from t_account";
        try {
            List<Account> list = runner.query(sql, new BeanListHandler<Account>(Account.class));
            if (!list.isEmpty()) {
                System.out.println("accountDaoImpl.findAll() 查询成功");
                return list;
            } else {
                System.out.println("accountDaoImpl.findAll() 没有数据！！！");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("accountDaoImpl.findAll() 失败 ！！！");
            e.printStackTrace();
            return null;
        }
    }
}