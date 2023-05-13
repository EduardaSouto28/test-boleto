package org.example;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class BoletoBottomUp {
    public static double periodoEmMeses(LocalDate dataVencimento, LocalDate dataPagamento) {
        return (double) ChronoUnit.MONTHS.between(dataVencimento, dataPagamento);
    }

    public static double calcularValorAPagar(double valorDevido, LocalDate dataVencimento, LocalDate dataPagamento) {
        if (dataPagamento.isBefore(dataVencimento) || dataPagamento.isEqual(dataVencimento)) {
            return valorDevido;
        } else {
            double mesesAtraso = periodoEmMeses(dataVencimento, dataPagamento);
            double valorComJuros = valorDevido * (1 + mesesAtraso * 0.01);
            return valorComJuros;
        }
    }

}
