package rukmini.tutorial;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class CoreJavaClient {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory  = new XmlBeanFactory(resource);
		Student stu = (Student) factory.getBean("studentbean");
		stu.displayInfo();
		
		

	}

}
