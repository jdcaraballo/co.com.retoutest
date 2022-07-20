package co.com.joinutest.model.datospersonales;

public class CreateDatosPersonales {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String city;
    private final String codPostal;
    private final String pass;

    public CreateDatosPersonales(DatosPersonalesBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.email = builder.getEmail();

        this.city = builder.getCity();
        this.codPostal = builder.getCodPostal();
        this.pass = builder.getPass();
    }


    public String getFirstName() { return firstName;}
    public String getLastName() { return lastName;}
    public String getEmail() {  return email;}

    public String getCity() { return city;}
    public String getCodPostal() { return codPostal;}
    public String getPass() {  return pass;}

}
