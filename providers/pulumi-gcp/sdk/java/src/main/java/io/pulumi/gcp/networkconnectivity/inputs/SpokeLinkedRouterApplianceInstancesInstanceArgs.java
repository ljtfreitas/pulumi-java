// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpokeLinkedRouterApplianceInstancesInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpokeLinkedRouterApplianceInstancesInstanceArgs Empty = new SpokeLinkedRouterApplianceInstancesInstanceArgs();

    /**
     * The IP address on the VM to use for peering.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> ipAddress() {
        return this.ipAddress == null ? Codegen.empty() : this.ipAddress;
    }

    /**
     * The URI of the virtual machine resource
     * 
     */
    @Import(name="virtualMachine")
      private final @Nullable Output<String> virtualMachine;

    public Output<String> virtualMachine() {
        return this.virtualMachine == null ? Codegen.empty() : this.virtualMachine;
    }

    public SpokeLinkedRouterApplianceInstancesInstanceArgs(
        @Nullable Output<String> ipAddress,
        @Nullable Output<String> virtualMachine) {
        this.ipAddress = ipAddress;
        this.virtualMachine = virtualMachine;
    }

    private SpokeLinkedRouterApplianceInstancesInstanceArgs() {
        this.ipAddress = Codegen.empty();
        this.virtualMachine = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeLinkedRouterApplianceInstancesInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<String> virtualMachine;

        public Builder() {
    	      // Empty
        }

        public Builder(SpokeLinkedRouterApplianceInstancesInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.virtualMachine = defaults.virtualMachine;
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Codegen.ofNullable(ipAddress);
            return this;
        }
        public Builder virtualMachine(@Nullable Output<String> virtualMachine) {
            this.virtualMachine = virtualMachine;
            return this;
        }
        public Builder virtualMachine(@Nullable String virtualMachine) {
            this.virtualMachine = Codegen.ofNullable(virtualMachine);
            return this;
        }        public SpokeLinkedRouterApplianceInstancesInstanceArgs build() {
            return new SpokeLinkedRouterApplianceInstancesInstanceArgs(ipAddress, virtualMachine);
        }
    }
}
