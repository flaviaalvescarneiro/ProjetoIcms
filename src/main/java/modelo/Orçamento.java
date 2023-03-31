
package modelo;

import java.math.BigDecimal;

public class Orçamento {
    public BigDecimal valorOrçamento;
    public String icmsRegiao;
    public Orçamento(BigDecimal valorOrçamento, String icmsRegiao){
        this.valorOrçamento = valorOrçamento;
        this.icmsRegiao = icmsRegiao;
    }
    
}
 