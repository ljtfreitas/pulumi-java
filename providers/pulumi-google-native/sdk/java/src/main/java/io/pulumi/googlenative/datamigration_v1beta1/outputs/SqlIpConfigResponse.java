// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.datamigration_v1beta1.outputs.SqlAclEntryResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SqlIpConfigResponse {
    /**
     * The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as 'slash' notation (e.g. `192.168.100.0/24`).
     * 
     */
    private final List<SqlAclEntryResponse> authorizedNetworks;
    /**
     * Whether the instance is assigned a public IP address or not.
     * 
     */
    private final Boolean enableIpv4;
    /**
     * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `/projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    private final String privateNetwork;
    /**
     * Whether SSL connections over IP should be enforced or not.
     * 
     */
    private final Boolean requireSsl;

    @CustomType.Constructor
    private SqlIpConfigResponse(
        @CustomType.Parameter("authorizedNetworks") List<SqlAclEntryResponse> authorizedNetworks,
        @CustomType.Parameter("enableIpv4") Boolean enableIpv4,
        @CustomType.Parameter("privateNetwork") String privateNetwork,
        @CustomType.Parameter("requireSsl") Boolean requireSsl) {
        this.authorizedNetworks = authorizedNetworks;
        this.enableIpv4 = enableIpv4;
        this.privateNetwork = privateNetwork;
        this.requireSsl = requireSsl;
    }

    /**
     * The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as 'slash' notation (e.g. `192.168.100.0/24`).
     * 
    */
    public List<SqlAclEntryResponse> getAuthorizedNetworks() {
        return this.authorizedNetworks;
    }
    /**
     * Whether the instance is assigned a public IP address or not.
     * 
    */
    public Boolean getEnableIpv4() {
        return this.enableIpv4;
    }
    /**
     * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `/projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
     * 
    */
    public String getPrivateNetwork() {
        return this.privateNetwork;
    }
    /**
     * Whether SSL connections over IP should be enforced or not.
     * 
    */
    public Boolean getRequireSsl() {
        return this.requireSsl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlIpConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SqlAclEntryResponse> authorizedNetworks;
        private Boolean enableIpv4;
        private String privateNetwork;
        private Boolean requireSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlIpConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.enableIpv4 = defaults.enableIpv4;
    	      this.privateNetwork = defaults.privateNetwork;
    	      this.requireSsl = defaults.requireSsl;
        }

        public Builder authorizedNetworks(List<SqlAclEntryResponse> authorizedNetworks) {
            this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks);
            return this;
        }

        public Builder enableIpv4(Boolean enableIpv4) {
            this.enableIpv4 = Objects.requireNonNull(enableIpv4);
            return this;
        }

        public Builder privateNetwork(String privateNetwork) {
            this.privateNetwork = Objects.requireNonNull(privateNetwork);
            return this;
        }

        public Builder requireSsl(Boolean requireSsl) {
            this.requireSsl = Objects.requireNonNull(requireSsl);
            return this;
        }
        public SqlIpConfigResponse build() {
            return new SqlIpConfigResponse(authorizedNetworks, enableIpv4, privateNetwork, requireSsl);
        }
    }
}
