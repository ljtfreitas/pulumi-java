// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterDnsConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterDnsConfigGetArgs Empty = new ClusterDnsConfigGetArgs();

    /**
     * Which in-cluster DNS provider should be used. `PROVIDER_UNSPECIFIED` (default) or `PLATFORM_DEFAULT` or `CLOUD_DNS`.
     * 
     */
    @InputImport(name="clusterDns")
        private final @Nullable Input<String> clusterDns;

    public Input<String> getClusterDns() {
        return this.clusterDns == null ? Input.empty() : this.clusterDns;
    }

    /**
     * The suffix used for all cluster service records.
     * 
     */
    @InputImport(name="clusterDnsDomain")
        private final @Nullable Input<String> clusterDnsDomain;

    public Input<String> getClusterDnsDomain() {
        return this.clusterDnsDomain == null ? Input.empty() : this.clusterDnsDomain;
    }

    /**
     * The scope of access to cluster DNS records. `DNS_SCOPE_UNSPECIFIED` (default) or `CLUSTER_SCOPE` or `VPC_SCOPE`.
     * 
     */
    @InputImport(name="clusterDnsScope")
        private final @Nullable Input<String> clusterDnsScope;

    public Input<String> getClusterDnsScope() {
        return this.clusterDnsScope == null ? Input.empty() : this.clusterDnsScope;
    }

    public ClusterDnsConfigGetArgs(
        @Nullable Input<String> clusterDns,
        @Nullable Input<String> clusterDnsDomain,
        @Nullable Input<String> clusterDnsScope) {
        this.clusterDns = clusterDns;
        this.clusterDnsDomain = clusterDnsDomain;
        this.clusterDnsScope = clusterDnsScope;
    }

    private ClusterDnsConfigGetArgs() {
        this.clusterDns = Input.empty();
        this.clusterDnsDomain = Input.empty();
        this.clusterDnsScope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterDnsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clusterDns;
        private @Nullable Input<String> clusterDnsDomain;
        private @Nullable Input<String> clusterDnsScope;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterDnsConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterDns = defaults.clusterDns;
    	      this.clusterDnsDomain = defaults.clusterDnsDomain;
    	      this.clusterDnsScope = defaults.clusterDnsScope;
        }

        public Builder setClusterDns(@Nullable Input<String> clusterDns) {
            this.clusterDns = clusterDns;
            return this;
        }

        public Builder setClusterDns(@Nullable String clusterDns) {
            this.clusterDns = Input.ofNullable(clusterDns);
            return this;
        }

        public Builder setClusterDnsDomain(@Nullable Input<String> clusterDnsDomain) {
            this.clusterDnsDomain = clusterDnsDomain;
            return this;
        }

        public Builder setClusterDnsDomain(@Nullable String clusterDnsDomain) {
            this.clusterDnsDomain = Input.ofNullable(clusterDnsDomain);
            return this;
        }

        public Builder setClusterDnsScope(@Nullable Input<String> clusterDnsScope) {
            this.clusterDnsScope = clusterDnsScope;
            return this;
        }

        public Builder setClusterDnsScope(@Nullable String clusterDnsScope) {
            this.clusterDnsScope = Input.ofNullable(clusterDnsScope);
            return this;
        }
        public ClusterDnsConfigGetArgs build() {
            return new ClusterDnsConfigGetArgs(clusterDns, clusterDnsDomain, clusterDnsScope);
        }
    }
}
