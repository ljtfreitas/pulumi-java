// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A set of Confidential Instance options.
 * 
 */
public final class ConfidentialInstanceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfidentialInstanceConfigArgs Empty = new ConfidentialInstanceConfigArgs();

    /**
     * Defines whether the instance should have confidential compute enabled.
     * 
     */
    @Import(name="enableConfidentialCompute")
      private final @Nullable Output<Boolean> enableConfidentialCompute;

    public Output<Boolean> getEnableConfidentialCompute() {
        return this.enableConfidentialCompute == null ? Output.empty() : this.enableConfidentialCompute;
    }

    public ConfidentialInstanceConfigArgs(@Nullable Output<Boolean> enableConfidentialCompute) {
        this.enableConfidentialCompute = enableConfidentialCompute;
    }

    private ConfidentialInstanceConfigArgs() {
        this.enableConfidentialCompute = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfidentialInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableConfidentialCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfidentialInstanceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
        }

        public Builder enableConfidentialCompute(@Nullable Output<Boolean> enableConfidentialCompute) {
            this.enableConfidentialCompute = enableConfidentialCompute;
            return this;
        }

        public Builder enableConfidentialCompute(@Nullable Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = Output.ofNullable(enableConfidentialCompute);
            return this;
        }
        public ConfidentialInstanceConfigArgs build() {
            return new ConfidentialInstanceConfigArgs(enableConfidentialCompute);
        }
    }
}
