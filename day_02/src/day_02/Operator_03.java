package day_02;

public class Operator_03 {

	public static void main(String[] args) {
		// 논리연산자
		// 다수개의 관계식을 조합하여
		// 하나의 boolean 값을 반환할 수 있는 연산자
		// AND(&&) , OR(||) , NOT(!)
		
		// AND 연산자 (&&)
		// 좌항과 우항의 관계식 결과가 모두 참(true)인 경우 true 를 반환하는 연산자
		// 좌항의 결과가 false인 경우 우항의 식을 비교하지 않는다.(우항 = Dead code)
		System.out.printf("%-5b && %-5b -> %b\n",false,false,false&&false);
		System.out.printf("%-5b && %-5b -> %b\n",false,true,false&&true);
		System.out.printf("%-5b && %-5b -> %b\n",true,false,true&&false);
		System.out.printf("%-5b && %-5b -> %b\n\n",true,true,true&&true);
		
		// OR 연산자 (||)
		// 좌항과 우항의 관계식 중 하나라도 결과가 모두 참(true)인 경우 true를 반환하는 연산자
		// 좌항의 결과가 true인 경우 우항의 식을 비교하지 않는다.(우항 = Dead code)
		System.out.printf("%-5b || %-5b -> %b\n",false,false,false||false);
		System.out.printf("%-5b || %-5b -> %b\n",false,true,false||true);
		System.out.printf("%-5b || %-5b -> %b\n",true,false,true||false);
		System.out.printf("%-5b || %-5b -> %b\n\n",true,true,true||true);
		
		// NOT 연산자 (!)
		// 단항연산자(피연산자가 1개)
		// 관계식의 결과를 부정하는 값을 반환
		// true -> false , false -> true
		System.out.printf("!%-5b -> %b\n",false,!false);
		System.out.printf("!%-5b -> %b\n\n",true,!true);
		
		///////////////////////////////////////////////////////////////////////////
		
		int age = 32;
		int gender = 1; // 1 또는 3인 경우 남자 , 2 또는 4인 경우 여자
		
		// 위의 두 변수를 사용하여
		// 나이가 20대 이고, 성별이 여자인 경우를 판단하는 식을 작성하고 결과를 확인
		System.out.printf("%b",age>=20&&age<=29&&(gender==2||gender==4));
		
		// boolean flag_age = age >= 20 && age <30;
		boolean flag_age = age / 10 == 2;
		boolean flag_gender = gender == 2 || gender == 4;
		boolean result = flag_age && flag_gender;
		System.out.println(result);
	}

}
