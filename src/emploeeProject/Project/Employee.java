package emploeeProject.Project;

abstract public class Employee {

    protected String name;
    protected int type;
    protected double rate;
    protected int hours;
    
    private static double MIN_RATE = 6.5;
    private static double MAX_RATE = 30.5;
    private static double MIN_HOUR = 1;
    private static double MAX_HOUR = 60;
    protected static double totalPay = 0;
    
    public Employee() {
        name = "";
        rate = 0;
        hours = 0;
    }

    //static, applies to all
    public static String getNameRules() {
        return "nonblank";
    }

    //public static String getTypeRules() {
      //  return "1 or 2";
    //}

    public static String getRateRules() {
        return "between "+MIN_RATE+" and "+MAX_RATE+", inclusive";
    }

    public static String getHoursRules() {
        return "between "+MIN_HOUR+" and "+MIN_HOUR+", inclusive";
    }
    
    public static double getTotalPay(){
        return totalPay;
    }
    
    //pt and ft emplyees both have this
    final public boolean setName(String nm) {
        if (nm.equals("")) {
            return false;
        } else {
            name = nm;
            return true;
        }
    }
    //we dont need type anymore,made through different classes 
    /*
    public boolean setType(int tp) {
        if (tp != 1 && tp != 2) {
            return false;
        } else {
            type = tp;
            return true;
        }
    }
    */
    final public boolean setRate(double rt) {
        if (rt < MIN_RATE || rt > MAX_RATE) {
            return false;
        } else {
            rate = rt;
            return true;
        }
    }

    final public boolean setHours(int hrs) {
        if (hrs < MIN_HOUR || hrs > MAX_HOUR) {
            return false;
        } else {
            hours = hrs;
            return true;
        }
    }

    final public String getName() {
        return name;
    }
    //both will define it differently
    abstract public double getPay();
}
