package step1.patterns;

public class Patterns {
    public static void main(String[] args) {
        // Pattern 1
        for (int i = 1; i <= 5; i++) {          // * * * * *
            for (int j = 1; j <= 5; j++) {      // * * * * *
                System.out.print("* ");         // * * * * *
            }                                   // * * * * *
            System.out.println();               // * * * * *
        }

        // Pattern 2
        for (int i = 1; i <= 5; i++) {          // *
            for (int j = 1; j <= i; j++) {      // * *
                System.out.print("* ");         // * * *
            }                                   // * * * *
            System.out.println();               // * * * * *
        }

        // Pattern 3
        for (int i = 1; i <= 5; i++) {          // 1
            for (int j = 1; j <= i; j++) {      // 1 2
                System.out.print(j + " ");      // 1 2 3
            }                                   // 1 2 3 4
            System.out.println();               // 1 2 3 4 5
        }

        // Pattern 4
        for (int i = 1; i <= 5; i++) {          // 1
            for (int j = 1; j <= i; j++) {      // 2 2
                System.out.print(i + " ");      // 3 3 3
            }                                   // 4 4 4 4
            System.out.println();               // 5 5 5 5 5
        }

        // Pattern 5
        for (int i = 5; i >= 1; i--) {          // * * * * *
            for (int j = i; j >= 1; j--) {      // * * * *
                System.out.print("* ");         // * * *
            }                                   // * *
            System.out.println();               // *
        }

        // Pattern 6
        for (int i = 5; i >= 1; i--) {          // 1 2 3 4 5
            for (int j = 1; j <= i; j++) {      // 1 2 3 4
                System.out.print(j + " ");      // 1 2 3
            }                                   // 1 2
            System.out.println();               // 1
        }

        // Pattern 7
        for (int i = 1; i <= 5; i++) {              //     *
            for (int j = 1; j <= 5 - i; j++) {      //    ***
                System.out.print(" ");              //   *****
            }                                       //  *******
            for (int k = 1; k <= 2 * i - 1; k++) {  // *********
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 8
        for (int i = 5; i >= 1; i--) {              // *********
            for (int j = 1; j <= 5 - i; j++) {      //  *******
                System.out.print(" ");              //   *****
            }                                       //    ***
            for (int k = 1; k <= 2 * i - 1; k++) {  //     *
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 9
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {  //     *
                System.out.print("*");              //    ***
            }                                       //   *****
            System.out.println();                   //  *******
        }                                           // *********
        for (int i = 5; i >= 1; i--) {              // *********
            for (int j = 1; j <= 5 - i; j++) {      //  *******
                System.out.print(" ");              //   *****
            }                                       //    ***
            for (int k = 1; k <= 2 * i - 1; k++) {  //     *
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 10
        for (int i = 1; i <= 2 * 5 - 1; i++) {          // *
            if (i <= 5) {                               // **
                for (int j = 1; j <= i; j++) {          // ***
                    System.out.print("*");              // ****
                }                                       // *****
                System.out.println();                   // ****
            } else {                                    // ***
                for (int j = 1; j <= 2 * 5 - i; j++) {  // **
                    System.out.print("*");              // *
                }
                System.out.println();
            }
        }

        // Pattern 11
        for (int i = 1; i <= 5; i++) {      // 1
            for (int j = 1; j <= i; j++) {  // 0 1
                int diff = Math.abs(i - j); // 1 0 1
                if (diff % 2 == 0)          // 0 1 0 1
                    System.out.print("1 "); // 1 0 1 0 1
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        // Pattern 12
        for (int i = 1; i <= 4; i++) {                      // 1      1
            for (int j = 1; j <= i; j++) {                  // 12    21
                System.out.print(j);                        // 123  321
            }                                               // 12344321
            for (int k = 1; k <= (2 * 4) - (2 * i); k++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }

        // Pattern 13
        int count = 1;
        for (int i = 1; i <= 5; i++) {              // 1
            for (int j = 1; j <= i; j++) {          // 2 3
            System.out.print(count++ + " ");        // 4 5 6
            }                                       // 7 8 9 10
            System.out.println();                   // 11 12 13 14 15
        }

        // Pattern 14
        for (int i = 1; i <= 5; i++) {      // A
            char letter = 'A';              // AB
            for (int j = 1; j <= i; j++) {  // ABC
                System.out.print(letter++); // ABCD
            }                               // ABCDE
            System.out.println();
        }

        // Pattern 15
        for (int i = 5; i >= 1; i--) {      // ABCDE
            char letter = 'A';              // ABCD
            for (int j = 1; j <= i; j++) {  // ABC
                System.out.print(letter++); // AB
            }                               // A
            System.out.println();
        }

        // Pattern 16
        char letter = 'A';                  // A
        for (int i = 1; i <= 5; i++) {      // BB
            for (int j = 1; j <= i; j++) {  // CCC
                System.out.print(letter);   // DDDD
            }                               // EEEEE
            letter++;
            System.out.println();
        }

        // Pattern 17
        for (int i = 1; i <= 5; i++) {          //    A
            for (int j = 1; j <= 5 - i; j++) {  //   ABA
                System.out.print(" ");          //  ABCBA
            }                                   // ABCDCBA

            char Letter = 'A';
            int breakpoint = (2 * i - 1) / 2;
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(Letter);
                if (k <= breakpoint) Letter++;
                else Letter--;
            }
            System.out.println();
        }

        // Pattern 18
        for (int i = 1; i <= 5; i++) {
            for (char ch = (char)('F' - i); ch <= (char)(int)'F' - 1; ch++) {
                System.out.print(ch + " "); // E
            }                               // D E
            System.out.println();           // C D E
        }                                   // B C D E
                                            // A B C D E

        // Pattern 19
        for (int i = 1; i <= 2 * 5; i++) {                  // **********
            if (i <= 5) {                                   // ****  ****
                for (int j = 1; j <= 5 - i + 1; j++) {      // ***    ***
                    System.out.print("*");                  // **      **
                }                                           // *        *
                                                            // *        *
                for (int k = 1; k <= 2 * (i - 1); k++) {    // **      **
                    System.out.print(" ");                  // ***    ***
                }                                           // ****  ****
                                                            // **********
                for (int l = 1; l <= 5 - i + 1; l++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= i - 5; j++) {
                    System.out.print("*");
                }

                for (int k = 1; k <= 2 * (2 * 5 - i); k++) {
                    System.out.print(" ");
                }

                for (int l = 1; l <= i - 5; l++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        // Pattern 20
        for (int i = 1; i <= 2 * 5 - 1; i++) {              // *        *
            if (i <= 5) {                                   // **      **
                for (int j = 1; j <= i; j++) {              // ***    ***
                    System.out.print("*");                  // ****  ****
                }                                           // **********
                                                            // ****  ****
                for (int k = 1; k <= 2 * (5 - i); k++) {    // ***    ***
                    System.out.print(" ");                  // **      **
                }                                           // *        *
                for (int l = 1; l <= i; l++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= 2 * 5 - i; j++) {
                    System.out.print("*");
                }

                for (int k = 1; k <= 2 * (i - 5); k++) {
                    System.out.print(" ");
                }

                for (int l = 1; l <= 2 * 5 - i; l++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        // Pattern 21
        for (int i = 1; i <= 4; i++) {          // ****
            if (i == 1 ||  i == 4) {
                for (int j = 1; j <= 4; j++) {  // *  *
                    System.out.print("*");
                }                               // *  *
                System.out.println();
            } else {                            // ****
                for (int j = 1; j <= 4; j++) {
                    if (j == 1 || j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        // Pattern 22
        int n = 4;                                  // 4444444
        for (int i = 0; i < 2 * n - 1; i++) {       // 4333334
            for (int j = 0; j < 2 * n - 1; j++) {   // 4322234
                int top = i;                        // 4321234
                int left = j;                       // 4322234
                int right = 2 * (n - 1) - j;        // 4333334
                int down = 2 * (n - 1) - i;         // 4444444
                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
            }
            System.out.println();
        }
    }
}
