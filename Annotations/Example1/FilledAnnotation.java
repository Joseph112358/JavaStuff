//this is a filled annotation, it does something
public @interface FilledAnnotation {
    String name() default "Bob"; //if not specified use default
    int value();

}
