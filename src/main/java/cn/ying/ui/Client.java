package cn.ying.ui;

import cn.ying.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * 界面实现类
 */
@Controller("Client")
public class Client {
    //private static IAccountService accountService = (IAccountService) BeanFactory.getBean("AccountService");

    @Autowired    //按类型注入
    private static IAccountService accountService;
    public static void main(String[] args) {
        //获取核心容器 三种方式
        // 一种ApplicationContext：一加载配置文件即刻创建bean对象，默认为单例对象，可以在配置文件中声明为多例对象
        // 另一种BeanFactory：需要使用时才创建bean对象，默认为多例对象
        //还有一种是AnnotationConfigApplicationContext  是注解时使用

        //使用ApplicationContext创建核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //通过ApplicationContext获取对象
//        accountService = (IAccountService) ac.getBean("AccountService");  //自己手动强转类型
          accountService = ac.getBean("AccountService",IAccountService.class); //由spring进行强转

//        //通过BeanFactory获取核心容器
//        Resource resource = new ClassPathResource("bean.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//
//        accountService = factory.getBean("AccountService",IAccountService.class);

        accountService.delete(36);
    }
}
