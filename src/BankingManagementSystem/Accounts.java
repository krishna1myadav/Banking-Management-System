package BankingManagementSystem;

import java.sql.Connection;
import java.util.Scanner;

public class Accounts {
    private Connection connection;
    private Scanner scanner;

    Accounts( Connection connection, Scanner scanner ){
        this.connection = connection;
        this.scanner = scanner;
    }

    public long open_account(String email){
        if(!account_exist(email)){
            Sting open_account_query = "INSERT INTO Acounts(account_number, full_name, email, balance, security_pin) VALUES(?, ?, ?, ?, ?)";
            scanner.nextLine();
            System.out.println("Enter Full Name: ");
            String full_name = scanner.nextLine();
            System.out.println("Enter Initial Account: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter Security Pin:");
            String security_pin = scanner.nextLine();
            try{
                long account_number = generateAccountNumber();
                PreparedStatement preparedStatement = connection.prepareStatement(open_account_query);
                preparedStatement.setLog(1, account_number);
                preparedStatement.setString(2, full_name);
                preparedStatement.setString(3, email);
                preparedStatement.setString(4, balance);
            }
        }
    }

}
