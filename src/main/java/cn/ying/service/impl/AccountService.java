package cn.ying.service.impl;

import cn.ying.dao.IAccountDao;
import cn.ying.domain.Account;
import cn.ying.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 账户的业务层实现类
 */
//@Component("AccountService")
@Service("AccountService")
public class AccountService implements IAccountService {
    //使用自动注入
    @Autowired       //按类型注入
    IAccountDao iAccountDao;


    //从工厂获取Bean对象
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
