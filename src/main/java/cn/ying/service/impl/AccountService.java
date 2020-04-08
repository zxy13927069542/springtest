package cn.ying.service.impl;

import cn.ying.dao.IAccountDao;
import cn.ying.domain.Account;
import cn.ying.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * �˻���ҵ���ʵ����
 */
//@Component("AccountService")
@Service("AccountService")
public class AccountService implements IAccountService {
    //ʹ���Զ�ע��
    @Autowired       //������ע��
    IAccountDao iAccountDao;


    //�ӹ�����ȡBean����
//    IAccountDao iAccountDao = (IAccountDao) BeanFactory.getBean("AccountDao");

    @Override
    public void insert(Account account) {

        iAccountDao.insert(account);

    }

    @Override
    public void delete(Integer id) {

        iAccountDao.delete(id);

    }

    @Override
    public Account select(Integer id) {
       return iAccountDao.selectById(id);
    }

    @Override
    public void update(Account account) {
        iAccountDao.update(account);

    }
}
