package tw.kewang.hbase.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
	String name() default "";

	Class<?> classType() default String.class;
}