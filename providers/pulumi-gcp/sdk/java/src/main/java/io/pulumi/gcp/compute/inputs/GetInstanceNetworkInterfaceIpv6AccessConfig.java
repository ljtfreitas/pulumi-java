// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceNetworkInterfaceIpv6AccessConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceNetworkInterfaceIpv6AccessConfig Empty = new GetInstanceNetworkInterfaceIpv6AccessConfig();

    @Import(name="externalIpv6", required=true)
      private final String externalIpv6;

    public String getExternalIpv6() {
        return this.externalIpv6;
    }

    @Import(name="externalIpv6PrefixLength", required=true)
      private final String externalIpv6PrefixLength;

    public String getExternalIpv6PrefixLength() {
        return this.externalIpv6PrefixLength;
    }

    /**
     * The [networking tier][network-tier] used for configuring this instance. One of `PREMIUM` or `STANDARD`.
     * 
     */
    @Import(name="networkTier", required=true)
      private final String networkTier;

    public String getNetworkTier() {
        return this.networkTier;
    }

    /**
     * The DNS domain name for the public PTR record.
     * 
     */
    @Import(name="publicPtrDomainName", required=true)
      private final String publicPtrDomainName;

    public String getPublicPtrDomainName() {
        return this.publicPtrDomainName;
    }

    public GetInstanceNetworkInterfaceIpv6AccessConfig(
        String externalIpv6,
        String externalIpv6PrefixLength,
        String networkTier,
        String publicPtrDomainName) {
        this.externalIpv6 = Objects.requireNonNull(externalIpv6, "expected parameter 'externalIpv6' to be non-null");
        this.externalIpv6PrefixLength = Objects.requireNonNull(externalIpv6PrefixLength, "expected parameter 'externalIpv6PrefixLength' to be non-null");
        this.networkTier = Objects.requireNonNull(networkTier, "expected parameter 'networkTier' to be non-null");
        this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName, "expected parameter 'publicPtrDomainName' to be non-null");
    }

    private GetInstanceNetworkInterfaceIpv6AccessConfig() {
        this.externalIpv6 = null;
        this.externalIpv6PrefixLength = null;
        this.networkTier = null;
        this.publicPtrDomainName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNetworkInterfaceIpv6AccessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String externalIpv6;
        private String externalIpv6PrefixLength;
        private String networkTier;
        private String publicPtrDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceNetworkInterfaceIpv6AccessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIpv6 = defaults.externalIpv6;
    	      this.externalIpv6PrefixLength = defaults.externalIpv6PrefixLength;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        public Builder externalIpv6(String externalIpv6) {
            this.externalIpv6 = Objects.requireNonNull(externalIpv6);
            return this;
        }

        public Builder externalIpv6PrefixLength(String externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = Objects.requireNonNull(externalIpv6PrefixLength);
            return this;
        }

        public Builder networkTier(String networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }

        public Builder publicPtrDomainName(String publicPtrDomainName) {
            this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName);
            return this;
        }
        public GetInstanceNetworkInterfaceIpv6AccessConfig build() {
            return new GetInstanceNetworkInterfaceIpv6AccessConfig(externalIpv6, externalIpv6PrefixLength, networkTier, publicPtrDomainName);
        }
    }
}
