package com.utn;


import com.utn.enunciado1.Cylinder;
import com.utn.enunciado2.Person;
import com.utn.enunciado2.Staff;
import com.utn.enunciado2.Student;
import com.utn.enunciado3.Circlev2;
import com.utn.enunciado3.Rectangle;
import com.utn.enunciado3.Square;

public class Main {

    public static void main(String[] args) {
        //--------------------------------------Exercise 1
        ///Initialization of Cylinder by default
        Cylinder cylinder1 = new Cylinder();
        ///Initialization of another Cylinder by parameters
        Cylinder cylinder2 = new Cylinder(10, "BLUE", 50);

        System.out.println("1: " + cylinder1);
        System.out.println("2: " + cylinder2);


        //--------------------------------------Exercise 2
        ///Instantiation and initialization of 4 Students
        Student student1 = new Student("123456", "Gonzalo", "Gonzalez", "Cordoba 123", "student1@email.com", 2019, 2500, "TUP");
        Student student2 = new Student("344000H", "Pablo", "Washington", "Alvarado 222", "student2@email.com", 2018, 4000, "Math");
        Student student3 = new Student("551113F", "Charly", "Gomez", "Costa 444", "student3@email.com", 2016, 1200, "Gym");
        Student student4 = new Student("233333", "Eva", "Sanchez", "Evergreen 655", "student4@email.com", 2020, 3000, "Hist");

        ///Instantiation and initialization of 4 Staff
        Staff staff1 = new Staff("551515A", "Irma", "Salaz", "Peña 333", "staff1@email.com", 35000.0, 'M');
        Staff staff2 = new Staff("1236611", "Susana", "Bal", "San Juan 123", "staff2@email.com", 40000.0, 'N');
        Staff staff3 = new Staff("61122D2", "Marito", "Utn", "Luro 1448", "staff3@email.com", 42000.0, 'N');
        Staff staff4 = new Staff("883443", "Willy", "Valido", "Dorrego 1448", "staff4@email.com", 60000.0, 'M');

        ///Array of Persons
        Person[] persons;
        persons = new Person[8];
        persons[0] = student1;
        persons[1] = student2;
        persons[2] = student3;
        persons[3] = student4;
        persons[4] = staff1;
        persons[5] = staff2;
        persons[6] = staff3;
        persons[7] = staff4;

        /////Count all the Persons if is a Student amountOfStudents +1
        ////Otherwise amountOfStaff +1
        int i = 0;
        int amountOfStudents = 0;
        int amountOfStaff = 0;
        while (i < 8 && persons[i] != null) {
            if (persons[i] instanceof Student) {
                amountOfStudents++;
            } else amountOfStaff++;

            i++;
        }
        System.out.println("Amount of Students =" + amountOfStudents + "\nAmount of Staff = " + amountOfStaff);

        i = 0;
        double annualIncome = 0;
        double annualStaffIncome = 0;
        while (i < 8 && persons[i] != null) {
            if (persons[i] instanceof Student) {
                Student student = (Student) persons[i];
                annualIncome += student.annualPayment();
            } else {
                Staff staff = (Staff) persons[i];
                annualStaffIncome += staff.annualSalary();
            }

            //System.out.printf("\n"+persons[i].toString());    //<--If you what to see all the Persons
            i++;
        }

        System.out.println("\nAnnual Income from all the Students = $" + annualIncome);
        System.out.println("Annual Income from all the Staff = $" + annualStaffIncome);


        //--------------------------------------Exercise 3

        ///Instantiation and initialization of 2 objects Square, 2 Rectangles and 2 CirclesV2
        /////Default
        Square sq1 = new Square();
        Rectangle r1 = new Rectangle();
        Circlev2 c1 = new Circlev2();

        /////Whit parameters
        Square sq2 = new Square("BlUE", 20);
        Rectangle r2 = new Rectangle("RED", 40, 60);
        Circlev2 c2 = new Circlev2("#333", 5.0, 15.0, 15.0);


        System.out.println();
        System.out.println(sq1.toString());
        System.out.println(sq2.toString());
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());


    }
}