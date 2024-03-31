package br.com.patrick.todolist.model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.patrick.todolist.DAO.DatabaseConnection;
import java.util.ArrayList;
import java.util.List;

public class MetodosTarefaModel {
private Connection connection; // Conexão com o banco de dados
    
    public MetodosTarefaModel() {
        // Inicialize a conexão com o banco de dados
        connection = DatabaseConnection.getConnection();
    }
    
    public void adicionarTarefa(String title, String description) {
        String query = "INSERT INTO tarefas (titulo_tarefa, descricao_tarefa) VALUES (?, ?)";
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, title);
            statement.setString(2, description);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Trate adequadamente as exceções
        }
    }
    
     public TarefasModel obterTarefaPorId(int id) {
        String query = "SELECT * FROM tarefas WHERE id_tarefa = ?";
        TarefasModel tarefa = null;
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                String title = resultSet.getString("titulo_tarefa");
                String description = resultSet.getString("descricao_tarefa");
                tarefa = new TarefasModel(id, title, description);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Trate adequadamente as exceções
        }
        
        return tarefa;
    }
     
     public void atualizarTarefa(int id, String novoTitulo, String novaDescricao) {
    String query = "UPDATE tarefas SET titulo_tarefa = ?, descricao_tarefa = ? WHERE id_tarefa = ?";
    
    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setString(1, novoTitulo);
        statement.setString(2, novaDescricao);
        statement.setInt(3, id);
        statement.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace(); // Trate adequadamente as exceções
    }
}

    
    public void removerTarefa(int id) {
        String query = "DELETE FROM tarefas WHERE id_tarefa = ?";
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Trate adequadamente as exceções
        }
    }
    
public List<TarefasModel> obterTodasTarefas() {
    List<TarefasModel> listaTarefas = new ArrayList<>();
    String query = "SELECT * FROM tarefas";
    
    try (PreparedStatement statement = connection.prepareStatement(query)) {
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id_tarefa");
            String title = resultSet.getString("titulo_tarefa");
            String description = resultSet.getString("descricao_tarefa");
            TarefasModel tarefa = new TarefasModel(id, title, description); // Aqui você usa o construtor que inclui o ID
            listaTarefas.add(tarefa);
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Trate adequadamente as exceções
    }
    
    return listaTarefas;
}

}