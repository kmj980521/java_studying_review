package JAVA;

public class Example{
	public static void main(String[] args) {
		int[]array1= {10,20,30,40,50};
		int[]array2= {100,200,300,400,500};
		
		System.arraycopy(array2, 2, array1, 3, 2);//array2의 인덱스넘버가 2인 수부터 array1배열의 인덱스넘버가 3인 자리부터 /2개를 복사해라
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]+" ");
		}
	}
}
