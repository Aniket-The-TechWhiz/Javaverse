import java.util.*;

public class FIFOPageReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of frames: ");
        int framesCount = sc.nextInt();

        System.out.print("Enter length of reference string: ");
        int refLength = sc.nextInt();

        int[] referenceString = new int[refLength];
        System.out.println("Enter reference string:");
        for (int i = 0; i < refLength; i++) {
            referenceString[i] = sc.nextInt();
        }

        int[] frames = new int[framesCount];
        Arrays.fill(frames, -1); 

        int idx = 0;
        int top = framesCount - 1;
        int hit = 0, fault = 0;

        for (int i = 0; i < refLength; i++) {
            boolean isHit = false;

            // check if the current page is already in frame
            for (int j = 0; j < framesCount; j++) {
                if (frames[j] == referenceString[i]) {
                    hit++;
                    isHit = true;
                    break;
                }
            }

            // if not found, it's a fault
            if (!isHit) {
                frames[idx] = referenceString[i];
                fault++;
                idx++;

                // wrap around when full (FIFO)
                if (idx > top) {
                    idx = 0;
                }
            }
        }

        System.out.println("\nTotal Hits: " + hit);
        System.out.println("Total Faults: " + fault);

        sc.close();
    }
}
