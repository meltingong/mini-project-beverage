package admin;

public class AdminSQL {
	
	public final static String ADMIN_INSERT ="insert into admin values(admin_admin_no_SEQ.nextval,?,?,?);";
	public final static String ADMIN_UPDATE_BY_ADMIN_ID ="update admin set admin_pw=?,admin_name=? where admin_id =?";
	public final static String ADMIN_DELETE_BY_ADMIN_ID = "delete from admin where admin_id=?";
	public final static String ADMIN_SELECT_ALL = "select * from admin";
	public final static String ADMIN_SELECT_BY_ADMIN_ID = "select * from admin where admin_id=?";
}
