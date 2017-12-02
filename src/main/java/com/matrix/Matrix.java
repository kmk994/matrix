package com.matrix;

public class Matrix {
    private int rowSize;
    private int columnSize;
    private double[][] data;

    public Matrix(int rowSize, int columnSize, double[][] data) {
        this.rowSize = rowSize;
        this.columnSize = columnSize;
        this.data = data;
    }

    public double get(int x, int y) {
        return this.data[x][y];
    }

    public Matrix add(Matrix other) {
        double[][] output = new double[this.rowSize][this.columnSize];
        for (int x = 0; x < this.rowSize; x++) {
            for (int y = 0; y < columnSize; y++) {
                output[x][y] = this.get(x, y) + other.get(x, y);
            }
        }
        return new Matrix(this.rowSize, this.columnSize, output);
    }

    public Matrix multiply(Matrix other) {
        double[][] output = new double[this.rowSize][other.columnSize];
        for (int x = 0; x < this.rowSize; x++) {
            for (int y = 0; y < other.columnSize; y++) {
                for (int k = 0; k < other.columnSize; k++) {
                    output[x][y] += this.get(x, k) * other.get(k, y);
                }
            }

        }
        return new Matrix(this.rowSize, this.columnSize, output);
    }

}
