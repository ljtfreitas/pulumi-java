// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.timestreamwrite.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class TableRetentionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableRetentionPropertiesArgs Empty = new TableRetentionPropertiesArgs();

    /**
     * The duration for which data must be stored in the magnetic store. Minimum value of 1. Maximum value of 73000.
     * 
     */
    @InputImport(name="magneticStoreRetentionPeriodInDays", required=true)
    private final Input<Integer> magneticStoreRetentionPeriodInDays;

    public Input<Integer> getMagneticStoreRetentionPeriodInDays() {
        return this.magneticStoreRetentionPeriodInDays;
    }

    /**
     * The duration for which data must be stored in the memory store. Minimum value of 1. Maximum value of 8766.
     * 
     */
    @InputImport(name="memoryStoreRetentionPeriodInHours", required=true)
    private final Input<Integer> memoryStoreRetentionPeriodInHours;

    public Input<Integer> getMemoryStoreRetentionPeriodInHours() {
        return this.memoryStoreRetentionPeriodInHours;
    }

    public TableRetentionPropertiesArgs(
        Input<Integer> magneticStoreRetentionPeriodInDays,
        Input<Integer> memoryStoreRetentionPeriodInHours) {
        this.magneticStoreRetentionPeriodInDays = Objects.requireNonNull(magneticStoreRetentionPeriodInDays, "expected parameter 'magneticStoreRetentionPeriodInDays' to be non-null");
        this.memoryStoreRetentionPeriodInHours = Objects.requireNonNull(memoryStoreRetentionPeriodInHours, "expected parameter 'memoryStoreRetentionPeriodInHours' to be non-null");
    }

    private TableRetentionPropertiesArgs() {
        this.magneticStoreRetentionPeriodInDays = Input.empty();
        this.memoryStoreRetentionPeriodInHours = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableRetentionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> magneticStoreRetentionPeriodInDays;
        private Input<Integer> memoryStoreRetentionPeriodInHours;

        public Builder() {
    	      // Empty
        }

        public Builder(TableRetentionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.magneticStoreRetentionPeriodInDays = defaults.magneticStoreRetentionPeriodInDays;
    	      this.memoryStoreRetentionPeriodInHours = defaults.memoryStoreRetentionPeriodInHours;
        }

        public Builder setMagneticStoreRetentionPeriodInDays(Input<Integer> magneticStoreRetentionPeriodInDays) {
            this.magneticStoreRetentionPeriodInDays = Objects.requireNonNull(magneticStoreRetentionPeriodInDays);
            return this;
        }

        public Builder setMagneticStoreRetentionPeriodInDays(Integer magneticStoreRetentionPeriodInDays) {
            this.magneticStoreRetentionPeriodInDays = Input.of(Objects.requireNonNull(magneticStoreRetentionPeriodInDays));
            return this;
        }

        public Builder setMemoryStoreRetentionPeriodInHours(Input<Integer> memoryStoreRetentionPeriodInHours) {
            this.memoryStoreRetentionPeriodInHours = Objects.requireNonNull(memoryStoreRetentionPeriodInHours);
            return this;
        }

        public Builder setMemoryStoreRetentionPeriodInHours(Integer memoryStoreRetentionPeriodInHours) {
            this.memoryStoreRetentionPeriodInHours = Input.of(Objects.requireNonNull(memoryStoreRetentionPeriodInHours));
            return this;
        }
        public TableRetentionPropertiesArgs build() {
            return new TableRetentionPropertiesArgs(magneticStoreRetentionPeriodInDays, memoryStoreRetentionPeriodInHours);
        }
    }
}
