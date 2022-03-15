// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Display information of the operation.
 * 
 */
public final class OperationsDefinitionDisplayArgs extends io.pulumi.resources.ResourceArgs {

    public static final OperationsDefinitionDisplayArgs Empty = new OperationsDefinitionDisplayArgs();

    @Import(name="description", required=true)
      private final Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }

    @Import(name="operation", required=true)
      private final Output<String> operation;

    public Output<String> getOperation() {
        return this.operation;
    }

    @Import(name="provider", required=true)
      private final Output<String> provider;

    public Output<String> getProvider() {
        return this.provider;
    }

    @Import(name="resource", required=true)
      private final Output<String> resource;

    public Output<String> getResource() {
        return this.resource;
    }

    public OperationsDefinitionDisplayArgs(
        Output<String> description,
        Output<String> operation,
        Output<String> provider,
        Output<String> resource) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.operation = Objects.requireNonNull(operation, "expected parameter 'operation' to be non-null");
        this.provider = Objects.requireNonNull(provider, "expected parameter 'provider' to be non-null");
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
    }

    private OperationsDefinitionDisplayArgs() {
        this.description = Output.empty();
        this.operation = Output.empty();
        this.provider = Output.empty();
        this.resource = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationsDefinitionDisplayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> description;
        private Output<String> operation;
        private Output<String> provider;
        private Output<String> resource;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationsDefinitionDisplayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.operation = defaults.operation;
    	      this.provider = defaults.provider;
    	      this.resource = defaults.resource;
        }

        public Builder description(Output<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder description(String description) {
            this.description = Output.of(Objects.requireNonNull(description));
            return this;
        }

        public Builder operation(Output<String> operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder operation(String operation) {
            this.operation = Output.of(Objects.requireNonNull(operation));
            return this;
        }

        public Builder provider(Output<String> provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }

        public Builder provider(String provider) {
            this.provider = Output.of(Objects.requireNonNull(provider));
            return this;
        }

        public Builder resource(Output<String> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder resource(String resource) {
            this.resource = Output.of(Objects.requireNonNull(resource));
            return this;
        }
        public OperationsDefinitionDisplayArgs build() {
            return new OperationsDefinitionDisplayArgs(description, operation, provider, resource);
        }
    }
}
