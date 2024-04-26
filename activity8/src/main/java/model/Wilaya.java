package model;

public class Wilaya {

    public Wilaya(){}
    public Wilaya(Integer id, Integer code, String nom) {
        this.id = id;
        this.code = code;
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private Integer id;
    private Integer code;
    private String nom;
}
