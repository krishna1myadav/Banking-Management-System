package BankingManagementSystem;

import java.sql.*;
import java.util.Scanner;

import static java.lang.Class.forName;

public class BankingApp {
    private static final String url = "jdbc:mysql://localhost:3306/banking_system";
    private static final String username = "root";
    private static final String password = "66669999";

    public static void main( String[] args )throws ClassNotFoundException, SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch( ClassNotFoundException e){
            System.out.println( e.getMessage() );
        }

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Scanner scanner = new Scanner(System.in);

            User user = new User( connection, scanner );
            Accounts accounts = new Accounts( connection, scanner );
            AccountManager accountManager = new AccountManager( connection, scanner );

            String email ;
            long account_number;

        }

    }
}
