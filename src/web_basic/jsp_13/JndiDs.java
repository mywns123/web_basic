package web_basic.jsp_13;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JndiDs {
	private static DataSource ds;
	
	private JndiDs() {}
	
	static { // 생성자 보다 먼저 수행
		try{
			InitialContext ic = new InitialContext(); //1.Jndi서버 객체 생성
			ds = (DataSource)ic.lookup("java:comp/env/jdbc/dbstudy");
			System.out.println("ds : " + ds);
		}catch(NamingException e){		
			e.printStackTrace();
		}		
	}

	public static Connection getConnection() {
		try{
			return ds.getConnection();
		}catch(SQLException e){		
			e.printStackTrace();
		}	
		return null;		
	}
}
