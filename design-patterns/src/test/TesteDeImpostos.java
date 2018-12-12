package test;

public class TesteDeImpostos {

    public static void main(String[] args) {
        ISS iss = new ISS();
        ICMS icms = new ICMS();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

        calculadorDeImposto.realizaCalculo(orcamento, iss);
        calculadorDeImposto.realizaCalculo(orcamento, icms);

    }
}
