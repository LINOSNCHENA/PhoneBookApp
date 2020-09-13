package com.monze.contactsql.dbmgmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class contactsCreateTable {

      public static void createTable(String url, String user, String passwd) {
            String sql1 = "DROP TABLE IF EXISTS tblphone;";
            String sql2 = "CREATE TABLE tblphone (id SERIAL PRIMARY KEY,pname TEXT NOT NULL, pnumber1 INT NOT NULL,pnumber2 INT);";
            String sql3 = "INSERT INTO tblphone(pname,pnumber1,pnumber2) VALUES('police Emmergency', 9999,31),('hospital Emergency',8888,21);";
            String sql4 = "INSERT INTO tblphone(pname,pnumber1,pnumber2) VALUES('fire Emmergency', 7777,41),('City police service Emergency',6666,11);";

            try (Connection con = DriverManager.getConnection(url, user, passwd);) {
                  System.out.println("\n Accessing database and table is been formated .......");
                  Statement stmt1 = con.createStatement();
                  Statement stmt2 = con.createStatement();
                  Statement stmt3 = con.createStatement();
                  Statement stmt4 = con.createStatement();

                  stmt1.executeUpdate(sql1);
                  stmt2.executeUpdate(sql2);
                  stmt3.executeUpdate(sql3);
                  stmt3.executeUpdate(sql4);
                  stmt1.close();
                  stmt2.close();
                  stmt3.close();
                  stmt4.close();
                  con.close();
            } catch (Exception e) {
                  System.err.println(e.getClass().getName() + ": " + e.getMessage());
                  System.exit(0);
            }
            System.out.println("\n !=================== TABLE CREATION COMPLETE =======================!\n");
      }

}
