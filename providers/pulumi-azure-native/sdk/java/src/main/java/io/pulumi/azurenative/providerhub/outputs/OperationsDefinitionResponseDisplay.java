// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OperationsDefinitionResponseDisplay {
    private final String description;
    private final String operation;
    private final String provider;
    private final String resource;

    @OutputCustomType.Constructor({"description","operation","provider","resource"})
    private OperationsDefinitionResponseDisplay(
        String description,
        String operation,
        String provider,
        String resource) {
        this.description = Objects.requireNonNull(description);
        this.operation = Objects.requireNonNull(operation);
        this.provider = Objects.requireNonNull(provider);
        this.resource = Objects.requireNonNull(resource);
    }

    public String getDescription() {
        return this.description;
    }
    public String getOperation() {
        return this.operation;
    }
    public String getProvider() {
        return this.provider;
    }
    public String getResource() {
        return this.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationsDefinitionResponseDisplay defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String operation;
        private String provider;
        private String resource;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationsDefinitionResponseDisplay defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.operation = defaults.operation;
    	      this.provider = defaults.provider;
    	      this.resource = defaults.resource;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setOperation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder setProvider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }

        public Builder setResource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        public OperationsDefinitionResponseDisplay build() {
            return new OperationsDefinitionResponseDisplay(description, operation, provider, resource);
        }
    }
}
