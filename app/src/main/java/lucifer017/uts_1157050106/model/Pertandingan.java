package lucifer017.uts_1157050106.model;

import java.io.Serializable;

public class Pertandingan implements Serializable {

    String namaTimSatu, logoTimSatu, scoreTimSatu, namaTimDua, logoTimDua, scoreTimDua, linkBerita;

    public Pertandingan(String namaTimSatu, String logoTimSatu, String scoreTimSatu, String namaTimDua, String logoTimDua, String scoreTimDua, String linkBerita) {
        this.namaTimSatu = namaTimSatu;
        this.logoTimSatu = logoTimSatu;
        this.scoreTimSatu = scoreTimSatu;
        this.namaTimDua = namaTimDua;
        this.logoTimDua = logoTimDua;
        this.scoreTimDua = scoreTimDua;
        this.linkBerita = linkBerita;
    }

    public String getNamaTimSatu() {
        return namaTimSatu;
    }

    public String getLogoTimSatu() {
        return logoTimSatu;
    }

    public String getScoreTimSatu() {
        return scoreTimSatu;
    }

    public String getNamaTimDua() {
        return namaTimDua;
    }

    public String getLogoTimDua() {
        return logoTimDua;
    }

    public String getScoreTimDua() {
        return scoreTimDua;
    }

    public String getLinkBerita() {
        return linkBerita;
    }

}
