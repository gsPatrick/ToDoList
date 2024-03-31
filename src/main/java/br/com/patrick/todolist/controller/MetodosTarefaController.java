package br.com.patrick.todolist.controller;
import br.com.patrick.todolist.model.MetodosTarefaModel;
import br.com.patrick.todolist.model.TarefasModel;
import java.util.List;

public class MetodosTarefaController {
    
     private TarefasModel tarefasModel; // Referência para o modelo de dados
     private MetodosTarefaModel metodosTarefaModel;
    
    // Construtor que recebe uma instância do modelo de dados
    public MetodosTarefaController(MetodosTarefaModel metodosTarefaModel) {
        this.metodosTarefaModel = metodosTarefaModel;
    }
    
    // Método para adicionar uma nova tarefa
    public void adicionarNovaTarefa(String titulo, String descricao) {
        // Chama o método do modelo de dados para adicionar a nova tarefa
        metodosTarefaModel.adicionarTarefa(titulo, descricao);
    }
    
      public List<TarefasModel> obterTodasTarefas() {
        return metodosTarefaModel.obterTodasTarefas();
    }
      
      public TarefasModel obterTarefaPorId(int id) {
    return metodosTarefaModel.obterTarefaPorId(id);
}
      
          public void processarTarefas(List<TarefasModel> tarefas) {
        for (TarefasModel tarefa : tarefas) {
            String titulo = tarefa.getTitulo();
            String descricao = tarefa.getDescricao();
            // Faça o que precisar com os títulos e descrições aqui
            System.out.println("Título: " + titulo + ", Descrição: " + descricao);
        }   
    }   
          
    public String getTitulo(TarefasModel tarefa) {
        return tarefa.getTitulo();
    }
    
    public String getDescricao(TarefasModel tarefa) {
        return tarefa.getDescricao();
    }
    
    public int getId(TarefasModel tarefa) {
        return tarefa.getId();
    }
    
    public void removerTarefa(int id) {
    metodosTarefaModel.removerTarefa(id);
}
    
    public void editarTarefa(int id, String novoTitulo, String novaDescricao) {
    metodosTarefaModel.atualizarTarefa(id, novoTitulo, novaDescricao);
}

public void editarTituloTarefa(int id, String novoTitulo) {
    TarefasModel tarefa = metodosTarefaModel.obterTarefaPorId(id);
    if (tarefa != null) {
        String descricao = tarefa.getDescricao(); // Mantém a descrição original
        editarTarefa(id, novoTitulo, descricao);
    } else {
        System.out.println("Tarefa não encontrada com o ID: " + id);
    }
}

public void editarDescricaoTarefa(int id, String novaDescricao) {
    TarefasModel tarefa = metodosTarefaModel.obterTarefaPorId(id);
    if (tarefa != null) {
        String titulo = tarefa.getTitulo(); // Mantém o título original
        editarTarefa(id, titulo, novaDescricao);
    } else {
        System.out.println("Tarefa não encontrada com o ID: " + id);
        }
    }
}