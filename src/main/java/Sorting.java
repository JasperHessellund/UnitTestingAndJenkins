
public class Sorting {

    public int[] sort (int[] array, boolean sortAscending) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 || array[i] > 50) {
                return new int[]{};
            }
        }

        if(sortAscending){
            for(int i=1; i<array.length; i++){
                for(int j=0; j<array.length-i; j++){
                    if(array[j]>array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        } else {
            for(int i=1; i<array.length; i++){
                for(int j=0; j<array.length-i; j++){
                    if(array[j]<array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }

        return array;

    }

}
