// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigTargetNameServerArgs;
import java.util.List;
import java.util.Objects;


public final class ManagedZoneForwardingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneForwardingConfigArgs Empty = new ManagedZoneForwardingConfigArgs();

    /**
     * List of target name servers to forward to. Cloud DNS will
     * select the best available name server if more than
     * one target is given.
     * Structure is documented below.
     * 
     */
    @Import(name="targetNameServers", required=true)
      private final Output<List<ManagedZoneForwardingConfigTargetNameServerArgs>> targetNameServers;

    public Output<List<ManagedZoneForwardingConfigTargetNameServerArgs>> getTargetNameServers() {
        return this.targetNameServers;
    }

    public ManagedZoneForwardingConfigArgs(Output<List<ManagedZoneForwardingConfigTargetNameServerArgs>> targetNameServers) {
        this.targetNameServers = Objects.requireNonNull(targetNameServers, "expected parameter 'targetNameServers' to be non-null");
    }

    private ManagedZoneForwardingConfigArgs() {
        this.targetNameServers = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneForwardingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ManagedZoneForwardingConfigTargetNameServerArgs>> targetNameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneForwardingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetNameServers = defaults.targetNameServers;
        }

        public Builder targetNameServers(Output<List<ManagedZoneForwardingConfigTargetNameServerArgs>> targetNameServers) {
            this.targetNameServers = Objects.requireNonNull(targetNameServers);
            return this;
        }

        public Builder targetNameServers(List<ManagedZoneForwardingConfigTargetNameServerArgs> targetNameServers) {
            this.targetNameServers = Output.of(Objects.requireNonNull(targetNameServers));
            return this;
        }
        public ManagedZoneForwardingConfigArgs build() {
            return new ManagedZoneForwardingConfigArgs(targetNameServers);
        }
    }
}
