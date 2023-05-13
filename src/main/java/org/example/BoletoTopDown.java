package org.example;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class BoletoTopDown {
    private double valorDevido;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;

    public BoletoTopDown(double valorDevido, LocalDate dataVencimento, LocalDate dataPagamento) {
        this.valorDevido = valorDevido;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public double calcularValorAPagar(double valorDevido) {
        int mesesAtraso = periodoEmMeses();
        double valorComJuros = valorDevido * (1 + mesesAtraso * 0.01);
        return valorComJuros;
    }

    private int periodoEmMeses() {
        return 2;
    }
}
