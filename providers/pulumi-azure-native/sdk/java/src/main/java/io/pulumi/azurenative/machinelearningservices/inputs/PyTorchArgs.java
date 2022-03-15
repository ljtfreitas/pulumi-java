// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PyTorch distribution configuration.
 * 
 */
public final class PyTorchArgs extends io.pulumi.resources.ResourceArgs {

    public static final PyTorchArgs Empty = new PyTorchArgs();

    /**
     * Enum to determine the job distribution type.
     * Expected value is 'PyTorch'.
     * 
     */
    @Import(name="distributionType", required=true)
      private final Output<String> distributionType;

    public Output<String> getDistributionType() {
        return this.distributionType;
    }

    /**
     * Total process count for the distributed job.
     * 
     */
    @Import(name="processCount")
      private final @Nullable Output<Integer> processCount;

    public Output<Integer> getProcessCount() {
        return this.processCount == null ? Output.empty() : this.processCount;
    }

    public PyTorchArgs(
        Output<String> distributionType,
        @Nullable Output<Integer> processCount) {
        this.distributionType = Objects.requireNonNull(distributionType, "expected parameter 'distributionType' to be non-null");
        this.processCount = processCount;
    }

    private PyTorchArgs() {
        this.distributionType = Output.empty();
        this.processCount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PyTorchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> distributionType;
        private @Nullable Output<Integer> processCount;

        public Builder() {
    	      // Empty
        }

        public Builder(PyTorchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionType = defaults.distributionType;
    	      this.processCount = defaults.processCount;
        }

        public Builder distributionType(Output<String> distributionType) {
            this.distributionType = Objects.requireNonNull(distributionType);
            return this;
        }

        public Builder distributionType(String distributionType) {
            this.distributionType = Output.of(Objects.requireNonNull(distributionType));
            return this;
        }

        public Builder processCount(@Nullable Output<Integer> processCount) {
            this.processCount = processCount;
            return this;
        }

        public Builder processCount(@Nullable Integer processCount) {
            this.processCount = Output.ofNullable(processCount);
            return this;
        }
        public PyTorchArgs build() {
            return new PyTorchArgs(distributionType, processCount);
        }
    }
}
