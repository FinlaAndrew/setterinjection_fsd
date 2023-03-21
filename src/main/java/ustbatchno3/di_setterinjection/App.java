package ustbatchno3.di_setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("application.xml"); 
    	Roles r = context.getBean("Finla",Roles.class);
    	Roles s = context.getBean("Finita",Roles.class);
    	Roles t = context.getBean("Treasa",Roles.class);
    	r.display();
    	s.display();
    	t.display();
    }
}
