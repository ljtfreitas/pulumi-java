// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs Empty = new AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs();

    /**
     * Specifies a fixed number of VM instances. This must be a positive
     * integer.
     * 
     */
    @Import(name="fixed")
      private final @Nullable Output<Integer> fixed;

    public Output<Integer> fixed() {
        return this.fixed == null ? Codegen.empty() : this.fixed;
    }

    /**
     * Specifies a percentage of instances between 0 to 100%, inclusive.
     * For example, specify 80 for 80%.
     * 
     */
    @Import(name="percent")
      private final @Nullable Output<Integer> percent;

    public Output<Integer> percent() {
        return this.percent == null ? Codegen.empty() : this.percent;
    }

    public AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs(
        @Nullable Output<Integer> fixed,
        @Nullable Output<Integer> percent) {
        this.fixed = fixed;
        this.percent = percent;
    }

    private AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs() {
        this.fixed = Codegen.empty();
        this.percent = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> fixed;
        private @Nullable Output<Integer> percent;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder fixed(@Nullable Output<Integer> fixed) {
            this.fixed = fixed;
            return this;
        }
        public Builder fixed(@Nullable Integer fixed) {
            this.fixed = Codegen.ofNullable(fixed);
            return this;
        }
        public Builder percent(@Nullable Output<Integer> percent) {
            this.percent = percent;
            return this;
        }
        public Builder percent(@Nullable Integer percent) {
            this.percent = Codegen.ofNullable(percent);
            return this;
        }        public AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs build() {
            return new AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs(fixed, percent);
        }
    }
}
