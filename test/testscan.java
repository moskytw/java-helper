
import mosky.scan;

public class testscan {

    public static void main(String[] args)
    {
        scan.str("1-9:", "[1-9]", "Please Enter 1-9.");
        scan.str("x, y or z:", "[xyz]");
        scan.str("any:");
    }
}
