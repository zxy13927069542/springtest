package cn.ying.dao.impl;

import cn.ying.dao.IAccountDao;
import cn.ying.domain.Account;
import org.springframework.stereotype.Repository;

//@Component("AccountDao")
@Repository("AccountDao")
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void insert(Account account) {
        System.out.println("�˻�����ɹ�");
    }

    @Override
    public void delete(Integer id) {
        System.out.println("�˻�ɾ���ɹ�");

    }

    @Override
    public Account selectById(Integer id) {
        Account account = new Account();
        System.out.println("�˻���ѯ�ɹ�");
        return account;
    }

    @Override
    public void update(Account account) {
        System.out.println("�˻����³ɹ�");

    }
}
