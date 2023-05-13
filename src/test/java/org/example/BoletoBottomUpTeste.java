package org.example;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class BoletoBottomUpTeste {

    @Test
    @DisplayName("CT01")
    public void testPeriodoEmMesesCT01() {
        LocalDate dataVencimento = LocalDate.of(2023, 3, 10);
        LocalDate dataPagamento = LocalDate.of(2023, 4, 10);

        double resultado = BoletoBottomUp.periodoEmMeses(dataVencimento, dataPagamento);

        assertEquals(1, resultado);
    }

    @Test
    @DisplayName("CT02")
    public void testPeriodoEmMesesCT02() {
        LocalDate dataVencimento = LocalDate.of(2023, 3, 10);
        LocalDate dataPagamento = LocalDate.of(2023, 5, 20);

        double resultado = BoletoBottomUp.periodoEmMeses(dataVencimento, dataPagamento);

        assertEquals(2.3666666666666667, resultado, 0.5); //permite uma margem de erro
    }

    @Test
    @DisplayName("CT03")
    public void testPeriodoEmMesesCT03() {
        LocalDate dataVencimento = LocalDate.of(2023, 3, 10);
        LocalDate dataPagamento = LocalDate.of(2023, 3, 5);

        double resultado = BoletoBottomUp.periodoEmMeses(dataVencimento, dataPagamento);

        assertEquals(0, resultado);
    }

    @Test
    @DisplayName("CT04")
    public void testPeriodoEmMesesCT04() {
        LocalDate dataVencimento = LocalDate.of(2023, 3, 10);
        LocalDate dataPagamento = LocalDate.of(2023, 3, 10);

        double resultado = BoletoBottomUp.periodoEmMeses(dataVencimento, dataPagamento);

        assertEquals(0, resultado);
    }

    @Test
    @DisplayName("Valor a Pagar")
    public void testCalcularValorAPagar() {
        double valorDevido = 1000.0;
        LocalDate dataVencimento = LocalDate.of(2023, 5, 1);
        LocalDate dataPagamento = LocalDate.of(2023, 5, 10);

        double resultado = BoletoBottomUp.calcularValorAPagar(valorDevido, dataVencimento, dataPagamento);

        assertEquals(1000.0, resultado);
    }

}
