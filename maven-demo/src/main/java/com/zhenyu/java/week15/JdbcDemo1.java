package com.zhenyu.java.week15;

import java.sql.*;

public class JdbcDemo1 {
    private final static String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    private final static String DB_URL="JDBC:mysql://localhost:3306/student_manager";
    private final static String USER_NAME="root";
    private final static String PASSWORD="q83228621";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        Connection conn= DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
        Statement statement=conn.createStatement();
        String sql="SELECT * FROM t_student";
        ResultSet rs=statement.executeQuery(sql);
        while (rs.next())
        {
            int classId=rs.getInt("Class_id");
            String studentName=rs.getString("student_name");
            short gender=rs.getShort(6);
            Object birthday=rs.getObject("birthday");
            System.out.println(classId+","+studentName+","+gender+","+birthday);
        }
        rs.close();
        statement.close();
        conn.close();
    }
}
