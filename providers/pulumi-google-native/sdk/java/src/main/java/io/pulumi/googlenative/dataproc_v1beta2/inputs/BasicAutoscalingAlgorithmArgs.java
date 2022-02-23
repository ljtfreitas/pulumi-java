// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.BasicYarnAutoscalingConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Basic algorithm for autoscaling.
 * 
 */
public final class BasicAutoscalingAlgorithmArgs extends io.pulumi.resources.ResourceArgs {

    public static final BasicAutoscalingAlgorithmArgs Empty = new BasicAutoscalingAlgorithmArgs();

    /**
     * Optional. Duration between scaling events. A scaling period starts after the update operation from the previous event has completed.Bounds: 2m, 1d. Default: 2m.
     * 
     */
    @InputImport(name="cooldownPeriod")
      private final @Nullable Input<String> cooldownPeriod;

    public Input<String> getCooldownPeriod() {
        return this.cooldownPeriod == null ? Input.empty() : this.cooldownPeriod;
    }

    /**
     * Optional. YARN autoscaling configuration.
     * 
     */
    @InputImport(name="yarnConfig")
      private final @Nullable Input<BasicYarnAutoscalingConfigArgs> yarnConfig;

    public Input<BasicYarnAutoscalingConfigArgs> getYarnConfig() {
        return this.yarnConfig == null ? Input.empty() : this.yarnConfig;
    }

    public BasicAutoscalingAlgorithmArgs(
        @Nullable Input<String> cooldownPeriod,
        @Nullable Input<BasicYarnAutoscalingConfigArgs> yarnConfig) {
        this.cooldownPeriod = cooldownPeriod;
        this.yarnConfig = yarnConfig;
    }

    private BasicAutoscalingAlgorithmArgs() {
        this.cooldownPeriod = Input.empty();
        this.yarnConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicAutoscalingAlgorithmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cooldownPeriod;
        private @Nullable Input<BasicYarnAutoscalingConfigArgs> yarnConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicAutoscalingAlgorithmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldownPeriod = defaults.cooldownPeriod;
    	      this.yarnConfig = defaults.yarnConfig;
        }

        public Builder setCooldownPeriod(@Nullable Input<String> cooldownPeriod) {
            this.cooldownPeriod = cooldownPeriod;
            return this;
        }

        public Builder setCooldownPeriod(@Nullable String cooldownPeriod) {
            this.cooldownPeriod = Input.ofNullable(cooldownPeriod);
            return this;
        }

        public Builder setYarnConfig(@Nullable Input<BasicYarnAutoscalingConfigArgs> yarnConfig) {
            this.yarnConfig = yarnConfig;
            return this;
        }

        public Builder setYarnConfig(@Nullable BasicYarnAutoscalingConfigArgs yarnConfig) {
            this.yarnConfig = Input.ofNullable(yarnConfig);
            return this;
        }
        public BasicAutoscalingAlgorithmArgs build() {
            return new BasicAutoscalingAlgorithmArgs(cooldownPeriod, yarnConfig);
        }
    }
}
