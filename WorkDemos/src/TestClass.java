//Spring Demo


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class TestClass {  
public static void main(String[] args) {  
    /*Resource resource=new ClassPathResource("com/springdemo/applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Student student=(Student)factory.getBean("studentbean");  
    student.displayInfo();  */
	
	 ApplicationContext context = 
             new ClassPathXmlApplicationContext("applicationContext.xml");

	 Student obj = (Student) context.getBean("studentbean");

      obj.getName();
}  }