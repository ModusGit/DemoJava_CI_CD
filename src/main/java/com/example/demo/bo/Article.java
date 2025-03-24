package com.example.demo.bo;

public class Article {
    private Long id;
    private String titre;

    public Article(Long id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    public Article() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
