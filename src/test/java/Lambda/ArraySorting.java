package Lambda;

public class ArraySorting {

    public static void main(String[] args) {
        ArraySorting as= new ArraySorting();
 //       as.sort();

        QuickSort qs=new QuickSort();
        BubleSort bs=new BubleSort();
        as.sort(qs);
        as.sort(bs);




    }

    public void sort(Sorting sorting){
        sorting.sort();
    }
}
