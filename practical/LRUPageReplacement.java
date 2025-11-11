import java.util.*;

public class LRUPageReplacement {
    public static void main(String args[])
    {
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
                if (fault < framesCount) {
                    // still have empty space
                    frames[fault] = referenceString[i];
                } else {
                    // find LRU page
                    int lruIndex = -1, minRecent = Integer.MAX_VALUE;
                    for (int j = 0; j < framesCount; j++) {
                        int lastUsed = -1;
                        for (int k = i - 1; k >= 0; k--) {
                            if (frames[j] == referenceString[k]) {
                                lastUsed = k;
                                break;
                            }
                        }
                        if (lastUsed == -1) { // not used at all
                            lruIndex = j;
                            break;
                        }
                        if (lastUsed < minRecent) {
                            minRecent = lastUsed;
                            lruIndex = j;
                        }
                    }
                    frames[lruIndex] = referenceString[i];
                }
                fault++;
            }
        }

        System.out.println("\nTotal Hits: " + hit);
        System.out.println("Total Faults: " + fault);

        sc.close();
    }
}
