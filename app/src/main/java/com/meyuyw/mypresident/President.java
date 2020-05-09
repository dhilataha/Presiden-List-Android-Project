package com.meyuyw.mypresident;

public class President {
    String name;
    String profil;
    int image;

    public President(String name, String profil, int image) {
        this.name = name;
        this.profil = profil;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getProfil() {
        return profil;
    }

    public int getImage() {
        return image;
    }
}
