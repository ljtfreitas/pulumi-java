// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ObjectReferenceDefinitionResponse {
    /**
     * Name of the object
     * 
     */
    private final @Nullable String name;
    /**
     * Namespace of the object
     * 
     */
    private final @Nullable String namespace;

    @OutputCustomType.Constructor({"name","namespace"})
    private ObjectReferenceDefinitionResponse(
        @Nullable String name,
        @Nullable String namespace) {
        this.name = name;
        this.namespace = namespace;
    }

    /**
     * Name of the object
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Namespace of the object
     * 
     */
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectReferenceDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectReferenceDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public ObjectReferenceDefinitionResponse build() {
            return new ObjectReferenceDefinitionResponse(name, namespace);
        }
    }
}
