package web_basic.jsp_13.erp;

import java.sql.Connection;
import java.util.List;

import web_basic.jsp_13.JndiDs;

public class TitleService {
	private Connection con = JndiDs.getConnection();
	private TitleDaoImpl dao = TitleDaoImpl.getInstance();
	
	public TitleService() {
		dao.setCon(con);
	}
	
	public List<Title> showTitles(){
		return dao.selectTitleByAll();
	}
	
	public void addTitle(Title title) {
		dao.insertTitle(title);
	}
	
}
