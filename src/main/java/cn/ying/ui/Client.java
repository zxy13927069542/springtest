package cn.ying.ui;

import cn.ying.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * ����ʵ����
 */
@Controller("Client")
public class Client {
    //private static IAccountService accountService = (IAccountService) BeanFactory.getBean("AccountService");

    @Autowired    //������ע��
    private static IAccountService accountService;
    public static void main(String[] args) {
        //��ȡ�������� ���ַ�ʽ
        // һ��ApplicationContext��һ���������ļ����̴���bean����Ĭ��Ϊ�������󣬿����������ļ�������Ϊ��������
        // ��һ��BeanFactory����Ҫʹ��ʱ�Ŵ���bean����Ĭ��Ϊ��������
        //����һ����AnnotationConfigApplicationContext  ��ע��ʱʹ��

        //ʹ��ApplicationContext������������
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //ͨ��ApplicationContext��ȡ����
//        accountService = (IAccountService) ac.getBean("AccountService");  //�Լ��ֶ�ǿת����
          accountService = ac.getBean("AccountService",IAccountService.class); //��spring����ǿת

//        //ͨ��BeanFactory��ȡ��������
//        Resource resource = new ClassPathResource("bean.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//
//        accountService = factory.getBean("AccountService",IAccountService.class);

        accountService.delete(36);
    }
}
