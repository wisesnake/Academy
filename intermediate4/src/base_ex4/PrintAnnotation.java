package base_ex4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
//어노테이션 적용 대상 -> 메서드.
@Retention(RetentionPolicy.RUNTIME)
//어노테이션 유지 정책(적용 시점과 제거 시점)
public @interface PrintAnnotation {
	//@PrintAnnotation 어노테이션은 속성을 가질 수 있다.
	// 속성은 타입과 이름으로 구성되며, 이름 뒤에 괄호를 붙인다. 속성의 기본값은 default 키워드로 지정할 수 있다.
	
	String value() default "-"; //선의 종류
	int count() default 15;
}
