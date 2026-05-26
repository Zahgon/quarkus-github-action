package io.quarkiverse.githubaction.deployment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import org.jboss.jandex.AnnotationInstance;
import org.jboss.jandex.AnnotationValue;
import org.jboss.jandex.DotName;
import org.jboss.jandex.MethodInfo;

class DispatchingConfiguration {

    /**
     * name, event, EventDispatchingConfiguration
     */
    private final Map<String, Map<String, ActionDispatchingConfiguration>> actionConfigurations = new TreeMap<>();

    /**
     * class name, EventDispatchingMethod
     */
    private final Map<DotName, TreeSet<ActionDispatchingMethod>> methods = new TreeMap<>();

    Map<String, Map<String, ActionDispatchingConfiguration>> getActionConfigurations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    ActionDispatchingConfiguration getOrCreateActionConfiguration(String action, String event, String payloadType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Map<DotName, TreeSet<ActionDispatchingMethod>> getMethods() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    List<ActionDispatchingConfiguration> getActionDispatchingConfigurations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void addActionDispatchingMethod(ActionDispatchingMethod actionDispatchingMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static class ActionDispatchingConfiguration {

        private final String event;

        private final String payloadType;

        private final TreeMap<String, EventAnnotation> eventAnnotations = new TreeMap<>();

        ActionDispatchingConfiguration(String event, String payloadType) {
            this.event = event;
            this.payloadType = payloadType;
        }

        String getEvent() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        String getPayloadType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        TreeMap<String, EventAnnotation> getEventAnnotations() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        Set<EventAnnotationLiteral> getEventAnnotationLiterals() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        ActionDispatchingConfiguration addEventAnnotation(String action, AnnotationInstance annotationInstance, List<AnnotationValue> annotationValues) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    static class EventAnnotation implements Comparable<EventAnnotation> {

        private final DotName name;

        private final List<AnnotationValue> values;

        EventAnnotation(DotName name, List<AnnotationValue> values) {
            this.name = name;
            this.values = values;
        }

        DotName getName() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        List<AnnotationValue> getValues() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public int compareTo(EventAnnotation other) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    static class EventAnnotationLiteral {

        private final DotName name;

        // for now, we only support string attributes
        private final List<String> attributes;

        EventAnnotationLiteral(DotName name, List<String> attributes) {
            this.name = name;
            this.attributes = attributes;
        }

        DotName getName() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        List<String> getAttributes() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public boolean equals(Object obj) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public int hashCode() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    static class ActionDispatchingMethod implements Comparable<ActionDispatchingMethod> {

        private final String name;

        private final AnnotationInstance eventSubscriberInstance;

        private final MethodInfo method;

        ActionDispatchingMethod(String name, AnnotationInstance eventSubscriberInstance, MethodInfo method) {
            this.name = name;
            this.eventSubscriberInstance = eventSubscriberInstance;
            this.method = method;
        }

        String getName() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        AnnotationInstance getEventSubscriberInstance() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        MethodInfo getMethod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public int compareTo(ActionDispatchingMethod other) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
