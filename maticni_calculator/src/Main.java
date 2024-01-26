import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static int calculateChecksum(int[] digits) {
        int sum = 0;

        for (int i = 0; i < digits.length - 6; i++) {
            sum += (digits[i] + digits[i + 6]) * (7 - i);
        }

        int m = 11 - (sum % 11);
        int k;
        if (m >= 1 && m <= 9) {
            k = m;
        } else {
            k = 0;
        }

        return k;
    }
    public static void main(String[] args) {
        Map<String, String> regions = HelperFunctions.getRegions();
        System.out.println("1. Check an EMBG \n2. Generate EMBG from date of birth and region? \nEnter a number: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if(line.equals("1")){
            System.out.println("Enter the EMBG in number format DDMMYYYRRBBBK");
            String embg = sc.nextLine();
            while (embg.length() != 13 || !embg.matches("-?(0|[1-9]\\d*)")) {
                System.out.println("Enter just numbers, the lenght is 13");
                embg = sc.nextLine();
            }
            String dayOfBirth = embg.substring(0, 2);
            String monthOfBirth = embg.substring(2, 4);
            String yearOfBirth = Integer.parseInt(embg.substring(4, 7)) > 900 ? "1" + embg.substring(4, 7) : "2" + embg.substring(4, 7);

            int day = Integer.parseInt(dayOfBirth);
            int month = Integer.parseInt(monthOfBirth);
            int year = Integer.parseInt(yearOfBirth);

            System.out.printf("The person is born on %s.%s.%s", dayOfBirth, monthOfBirth, yearOfBirth);
            System.out.printf(" from %s.%n", regions.get(embg.substring(7, 9)));

            LocalDate currentDate = LocalDate.now();
            LocalDate birthDate = LocalDate.of(year, month, day);
            System.out.printf("The person is a %s currently %s years old.%n", Integer.parseInt(embg.substring(9, 12)) >= 500 ?  "female" : "male",
                    Period.between(birthDate, currentDate).getYears());
            System.out.printf("Their control number is %s.%n", embg.charAt(12));
        } else if (line.equals("2")) {
            System.out.println("Enter date of birth dd/mm/yyyy format.");
            String date = sc.nextLine();
            while (!date.matches( "^\\d{2}/\\d{2}/\\d{4}$")){
                System.out.println("The format is dd/mm/yyyy");
                date = sc.nextLine();
            }
            date = date.replace("/", ""); //10122002
            date = date.substring(0, 4) + date.substring(5, 8);

            System.out.println("Enter region, *if you want to display the numbers of regions within their names enter R?");
            String region = sc.nextLine();
            region = region.toLowerCase();
            if(region.equals("r") || !region.matches("\\d{2}")) {
                HelperFunctions.toStringMap();
                System.out.println("Enter the region number:");
                region = sc.nextLine();
            }
            while(Integer.parseInt(region) > 96 || Integer.parseInt(region) < 0) {
                System.out.println("Wrong number enter again");
                region = sc.nextLine();
            }
            System.out.println("Is the person female or male? F/M");
            String gender = sc.nextLine();
            while (!gender.equals("F") && !gender.equals("M")) {
                System.out.println("M/F");
                gender = sc.nextLine();
            }

            String genderNum;
            if(gender.equals("M")) {
                genderNum = "000";
            } else {
                genderNum = "500";
            }

            String tmp = "y";
            while(tmp.equals("y")){
                String embgWithoutM = date + region + genderNum;
                int[] digits = new int[embgWithoutM.length()];

                for (int i = 0; i < embgWithoutM.length(); i++) {
                    digits[i] = Character.getNumericValue(embgWithoutM.charAt(i));
                }

                int m = calculateChecksum(digits);
                System.out.printf("The generated EMBG is: %s%n", embgWithoutM + m);
                System.out.println("If this isn't what you are looking for.\nGenerate again with the same parametars? y/n");
                tmp = sc.nextLine().toLowerCase();
                int increased = Integer.parseInt(genderNum);
                increased++;
                genderNum = String.format("%03d", increased);

            }

        } else {
            System.out.println("Wrong option, try again.");
        }
        System.out.println("Thanks for using this program :)");
    }
}