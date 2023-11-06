package org.example;

import java.util.Objects;

/**
 * Klasa za rad sa mobilnim brojevima, naslijedjena iz klase TelefonskiBroj
 */
public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    public void setMobilnaMreza(int mobilnaMreza) {
        this.mobilnaMreza = mobilnaMreza;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return "0" + mobilnaMreza + "/" + broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilnaMreza, broj);
    }
}