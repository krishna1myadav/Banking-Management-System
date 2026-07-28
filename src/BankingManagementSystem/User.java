package BankingManagementSystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class User {
    private Connection connection;
    private Scanner scanner;

    public User( Connection connection, Scanner scanner ){
        this.connection = connection;
        this.scanner = scanner;
    }

    public void register(){
        scanner.nextLine();
        System.out.print(" Enter Full Name ");
        String full_name = scanner.nextLine();
        System.out.print(" Enter email ");
        String email = scanner.nextLine();
        System.out.print(" Enter Password ");
        String password = scanner.nextLine();

        if( user_exist (email) ){
            System.out.println(" User Already Exists for this Email Address!!");
            return;
        }
        String register_query = "INSERT INTO User(full_name, email, password) VALLUES(?, ?, ?)";
        try{
            PreparedStatement preparedStatement = connction.prepareStatement(register_query);
            preparedStatement.setString(1, full_name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);

            int affectedRows = preparedStatement.executeUpdate();
            if( affectedRows > 0 ){
                System.out.println(" Registration Successfull!!");
            }else{
                System.out.println(" Registration Failed!!");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public String login(){
        scanner.nextLine();
    }
}
