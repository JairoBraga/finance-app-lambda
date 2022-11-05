package finance;

import java.time.LocalDate;

public class Finance {
    private Long id;
    private LocalDate data;
    private String descricao;
    private Double valor;
    private CostType type;

    public Finance() {
    }

    public Finance(Long id, LocalDate data, String descricao, Double valor, CostType type) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public CostType getType() {
        return type;
    }

    public void setType(CostType type) {
        this.type = type;
    }
}
