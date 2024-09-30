package com.Threading;
class Q1 extends Thread {
    private int[][] mat1;
    private int[][] mat2;
    private int[][] result;
    private int row;
    private int col;

     public Q1(int[][] mat1, int[][] mat2, int[][] result, int row, int col) {
        this.mat1 = mat1;
        this.mat2 = mat2;
        this.result = result;
        this.row = row;
        this.col = col;
    }

      
    public void run() {
        int sum = 0;
        for (int i = 0; i < mat2.length; i++) {
            sum += mat1[row][i] * mat2[i][col];
        }
         synchronized (result) {
            result[row][col] = sum;
        }
    }

    public static void main(String[] args) {
         int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] mat2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

         int m = mat1.length;
        int n = mat1[0].length;
        int p = mat2[0].length;

         int[][] result = new int[m][p];

         Thread[][] threads = new Thread[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                threads[i][j] = new Q1(mat1, mat2, result, i, j);
                threads[i][j].start(); 
            }
        }

         for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                try {
                    threads[i][j].join(); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

         System.out.println("Resultant matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
} 