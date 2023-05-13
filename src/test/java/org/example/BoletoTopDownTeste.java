package org.example;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BoletoTopDownTeste {

    @Test
    public void testValorPagar(){
        BoletoTopDown calc = new BoletoTopDown(1000, LocalDate.of(2023, 5, 5), LocalDate.of(2023, 5, 4) );
        double valor = calc.calcularValorAPagar(1000);
        assertEquals(1020, valor);
    }

}
