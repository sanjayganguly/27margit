import com.sun.jdi.PathSearchingVirtualMachine;
import org.w3c.dom.ls.LSOutput;
class superDepartment {

    public String departmentName() {
        return "Super Department";
           }

    public String getTodaysWork() {
        return "No Work as of now";
            }

    public String getWorkDeadline() {
        return "Nil";
            }

    public String isTodayAHoliday() {
        return "Today is not a holiday";
            }
}

class adminDepartment extends superDepartment {
    @Override
    public String departmentName() {
        return "Admin Department";
            }
@Override
    public String getTodaysWork() {
        return "Complete your document Submission";
           }
@Override
    public String getWorkDeadline() {
        return "Complete by EOD";
            }

}


class hrDepartment extends superDepartment {

    @Override
    public String departmentName() {
        return "Hr Department";
        str k1 = "Hr Department"
        System.out.println( welcome to + k1");
    }

    @Override
    public String getTodaysWork() {
        return "Fill today is worksheet and mark your attandance";
        System.out.println("Fill today is worksheet and mark your attandance");
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
        System.out.println("Complete by EOD");
    }

    public String doActivity() {
        return "team Lunch";
        System.out.println("team Lunch");
    }

}

class techDepartment extends superDepartment {

    @Override
    public String departmentName() {
        return "Tech Department";
        System.out.println("Tech Department");
    }

    @Override
    public String getTodaysWork() {
        return "Complete coding of module 1";
        System.out.println("Complete coding of module 1");
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
        System.out.println("Complete by EOD");
    }

    public String getTechStackInformation() {
        return "core java";
        System.out.println("core java");
    }
}

    class allfinal {

        public static void main(String[] args) {

          superDepartment s1 = new adminDepartment();

            s1.departmentName();
            System.out.println("Welcome to Admin Department");

            s1.getTodaysWork();
            System.out.println("Complete your document Submission");

            s1.getWorkDeadline();
            System.out.println("Complete by EOD");

            admin s2 = (adminDepartment) s1;
            s2.isTodayAHoliday();
            System.out.println("Today is not a Holiday");



            superDepartment s3 = new hrDepartment();

            s3.departmentName();
            System.out.println("Welcome to Hr Department");

            s3.doActivity();
            System.out.println("team Lunch");

            s3.getTodaysWork();
            System.out.println("Fill today's timesheet and mark your attandance");

            s3.getWorkDeadline();
            System.out.println("Complete by EOD");

            hrDepartment s4 = (hrDepartment) s3;
            s4.isTodayAHoliday();
            System.out.println("Today is not a Holiday");


            superDepartment s5 = new techDepartment();

            s5.departmentName();
            System.out.println("Welcome to Tech Department");

            s5.getTodaysWork();
            System.out.println("Complete coding of Module 1");

            s5.getWorkDeadline();
            System.out.println("Complete by EOD\n Core Java");

            techDepartment s6 = (techDepartment) s5;
            s6.isTodayAHoliday();
            System.out.println("Core java");
            System.out.println("Today is not a Holiday");

        }

    }
