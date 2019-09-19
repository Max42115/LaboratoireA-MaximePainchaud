import java.text.DecimalFormat;

public class typage {

    public static void main(String[] args) {

        int var1 = 1;
        double var2 = 1.2345678;
        char var3 = 1;
        DecimalFormat df = new DecimalFormat("####0.00");

        String conversion1 = Integer.toString(var1);

        boolean conversion2 = (var1 == 1);

        int conversion3 = (int)(var2);

        int conversion5 = var3;

        System.out.println("Conversion #1 : " + conversion1);
        System.out.println("Conversion #2 : " + conversion2);
        System.out.println("Conversion #3 : " + conversion3);
        System.out.println(String.format("Conversion #4 : " + df.format(var2)));
        System.out.println("Conversion #5 : " + conversion5);
    }
}
