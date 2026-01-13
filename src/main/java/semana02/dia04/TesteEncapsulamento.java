package semana02.dia04;

public class TesteEncapsulamento {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Maria", 3000.00, "Analista Jr");

        // f1.salario = 5000; // ERRO! Atributo é privado

        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salário: " + f1.getSalario());

        // Tentando colocar salário negativo
        f1.setSalario(-1000);
        System.out.println("Salário após erro: " + f1.getSalario());

        // Atualizando corretamente
        f1.setSalario(3500.00);
        System.out.println("Salário atualizado: " + f1.getSalario());

        f1.promover("Analista Pleno", 1500.00);
        System.out.println("Novo Cargo: " + f1.getCargo());
        System.out.println("Novo Salário: " + f1.getSalario());
    }
}

