package Lambda;

public class ArraySorting {

    public static void main(String[] args) {
        ArraySorting as= new ArraySorting();
 //       as.sort();

        QuickSort qs=new QuickSort();
        BubleSort bs=new BubleSort();
        as.sort(qs);
        as.sort(bs);
        //     MyLambda myLambda=()-> System.out.println("Sorting array");
       // Sorting myLambda2=()-> System.out.println("Sorting the array");
         Sorting noLambda=new QuickSort();
         noLambda.sort();

         Sorting quickSort=()-> System.out.println("Quick sorting");
         as.sort(quickSort);

          Sorting bubleSort=()-> System.out.println("Buble sorting");
          as.sort(bubleSort);



    }

    public void sort(Sorting sorting){
        sorting.sort();
    }
}


//interface MyLambda{
//    void print();
//}