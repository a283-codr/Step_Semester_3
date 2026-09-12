public class CSVStudentRecordParser {

    public static void parseStudentRecord(String csvLine) {

        String[] data = csvLine.split(",");

        if (data.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String name = data[0];
        String rollNumber = data[1];
        String department = data[2];

        System.out.println("Name: " + name +
                           " | Roll No: " + rollNumber +
                           " | Dept: " + department);
    }

    public static void main(String[] args) {

        String studentRecord =
                "Ananya Verma,RA2211003010123,CSE";

        parseStudentRecord(studentRecord);
    }
}