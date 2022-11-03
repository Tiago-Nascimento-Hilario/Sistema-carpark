package br.com.tiago.carpark.model;

public class Veiculo {
    
    private Long id;
    private String placa;

    public Veiculo(String placa) {
        this.placa = placa;
    }

    public void setPlaca( String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return placa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    
    
}
