package base_ex4;

import java.lang.reflect.Method;

public class PrintAnnotationTest {

	public static void printLine(PrintAnnotation printAnnotation){
		if(printAnnotation != null) {
			int number=printAnnotation.count();
			//count속성값 얻기. PrintAnnotation어노테이션클래스의 number필드의 디폴트값인 15, 혹은 지정된 속성값을 가져오겠지.
			for (int i = 0 ; i < number ; i++){
				//value속성값 얻기.
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) throws Exception{
		
		Method[] declaredM = Service.class.getDeclaredMethods();
		//Service클래스의 모든 선언된 메서드들을 배열의 형태로 declaredM으로 대입.
		
		for( Method method : declaredM ) {
			//그렇게 나온 declearedM의 길이만큼 반복문 돌리면서 Method 타입 method에 하나식 대입.
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
//			System.out.println(printAnnotation);
			printLine(printAnnotation);
			method.invoke(new Service());
			printLine(printAnnotation);
			
		}
		
	}
}
