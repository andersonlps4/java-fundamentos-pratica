package semana02.dia04;

public class Funcionario {

    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, Double salario, String cargo){

        this.nome = nome;
        setSalario (salario);
        this.cargo = cargo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
       if(salario >= 0) {
           this.salario = salario;

       }else{
           System.out.println("Erro salário não pode ser negativo!");
       }
    }
    public String getCargo(){
        return cargo;
    }
    public void promover(String novoCargo, double aumento){
        this.cargo = novoCargo;
        setSalario(this.salario + aumento);
        System.out.println("Funcinario promovido!");
    }

}
