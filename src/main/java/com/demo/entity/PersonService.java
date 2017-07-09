package com.demo.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.annotation.PostConstruct;  
import javax.annotation.PreDestroy;  
public class PersonService {
    private String  message;  
    
    public String getMessage() {  
        return message;  
    }  
      
    public void setMessage(String message) {  
        this.message = message;  
    }  
     
  
      
    public void init(){  
        System.out.println("init");  
    }  
    //  how  validate the  destory method is  a question  
    public void  cleanUp(){  
        System.out.println("cleanUp");  
    }
//    http://blog.csdn.net/topwqp/article/details/8681497
//    @PostConstruct  
//    public void  postConstruct(){  
//        System.out.println("I'm  init  method  using  @PostConstrut...."+message);  
//    }  
//      
//    @PreDestroy  
//    public void  predestory(){  
//        System.out.println("I'm  destory method  using  @PreDestroy....."+message);  
//    }  
    public static void main(String[] args) {
        
        //只要加载了就会实例化bean 并执行init-method 方法
        AbstractApplicationContext  context =new  ClassPathXmlApplicationContext("testBean.xml");  
        
        PersonService  person = (PersonService)context.getBean("personService");  
//          
//        person.setMessage("hello  spring");  
//          
//        PersonService  person_new = (PersonService)context.getBean("personService");  
//          
//        System.out.println(person.getMessage());  
//        System.out.println(person_new.getMessage()); 
//        context.registerShutdownHook(); 是一个钩子方法，当jvm关闭退出的时候会调用这个钩子方法，在设计模式之 模板模式中 通过在抽象类中定义这样的钩子方法由实现类进行实现，这里的实现类是AbstractApplicationContext，这是spring 容器优雅关闭的方法。
        person.predestory();  
       context.registerShutdownHook();  
    }

}
