import java.time.*;
public class DateTime{
    public void AgeCalculator(){
        //Get the birthday
        LocalDate birthdate = LocalDate.of(2003, 11, 8);

        //Get today's date
        LocalDate now = LocalDate.now();

        // Calculate age using period
        Period age = Period.between(birthdate, now);
        System.out.println("Age is : "+ age.getYears());

        //Days until birthday
        LocalDate birthday2025 = LocalDate.of(2025, 11, 8);
        Period age2025 = Period.between(now,birthday2025);
        System.out.println("Days left till birthday 2025 is: "+ age2025.getDays());
    }
}
