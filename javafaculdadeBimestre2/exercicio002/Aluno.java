package exercicio002;

public class Aluno {
    private String nome;
    private String curso;
    private String placa;
    
    public Aluno(String nome, String curso, String placa){
	
	this.nome=nome;
	this.curso=curso;
	this.placa=placa;
    }

    public Aluno(){

    }

    public String getNome(){
        return this.nome;
    }
    public String getCurso(){
        return this.curso;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setPlaca(String placa){
        this.placa=placa;
    }
    public void setCurso(String curso){
    this.curso=curso;
    }

}













