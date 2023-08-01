package com.indocyber.square;

public class KotakMaker {
    private int nomor;

    public KotakMaker(int nomor) {
        this.nomor = nomor;
    }

    public String kotakValidator() {
        if (nomor <= 2) {
            return "Nilai terlalu kecil.";
        } else if (nomor >= 10) {
            return "Nilai terlalu besar.";
        } else {
            return buatKotakUtuh();
        }
    }

    public String buatKotakUtuh() {
        String kotakHorizontal  = buatGarisHorizontal();
        String kotakVertical    = buatGarisVertical();

        String kotakUtuh = kotakHorizontal;
        for (int i = 1; i < nomor; i++) {
            if (i == nomor - 1) {
                kotakUtuh = kotakUtuh + kotakHorizontal;
                break;
            }
            kotakUtuh = kotakUtuh + kotakVertical;
        }
        return kotakUtuh;
    }

    public String buatGarisHorizontal() {
        String line = "";
        for (int i = 0; i < nomor; i++) {
            line = line + "=";
        }
        return line;
    }

    public String buatGarisVertical() {
        String line = "|";
        for (int i = 1; i < nomor; i++) {
            if (i == nomor - 1) {
                line = line + "|";
                break;
            }
            line = line + " ";
        }
        return line;
    }
}
