package lesson14;

public class Main {
    public static void main(String[] args) {
        double[][] numsForA = {{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        Matrix a = new Matrix(numsForA);
        System.out.println(a.getRows());
        System.out.println(a.getColumns());
        System.out.println(a.getValueAt(0, 0));
        a.setValueAt(0, 0, 9);
        System.out.println(a.getValueAt(0, 0));

        double[][] numsForB = {{6, 6, 6, 7},
                {5, 5, 5, 6},
                {1, 1, 1, 1},
                {4, 4, 4, 5}};
        Matrix b = new Matrix(numsForB);

        // неявный параметр - а (внутри метода доступно по this)
        // явный параметр - b (внутри метода доступен otherMatrix)
        IMatrix resultAdd = a.add(b);

        resultAdd.printToConsole();
        System.out.println("---------------");
        a.printToConsole();

      /*
        System.out.println("Детерминируем матрицу");
        IMatrix det = a.determinant();
        det.printToConsole();

       */


        System.out.println("разность матриц");
        IMatrix resultSub = a.sub(b);
        resultSub.printToConsole();

        System.out.println("---------------");

        /*
        IMatrix resultMul = a.mul(b);
        resultMul.printToConsole();

         */
        System.out.println("умножаем матрицу на число");
        IMatrix resultMulValue = a.mul(5.0);
        resultMulValue.printToConsole();

       /*
        System.out.println("транспонируем");
        IMatrix resultTranspose = a.transpose();
        resultTranspose.printToConsole();



        System.out.println("заполняем матрицу числом");
        IMatrix resultToFill = a.fillMatrix(8.0);
         resultToFill.printToConsole();

        */

        System.out.println("матрица нулевая?");
        Boolean resultIsNul = a.isNullMatrix();
        System.out.println(resultIsNul.booleanValue());

        System.out.println("единичная матрица?");
        Boolean resultisIdentity = a.isIdentityMatrix();
        System.out.println(resultisIdentity.booleanValue());

        System.out.println("матрица квадратная?");
        Boolean resultIsSquare = a.isSquareMatrix();
        System.out.println(resultIsSquare.booleanValue());

    }
}
