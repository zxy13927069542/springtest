package cn.ying.service;

import cn.ying.domain.Account;

/**
 * 账户业务层接口
 */
public interface IAccountService {

    /**
     * 插入账户
     * @param account
     */
    public void insert(Account account);

    /**
     * 根据账户id删除账户
     * @param id
     */
    public void delete(Integer id);

    /**
     * 根据账户id查询账户
     * @param id
     * @return
     */
    public Account select(Integer id);

    /**
     * 更新账户
     * @param account
     */
    public void update(Account account);


}
