
public class main {
	
	public static int secondSmallest(int[] array) {
		int first, second;
		first = second = Integer.MAX_VALUE;          // Поскольку мы ищем МИНИМАЛЬНОЕ значение, решил изначально 
        for (int i = 0; i < array.length  ; i ++)    // присвоить им максимально возможное значение, чтобы не произошло путаницы. 
        { 
            if (array[i] < first)   // Ищем минимальное значение, запоминая при этом второе минимальное 
            { 
                second = first; 
                first = array[i]; 
            } 

            else if (array[i] < second && array[i] != first) // Проверяем, чтобы второе значение не было равно первому
                second = array[i];                          
        } 
        return second; 
	}
	
	public static void main(String[] args) {
	
		 int array1[] = {0,1,2,3,4,5,6,7,8,9,10};
		 int array2[] = {-10,-9,-8,-7,-6,-5,-4,-3,-2,-1};
		 int array3[] = {11,22,33,44,55,66,77,88,99,100,100};             //Шесть массивов, как договаривались :)
		 int array4[] = {1,2,2,1,5,6,6,9,1,2,5,8,5,3,2,1,4, 0};
		 int array5[] = {123,5798,234534,12312,235423,12312,3,12312};
		 int array6[] = {-1236, -44224, -1, -1, 0, 245, 12348, 456};
		 

		 System.out.println(secondSmallest(array1));
		 System.out.println(secondSmallest(array2));
		 System.out.println(secondSmallest(array3));
		 System.out.println(secondSmallest(array4));
		 System.out.println(secondSmallest(array5));
		 System.out.println(secondSmallest(array6));



	}

}
