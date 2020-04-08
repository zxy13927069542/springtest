package cn.ying.dao.impl;

import cn.ying.dao.IAccountDao;
import cn.ying.domain.Account;
import org.springframework.stereotype.Repository;

//@Component("AccountDao")
@Repository("AccountDao")
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void insert(Account account) {
        System.out.println("账户插入成功");
    }

    @Override
    public void delete(Integer id) {
        System.out.println("账户删除成功");

    }

    @Override
    public Account selectById(Integer id) {
        Account account = new Account();
        System.out.println("账户查询成功");
        return account;
    }

    @Override
    public void update(Account account) {
        System.out.println("账户更新成功");

    }
}
