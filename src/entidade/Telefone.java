package entidade;

public class Telefone {

    private String telefone;
    private TipoTelefone tipoTelefone;

    public Telefone(String telefone, TipoTelefone tipoTelefone) {
        this.telefone = telefone;
        this.tipoTelefone = tipoTelefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "telefone='" + telefone + '\'' +
                ", tipoTelefone='" + tipoTelefone + '\'' +
                '}';
    }
}
