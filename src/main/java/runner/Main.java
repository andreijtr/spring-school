package runner;

import config.HibernateUtil;
import org.hibernate.Session;

public class Main {
    public static void main( String[] args ) {
        HibernateUtil hibernateUtil = new HibernateUtil();
        Session session = hibernateUtil.getSession();
        System.out.println( "Hello World!" );
    }
}
