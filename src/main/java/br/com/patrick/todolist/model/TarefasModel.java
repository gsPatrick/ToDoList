package br.com.patrick.todolist.model;

public class TarefasModel {
    
    private int id;
    private String Titulo;
    private String Descricao;
    
    public TarefasModel(int id, String Titulo, String Descricao) {
        this.id = id;
        this.Titulo = Titulo;
        this.Descricao = Descricao;
    }
    
      public TarefasModel(String Titulo, String Descricao) {
        this.Titulo = Titulo;
        this.Descricao = Descricao;
    }
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
}
    

