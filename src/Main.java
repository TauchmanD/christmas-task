import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        create_sphere(4, '–', 5);
        create_sphere(4, '–', 0);

    }
    static void create_sphere(int radius, char symbol, int offset){
        int diameter = radius*2;
        for(int x=0; x<=diameter; x++) {
            if(x<diameter-offset+1)
            {
                for (int y=0; y<=diameter; y++) {
                    double distance = Math.sqrt(Math.pow((x-radius),2)+Math.pow((y-radius),2));
                    if (distance > radius - 0.5 && distance < radius + 0.5) {
                        System.out.print(symbol);
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}