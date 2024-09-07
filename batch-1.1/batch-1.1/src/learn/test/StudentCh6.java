package learn.test;

// Question 6. Create a method to perform matrix multiplication.

class Matrix {
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    int c[][] = new int[2][2];

    public void setMatrix(int a[][], int b[][]) {
        this.a = a;
        this.b = b;
    }

    public void multiply() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
}

public class StudentCh6 {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        int a[][] = { { 1, 2 }, { 3, 4 } };
        int b[][] = { { 5, 6 }, { 7, 8 } };

        m.setMatrix(a, b);
        m.multiply();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m.c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
