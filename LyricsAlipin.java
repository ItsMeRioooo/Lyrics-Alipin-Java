import java.util.concurrent.TimeUnit;

public class LyricsAlipin {
    public static void main(String[] args) throws InterruptedException {
        String[] lyrics = {
            "Ako'y alipin mo kahit hindi batid",
            "Aaminin ko minsan ako'y manhid",
            "Sana at iyong naririnig...",
            "Sa'yong yakap ako'y nasasabik"
        };
        double[] linePauses = {1.6, 2.0, 2.1, 0.7};
        double[] charDelays = {0.13, 0.15, 0.18, 0.15};

        System.out.println("Now playing: Alipin\n");
        for (int i = 0; i < lyrics.length; i++) {
            String line = lyrics[i];
            double charDelay = charDelays[i];
            for (int j = 0; j < line.length(); j++) {
                System.out.print(line.charAt(j));
                Thread.sleep((long)(charDelay * 1000));
            }
            System.out.println();
            Thread.sleep((long)(linePauses[i] * 1000));
        }
    }
}
