package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)// ����Ԫע�⽫����ʲô�ط���һ����������һ����
@Retention(RetentionPolicy.RUNTIME)// ����ע������һ��������ã�SOURCE/CLASS/RUNTIME��
public @interface UseCase {
	public int id();
	public String description() default "no description";
}
