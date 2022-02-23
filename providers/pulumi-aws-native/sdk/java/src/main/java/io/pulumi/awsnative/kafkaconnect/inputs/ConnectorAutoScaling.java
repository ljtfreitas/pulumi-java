// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorScaleInPolicy;
import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorScaleOutPolicy;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Details about auto scaling of a connector.
 * 
 */
public final class ConnectorAutoScaling extends io.pulumi.resources.InvokeArgs {

    public static final ConnectorAutoScaling Empty = new ConnectorAutoScaling();

    /**
     * The maximum number of workers for a connector.
     * 
     */
    @InputImport(name="maxWorkerCount", required=true)
        private final Integer maxWorkerCount;

    public Integer getMaxWorkerCount() {
        return this.maxWorkerCount;
    }

    /**
     * Specifies how many MSK Connect Units (MCU) as the minimum scaling unit.
     * 
     */
    @InputImport(name="mcuCount", required=true)
        private final Integer mcuCount;

    public Integer getMcuCount() {
        return this.mcuCount;
    }

    /**
     * The minimum number of workers for a connector.
     * 
     */
    @InputImport(name="minWorkerCount", required=true)
        private final Integer minWorkerCount;

    public Integer getMinWorkerCount() {
        return this.minWorkerCount;
    }

    @InputImport(name="scaleInPolicy", required=true)
        private final ConnectorScaleInPolicy scaleInPolicy;

    public ConnectorScaleInPolicy getScaleInPolicy() {
        return this.scaleInPolicy;
    }

    @InputImport(name="scaleOutPolicy", required=true)
        private final ConnectorScaleOutPolicy scaleOutPolicy;

    public ConnectorScaleOutPolicy getScaleOutPolicy() {
        return this.scaleOutPolicy;
    }

    public ConnectorAutoScaling(
        Integer maxWorkerCount,
        Integer mcuCount,
        Integer minWorkerCount,
        ConnectorScaleInPolicy scaleInPolicy,
        ConnectorScaleOutPolicy scaleOutPolicy) {
        this.maxWorkerCount = Objects.requireNonNull(maxWorkerCount, "expected parameter 'maxWorkerCount' to be non-null");
        this.mcuCount = Objects.requireNonNull(mcuCount, "expected parameter 'mcuCount' to be non-null");
        this.minWorkerCount = Objects.requireNonNull(minWorkerCount, "expected parameter 'minWorkerCount' to be non-null");
        this.scaleInPolicy = Objects.requireNonNull(scaleInPolicy, "expected parameter 'scaleInPolicy' to be non-null");
        this.scaleOutPolicy = Objects.requireNonNull(scaleOutPolicy, "expected parameter 'scaleOutPolicy' to be non-null");
    }

    private ConnectorAutoScaling() {
        this.maxWorkerCount = null;
        this.mcuCount = null;
        this.minWorkerCount = null;
        this.scaleInPolicy = null;
        this.scaleOutPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorAutoScaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxWorkerCount;
        private Integer mcuCount;
        private Integer minWorkerCount;
        private ConnectorScaleInPolicy scaleInPolicy;
        private ConnectorScaleOutPolicy scaleOutPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorAutoScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxWorkerCount = defaults.maxWorkerCount;
    	      this.mcuCount = defaults.mcuCount;
    	      this.minWorkerCount = defaults.minWorkerCount;
    	      this.scaleInPolicy = defaults.scaleInPolicy;
    	      this.scaleOutPolicy = defaults.scaleOutPolicy;
        }

        public Builder setMaxWorkerCount(Integer maxWorkerCount) {
            this.maxWorkerCount = Objects.requireNonNull(maxWorkerCount);
            return this;
        }

        public Builder setMcuCount(Integer mcuCount) {
            this.mcuCount = Objects.requireNonNull(mcuCount);
            return this;
        }

        public Builder setMinWorkerCount(Integer minWorkerCount) {
            this.minWorkerCount = Objects.requireNonNull(minWorkerCount);
            return this;
        }

        public Builder setScaleInPolicy(ConnectorScaleInPolicy scaleInPolicy) {
            this.scaleInPolicy = Objects.requireNonNull(scaleInPolicy);
            return this;
        }

        public Builder setScaleOutPolicy(ConnectorScaleOutPolicy scaleOutPolicy) {
            this.scaleOutPolicy = Objects.requireNonNull(scaleOutPolicy);
            return this;
        }
        public ConnectorAutoScaling build() {
            return new ConnectorAutoScaling(maxWorkerCount, mcuCount, minWorkerCount, scaleInPolicy, scaleOutPolicy);
        }
    }
}
