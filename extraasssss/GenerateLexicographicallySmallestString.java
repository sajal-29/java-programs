package extraasssss;

public class GenerateLexicographicallySmallestString {
    public static String solve(String S1, String S2) {
        int L1 = S1.length();
        int L2 = S2.length();

        // Create a StringBuilder to store the output string.
        StringBuilder S = new StringBuilder();

        // Iterate over the string S2.
        for (int i = 0; i < L2; i++) {
            // If the current character in S2 is 'T', then append the substring of length L1 from S1 starting at index i.
            if (S2.charAt(i) == 'T') {
                S.append(S1.substring(i, i + L1));
            }
            // Otherwise, append the lexicographically smallest character to the output string.
            else {
                char minChar = 'a';
                for (int j = i; j < i + L1; j++) {
                    if (S1.charAt(j) < minChar) {
                        minChar = S1.charAt(j);
                    }
                }
                S.append(minChar);
            }
        }

        // Return the output string.
        return S.toString();
    }

    public static void main(String[] args) {
        // Test case 1
        String S1 = "ABC";
        String S2 = "TT";
        String output = solve(S1, S2);
        System.out.println(output); // Output: ABC

        // Test case 2
        S1 = "XYZ";
        S2 = "FT";
        output = solve(S1, S2);
        System.out.println(output); // Output: AXY
    }
}