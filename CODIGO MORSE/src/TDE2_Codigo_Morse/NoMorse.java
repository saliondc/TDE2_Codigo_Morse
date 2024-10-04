package TDE2_Codigo_Morse;

class NoMorse {
    private String valor;
    private NoMorse filhoEsquerdo;
    private NoMorse filhoDireito;

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public NoMorse getFilhoEsquerdo() {
        return this.filhoEsquerdo;
    }

    public void setFilhoEsquerdo(NoMorse filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public NoMorse getFilhoDireito() {
        return this.filhoDireito;
    }

    public void setFilhoDireito(NoMorse filhoDireito) {
        this.filhoDireito = filhoDireito;
    }
}