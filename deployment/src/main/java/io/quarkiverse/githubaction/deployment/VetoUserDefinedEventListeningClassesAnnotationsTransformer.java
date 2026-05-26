package io.quarkiverse.githubaction.deployment;

import java.util.Set;
import org.jboss.jandex.AnnotationInstance;
import org.jboss.jandex.AnnotationTarget;
import org.jboss.jandex.AnnotationTarget.Kind;
import org.jboss.jandex.AnnotationTransformation;
import org.jboss.jandex.DotName;
import io.quarkus.arc.processor.DotNames;

class VetoUserDefinedEventListeningClassesAnnotationsTransformer implements AnnotationTransformation {

    private final Set<DotName> eventDefinitionAnnotations;

    VetoUserDefinedEventListeningClassesAnnotationsTransformer(Set<DotName> eventDefinitionAnnotations) {
        this.eventDefinitionAnnotations = eventDefinitionAnnotations;
    }

    @Override
    public boolean supports(AnnotationTarget.Kind kind) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void apply(TransformationContext transformationContext) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEventListeningClass(TransformationContext transformationContext) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
