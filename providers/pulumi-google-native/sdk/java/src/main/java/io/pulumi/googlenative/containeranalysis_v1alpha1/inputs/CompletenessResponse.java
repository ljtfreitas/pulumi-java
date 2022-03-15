// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Indicates that the builder claims certain fields in this message to be complete.
 * 
 */
public final class CompletenessResponse extends io.pulumi.resources.InvokeArgs {

    public static final CompletenessResponse Empty = new CompletenessResponse();

    /**
     * If true, the builder claims that recipe.arguments is complete, meaning that all external inputs are properly captured in the recipe.
     * 
     */
    @Import(name="arguments", required=true)
      private final Boolean arguments;

    public Boolean getArguments() {
        return this.arguments;
    }

    /**
     * If true, the builder claims that recipe.environment is claimed to be complete.
     * 
     */
    @Import(name="environment", required=true)
      private final Boolean environment;

    public Boolean getEnvironment() {
        return this.environment;
    }

    /**
     * If true, the builder claims that materials are complete, usually through some controls to prevent network access. Sometimes called "hermetic".
     * 
     */
    @Import(name="materials", required=true)
      private final Boolean materials;

    public Boolean getMaterials() {
        return this.materials;
    }

    public CompletenessResponse(
        Boolean arguments,
        Boolean environment,
        Boolean materials) {
        this.arguments = Objects.requireNonNull(arguments, "expected parameter 'arguments' to be non-null");
        this.environment = Objects.requireNonNull(environment, "expected parameter 'environment' to be non-null");
        this.materials = Objects.requireNonNull(materials, "expected parameter 'materials' to be non-null");
    }

    private CompletenessResponse() {
        this.arguments = null;
        this.environment = null;
        this.materials = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompletenessResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean arguments;
        private Boolean environment;
        private Boolean materials;

        public Builder() {
    	      // Empty
        }

        public Builder(CompletenessResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.environment = defaults.environment;
    	      this.materials = defaults.materials;
        }

        public Builder arguments(Boolean arguments) {
            this.arguments = Objects.requireNonNull(arguments);
            return this;
        }

        public Builder environment(Boolean environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder materials(Boolean materials) {
            this.materials = Objects.requireNonNull(materials);
            return this;
        }
        public CompletenessResponse build() {
            return new CompletenessResponse(arguments, environment, materials);
        }
    }
}
