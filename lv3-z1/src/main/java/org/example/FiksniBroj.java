package org.example;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;
    public FiksniBroj(Grad grad, String broj) {
        if(grad == null) throw new TelefonskiBrojIzuzetak("Neispravan pozivni broj");
        this.grad=grad;
        this.broj=broj;
    }
    @Override
    public String ispisi() {
        return grad.toString() + "/" + broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grad, broj);
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }
}