// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceTemplateNetworkInterfaceAccessConfig {
    /**
     * The IP address that will be 1:1 mapped to the instance's
     * network ip. If not given, one will be generated.
     * 
     */
    private final @Nullable String natIp;
    /**
     * The service-level to be provided for IPv6 traffic when the
     * subnet has an external subnet. Only PREMIUM tier is valid for IPv6.
     * 
     */
    private final @Nullable String networkTier;
    private final @Nullable String publicPtrDomainName;

    @CustomType.Constructor
    private InstanceTemplateNetworkInterfaceAccessConfig(
        @CustomType.Parameter("natIp") @Nullable String natIp,
        @CustomType.Parameter("networkTier") @Nullable String networkTier,
        @CustomType.Parameter("publicPtrDomainName") @Nullable String publicPtrDomainName) {
        this.natIp = natIp;
        this.networkTier = networkTier;
        this.publicPtrDomainName = publicPtrDomainName;
    }

    /**
     * The IP address that will be 1:1 mapped to the instance's
     * network ip. If not given, one will be generated.
     * 
    */
    public Optional<String> getNatIp() {
        return Optional.ofNullable(this.natIp);
    }
    /**
     * The service-level to be provided for IPv6 traffic when the
     * subnet has an external subnet. Only PREMIUM tier is valid for IPv6.
     * 
    */
    public Optional<String> getNetworkTier() {
        return Optional.ofNullable(this.networkTier);
    }
    public Optional<String> getPublicPtrDomainName() {
        return Optional.ofNullable(this.publicPtrDomainName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateNetworkInterfaceAccessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String natIp;
        private @Nullable String networkTier;
        private @Nullable String publicPtrDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateNetworkInterfaceAccessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.natIp = defaults.natIp;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        public Builder natIp(@Nullable String natIp) {
            this.natIp = natIp;
            return this;
        }

        public Builder networkTier(@Nullable String networkTier) {
            this.networkTier = networkTier;
            return this;
        }

        public Builder publicPtrDomainName(@Nullable String publicPtrDomainName) {
            this.publicPtrDomainName = publicPtrDomainName;
            return this;
        }
        public InstanceTemplateNetworkInterfaceAccessConfig build() {
            return new InstanceTemplateNetworkInterfaceAccessConfig(natIp, networkTier, publicPtrDomainName);
        }
    }
}
