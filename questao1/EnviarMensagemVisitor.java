package questao1;

public class EnviarMensagemVisitor implements VeiculoVisitor {

    @Override
    public void visit(Carro carro) {
        System.out.println("Mensagem para o dono do carro: favor atualizar dados do IPVA");
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Mensagem para o dono do onibus: atencao para atualizacao das licencas");
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Mensagem para o dono da bicicleta: comemore no parque o dia do ciclismo");
    }
}
