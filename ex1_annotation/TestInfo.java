package ex1_annotation;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
@Target({TYPE,FIELD,TYPE_USE,METHOD})
@Retention(RUNTIME)
public @interface TestInfo {//앞을 다른 곳에서 @TestInfo라는 이름으로 어노테이션을
							//사용할 수 있다.
	String[] value()default"정보1"; //추상메서드
	//아무것도 정의하지 않았을 때 기본값으로 "정보1"을 반환을 하겠다.
	String[] testTool()default"INF01";
	String tester();
	DateTime datetime();
}
