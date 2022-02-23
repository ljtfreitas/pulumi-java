// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.outputs;

import io.pulumi.awsnative.dynamodb.outputs.GlobalTableCapacityAutoScalingSettings;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GlobalTableReadProvisionedThroughputSettings {
    private final @Nullable GlobalTableCapacityAutoScalingSettings readCapacityAutoScalingSettings;
    private final @Nullable Integer readCapacityUnits;

    @OutputCustomType.Constructor({"readCapacityAutoScalingSettings","readCapacityUnits"})
    private GlobalTableReadProvisionedThroughputSettings(
        @Nullable GlobalTableCapacityAutoScalingSettings readCapacityAutoScalingSettings,
        @Nullable Integer readCapacityUnits) {
        this.readCapacityAutoScalingSettings = readCapacityAutoScalingSettings;
        this.readCapacityUnits = readCapacityUnits;
    }

    public Optional<GlobalTableCapacityAutoScalingSettings> getReadCapacityAutoScalingSettings() {
        return Optional.ofNullable(this.readCapacityAutoScalingSettings);
    }
    public Optional<Integer> getReadCapacityUnits() {
        return Optional.ofNullable(this.readCapacityUnits);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableReadProvisionedThroughputSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GlobalTableCapacityAutoScalingSettings readCapacityAutoScalingSettings;
        private @Nullable Integer readCapacityUnits;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableReadProvisionedThroughputSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readCapacityAutoScalingSettings = defaults.readCapacityAutoScalingSettings;
    	      this.readCapacityUnits = defaults.readCapacityUnits;
        }

        public Builder setReadCapacityAutoScalingSettings(@Nullable GlobalTableCapacityAutoScalingSettings readCapacityAutoScalingSettings) {
            this.readCapacityAutoScalingSettings = readCapacityAutoScalingSettings;
            return this;
        }

        public Builder setReadCapacityUnits(@Nullable Integer readCapacityUnits) {
            this.readCapacityUnits = readCapacityUnits;
            return this;
        }
        public GlobalTableReadProvisionedThroughputSettings build() {
            return new GlobalTableReadProvisionedThroughputSettings(readCapacityAutoScalingSettings, readCapacityUnits);
        }
    }
}
