package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import VO.CustomerVO;
import db.DBhelper;
import db.SQL;

public class CustomerDAO extends DBhelper {
	
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return instance;
	}
	private CustomerDAO() {
		
	}
	public int insertCustomer(CustomerVO vo) {
		
		int count = 0;
		
		try {
			
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, vo.getCustid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setString(4, vo.getAddr());
			count = psmt.executeUpdate();
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	public CustomerVO selectCustomer(String custId) {
		
		CustomerVO vo = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new CustomerVO();
				vo.setCustid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAddr(rs.getString(4));
			}
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	public List<CustomerVO> selectCustomers() {
		return null;
	}
	public int updateCustomer(CustomerVO vo) {
		return 0;
	}
	public int deleteCustomer(String custId) {
		return 0;
	}
}
