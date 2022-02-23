// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dns_v1.outputs.PolicyAlternativeNameServerConfigResponse;
import io.pulumi.googlenative.dns_v1.outputs.PolicyNetworkResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetPolicyResult {
    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
     */
    private final PolicyAlternativeNameServerConfigResponse alternativeNameServerConfig;
    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the policy's function.
     * 
     */
    private final String description;
    /**
     * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over VPN connections. When enabled, a virtual IP address is allocated from each of the subnetworks that are bound to this policy.
     * 
     */
    private final Boolean enableInboundForwarding;
    /**
     * Controls whether logging is enabled for the networks bound to this policy. Defaults to no logging if not set.
     * 
     */
    private final Boolean enableLogging;
    private final String kind;
    /**
     * User-assigned name for this policy.
     * 
     */
    private final String name;
    /**
     * List of network names specifying networks to which this policy is applied.
     * 
     */
    private final List<PolicyNetworkResponse> networks;

    @OutputCustomType.Constructor({"alternativeNameServerConfig","description","enableInboundForwarding","enableLogging","kind","name","networks"})
    private GetPolicyResult(
        PolicyAlternativeNameServerConfigResponse alternativeNameServerConfig,
        String description,
        Boolean enableInboundForwarding,
        Boolean enableLogging,
        String kind,
        String name,
        List<PolicyNetworkResponse> networks) {
        this.alternativeNameServerConfig = Objects.requireNonNull(alternativeNameServerConfig);
        this.description = Objects.requireNonNull(description);
        this.enableInboundForwarding = Objects.requireNonNull(enableInboundForwarding);
        this.enableLogging = Objects.requireNonNull(enableLogging);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.networks = Objects.requireNonNull(networks);
    }

    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
     */
    public PolicyAlternativeNameServerConfigResponse getAlternativeNameServerConfig() {
        return this.alternativeNameServerConfig;
    }
    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the policy's function.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over VPN connections. When enabled, a virtual IP address is allocated from each of the subnetworks that are bound to this policy.
     * 
     */
    public Boolean getEnableInboundForwarding() {
        return this.enableInboundForwarding;
    }
    /**
     * Controls whether logging is enabled for the networks bound to this policy. Defaults to no logging if not set.
     * 
     */
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }
    public String getKind() {
        return this.kind;
    }
    /**
     * User-assigned name for this policy.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * List of network names specifying networks to which this policy is applied.
     * 
     */
    public List<PolicyNetworkResponse> getNetworks() {
        return this.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyAlternativeNameServerConfigResponse alternativeNameServerConfig;
        private String description;
        private Boolean enableInboundForwarding;
        private Boolean enableLogging;
        private String kind;
        private String name;
        private List<PolicyNetworkResponse> networks;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternativeNameServerConfig = defaults.alternativeNameServerConfig;
    	      this.description = defaults.description;
    	      this.enableInboundForwarding = defaults.enableInboundForwarding;
    	      this.enableLogging = defaults.enableLogging;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.networks = defaults.networks;
        }

        public Builder setAlternativeNameServerConfig(PolicyAlternativeNameServerConfigResponse alternativeNameServerConfig) {
            this.alternativeNameServerConfig = Objects.requireNonNull(alternativeNameServerConfig);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEnableInboundForwarding(Boolean enableInboundForwarding) {
            this.enableInboundForwarding = Objects.requireNonNull(enableInboundForwarding);
            return this;
        }

        public Builder setEnableLogging(Boolean enableLogging) {
            this.enableLogging = Objects.requireNonNull(enableLogging);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworks(List<PolicyNetworkResponse> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }
        public GetPolicyResult build() {
            return new GetPolicyResult(alternativeNameServerConfig, description, enableInboundForwarding, enableLogging, kind, name, networks);
        }
    }
}
