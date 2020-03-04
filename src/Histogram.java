import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Histogram {

    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        Map<Character,Long> freq = new HashMap<>();
        freq.put('A', 40L);
        freq.put('B', 40L);
        freq.put('R', 40L);
        freq.put('N', 40L);
        freq.put('D', 40L);
        freq.put('C', 40L);
        freq.put('E', 40L);
        freq.put('Q', 40L);
        freq.put('G', 80L);

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DrawHistogram(freq);
            }
        });
//        DrawHistogram draw = new DrawHistogram(freq,600,700);
//        draw.print();
    }
}
