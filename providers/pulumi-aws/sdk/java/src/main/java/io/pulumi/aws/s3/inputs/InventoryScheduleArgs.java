// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InventoryScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final InventoryScheduleArgs Empty = new InventoryScheduleArgs();

    /**
     * Specifies how frequently inventory results are produced. Valid values: `Daily`, `Weekly`.
     * 
     */
    @Import(name="frequency", required=true)
      private final Output<String> frequency;

    public Output<String> getFrequency() {
        return this.frequency;
    }

    public InventoryScheduleArgs(Output<String> frequency) {
        this.frequency = Objects.requireNonNull(frequency, "expected parameter 'frequency' to be non-null");
    }

    private InventoryScheduleArgs() {
        this.frequency = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> frequency;

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
        }

        public Builder frequency(Output<String> frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }

        public Builder frequency(String frequency) {
            this.frequency = Output.of(Objects.requireNonNull(frequency));
            return this;
        }
        public InventoryScheduleArgs build() {
            return new InventoryScheduleArgs(frequency);
        }
    }
}
