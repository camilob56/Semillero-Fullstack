package juegoCartas.contratos;

public abstract class CartaBase implements Carta{
    protected String palo;
    protected int valor;

    public CartaBase(String palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }
}