package cn.ying.dao;

import java.sql.*;

public class Jdbc {
    static String url = "jdbc:mysql://localhost:3306/sct?serverTimezone=UTC";
    static String userName = "root";
    static String passWord = "066311";
    static String driver = "com.mysql.cj.jdbc.Driver";
    static Connection conn ;

    public static void main(String[] args) {
        //即使不注册驱动也可以获取连接
        //try-catch-resource结构
        //()中的资源会被自动关闭而无需手动关闭
        try (
             Connection con = DriverManager.getConnection(url,userName,passWord);
             PreparedStatement ps = con.prepareStatement("select  * from student");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()){
                System.out.println(rs.getString("sname"));
            }

            // process the resultset here, all resources will be cleaned up

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
