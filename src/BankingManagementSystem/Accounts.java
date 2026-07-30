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

}
