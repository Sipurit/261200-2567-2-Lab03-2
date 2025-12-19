public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;
    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber){
        if(id < 0){
            System.out.println("! Invalid id -> Using default id !");
            this.id = 0;
        }else{
            this.id = id;
        }
        this.name = name;
        if(birthYear <= 0){
            System.out.println("! Invalid birthYear -> Using default birthYear !");
            this.birthYear = 2000;
        }else{
            this.birthYear = birthYear;
        }
        if(height <= 0){
            System.out.println("! Invalid height -> Using default height !");
            this.height = 0;
        }else{
            this.height = height;
        }
        if(weight <= 0){
            System.out.println("! Invalid weight -> Using default weight !");
            this.weight = 0;
        }else{
            this.weight = weight;
        }
        this.phoneNumber = phoneNumber;
        this.bloodGroup = bloodGroup;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getBirthYear() {
        return this.birthYear;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWeight(){
        return this.weight;
    }
    public String getBloodGroup(){
        return this.bloodGroup;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public int getAge(int currentYear){
        int age = 0;
        if(currentYear < birthYear){
            System.out.println("currentYear is invalid");
        }else{
            age = currentYear - this.birthYear;
        }
        return age;
    }
    public double getBMI(){
        if( height <= 0 || weight <= 0){
            return 0;
        }else {
            double hinm = height / 100;
            double bmi = weight / (hinm * hinm);
            return bmi;
        }
    }
    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient Blood Group: " + bloodGroup);
        System.out.println("Patient Phone Number: " + phoneNumber);
        System.out.println("Patient BMI: " + getBMI());
    }
}