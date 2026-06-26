package Modelo;

public class Estudiante {
    private String id;
    private String nom;
    private String car;
    
    public Estudiante (){}
    
    public Object [] Registro (int num){
        Object [] fila = {num, id, nom, car};
        return fila;
    }
    
    public String getId() {  return id;  }
    public void setId(String id) {  this.id = id;  }
    public String getNom() {  return nom;  }
    public void setNom(String nom) {  this.nom = nom;  }
    public String getCar() {  return car;  }
    public void setCar(String car) {  this.car = car;  }
} //Fin de la clase


