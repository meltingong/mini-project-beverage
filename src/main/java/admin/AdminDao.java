package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import common.DataSourceFactory;


public class AdminDao {
	
	private DataSource dataSource;
	
	public AdminDao() throws Exception {
		dataSource = DataSourceFactory.getDataSource();
	}
	
	/*
	 * 관리자 insert
	 */
	public int insertAdmin(Admin admin) throws Exception {
		int rowCount = 0;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(AdminSQL.ADMIN_INSERT);
		pstmt.setString(1, admin.getAdmin_id());
		pstmt.setString(2, admin.getAdmin_pw());
		pstmt.setString(3, admin.getAdmin_name());
		rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	/*
	 * 관리자정보 update
	 */
	public int updateAdmin(Admin admin) throws Exception {
		int rowCount = 0;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(AdminSQL.ADMIN_UPDATE_BY_ADMIN_ID);
		pstmt.setString(1, admin.getAdmin_pw());
		pstmt.setString(2, admin.getAdmin_name());
		rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	/*
	 * 관리자 탈퇴
	 */
	public int deleteAdmin(String admin_id) throws Exception {
		int rowCount = 0;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(AdminSQL.ADMIN_DELETE_BY_ADMIN_ID);
		pstmt.setString(1, admin_id);
		rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	/*
	 * 관리자 리스트
	 */
	public List<Admin> selectAll() throws Exception{
		List<Admin> adminList = new ArrayList<Admin>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(AdminSQL.ADMIN_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			adminList.add(new Admin(rs.getInt(0),rs.getString("admin_id"),rs.getString("admin_pw"),rs.getString("admin_name")));
		}
		pstmt.close();
		con.close();
		return adminList;
	}
	
	
}
