package cn.ying.service;

import cn.ying.domain.Account;

/**
 * �˻�ҵ���ӿ�
 */
public interface IAccountService {

    /**
     * �����˻�
     * @param account
     */
    public void insert(Account account);

    /**
     * �����˻�idɾ���˻�
     * @param id
     */
    public void delete(Integer id);

    /**
     * �����˻�id��ѯ�˻�
     * @param id
     * @return
     */
    public Account select(Integer id);

    /**
     * �����˻�
     * @param account
     */
    public void update(Account account);


}
