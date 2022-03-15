// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.SlsaCompletenessArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Other properties of the build.
 * 
 */
public final class SlsaMetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final SlsaMetadataArgs Empty = new SlsaMetadataArgs();

    /**
     * The timestamp of when the build completed.
     * 
     */
    @Import(name="buildFinishedOn")
      private final @Nullable Output<String> buildFinishedOn;

    public Output<String> getBuildFinishedOn() {
        return this.buildFinishedOn == null ? Output.empty() : this.buildFinishedOn;
    }

    /**
     * Identifies the particular build invocation, which can be useful for finding associated logs or other ad-hoc analysis. The value SHOULD be globally unique, per in-toto Provenance spec.
     * 
     */
    @Import(name="buildInvocationId")
      private final @Nullable Output<String> buildInvocationId;

    public Output<String> getBuildInvocationId() {
        return this.buildInvocationId == null ? Output.empty() : this.buildInvocationId;
    }

    /**
     * The timestamp of when the build started.
     * 
     */
    @Import(name="buildStartedOn")
      private final @Nullable Output<String> buildStartedOn;

    public Output<String> getBuildStartedOn() {
        return this.buildStartedOn == null ? Output.empty() : this.buildStartedOn;
    }

    /**
     * Indicates that the builder claims certain fields in this message to be complete.
     * 
     */
    @Import(name="completeness")
      private final @Nullable Output<SlsaCompletenessArgs> completeness;

    public Output<SlsaCompletenessArgs> getCompleteness() {
        return this.completeness == null ? Output.empty() : this.completeness;
    }

    /**
     * If true, the builder claims that running the recipe on materials will produce bit-for-bit identical output.
     * 
     */
    @Import(name="reproducible")
      private final @Nullable Output<Boolean> reproducible;

    public Output<Boolean> getReproducible() {
        return this.reproducible == null ? Output.empty() : this.reproducible;
    }

    public SlsaMetadataArgs(
        @Nullable Output<String> buildFinishedOn,
        @Nullable Output<String> buildInvocationId,
        @Nullable Output<String> buildStartedOn,
        @Nullable Output<SlsaCompletenessArgs> completeness,
        @Nullable Output<Boolean> reproducible) {
        this.buildFinishedOn = buildFinishedOn;
        this.buildInvocationId = buildInvocationId;
        this.buildStartedOn = buildStartedOn;
        this.completeness = completeness;
        this.reproducible = reproducible;
    }

    private SlsaMetadataArgs() {
        this.buildFinishedOn = Output.empty();
        this.buildInvocationId = Output.empty();
        this.buildStartedOn = Output.empty();
        this.completeness = Output.empty();
        this.reproducible = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlsaMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> buildFinishedOn;
        private @Nullable Output<String> buildInvocationId;
        private @Nullable Output<String> buildStartedOn;
        private @Nullable Output<SlsaCompletenessArgs> completeness;
        private @Nullable Output<Boolean> reproducible;

        public Builder() {
    	      // Empty
        }

        public Builder(SlsaMetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildFinishedOn = defaults.buildFinishedOn;
    	      this.buildInvocationId = defaults.buildInvocationId;
    	      this.buildStartedOn = defaults.buildStartedOn;
    	      this.completeness = defaults.completeness;
    	      this.reproducible = defaults.reproducible;
        }

        public Builder buildFinishedOn(@Nullable Output<String> buildFinishedOn) {
            this.buildFinishedOn = buildFinishedOn;
            return this;
        }

        public Builder buildFinishedOn(@Nullable String buildFinishedOn) {
            this.buildFinishedOn = Output.ofNullable(buildFinishedOn);
            return this;
        }

        public Builder buildInvocationId(@Nullable Output<String> buildInvocationId) {
            this.buildInvocationId = buildInvocationId;
            return this;
        }

        public Builder buildInvocationId(@Nullable String buildInvocationId) {
            this.buildInvocationId = Output.ofNullable(buildInvocationId);
            return this;
        }

        public Builder buildStartedOn(@Nullable Output<String> buildStartedOn) {
            this.buildStartedOn = buildStartedOn;
            return this;
        }

        public Builder buildStartedOn(@Nullable String buildStartedOn) {
            this.buildStartedOn = Output.ofNullable(buildStartedOn);
            return this;
        }

        public Builder completeness(@Nullable Output<SlsaCompletenessArgs> completeness) {
            this.completeness = completeness;
            return this;
        }

        public Builder completeness(@Nullable SlsaCompletenessArgs completeness) {
            this.completeness = Output.ofNullable(completeness);
            return this;
        }

        public Builder reproducible(@Nullable Output<Boolean> reproducible) {
            this.reproducible = reproducible;
            return this;
        }

        public Builder reproducible(@Nullable Boolean reproducible) {
            this.reproducible = Output.ofNullable(reproducible);
            return this;
        }
        public SlsaMetadataArgs build() {
            return new SlsaMetadataArgs(buildFinishedOn, buildInvocationId, buildStartedOn, completeness, reproducible);
        }
    }
}
