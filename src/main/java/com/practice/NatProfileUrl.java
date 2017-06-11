package com.practice;

//import oracle.jdbc.driver.OracleDriver;
import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 06/11/13
 * Time: 21:36
 */
public class NatProfileUrl {

  // JDBC driver name and database URL
  static final String DB_URL = "jdbc:oracle:thin:@pulley:1521:nmsd";


  //  Database credentials
  static final String USER = "nmslivea";
  static final String PASS = "nmslivead";
  private static final String sqlCount = "select count(*) from nat_profile_url";
  private static final String sqlCountProfileUrl = "select profile_url from nat_profile_url";

  public static void main(String[] args) {
    getProfileNatTableEntries();
  }

  public static void getProfileNatTableEntries(){
    Connection conn = null;
    Statement stmt = null;
    ResultSet resultSetCount = null;
    ResultSet resultSetProfileUrl = null ;
    long start, end;

    try  {
      //Open a connection
      System.out.println("Connecting to database...");
      //DriverManager.registerDriver(new OracleDriver());
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //Execute query
      stmt = conn.createStatement();

      resultSetCount = stmt.executeQuery(sqlCount);
      resultSetCount.next();
      System.out.println(resultSetCount.getString("COUNT(*)"));


      start = System.nanoTime();
      resultSetProfileUrl = stmt.executeQuery(sqlCountProfileUrl);
      int i = 0;
      while (resultSetProfileUrl.next()){
        if(i % 10000==0){
          System.out.println(i +" - " +resultSetProfileUrl.getString("PROFILE_URL"));
        }
        i++;
      }
      end = System.nanoTime();

      System.out.println("Command executed successfully..." + "in " + (end-start)/1000000000 );

    }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
    }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
    } finally {
      //Close connections
      try{
        resultSetCount.close();
        resultSetProfileUrl.close();
        stmt.close();
        conn.close();
      }  catch (SQLException e) {
        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
      }
    }
  }

}
