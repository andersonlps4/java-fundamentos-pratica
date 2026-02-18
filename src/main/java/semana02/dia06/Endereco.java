package semana02.dia06;

public class Endereco {
        String rua;
        String numero;
        String cidade;

        public Endereco(String rua, String numero, String cidade) {
            this.rua = rua;
            this.numero = numero;
            this.cidade = cidade;
        }

        public String toString(){
            return rua + ", " + numero + " - " + cidade;

        }


}
