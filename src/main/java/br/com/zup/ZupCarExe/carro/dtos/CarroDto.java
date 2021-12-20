package br.com.zup.ZupCarExe.carro.dtos;

public class CarroDto {
    private String modelo;
    private String cor;
    private String motor;
    private Integer ano;

    public CarroDto() {
    }

    public CarroDto(String modelo, String cor, String motor, Integer ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
