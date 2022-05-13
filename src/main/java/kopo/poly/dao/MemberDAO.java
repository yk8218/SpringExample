package kopo.poly.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Date;

public class MemberDAO {
    private String user_id;
    private String user_pw;
    private String user_name;
    private int user_age;

    private Connection con;
    private ResultSet rs;

    public MemberDAO() {

        try{
            String dbURL = "jdbc:mysql://localhost:3306/<myDB>?characterEncoding=UTF-8&serverTimezone=UTC";
            String dbID = "web_user";
            String dbPW = "1234";
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
