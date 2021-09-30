package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class TB_MEMDAO {
	//TB_MEM 테이블에 insert - 회원가입
	public int insert(TB_MEMDTO user) {
		System.out.println("웹페이지에 사용자가 입력한 데이터:"+user); 
		String sql = "insert into TB_MEM values(?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;	
		int result = 0;
		try {			
			con = TP_DBUtil.getConnect();
			stmt = con.prepareStatement(sql);			
			stmt.setString(1, user.getMEM_NM());
			stmt.setString(2, user.getBIRTH());
			stmt.setString(3, user.getGENDER());
			stmt.setString(4, user.getMEM_ID());
			stmt.setString(5, user.getPWD());
			stmt.setString(6, user.getPWD_CHECK());
			stmt.setString(7, user.getCELLNO());
			stmt.setString(8, user.getEMAIL());
			stmt.setString(9, user.getADDR());
				
			result = stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			TP_DBUtil.close(null, stmt, con);
		}
		return result;
	}

}





