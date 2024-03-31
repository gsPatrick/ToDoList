package br.com.patrick.todolist.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    
    private static final String URL = "jdbc:postgresql://localhost:5432/ToDoList";
    private static final String USER = "postgres"; // substitua pelo seu nome de usuário
    private static final String PASSWORD = "todolist123"; // substitua pela sua senha

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão com o banco de dados estabelecida com sucesso.");
            return connection;
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer conexão com o banco de dados:");
            e.printStackTrace();
            return null;
        }
    }
}
