// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceTemplateNetworkInterfaceAccessConfig {
    private final String natIp;
    private final String networkTier;
    private final String publicPtrDomainName;

    @OutputCustomType.Constructor({"natIp","networkTier","publicPtrDomainName"})
    private GetInstanceTemplateNetworkInterfaceAccessConfig(
        String natIp,
        String networkTier,
        String publicPtrDomainName) {
        this.natIp = Objects.requireNonNull(natIp);
        this.networkTier = Objects.requireNonNull(networkTier);
        this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName);
    }

    public String getNatIp() {
        return this.natIp;
    }
    public String getNetworkTier() {
        return this.networkTier;
    }
    public String getPublicPtrDomainName() {
        return this.publicPtrDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateNetworkInterfaceAccessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String natIp;
        private String networkTier;
        private String publicPtrDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateNetworkInterfaceAccessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.natIp = defaults.natIp;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        public Builder setNatIp(String natIp) {
            this.natIp = Objects.requireNonNull(natIp);
            return this;
        }

        public Builder setNetworkTier(String networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }

        public Builder setPublicPtrDomainName(String publicPtrDomainName) {
            this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName);
            return this;
        }

        public GetInstanceTemplateNetworkInterfaceAccessConfig build() {
            return new GetInstanceTemplateNetworkInterfaceAccessConfig(natIp, networkTier, publicPtrDomainName);
        }
    }
}