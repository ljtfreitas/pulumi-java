// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.awsnative.dynamodb.inputs.GlobalTableCapacityAutoScalingSettings;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalTableWriteProvisionedThroughputSettings extends io.pulumi.resources.InvokeArgs {

    public static final GlobalTableWriteProvisionedThroughputSettings Empty = new GlobalTableWriteProvisionedThroughputSettings();

    @InputImport(name="writeCapacityAutoScalingSettings")
        private final @Nullable GlobalTableCapacityAutoScalingSettings writeCapacityAutoScalingSettings;

    public Optional<GlobalTableCapacityAutoScalingSettings> getWriteCapacityAutoScalingSettings() {
        return this.writeCapacityAutoScalingSettings == null ? Optional.empty() : Optional.ofNullable(this.writeCapacityAutoScalingSettings);
    }

    public GlobalTableWriteProvisionedThroughputSettings(@Nullable GlobalTableCapacityAutoScalingSettings writeCapacityAutoScalingSettings) {
        this.writeCapacityAutoScalingSettings = writeCapacityAutoScalingSettings;
    }

    private GlobalTableWriteProvisionedThroughputSettings() {
        this.writeCapacityAutoScalingSettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableWriteProvisionedThroughputSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GlobalTableCapacityAutoScalingSettings writeCapacityAutoScalingSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableWriteProvisionedThroughputSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.writeCapacityAutoScalingSettings = defaults.writeCapacityAutoScalingSettings;
        }

        public Builder setWriteCapacityAutoScalingSettings(@Nullable GlobalTableCapacityAutoScalingSettings writeCapacityAutoScalingSettings) {
            this.writeCapacityAutoScalingSettings = writeCapacityAutoScalingSettings;
            return this;
        }
        public GlobalTableWriteProvisionedThroughputSettings build() {
            return new GlobalTableWriteProvisionedThroughputSettings(writeCapacityAutoScalingSettings);
        }
    }
}
