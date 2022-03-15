// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageNetworkInterfaceAccessConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageNetworkInterfaceAccessConfigGetArgs Empty = new InstanceFromMachineImageNetworkInterfaceAccessConfigGetArgs();

    @Import(name="natIp")
      private final @Nullable Output<String> natIp;

    public Output<String> getNatIp() {
        return this.natIp == null ? Output.empty() : this.natIp;
    }

    @Import(name="networkTier")
      private final @Nullable Output<String> networkTier;

    public Output<String> getNetworkTier() {
        return this.networkTier == null ? Output.empty() : this.networkTier;
    }

    @Import(name="publicPtrDomainName")
      private final @Nullable Output<String> publicPtrDomainName;

    public Output<String> getPublicPtrDomainName() {
        return this.publicPtrDomainName == null ? Output.empty() : this.publicPtrDomainName;
    }

    public InstanceFromMachineImageNetworkInterfaceAccessConfigGetArgs(
        @Nullable Output<String> natIp,
        @Nullable Output<String> networkTier,
        @Nullable Output<String> publicPtrDomainName) {
        this.natIp = natIp;
        this.networkTier = networkTier;
        this.publicPtrDomainName = publicPtrDomainName;
    }

    private InstanceFromMachineImageNetworkInterfaceAccessConfigGetArgs() {
        this.natIp = Output.empty();
        this.networkTier = Output.empty();
        this.publicPtrDomainName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageNetworkInterfaceAccessConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> natIp;
        private @Nullable Output<String> networkTier;
        private @Nullable Output<String> publicPtrDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageNetworkInterfaceAccessConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.natIp = defaults.natIp;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        public Builder natIp(@Nullable Output<String> natIp) {
            this.natIp = natIp;
            return this;
        }

        public Builder natIp(@Nullable String natIp) {
            this.natIp = Output.ofNullable(natIp);
            return this;
        }

        public Builder networkTier(@Nullable Output<String> networkTier) {
            this.networkTier = networkTier;
            return this;
        }

        public Builder networkTier(@Nullable String networkTier) {
            this.networkTier = Output.ofNullable(networkTier);
            return this;
        }

        public Builder publicPtrDomainName(@Nullable Output<String> publicPtrDomainName) {
            this.publicPtrDomainName = publicPtrDomainName;
            return this;
        }

        public Builder publicPtrDomainName(@Nullable String publicPtrDomainName) {
            this.publicPtrDomainName = Output.ofNullable(publicPtrDomainName);
            return this;
        }
        public InstanceFromMachineImageNetworkInterfaceAccessConfigGetArgs build() {
            return new InstanceFromMachineImageNetworkInterfaceAccessConfigGetArgs(natIp, networkTier, publicPtrDomainName);
        }
    }
}
