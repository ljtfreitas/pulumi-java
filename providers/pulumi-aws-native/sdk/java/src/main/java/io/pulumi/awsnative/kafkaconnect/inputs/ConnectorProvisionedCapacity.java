// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details about a fixed capacity allocated to a connector.
 * 
 */
public final class ConnectorProvisionedCapacity extends io.pulumi.resources.InvokeArgs {

    public static final ConnectorProvisionedCapacity Empty = new ConnectorProvisionedCapacity();

    /**
     * Specifies how many MSK Connect Units (MCU) are allocated to the connector.
     * 
     */
    @InputImport(name="mcuCount")
        private final @Nullable Integer mcuCount;

    public Optional<Integer> getMcuCount() {
        return this.mcuCount == null ? Optional.empty() : Optional.ofNullable(this.mcuCount);
    }

    /**
     * Number of workers for a connector.
     * 
     */
    @InputImport(name="workerCount", required=true)
        private final Integer workerCount;

    public Integer getWorkerCount() {
        return this.workerCount;
    }

    public ConnectorProvisionedCapacity(
        @Nullable Integer mcuCount,
        Integer workerCount) {
        this.mcuCount = mcuCount;
        this.workerCount = Objects.requireNonNull(workerCount, "expected parameter 'workerCount' to be non-null");
    }

    private ConnectorProvisionedCapacity() {
        this.mcuCount = null;
        this.workerCount = null;
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
