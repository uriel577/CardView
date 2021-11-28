package mx.edu.utng.cardview;

public class Usuario {
    //Definir propiedades de la clase
    private int id;
    private String name;
    private String lastname;
    private String photo;
    private String email;

    //Constructo con todos los parametros
    public Usuario(int id, String name, String lastname, String photo, String email) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.photo = photo;
        this.email = email;
    }

    //Constructor solo con el parametro Id
    public Usuario(int id) {
        this.id = id;
    }

    //Generar Setters and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", photo='" + photo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
