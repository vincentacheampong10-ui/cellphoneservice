package CellPhoneApplication;


import java.util.Scanner;

public class CellPhoneApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone = new CellPhone();


        System.out.println("What is the serial number?:");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        cellPhone.setSerialNumber(serialNumber);

        System.out.println("What model is the phone?");
        String Model = scanner.nextLine();
        cellPhone.setModel(Model);

        System.out.println("Who is the carrier?");
        String carrier = scanner.nextLine();
        cellPhone.setCarrier(carrier);

        System.out.println("What is the phone number?");
        String phoneNumber = scanner.nextLine();
        cellPhone.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone?");
        String owner = scanner.nextLine();
        cellPhone.setOwner(owner);

        System.out.printf("""
                             The serial number is %d
                             The model is of the phone is %s
                             The carrier is %s
                             The phone number is %s
                             The owner of the phone is %s
                """, cellPhone.getSerialNumber(), cellPhone.getModel(), cellPhone.getCarrier(), cellPhone.getPhoneNumber(), cellPhone.getOwner());

  /// You can also use generate to print tostring to print instead of sout
        /// system.out.println(cellPhone);

        ///(this). makes it so that there is no need to write the set codeie. (cellPhone.setSerialNumber(serialNumber);)
        /// No data types needed.
        /// Example below.
        /// CellPhone cellPhone = new CellPhone(serialNumber,model, carrier,phoneNumber,owner.);
    }
}
