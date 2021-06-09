public class Main {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add("1");
        sortedList.add("2");
        sortedList.add("3");

        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();

        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
    }
}
