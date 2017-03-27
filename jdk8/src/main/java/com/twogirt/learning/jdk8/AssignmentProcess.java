package com.twogirt.learning.jdk8;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.*;
import javax.lang.model.util.Elements;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by kezhang on 17/1/19.
 */
public class AssignmentProcess extends AbstractProcessor {
    private TypeElement assignmentElement;

    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        Elements elementUtils = processingEnv.getElementUtils();
        assignmentElement = elementUtils.getTypeElement("annotation.Assignment");
    }

    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(assignmentElement);
        for (Element element : elements) {
            processAssignment(element);
        }
        return  true;
    }

    private void processAssignment(Element element) {
        List<? extends AnnotationMirror> annotations = element.getAnnotationMirrors();
        for (AnnotationMirror mirror : annotations) {
            if (mirror.getAnnotationType().asElement().equals(assignmentElement)) {
                Map<? extends ExecutableElement, ? extends AnnotationValue> values = mirror.getElementValues();
//                String assignee = (String) getAnnotationValue(values, "assignee"); //获取注解的值
                values.values();
            }
        }
    }
}
