import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Calendar;
import java.util.Comparator;


class staff
{
    String sid, sname, desg, sex;
    int salary;
    void new_staff(staff[] s, int count6) {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        sid = input.nextLine();
        System.out.print("name:-");
        sname = input.nextLine();
        System.out.print("designation (nurse/worker/security):-");
        desg = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("salary:-");
        salary = input.nextInt();

        s[count6++] = this;
    }
    void staff_info() {
        System.out.println(sid + "\t" + sname + "\t" + desg + "\t" + sex + "\t" + salary);
    }

        void show_nurse_info () {
            if ("nurse".equals(desg)) {
                System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
            }
        }

        void show_worker_info () {
            if ("worker".equals(desg)) {
                System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
            }
        }

        void show_security_info () {
            if ("security".equals(desg)) {System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
            }
        }


    void update_staff(staff[] s, int count6) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ID of the staff to update: ");
        String updateId = input.nextLine();

        for (int i = 0; i < count6; i++) {
            if (updateId.equals(s[i].sid)) {
                System.out.print("Enter new name: ");
                s[i].sname = input.nextLine();
                System.out.println("Staff information updated successfully.");
                return;
            }
        }
        System.out.println("Staff with ID " + updateId + " not found.");
    }
    void delete_staff(staff[] s, int count6) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the ID of the staff to delete: ");
        String deleteID = input.nextLine();
        for (int i = 0; i < count6; i++) {
            if (deleteID.equals(s[i].sid)) {
                for (int j = i; j < count6 - 1; j++) {
                    s[j] = s[j + 1];
                }
                System.out.println("Patient with ID " + deleteID + " deleted successfully.");
                count6--;
                return;
            }
        }
    }

}
class doctor
{
    String did, dname, specilist, appoint, doc_qual;
    int droom;
    void new_doctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        did = input.nextLine();
        System.out.print("name:-");
        dname = input.nextLine();
        System.out.print("specilization:-");
        specilist = input.nextLine();
        System.out.print("work time:-");
        appoint = input.nextLine();
        System.out.print("qualification:-");
        doc_qual = input.nextLine();
        System.out.print("room no.:-");
        droom = input.nextInt();
    }
    void doctor_info()
    {
        System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);
    }
    void update_doctor(doctor[] d, int count1) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ID of the doctor to update: ");
        String updateId = input.nextLine();

        for (int i = 0; i < count1; i++) {
            if (updateId.equals(d[i].did)) {
                System.out.print("Enter new name: ");
                d[i].dname = input.nextLine();
                System.out.print("Enter new specialization: ");
                d[i].specilist = input.nextLine();
                System.out.print("Enter new work time: ");
                d[i].appoint = input.nextLine();
                System.out.print("Enter new qualification: ");
                d[i].doc_qual = input.nextLine();
                System.out.print("Enter new room number: ");
                d[i].droom = input.nextInt();
                System.out.println("Doctor information updated successfully.");
                return;
            }
        }

        System.out.println("Doctor with ID " + updateId + " not found.");
    }
    void delete_doctor(doctor[] d, int count1) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ID of the doctor to delete: ");
        String deleteId = input.nextLine();

        for (int i = 0; i < count1; i++) {
            if (deleteId.equals(d[i].did)) {
                for (int j = i; j < count1 - 1; j++) {
                    d[j] = d[j + 1];
                }
                System.out.println("Doctor with ID " + deleteId + " deleted successfully.");
                count1--;
                return;
            }
        }

        System.out.println("Doctor with ID " + deleteId + " not found.");
    }
}
class patient
{
    String pid, pname, disease, sex, admit_status;
    int age;
    void new_patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        pid = input.nextLine();
        System.out.print("name:-");
        pname = input.nextLine();
        System.out.print("disease:-");
        disease = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("admit_status:-");
        admit_status = input.nextLine();
        System.out.print("age:-");
        age = input.nextInt();
    }
    void patient_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
    }

    void update_patient(patient[] p,int count2) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ID of the patient to update: ");
        String updateId = input.nextLine();

        for (int i = 0; i < count2; i++) {
            if (updateId.equals(p[i].pid)) {
                System.out.print("Enter new name: ");
                p[i].pname = input.nextLine();
                System.out.print("Enter new disease: ");
                p[i].disease = input.nextLine();
                System.out.print("Enter new gender: ");
                p[i].sex = input.nextLine();
                System.out.print("Enter new admit status: ");
                p[i].admit_status = input.nextLine();
                System.out.print("Enter new age: ");
                p[i].age = input.nextInt();
                System.out.println("Patient information updated successfully.");
                return;
            }
        }

        System.out.println("Patient with ID " + updateId + " not found.");
    }
    void delete_patient(patient[] p, int count2) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ID of the patient to delete: ");
        String deleteId = input.nextLine();

        for (int i = 0; i < count2; i++) {
            if (deleteId.equals(p[i].pid)) {
                for (int j = i; j < count2 - 1; j++) {
                    p[j] = p[j + 1];
                }
                System.out.println("Patient with ID " + deleteId + " deleted successfully.");
                count2--;
                return;
            }
        }

        System.out.println("Patient with ID " + deleteId + " not found.");
    }
}
class medical
{
    String med_name, med_comp, exp_date;
    int med_cost, count;
    void new_medi()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("name:-");
        med_name = input.nextLine();
        System.out.print("comp:-");
        med_comp = input.nextLine();
        System.out.print("exp_date:-");
        exp_date = input.nextLine();
        System.out.print("cost:-");
        med_cost = input.nextInt();
        System.out.print("no of unit:-");
        count = input.nextInt();
    }
    void find_medi()
    {
        System.out.println(med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);
    }
    void update_medi(medical[] m,int count3) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the medicine to update: ");
        String updateName = input.nextLine();

        for (int i = 0; i < count3; i++) {
            if (updateName.equals(m[i].med_name)) {
                System.out.print("Enter new company: ");
                m[i].med_comp = input.nextLine();
                System.out.print("Enter new expiry date: ");
                m[i].exp_date = input.nextLine();
                System.out.print("Enter new cost: ");
                m[i].med_cost = input.nextInt();
                System.out.print("Enter new count: ");
                m[i].count = input.nextInt();
                System.out.println("Medicine information updated successfully.");
                return;
            }
        }

        System.out.println("Medicine with name " + updateName + " not found.");
    }
    void delete_medi(medical[] m, int count) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the medicine to delete: ");
        String deleteName = input.nextLine();

        int foundIndex = -1;

        for (int i = 0; i < count; i++) {
            if (deleteName.equals(m[i].med_name)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            for (int i = foundIndex; i < count - 1; i++) {
                m[i] = m[i + 1];
            }

            count--;

            System.out.println("Medicine deleted successfully!");
        } else {
            System.out.println("Medicine with name " + deleteName + " not found.");
        }
    }
}
class lab
{
    void update_lab(lab[] l, int count4) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the facility to update: ");
        String updateFacility = input.nextLine().trim();

        for (int i = 0; i < count4; i++) {
            if (updateFacility.equalsIgnoreCase(l[i].fecility.trim())) {
                System.out.print("Enter new facility: ");
                l[i].fecility = input.nextLine();
                System.out.print("Enter new cost: ");
                l[i].lab_cost = input.nextInt();
                System.out.println("Lab information updated successfully.");
                return;
            }
        }

        System.out.println("Lab with facility " + updateFacility + " not found.");
    }
    void delete_lab(lab[] l, int count) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the facility to delete: ");
        String deleteFacility = input.nextLine();

        int foundIndex = -1;

        for (int i = 0; i < count; i++) {
            if (deleteFacility.equals(l[i].fecility)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {

            for (int i = foundIndex; i < count - 1; i++) {
                l[i] = l[i + 1];
            }

            count--;

            System.out.println("Laboratory deleted successfully!");
        } else {
            System.out.println("Lab with facility " + deleteFacility + " not found.");
        }
    }
    String fecility;
    int lab_cost;
    void new_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fecility = input.nextLine();
        System.out.print("cost:-");
        lab_cost = input.nextInt();
    }
    void feci_list()
    {
        System.out.println(fecility + "\t\t" + lab_cost);
    }
}
class fecility
{
    String fec_name;
    void add_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fec_name = input.nextLine();
    }
    void show_feci()
    {
        System.out.println(fec_name);
    }
    void update_fecility(fecility[] f, int count5) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the facility to update: ");
        String updateFacility = input.nextLine();

        for (int i = 0; i < count5; i++) {
            if (updateFacility.equals(f[i].fec_name)) {
                // update facility information
                System.out.print("Enter new facility name: ");
                f[i].fec_name = input.nextLine();
                System.out.println("Facility information updated successfully.");
                return;
            }
        }

        System.out.println("Facility with name " + updateFacility + " not found.");
    }
    void delete_fecility(fecility[] f, int count) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the facility to delete: ");
        String deleteFacility = input.nextLine();

        int foundIndex = -1;

        for (int i = 0; i < count; i++) {
            if (deleteFacility.equals(f[i].fec_name)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            for (int i = foundIndex; i < count - 1; i++) {
                f[i] = f[i + 1];
            }

            count--;

            System.out.println("Facility deleted successfully!");
        } else {
            System.out.println("Facility with name " + deleteFacility + " not found.");
        }
    }
}

class HospitalManagement {

    static int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;

    public static void main(String args[]) {
        String months[] = {
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "Jun",
                "Jul",
                "Aug",
                "Sep",
                "Oct",
                "Nov",
                "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        doctor[] d = new doctor[25];
        patient[] p = new patient[100];
        lab[] l = new lab[20];
        fecility[] f = new fecility[20];
        medical[] m = new medical[100];
        staff[] s = new staff[100];

        int i;
        for (i = 0; i < 25; i++)
            d[i] = new doctor();
        for (i = 0; i < 100; i++)
            p[i] = new patient();
        for (i = 0; i < 20; i++)
            l[i] = new lab();
        for (i = 0; i < 20; i++)
            f[i] = new fecility();
        for (i = 0; i < 100; i++)
            m[i] = new medical();
        for (i = 0; i < 100; i++)
            s[i] = new staff();


        d[0].did = "21";
        d[0].dname = "Dr.Ghanendra";
        d[0].specilist = "ENT";
        d[0].appoint = "5-11AM";
        d[0].doc_qual = "MBBS,MD";
        d[0].droom = 17;
        d[1].did = "32";
        d[1].dname = "Dr.Vikram";
        d[1].specilist = "Physician";
        d[1].appoint = "10-3AM";
        d[1].doc_qual = "MBBS,MD";
        d[1].droom = 45;
        d[2].did = "17";
        d[2].dname = "Dr.Rekha";
        d[2].specilist = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].doc_qual = "BDM";
        d[2].droom = 8;
        d[3].did = "33";
        d[3].dname = "Dr.Pramod";
        d[3].specilist = "Artho";
        d[3].appoint = "10-4PM";
        d[3].doc_qual = "MBBS,MS";
        d[3].droom = 40;

        p[0].pid = "12";
        p[0].pname = "Pankaj";
        p[0].disease = "Cancer";
        p[0].sex = "Male";
        p[0].admit_status = "y";
        p[0].age = 30;
        p[1].pid = "13";
        p[1].pname = "Sumit";
        p[1].disease = "Cold";
        p[1].sex = "Male";
        p[1].admit_status = "y";
        p[1].age = 23;
        p[2].pid = "14";
        p[2].pname = "Alok";
        p[2].disease = "Maleriya";
        p[2].sex = "Male";
        p[2].admit_status = "y";
        p[2].age = 45;
        p[3].pid = "15";
        p[3].pname = "Ravi";
        p[3].disease = "Diabetes";
        p[3].sex = "Male";
        p[3].admit_status = "y";
        p[3].age = 25;

        m[0].med_name = "Corex";
        m[0].med_comp = "Cino pvt";
        m[0].exp_date = "9-5-16";
        m[0].med_cost = 55;
        m[0].count = 8;
        m[1].med_name = "Nytra";
        m[1].med_comp = "Ace pvt";
        m[1].exp_date = "4-4-15";
        m[1].med_cost = 500;
        m[1].count = 5;
        m[2].med_name = "Brufa";
        m[2].med_comp = "Reckitt";
        m[2].exp_date = "12-7-17";
        m[2].med_cost = 50;
        m[2].count = 56;
        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].exp_date = "12-4-12";
        m[3].med_cost = 1100;
        m[3].count = 100;

        l[0].fecility = "X-ray     ";
        l[0].lab_cost = 800;
        l[1].fecility = "CT Scan   ";
        l[1].lab_cost = 1200;
        l[2].fecility = "OR Scan   ";
        l[2].lab_cost = 500;
        l[3].fecility = "Blood Bank";
        l[3].lab_cost = 50;

        f[0].fec_name = "Ambulance";
        f[1].fec_name = "Admit Facility ";
        f[2].fec_name = "Canteen";
        f[3].fec_name = "Emergency";

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1) {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctos  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      **DOCTOR SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Doctors List\n3.Update Doctor Information\n4. Delete Doctor");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                d[count1].new_doctor();
                                count1++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count1; j++) {
                                    d[j].doctor_info();
                                }
                                break;
                            }
                            case 3: {
                                d[0].update_doctor(d, count1);
                                break;
                            }
                            case 4:
                                d[0].delete_doctor(d, count1);
                                break;
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = input.nextInt();
                    }
                    break;
                }
                case 2: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **PATIENT SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s2 = 1;
                    while (s2 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Patients List\n3.Update Patient Information\n4. Delete Patient");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                p[count2].new_patient();
                                count2++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count2; j++) {
                                    p[j].patient_info();
                                }
                                break;
                            }
                            case 3: {
                                p[0].update_patient(p, count2);
                                break;
                            }
                            case 4:
                                p[0].delete_patient(p, count2);
                                break;
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;
                }
                case 3: {
                    s3 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **MEDICINE SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s3 == 1) {
                        System.out.println("1.Add New Entry\n2. Existing Medicines List\n3. Update Medicine Information\n4. Delete Medicine");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                m[count3].new_medi();
                                count3++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Name \t Company \t Expiry Date \t Cost");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count3; j++) {
                                    m[j].find_medi();
                                }
                                break;
                            }
                            case 3: {
                                m[0].update_medi(m, count3);
                                break;
                            }
                            case 4:
                                m[0].delete_medi(m, count3);
                                break;
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }
                case 4:
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                    **LABORATORY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s4 = 1;
                    while (s4 == 1) {
                        System.out.println("1.Add New Entry \n2.Existing Laboratories List\n3.Update Laboratory Information\n4. Delete Laboratory");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1:
                                l[count4].new_feci();
                                count4++;
                                break;
                            case 2:
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Facilities\t\t Cost");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count4; j++) {
                                    l[j].feci_list();
                                }
                                break;
                            case 3:
                                l[0].update_lab(l, count4);
                                break;
                            case 4:
                                l[0].delete_lab(l, count4);
                                break;
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = input.nextInt();
                    }
                    break;
                case 5:
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("          **HOSPITAL FACILITY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s5 = 1;
                    while (s5 == 1) {
                        System.out.println("1.Add New Facility\n2.Existing Facilities List\n3.Update Facility Information\n4. Delete Facility");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1:
                                f[count5].add_feci();
                                count5++;
                                break;
                            case 2:
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Hospital  Facility are:");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count5; j++) {
                                    f[j].show_feci();
                                }
                                break;
                            case 3:
                                f[0].update_fecility(f, count5);
                                break;
                            case 4:
                                f[0].delete_fecility(f, count5);
                                break;
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s5 = input.nextInt();
                    }
                    break;
                case 6: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       **STAFF SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s6 = 1;
                    while (s6 == 1) {
                        String a = "nurse", b = "worker", c = "security";
                        System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List \n5.Update Staff Information\n6. Delete Staff");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1:
                                s[count6].new_staff(s, count6);
                                count6++;
                                break;

                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count6; j++) {
                                    s[j].show_nurse_info();
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count6; j++) {
                                    s[j].show_worker_info();
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count6; j++) {
                                    s[j].show_security_info();
                                }
                                break;
                            }
                            case 5:
                                s[0].update_staff(s, count6);
                                break;
                            case 6:
                                s[0].delete_staff(s, count6);
                                break;
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s6 = input.nextInt();
                    }
                    break;
                }
                default:
                    System.out.println(" You Have Enter Wrong Choice!!!");
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();

            }

    }
}
