package lesson14;

public class Main {
    public static void main(String[] args) {
        double[][] numsForA = {{1, 1, 1, 1},
                               {1, 3, 1, 1},
                               {1, 1, 8, 1},
                               {1, 1, 1, 6}};
        Matrix a = new Matrix(numsForA);
        System.out.println(a.getRows());
        System.out.println(a.getColumns());

        try {
            System.out.println(a.getValueAt(0, 0));
        }catch (IndexOutOfBoundsException e){
            System.out.println("rowIndex не подходит!!! || colIndex не подходит!!!");
        }
        try {
            a.setValueAt(0, 0, 9);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("rowIndex не подходит!!! || colIndex не подходит!!!");
        }
        try {
            System.out.println(a.getValueAt(0, 0));
        }catch (IndexOutOfBoundsException e){
            System.out.println("rowIndex не подходит!!! || colIndex не подходит!!!");
        }

        double[][] numsForB = {{6, 6, 6, 7},
                               {5, 5, 5, 6},
                               {1, 1, 1, 1},
                               {4, 4, 4, 5}};
        Matrix b = new Matrix(numsForB);

        // неявный параметр - а (внутри метода доступно по this)
        // явный параметр - b (внутри метода доступен otherMatrix)
        System.out.println("суммa текущей матрицы и второго аргумента");
       try {
           IMatrix resultAdd = a.add(b);
           resultAdd.printToConsole();
       }catch (IllegalArgumentException e){

       }catch (NullPointerException e){

       }



        System.out.println("------------");
        a.printToConsole();

        System.out.println("Детерминируем матрицу");
        a.determinant();
        a.printToConsole();

        System.out.println("разность матриц");
        IMatrix resultSub = a.sub(b);
        resultSub.printToConsole();

        System.out.println("произведение");
        IMatrix resultMul = a.mul(b);
        resultMul.printToConsole();

        System.out.println("умножаем матрицу на число");
        IMatrix resultMulValue = a.mul(5.0);
        resultMulValue.printToConsole();

        System.out.println("транспонируем");
        IMatrix resultTranspose = a.transpose();
        resultTranspose.printToConsole();

        System.out.println("заполняем матрицу числом");
        a.fillMatrix(8.0);
        a.printToConsole();

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
