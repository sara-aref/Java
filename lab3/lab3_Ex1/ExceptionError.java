
public class ExceptionError {
    public static void main(String [] args){

        Operation obj = new Operation();
        try {
            double Division = obj.div(8, 4);
            System.out.println("Division: " +Division);

            double Division2 = obj.div(5, 0);
        }
        catch (RunException e) {
            System.out.println("Something went wrong. " + e.getMessage());
        }

        try{
            double Root = obj.root(9);
            System.out.println("Root: " +Root);

            double Root2 = obj.root(-9);
        }

        catch (RunException e) {
            System.out.println("Something went wrong. " + e.getMessage());
        }

        try{
            double Difference = obj.diff(6, 2);
            System.out.println("Difference: " +Difference);

            double Difference2 = obj.diff(2,6);
          
        } catch (RunException e) {
            System.out.println("Something went wrong. " + e.getMessage());
        } 
        finally {
            System.out.println("This is final message.");
        }

    }
}