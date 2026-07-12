package questao1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Prata", "Volkswagen", "Golf"));
        veiculos.add(new Onibus(42, 2019));
        veiculos.add(new Bicicleta("Vermelha"));

        VeiculoVisitor imprimirDados = new ImprimirDadosVisitor();
        VeiculoVisitor enviarMensagem = new EnviarMensagemVisitor();

        System.out.println("=== Dados dos veiculos ===");
        for (Veiculo veiculo : veiculos) {
            veiculo.accept(imprimirDados);
        }

        System.out.println();
        System.out.println("=== Mensagens para os donos ===");
        for (Veiculo veiculo : veiculos) {
            veiculo.accept(enviarMensagem);
        }
    }
}
