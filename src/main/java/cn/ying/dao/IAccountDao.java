package cn.ying.dao;

import cn.ying.domain.Account;

/**
 * �˻��ĳ־ò�ӿ�
 */
public interface IAccountDao {

    /**
     * ����һ���˻�
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
    public Account selectById(Integer id);

    /**
     * �����˻�
     * @param account
     */
    public void update(Account account);


}
