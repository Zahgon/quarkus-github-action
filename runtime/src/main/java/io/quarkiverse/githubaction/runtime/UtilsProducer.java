package io.quarkiverse.githubaction.runtime;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Qualifier;
import jakarta.inject.Singleton;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

@Singleton
public class UtilsProducer {

    @Produces
    @Singleton
    @Yaml
    public ObjectMapper yamlObjectMapper() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Target({ METHOD, FIELD, PARAMETER, TYPE })
    @Retention(RUNTIME)
    @Documented
    @Qualifier
    public @interface Yaml {
    }
}
