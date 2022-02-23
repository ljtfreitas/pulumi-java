// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorProvisionedCapacity {
    /**
     * Specifies how many MSK Connect Units (MCU) are allocated to the connector.
     * 
     */
    private final @Nullable Integer mcuCount;
    /**
     * Number of workers for a connector.
     * 
     */
    private final Integer workerCount;

    @OutputCustomType.Constructor({"mcuCount","workerCount"})
    private ConnectorProvisionedCapacity(
        @Nullable Integer mcuCount,
        Integer workerCount) {
        this.mcuCount = mcuCount;
        this.workerCount = Objects.requireNonNull(workerCount);
    }

    /**
     * Specifies how many MSK Connect Units (MCU) are allocated to the connector.
     * 
     */
    public Optional<Integer> getMcuCount() {
        return Optional.ofNullable(this.mcuCount);
    }
    /**
     * Number of workers for a connector.
     * 
     */
    public Integer getWorkerCount() {
        return this.workerCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProvisionedCapacity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer mcuCount;
        private Integer workerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProvisionedCapacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mcuCount = defaults.mcuCount;
    	      this.workerCount = defaults.workerCount;
        }

        public Builder setMcuCount(@Nullable Integer mcuCount) {
            this.mcuCount = mcuCount;
            return this;
        }

        public Builder setWorkerCount(Integer workerCount) {
            this.workerCount = Objects.requireNonNull(workerCount);
            return this;
        }
        public ConnectorProvisionedCapacity build() {
            return new ConnectorProvisionedCapacity(mcuCount, workerCount);
        }
    }
}
