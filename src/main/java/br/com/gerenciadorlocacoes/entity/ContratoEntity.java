package br.com.gerenciadorlocacoes.entity;

import java.util.Date;

public class ContratoEntity {

    private double valorAluguel;
    private int diaVencimento;
    private Date dtContrato;
    private int prazo;
    private ImovelEntity imovel;
    private LocatarioEntity locatario;

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public void setDtContrato(Date dtContrato) {
        this.dtContrato = dtContrato;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public void setImovel(ImovelEntity imovel) {
        this.imovel = imovel;
    }

    public void setLocatario(LocatarioEntity locatario) {
        this.locatario = locatario;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public Date getDtContrato() {
        return dtContrato;
    }

    public int getPrazo() {
        return prazo;
    }

    public ImovelEntity getImovel() {
        return imovel;
    }

    public LocatarioEntity getLocatario() {
        return locatario;
    }
}
