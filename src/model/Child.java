package model;

public class Child implements Comparable<Child>{

    private String name;
    private String address;
    private String city;
    private String country;
    private String christmasWish;
    private int age;

	/**
	*Metodo constructor de la clase Child
	*permite crear un nuevo niño
	 @param option de tipo int
	 @param name de tipo String
	 @param address de tipo String
	 @param city de tipo String
	 @param country de tipo String
	 @param christmasWish de tipo String
	 @param age de tipo int
	*/
    public Child(String name, String address, String city, String country, String christmasWish, int age) {

        this.name = name;
        this.address = address;
        this.city = city;
        this.country = country;
        this.christmasWish = christmasWish;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String newName) {
        this.name = newName;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String newAddress) {
        this.address = newAddress;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String newCity) {
        this.city = newCity;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String newCountry) {
        this.country = newCountry;
    }


    public String getChristmasWish() {
        return christmasWish;
    }


    public void setChristmasWish(String newWish) {
        this.christmasWish = newWish;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int newAge) {
        this.age = newAge;
    }

	/**
	*permite comparar las edades de los niños
	@param i de tipo Child
	@return numero positivo, es mayor
	 0 si son iguales
	 numero negativo, es menor
	*/
    @Override
    public int compareTo(Child i) {

        int out= getAge()-i.getAge();
        // Si retorna un numero positivo es mayor
        //Si retorna 0 son iguales
        //Si retorna un numero negativo es menor
      
        if(out>0){
            return 1;
        } else if(out<0){
            return -1;
        } else {
            return 0;
        }

    }


    @Override
    public String toString() {
        String out="";

        out+="Name: "+getName()+"\n"+
        "Address: "+getAddress()+"\n"+
        "City: "+getCity()+"\n"+
        "Country: "+getCountry()+"\n"+
        "Wish: "+getChristmasWish()+"\n"+
        "Age: "+getAge()+"\n";


        return out;
        
    }

    

    

}
