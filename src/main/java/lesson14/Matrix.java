package lesson14;

import lesson14.IMatrix;

public class Matrix implements IMatrix {
    private double[][] nums;

    public Matrix() {
        nums = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(double[][] nums) {
        this.nums = nums;
    }

    public Matrix(int row, int col) {
        nums = new double[row][col];
    }

    @Override
    public int getRows() {
        return nums.length;
    }

    @Override
    public int getColumns() {
        return nums[0].length;
    }

    //Возвращает элемент матрицы по индексам
    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex > getRows()) {
            System.out.println("rowIndex не подходит!!! ");
            return 0;
        }

        if (colIndex < 0 || colIndex > getColumns()) {
            System.out.println("colIndex не подходит!!! ");
            return 0;
        }

        return nums[rowIndex][colIndex];
    }

    // Устанавливает элемент матрицы по индексам
    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex > getRows()) {
            System.out.println("rowIndex не подходит!!! ");
            return;
        }

        if (colIndex < 0 || colIndex > getColumns()) {
            System.out.println("colIndex не подходит!!! ");
            return;
        }

        nums[rowIndex][colIndex] = value;
    }

    // Возвращает сумму текущей матрицы и второго аргумента. <br/>
    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        //  а --- this
        // b ---- otherMatrix

        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не совпадает кол-во строк!!!");
            return null;
        }

        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не совпадает кол-во колонок!!!");
            return null;
        }

        Matrix result = new Matrix(getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    // Возвращает разность текущей матрицы и второго аргумента.<br/>
    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        //  а --- this
        // b ---- otherMatrix
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не совпадает кол-во строк!!!");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не совпадает кол-во колонок!!!");
            return null;

        }
        Matrix result = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }
    // Возвращает произведение текущей матрицы и второго аргумента
    /*
    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if(this.getRows() != otherMatrix.getColumns() || otherMatrix == null){
            System.out.println("Количество строк не совпарадает с количеством колонок!!!");
            return null;
            }

        Matrix result = new Matrix(getRows(), getColumns());
        for(int i = 0; i < getRows(); i++){
            for(int j = 0; j < getColumns(); j++ ){
                for(int k = 0; k < this.getColumns(); k++) {
                    result[i][j] += this.getValueAt(i, k) * otherMatrix.getValueAt(k, j);  // < --- тут не видит массив
                }
            }
        }
        return result;
        }

  */


    // Возвращает произведение текущей матрицы на число.<br/>
    @Override
    public IMatrix mul(double value) {
        Matrix result = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    //  Возвращает транспонированную матрицу по отношению к текущей
    /*
    @Override
    public IMatrix transpose() {
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                this[i][j] = this[j][i];
                result[j][i] = result;
            }

        }
        return this;
    }

     */
  /*  // Заполняет текущю матрицу заданным значением
    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                this.setValueAt(i, j, value);
            }
        }
        return this;  // он ведь должен вернуть текущую матрицу, почему ругается
    }

   */

    @Override
    public double determinant() {
        if (!isSquareMatrix()) {
            throw new UnsupportedOperationException("Определитель можно вычислить только для квадратных матриц");
        }

        int n = this.getRows();
        if (n == 1) {
            return this.getValueAt(0, 0);
        } else if (n == 2) {
            return this.getValueAt(0, 0) * this.getValueAt(1, 1) - this.getValueAt(0, 1) * this.getValueAt(1, 0);
        } else {
            double det = 0;
            for (int i = 0; i < n; i++) {
                det += this.getValueAt(0, i) * cofactor(0, i).determinant() * ((i % 2 == 0) ? 1 : -1);
            }
            return det;
        }
    }

    // Helper method to compute the cofactor matrix
    private IMatrix cofactor(int row, int col) {
        Matrix cofactorMatrix = new Matrix(this.getRows() - 1, this.getColumns() - 1);
        int rowCount = 0;
        for (int i = 0; i < this.getRows(); i++) {
            if (i == row) {
                continue;
            }
            int colCount = 0;
            for (int j = 0; j < this.getColumns(); j++) {
                if (j == col) {
                    continue;
                }
                cofactorMatrix.setValueAt(rowCount, colCount, this.getValueAt(i, j));
                colCount++;
            }
            rowCount++;
        }
        return cofactorMatrix;
    }

    @Override
    public boolean isNullMatrix() {

        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {
        //  this - та матрица, которую нужно напечатать

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(this.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }
}

