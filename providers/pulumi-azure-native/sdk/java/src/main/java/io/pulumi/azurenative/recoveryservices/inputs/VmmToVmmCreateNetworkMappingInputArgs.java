// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Create network mappings input properties/behavior specific to vmm to vmm Network mapping.
 * 
 */
public final class VmmToVmmCreateNetworkMappingInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmmToVmmCreateNetworkMappingInputArgs Empty = new VmmToVmmCreateNetworkMappingInputArgs();

    /**
     * The instance type.
     * Expected value is 'VmmToVmm'.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Output.empty() : this.instanceType;
    }

    public VmmToVmmCreateNetworkMappingInputArgs(@Nullable Output<String> instanceType) {
        this.instanceType = instanceType;
    }

    private VmmToVmmCreateNetworkMappingInputArgs() {
        this.instanceType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmmToVmmCreateNetworkMappingInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceType;

        public Builder() {
    	      // Empty
        }

        public Builder(VmmToVmmCreateNetworkMappingInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Output.ofNullable(instanceType);
            return this;
        }
        public VmmToVmmCreateNetworkMappingInputArgs build() {
            return new VmmToVmmCreateNetworkMappingInputArgs(instanceType);
        }
    }
}
