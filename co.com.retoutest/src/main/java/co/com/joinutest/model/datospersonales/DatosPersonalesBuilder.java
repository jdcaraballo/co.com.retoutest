package co.com.joinutest.model.datospersonales;

import java.util.List;
import java.util.Map;

public class DatosPersonalesBuilder {

    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String codPostal;
    private String pass;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {return email; }
    public String getCity() {
        return city;
    }
    public String getCodPostal() {
        return codPostal;
    }
    public String getPass() {return pass; }

    public static DatosPersonalesBuilder con() {
        return new DatosPersonalesBuilder();
    }

    public DatosPersonalesBuilder firstName (List<Map<String, String>> datos) {
        this.firstName = datos.get(0).get("firstName");
        return this; }

    public DatosPersonalesBuilder lastName (List<Map<String, String>> datos) {
        this.lastName = datos.get(0).get("lastName");
        return this;}

    public DatosPersonalesBuilder email (List<Map<String, String>> datos) {
        this.email = datos.get(0).get("email");
        return this; }

    public DatosPersonalesBuilder city (List<Map<String, String>> datos) {
        this.city = datos.get(0).get("city");
        return this; }

    public DatosPersonalesBuilder codPostal (List<Map<String, String>> datos) {
        this.codPostal = datos.get(0).get("codPostal");
        return this;}

    public DatosPersonalesBuilder pass (List<Map<String, String>> datos) {
        this.pass = datos.get(0).get("pass");
        return this; }

    public CreateDatosPersonales build() {
        return new CreateDatosPersonales(this);
    }



}
