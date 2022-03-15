// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.NetworkInterfaceIPConfigurationResponse;
import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Inbound NAT rule of the load balancer.
 * 
 */
public final class InboundNatRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final InboundNatRuleResponse Empty = new InboundNatRuleResponse();

    /**
     * A reference to a private IP address defined on a network interface of a VM. Traffic sent to the frontend port of each of the frontend IP configurations is forwarded to the backend IP.
     * 
     */
    @Import(name="backendIPConfiguration", required=true)
      private final NetworkInterfaceIPConfigurationResponse backendIPConfiguration;

    public NetworkInterfaceIPConfigurationResponse getBackendIPConfiguration() {
        return this.backendIPConfiguration;
    }

    /**
     * The port used for the internal endpoint. Acceptable values range from 1 to 65535.
     * 
     */
    @Import(name="backendPort")
      private final @Nullable Integer backendPort;

    public Optional<Integer> getBackendPort() {
        return this.backendPort == null ? Optional.empty() : Optional.ofNullable(this.backendPort);
    }

    /**
     * Configures a virtual machine's endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     * 
     */
    @Import(name="enableFloatingIP")
      private final @Nullable Boolean enableFloatingIP;

    public Optional<Boolean> getEnableFloatingIP() {
        return this.enableFloatingIP == null ? Optional.empty() : Optional.ofNullable(this.enableFloatingIP);
    }

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="enableTcpReset")
      private final @Nullable Boolean enableTcpReset;

    public Optional<Boolean> getEnableTcpReset() {
        return this.enableTcpReset == null ? Optional.empty() : Optional.ofNullable(this.enableTcpReset);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * A reference to frontend IP addresses.
     * 
     */
    @Import(name="frontendIPConfiguration")
      private final @Nullable SubResourceResponse frontendIPConfiguration;

    public Optional<SubResourceResponse> getFrontendIPConfiguration() {
        return this.frontendIPConfiguration == null ? Optional.empty() : Optional.ofNullable(this.frontendIPConfiguration);
    }

    /**
     * The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values range from 1 to 65534.
     * 
     */
    @Import(name="frontendPort")
      private final @Nullable Integer frontendPort;

    public Optional<Integer> getFrontendPort() {
        return this.frontendPort == null ? Optional.empty() : Optional.ofNullable(this.frontendPort);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
      private final @Nullable Integer idleTimeoutInMinutes;

    public Optional<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Optional.empty() : Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * The name of the resource that is unique within the set of inbound NAT rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The reference to the transport protocol used by the load balancing rule.
     * 
     */
    @Import(name="protocol")
      private final @Nullable String protocol;

    public Optional<String> getProtocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    /**
     * The provisioning state of the inbound NAT rule resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public InboundNatRuleResponse(
        NetworkInterfaceIPConfigurationResponse backendIPConfiguration,
        @Nullable Integer backendPort,
        @Nullable Boolean enableFloatingIP,
        @Nullable Boolean enableTcpReset,
        String etag,
        @Nullable SubResourceResponse frontendIPConfiguration,
        @Nullable Integer frontendPort,
        @Nullable String id,
        @Nullable Integer idleTimeoutInMinutes,
        @Nullable String name,
        @Nullable String protocol,
        String provisioningState,
        String type) {
        this.backendIPConfiguration = Objects.requireNonNull(backendIPConfiguration, "expected parameter 'backendIPConfiguration' to be non-null");
        this.backendPort = backendPort;
        this.enableFloatingIP = enableFloatingIP;
        this.enableTcpReset = enableTcpReset;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.frontendIPConfiguration = frontendIPConfiguration;
        this.frontendPort = frontendPort;
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.name = name;
        this.protocol = protocol;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InboundNatRuleResponse() {
        this.backendIPConfiguration = null;
        this.backendPort = null;
        this.enableFloatingIP = null;
        this.enableTcpReset = null;
        this.etag = null;
        this.frontendIPConfiguration = null;
        this.frontendPort = null;
        this.id = null;
        this.idleTimeoutInMinutes = null;
        this.name = null;
        this.protocol = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundNatRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInterfaceIPConfigurationResponse backendIPConfiguration;
        private @Nullable Integer backendPort;
        private @Nullable Boolean enableFloatingIP;
        private @Nullable Boolean enableTcpReset;
        private String etag;
        private @Nullable SubResourceResponse frontendIPConfiguration;
        private @Nullable Integer frontendPort;
        private @Nullable String id;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable String name;
        private @Nullable String protocol;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundNatRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendIPConfiguration = defaults.backendIPConfiguration;
    	      this.backendPort = defaults.backendPort;
    	      this.enableFloatingIP = defaults.enableFloatingIP;
    	      this.enableTcpReset = defaults.enableTcpReset;
    	      this.etag = defaults.etag;
    	      this.frontendIPConfiguration = defaults.frontendIPConfiguration;
    	      this.frontendPort = defaults.frontendPort;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder backendIPConfiguration(NetworkInterfaceIPConfigurationResponse backendIPConfiguration) {
            this.backendIPConfiguration = Objects.requireNonNull(backendIPConfiguration);
            return this;
        }

        public Builder backendPort(@Nullable Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }

        public Builder enableFloatingIP(@Nullable Boolean enableFloatingIP) {
            this.enableFloatingIP = enableFloatingIP;
            return this;
        }

        public Builder enableTcpReset(@Nullable Boolean enableTcpReset) {
            this.enableTcpReset = enableTcpReset;
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder frontendIPConfiguration(@Nullable SubResourceResponse frontendIPConfiguration) {
            this.frontendIPConfiguration = frontendIPConfiguration;
            return this;
        }

        public Builder frontendPort(@Nullable Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public InboundNatRuleResponse build() {
            return new InboundNatRuleResponse(backendIPConfiguration, backendPort, enableFloatingIP, enableTcpReset, etag, frontendIPConfiguration, frontendPort, id, idleTimeoutInMinutes, name, protocol, provisioningState, type);
        }
    }
}
