// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Indicates that the builder claims certain fields in this message to be complete.
 * 
 */
public final class SlsaCompletenessArgs extends io.pulumi.resources.ResourceArgs {

    public static final SlsaCompletenessArgs Empty = new SlsaCompletenessArgs();

    /**
     * If true, the builder claims that recipe.arguments is complete, meaning that all external inputs are properly captured in the recipe.
     * 
     */
    @Import(name="arguments")
      private final @Nullable Output<Boolean> arguments;

    public Output<Boolean> getArguments() {
        return this.arguments == null ? Output.empty() : this.arguments;
    }

    /**
     * If true, the builder claims that recipe.environment is claimed to be complete.
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<Boolean> environment;

    public Output<Boolean> getEnvironment() {
        return this.environment == null ? Output.empty() : this.environment;
    }

    /**
     * If true, the builder claims that materials are complete, usually through some controls to prevent network access. Sometimes called "hermetic".
     * 
     */
    @Import(name="materials")
      private final @Nullable Output<Boolean> materials;

    public Output<Boolean> getMaterials() {
        return this.materials == null ? Output.empty() : this.materials;
    }

    public SlsaCompletenessArgs(
        @Nullable Output<Boolean> arguments,
        @Nullable Output<Boolean> environment,
        @Nullable Output<Boolean> materials) {
        this.arguments = arguments;
        this.environment = environment;
        this.materials = materials;
    }

    private SlsaCompletenessArgs() {
        this.arguments = Output.empty();
        this.environment = Output.empty();
        this.materials = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlsaCompletenessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> arguments;
        private @Nullable Output<Boolean> environment;
        private @Nullable Output<Boolean> materials;

        public Builder() {
    	      // Empty
        }

        public Builder(SlsaCompletenessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.environment = defaults.environment;
    	      this.materials = defaults.materials;
        }

        public Builder arguments(@Nullable Output<Boolean> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder arguments(@Nullable Boolean arguments) {
            this.arguments = Output.ofNullable(arguments);
            return this;
        }

        public Builder environment(@Nullable Output<Boolean> environment) {
            this.environment = environment;
            return this;
        }

        public Builder environment(@Nullable Boolean environment) {
            this.environment = Output.ofNullable(environment);
            return this;
        }

        public Builder materials(@Nullable Output<Boolean> materials) {
            this.materials = materials;
            return this;
        }

        public Builder materials(@Nullable Boolean materials) {
            this.materials = Output.ofNullable(materials);
            return this;
        }
        public SlsaCompletenessArgs build() {
            return new SlsaCompletenessArgs(arguments, environment, materials);
        }
    }
}
