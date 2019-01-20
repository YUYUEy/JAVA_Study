package com.midea.isc.isale.wms.test;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.SQLException;

public class JdbcTest {
	public static void main(String[] args) {
		 //数据库连接
		Connection connection = null;
		 //预编译的Statement，使用预编译的Statement提高数据库性能
		PreparedStatement preparedStatement =null;
		//结果集
		ResultSet resultSet =null;
		try {
			 //加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			 //通过驱动管理类获取数据库链接
			connection =(Connection) DriverManager.getConnection("jdbc:mysql://10.16.88.189:3306/isc_test1?characterEncoding=utf-8", "iappsmgr", "db2018uat2");
			//定义sql语句 ?表示占位符
			String sql ="SELECT * FROM `yy_stu`";
			//获取预处理statement
//			preparedStatement = connection.prepareStatement(sql);
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			//设置参数，第一个参数为sql语句中参数的序号（从1开始），第二个参数为设置的参数值
//			preparedStatement.setString(1, "");
			 //向数据库发出sql执行查询，查询出结果集
			resultSet = preparedStatement.executeQuery();
			System.out.println(123);
			System.out.println(resultSet);
			 //遍历查询结果集
			while (resultSet.next()) {
				String id =resultSet.getString("sid");
				String username =resultSet.getString("sname");
				System.out.println(id+"----;"+username);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			 //释放资源
			if(resultSet !=null){
				try {
					resultSet.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if(preparedStatement !=null){
				try {
					preparedStatement.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if(connection !=null){
				try {
					connection.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
}
