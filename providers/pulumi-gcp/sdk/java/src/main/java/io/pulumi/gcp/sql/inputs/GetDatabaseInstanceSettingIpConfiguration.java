// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.sql.inputs.GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetDatabaseInstanceSettingIpConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final GetDatabaseInstanceSettingIpConfiguration Empty = new GetDatabaseInstanceSettingIpConfiguration();

    @Import(name="allocatedIpRange", required=true)
      private final String allocatedIpRange;

    public String allocatedIpRange() {
        return this.allocatedIpRange;
    }

    @Import(name="authorizedNetworks", required=true)
      private final List<GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork> authorizedNetworks;

    public List<GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork> authorizedNetworks() {
        return this.authorizedNetworks;
    }

    @Import(name="ipv4Enabled", required=true)
      private final Boolean ipv4Enabled;

    public Boolean ipv4Enabled() {
        return this.ipv4Enabled;
    }

    @Import(name="privateNetwork", required=true)
      private final String privateNetwork;

    public String privateNetwork() {
        return this.privateNetwork;
    }

    @Import(name="requireSsl", required=true)
      private final Boolean requireSsl;

    public Boolean requireSsl() {
        return this.requireSsl;
    }

    public GetDatabaseInstanceSettingIpConfiguration(
        String allocatedIpRange,
        List<GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork> authorizedNetworks,
        Boolean ipv4Enabled,
        String privateNetwork,
        Boolean requireSsl) {
        this.allocatedIpRange = Objects.requireNonNull(allocatedIpRange, "expected parameter 'allocatedIpRange' to be non-null");
        this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks, "expected parameter 'authorizedNetworks' to be non-null");
        this.ipv4Enabled = Objects.requireNonNull(ipv4Enabled, "expected parameter 'ipv4Enabled' to be non-null");
        this.privateNetwork = Objects.requireNonNull(privateNetwork, "expected parameter 'privateNetwork' to be non-null");
        this.requireSsl = Objects.requireNonNull(requireSsl, "expected parameter 'requireSsl' to be non-null");
    }

    private GetDatabaseInstanceSettingIpConfiguration() {
        this.allocatedIpRange = null;
        this.authorizedNetworks = List.of();
        this.ipv4Enabled = null;
        this.privateNetwork = null;
        this.requireSsl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceSettingIpConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocatedIpRange;
        private List<GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork> authorizedNetworks;
        private Boolean ipv4Enabled;
        private String privateNetwork;
        private Boolean requireSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceSettingIpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedIpRange = defaults.allocatedIpRange;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.ipv4Enabled = defaults.ipv4Enabled;
    	      this.privateNetwork = defaults.privateNetwork;
    	      this.requireSsl = defaults.requireSsl;
        }

        public Builder allocatedIpRange(String allocatedIpRange) {
            this.allocatedIpRange = Objects.requireNonNull(allocatedIpRange);
            return this;
        }
        public Builder authorizedNetworks(List<GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork> authorizedNetworks) {
            this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks);
            return this;
        }
        public Builder authorizedNetworks(GetDatabaseInstanceSettingIpConfigurationAuthorizedNetwork... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }
        public Builder ipv4Enabled(Boolean ipv4Enabled) {
            this.ipv4Enabled = Objects.requireNonNull(ipv4Enabled);
            return this;
        }
        public Builder privateNetwork(String privateNetwork) {
            this.privateNetwork = Objects.requireNonNull(privateNetwork);
            return this;
        }
        public Builder requireSsl(Boolean requireSsl) {
            this.requireSsl = Objects.requireNonNull(requireSsl);
            return this;
        }        public GetDatabaseInstanceSettingIpConfiguration build() {
            return new GetDatabaseInstanceSettingIpConfiguration(allocatedIpRange, authorizedNetworks, ipv4Enabled, privateNetwork, requireSsl);
        }
    }
}
