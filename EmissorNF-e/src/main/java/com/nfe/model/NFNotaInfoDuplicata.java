package com.nfe.model;


import java.math.BigDecimal;
import java.time.LocalDate;



public class NFNotaInfoDuplicata  {
  
    private String numeroDuplicata;
    private LocalDate dataVencimento;
    private String valorDuplicata;

    public void setNumeroDuplicata(final String numeroDuplicata) {
    
        this.numeroDuplicata = numeroDuplicata;
    }

    public void setDataVencimento(final LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setValorDuplicata(final BigDecimal valorDuplicata) {
        this.valorDuplicata = String.valueOf(valorDuplicata);
    }

    public String getValorDuplicata() {
        return this.valorDuplicata;
    }

    public void setValorDuplicata(final String valorDuplicata) {
        this.valorDuplicata = valorDuplicata;
    }

    public String getNumeroDuplicata() {
        return this.numeroDuplicata;
    }

    public LocalDate getDataVencimento() {
        return this.dataVencimento;
    }
}