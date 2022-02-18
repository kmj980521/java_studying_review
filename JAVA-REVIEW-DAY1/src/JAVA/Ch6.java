package JAVA;

public class Ch3 {

	public static void main(String[] args) {
		
		int n=10;
		double drum=n; //바이트 크기가 작은 자료형에서 큰 자료형으로 '묵시적 형변환'
		
		int n2=20;
		float fnum=n2; //덜 정밀한 자료형에서 정밀한 자료형으로 '묵시적 형변환'
		
		int n3=10;
		byte bnum=(byte)n3; //바이트 크기가 큰 자료형에서 작은 자료형으로 '명시적 형변환'
		
		double dnum=3.14;
		int n4=(int)dnum; // 더 정밀한 자료형에서 덜 정밀한 자료형으로 '명시적 형변환' 
		
		double numD=1.2;
		float numF=0.9F;
		
		int num1=(int)numD+(int)numF; // '명시적 형변환에의해 1+0이 됨
		int num2=(int)(numD+numF); //'명시적 형변환에 의해 2.1에서 2가 됨. 언제 형변환을 했는지에따라 결과값이 달라질 수 있음.

	}

}
