
package PatterFactory;

import modelo.Orçamento;
import java.math.BigDecimal;

    public class IcmsMG implements CalculoPorRegiao{
        @Override
        public BigDecimal CalculoPorRegiao(Orçamento orçamento){
            return orçamento.valorOrçamento.multiply(new BigDecimal("0.18"));
        }
   }
