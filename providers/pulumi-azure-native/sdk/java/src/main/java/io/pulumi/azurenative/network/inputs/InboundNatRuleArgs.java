// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.TransportProtocol;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Inbound NAT rule of the load balancer.
 * 
 */
public final class InboundNatRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final InboundNatRuleArgs Empty = new InboundNatRuleArgs();

    /**
     * The port used for the internal endpoint. Acceptable values range from 1 to 65535.
     * 
     */
    @InputImport(name="backendPort")
    private final @Nullable Input<Integer> backendPort;

    public Input<Integer> getBackendPort() {
        return this.backendPort == null ? Input.empty() : this.backendPort;
    }

    /**
     * Configures a virtual machine's endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     * 
     */
    @InputImport(name="enableFloatingIP")
    private final @Nullable Input<Boolean> enableFloatingIP;

    public Input<Boolean> getEnableFloatingIP() {
        return this.enableFloatingIP == null ? Input.empty() : this.enableFloatingIP;
    }

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    @InputImport(name="enableTcpReset")
    private final @Nullable Input<Boolean> enableTcpReset;

    public Input<Boolean> getEnableTcpReset() {
        return this.enableTcpReset == null ? Input.empty() : this.enableTcpReset;
    }

    /**
     * A reference to frontend IP addresses.
     * 
     */
    @InputImport(name="frontendIPConfiguration")
    private final @Nullable Input<SubResourceArgs> frontendIPConfiguration;

    public Input<SubResourceArgs> getFrontendIPConfiguration() {
        return this.frontendIPConfiguration == null ? Input.empty() : this.frontendIPConfiguration;
    }

    /**
     * The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values range from 1 to 65534.
     * 
     */
    @InputImport(name="frontendPort")
    private final @Nullable Input<Integer> frontendPort;

    public Input<Integer> getFrontendPort() {
        return this.frontendPort == null ? Input.empty() : this.frontendPort;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     */
    @InputImport(name="idleTimeoutInMinutes")
    private final @Nullable Input<Integer> idleTimeoutInMinutes;

    public Input<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Input.empty() : this.idleTimeoutInMinutes;
    }

    /**
     * The name of the resource that is unique within the set of inbound NAT rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The reference to the transport protocol used by the load balancing rule.
     * 
     */
    @InputImport(name="protocol")
    private final @Nullable Input<Either<String,TransportProtocol>> protocol;

    public Input<Either<String,TransportProtocol>> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    public InboundNatRuleArgs(
        @Nullable Input<Integer> backendPort,
        @Nullable Input<Boolean> enableFloatingIP,
        @Nullable Input<Boolean> enableTcpReset,
        @Nullable Input<SubResourceArgs> frontendIPConfiguration,
        @Nullable Input<Integer> frontendPort,
        @Nullable Input<String> id,
        @Nullable Input<Integer> idleTimeoutInMinutes,
        @Nullable Input<String> name,
        @Nullable Input<Either<String,TransportProtocol>> protocol) {
        this.backendPort = backendPort;
        this.enableFloatingIP = enableFloatingIP;
        this.enableTcpReset = enableTcpReset;
        this.frontendIPConfiguration = frontendIPConfiguration;
        this.frontendPort = frontendPort;
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.name = name;
        this.protocol = protocol;
    }

    private InboundNatRuleArgs() {
        this.backendPort = Input.empty();
        this.enableFloatingIP = Input.empty();
        this.enableTcpReset = Input.empty();
        this.frontendIPConfiguration = Input.empty();
        this.frontendPort = Input.empty();
        this.id = Input.empty();
        this.idleTimeoutInMinutes = Input.empty();
        this.name = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundNatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> backendPort;
        private @Nullable Input<Boolean> enableFloatingIP;
        private @Nullable Input<Boolean> enableTcpReset;
        private @Nullable Input<SubResourceArgs> frontendIPConfiguration;
        private @Nullable Input<Integer> frontendPort;
        private @Nullable Input<String> id;
        private @Nullable Input<Integer> idleTimeoutInMinutes;
        private @Nullable Input<String> name;
        private @Nullable Input<Either<String,TransportProtocol>> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundNatRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.enableFloatingIP = defaults.enableFloatingIP;
    	      this.enableTcpReset = defaults.enableTcpReset;
    	      this.frontendIPConfiguration = defaults.frontendIPConfiguration;
    	      this.frontendPort = defaults.frontendPort;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder setBackendPort(@Nullable Input<Integer> backendPort) {
            this.backendPort = backendPort;
            return this;
        }

        public Builder setBackendPort(@Nullable Integer backendPort) {
            this.backendPort = Input.ofNullable(backendPort);
            return this;
        }

        public Builder setEnableFloatingIP(@Nullable Input<Boolean> enableFloatingIP) {
            this.enableFloatingIP = enableFloatingIP;
            return this;
        }

        public Builder setEnableFloatingIP(@Nullable Boolean enableFloatingIP) {
            this.enableFloatingIP = Input.ofNullable(enableFloatingIP);
            return this;
        }

        public Builder setEnableTcpReset(@Nullable Input<Boolean> enableTcpReset) {
            this.enableTcpReset = enableTcpReset;
            return this;
        }

        public Builder setEnableTcpReset(@Nullable Boolean enableTcpReset) {
            this.enableTcpReset = Input.ofNullable(enableTcpReset);
            return this;
        }

        public Builder setFrontendIPConfiguration(@Nullable Input<SubResourceArgs> frontendIPConfiguration) {
            this.frontendIPConfiguration = frontendIPConfiguration;
            return this;
        }

        public Builder setFrontendIPConfiguration(@Nullable SubResourceArgs frontendIPConfiguration) {
            this.frontendIPConfiguration = Input.ofNullable(frontendIPConfiguration);
            return this;
        }

        public Builder setFrontendPort(@Nullable Input<Integer> frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }

        public Builder setFrontendPort(@Nullable Integer frontendPort) {
            this.frontendPort = Input.ofNullable(frontendPort);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Input<Integer> idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = Input.ofNullable(idleTimeoutInMinutes);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProtocol(@Nullable Input<Either<String,TransportProtocol>> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable Either<String,TransportProtocol> protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public InboundNatRuleArgs build() {
            return new InboundNatRuleArgs(backendPort, enableFloatingIP, enableTcpReset, frontendIPConfiguration, frontendPort, id, idleTimeoutInMinutes, name, protocol);
        }
    }
}
