public class Address {
    String street;
    int number;
    String district;
    String city;
    String state;

    String getFullAddress() {
        return
        "Rua: "+street+ 
        ", numero: "+number+
         ", bairro: "+district+
        ", cidade: "+city+
        ", estado: "+state;
    }
}
