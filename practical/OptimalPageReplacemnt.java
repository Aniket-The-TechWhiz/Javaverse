import java.util.Arrays;
import java.util.Scanner;

public class OptimalPageReplacemnt {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

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
                    // still empty slots available
                    frames[fault] = referenceString[i];
                } else {
                    int optIndex = -1, farthest = -1;

                    // for each frame, check when it will be used next
                    for (int j = 0; j < framesCount; j++) {
                        int nextUse = Integer.MAX_VALUE;
                        for (int k = i + 1; k < refLength; k++) {
                            if (frames[j] == referenceString[k]) {
                                nextUse = k;
                                break;
                            }
                        }
                        // page not used again -> replace it immediately
                        if (nextUse == Integer.MAX_VALUE) {
                            optIndex = j;
                            break;
                        }

                        // otherwise choose the farthest used page
                        if (nextUse > farthest) {
                            farthest = nextUse;
                            optIndex = j;
                        }
                    }

                    frames[optIndex] = referenceString[i];
                }
                fault++;
            }
        }

        System.out.println("\nTotal Hits: " + hit);
        System.out.println("Total Faults: " + fault);

        sc.close();*/

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

            for (int j = 0; j < 3; j++) {
                System.out.println("Inner Loop: " + j);
                break;
            }
            System.out.println("Outer Loop: ");
            if (i == 0) {
                break;
            }
            System.out.println("After If");
        }
    }

}
