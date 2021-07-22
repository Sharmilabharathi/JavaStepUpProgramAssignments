import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sharmila
 */
public class CompanyMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the company name:");
        String companyName = scanner.nextLine();
        System.out.println("Enter the employees:");
        String employees = scanner.nextLine();
        System.out.println("Enter TeamLead:");
        String teamLead = scanner.nextLine();

        Company company = new Company();
        company.setName(companyName);
        company.setEmployees(employees);
        String[]  employeeArray = employees.split(",");
        List<String> nameList = new ArrayList<>(Arrays.asList(employeeArray));
        if(nameList.contains(teamLead)){
                company.setTeamLead(teamLead);
            }else{
                System.out.println("Invalid Input");
                System.exit(0);
            }



        System.out.println("Name:"+company.getName()+"\n"
                +"Employees:"+company.getEmployees()
                +"\n"+"Lead:"+company.getTeamLead());

    }
}
