// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.LoadDistribution;
import io.pulumi.azurenative.network.enums.TransportProtocol;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A load balancing rule for a load balancer.
 * 
 */
public final class LoadBalancingRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancingRuleArgs Empty = new LoadBalancingRuleArgs();

    /**
     * A reference to a pool of DIPs. Inbound traffic is randomly load balanced across IPs in the backend IPs.
     * 
     */
    @Import(name="backendAddressPool")
      private final @Nullable Output<SubResourceArgs> backendAddressPool;

    public Output<SubResourceArgs> getBackendAddressPool() {
        return this.backendAddressPool == null ? Output.empty() : this.backendAddressPool;
    }

    /**
     * The port used for internal connections on the endpoint. Acceptable values are between 0 and 65535. Note that value 0 enables "Any Port".
     * 
     */
    @Import(name="backendPort")
      private final @Nullable Output<Integer> backendPort;

    public Output<Integer> getBackendPort() {
        return this.backendPort == null ? Output.empty() : this.backendPort;
    }

    /**
     * Configures SNAT for the VMs in the backend pool to use the publicIP address specified in the frontend of the load balancing rule.
     * 
     */
    @Import(name="disableOutboundSnat")
      private final @Nullable Output<Boolean> disableOutboundSnat;

    public Output<Boolean> getDisableOutboundSnat() {
        return this.disableOutboundSnat == null ? Output.empty() : this.disableOutboundSnat;
    }

    /**
     * Configures a virtual machine's endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     * 
     */
    @Import(name="enableFloatingIP")
      private final @Nullable Output<Boolean> enableFloatingIP;

    public Output<Boolean> getEnableFloatingIP() {
        return this.enableFloatingIP == null ? Output.empty() : this.enableFloatingIP;
    }

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="enableTcpReset")
      private final @Nullable Output<Boolean> enableTcpReset;

    public Output<Boolean> getEnableTcpReset() {
        return this.enableTcpReset == null ? Output.empty() : this.enableTcpReset;
    }

    /**
     * A reference to frontend IP addresses.
     * 
     */
    @Import(name="frontendIPConfiguration")
      private final @Nullable Output<SubResourceArgs> frontendIPConfiguration;

    public Output<SubResourceArgs> getFrontendIPConfiguration() {
        return this.frontendIPConfiguration == null ? Output.empty() : this.frontendIPConfiguration;
    }

    /**
     * The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values are between 0 and 65534. Note that value 0 enables "Any Port".
     * 
     */
    @Import(name="frontendPort", required=true)
      private final Output<Integer> frontendPort;

    public Output<Integer> getFrontendPort() {
        return this.frontendPort;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
      private final @Nullable Output<Integer> idleTimeoutInMinutes;

    public Output<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Output.empty() : this.idleTimeoutInMinutes;
    }

    /**
     * The load distribution policy for this rule.
     * 
     */
    @Import(name="loadDistribution")
      private final @Nullable Output<Either<String,LoadDistribution>> loadDistribution;

    public Output<Either<String,LoadDistribution>> getLoadDistribution() {
        return this.loadDistribution == null ? Output.empty() : this.loadDistribution;
    }

    /**
     * The name of the resource that is unique within the set of load balancing rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The reference to the load balancer probe used by the load balancing rule.
     * 
     */
    @Import(name="probe")
      private final @Nullable Output<SubResourceArgs> probe;

    public Output<SubResourceArgs> getProbe() {
        return this.probe == null ? Output.empty() : this.probe;
    }

    /**
     * The reference to the transport protocol used by the load balancing rule.
     * 
     */
    @Import(name="protocol", required=true)
      private final Output<Either<String,TransportProtocol>> protocol;

    public Output<Either<String,TransportProtocol>> getProtocol() {
        return this.protocol;
    }

    public LoadBalancingRuleArgs(
        @Nullable Output<SubResourceArgs> backendAddressPool,
        @Nullable Output<Integer> backendPort,
        @Nullable Output<Boolean> disableOutboundSnat,
        @Nullable Output<Boolean> enableFloatingIP,
        @Nullable Output<Boolean> enableTcpReset,
        @Nullable Output<SubResourceArgs> frontendIPConfiguration,
        Output<Integer> frontendPort,
        @Nullable Output<String> id,
        @Nullable Output<Integer> idleTimeoutInMinutes,
        @Nullable Output<Either<String,LoadDistribution>> loadDistribution,
        @Nullable Output<String> name,
        @Nullable Output<SubResourceArgs> probe,
        Output<Either<String,TransportProtocol>> protocol) {
        this.backendAddressPool = backendAddressPool;
        this.backendPort = backendPort;
        this.disableOutboundSnat = disableOutboundSnat;
        this.enableFloatingIP = enableFloatingIP;
        this.enableTcpReset = enableTcpReset;
        this.frontendIPConfiguration = frontendIPConfiguration;
        this.frontendPort = Objects.requireNonNull(frontendPort, "expected parameter 'frontendPort' to be non-null");
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.loadDistribution = loadDistribution;
        this.name = name;
        this.probe = probe;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private LoadBalancingRuleArgs() {
        this.backendAddressPool = Output.empty();
        this.backendPort = Output.empty();
        this.disableOutboundSnat = Output.empty();
        this.enableFloatingIP = Output.empty();
        this.enableTcpReset = Output.empty();
        this.frontendIPConfiguration = Output.empty();
        this.frontendPort = Output.empty();
        this.id = Output.empty();
        this.idleTimeoutInMinutes = Output.empty();
        this.loadDistribution = Output.empty();
        this.name = Output.empty();
        this.probe = Output.empty();
        this.protocol = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SubResourceArgs> backendAddressPool;
        private @Nullable Output<Integer> backendPort;
        private @Nullable Output<Boolean> disableOutboundSnat;
        private @Nullable Output<Boolean> enableFloatingIP;
        private @Nullable Output<Boolean> enableTcpReset;
        private @Nullable Output<SubResourceArgs> frontendIPConfiguration;
        private Output<Integer> frontendPort;
        private @Nullable Output<String> id;
        private @Nullable Output<Integer> idleTimeoutInMinutes;
        private @Nullable Output<Either<String,LoadDistribution>> loadDistribution;
        private @Nullable Output<String> name;
        private @Nullable Output<SubResourceArgs> probe;
        private Output<Either<String,TransportProtocol>> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancingRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPool = defaults.backendAddressPool;
    	      this.backendPort = defaults.backendPort;
    	      this.disableOutboundSnat = defaults.disableOutboundSnat;
    	      this.enableFloatingIP = defaults.enableFloatingIP;
    	      this.enableTcpReset = defaults.enableTcpReset;
    	      this.frontendIPConfiguration = defaults.frontendIPConfiguration;
    	      this.frontendPort = defaults.frontendPort;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.loadDistribution = defaults.loadDistribution;
    	      this.name = defaults.name;
    	      this.probe = defaults.probe;
    	      this.protocol = defaults.protocol;
        }

        public Builder backendAddressPool(@Nullable Output<SubResourceArgs> backendAddressPool) {
            this.backendAddressPool = backendAddressPool;
            return this;
        }

        public Builder backendAddressPool(@Nullable SubResourceArgs backendAddressPool) {
            this.backendAddressPool = Output.ofNullable(backendAddressPool);
            return this;
        }

        public Builder backendPort(@Nullable Output<Integer> backendPort) {
            this.backendPort = backendPort;
            return this;
        }

        public Builder backendPort(@Nullable Integer backendPort) {
            this.backendPort = Output.ofNullable(backendPort);
            return this;
        }

        public Builder disableOutboundSnat(@Nullable Output<Boolean> disableOutboundSnat) {
            this.disableOutboundSnat = disableOutboundSnat;
            return this;
        }

        public Builder disableOutboundSnat(@Nullable Boolean disableOutboundSnat) {
            this.disableOutboundSnat = Output.ofNullable(disableOutboundSnat);
            return this;
        }

        public Builder enableFloatingIP(@Nullable Output<Boolean> enableFloatingIP) {
            this.enableFloatingIP = enableFloatingIP;
            return this;
        }

        public Builder enableFloatingIP(@Nullable Boolean enableFloatingIP) {
            this.enableFloatingIP = Output.ofNullable(enableFloatingIP);
            return this;
        }

        public Builder enableTcpReset(@Nullable Output<Boolean> enableTcpReset) {
            this.enableTcpReset = enableTcpReset;
            return this;
        }

        public Builder enableTcpReset(@Nullable Boolean enableTcpReset) {
            this.enableTcpReset = Output.ofNullable(enableTcpReset);
            return this;
        }

        public Builder frontendIPConfiguration(@Nullable Output<SubResourceArgs> frontendIPConfiguration) {
            this.frontendIPConfiguration = frontendIPConfiguration;
            return this;
        }

        public Builder frontendIPConfiguration(@Nullable SubResourceArgs frontendIPConfiguration) {
            this.frontendIPConfiguration = Output.ofNullable(frontendIPConfiguration);
            return this;
        }

        public Builder frontendPort(Output<Integer> frontendPort) {
            this.frontendPort = Objects.requireNonNull(frontendPort);
            return this;
        }

        public Builder frontendPort(Integer frontendPort) {
            this.frontendPort = Output.of(Objects.requireNonNull(frontendPort));
            return this;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = Output.ofNullable(idleTimeoutInMinutes);
            return this;
        }

        public Builder loadDistribution(@Nullable Output<Either<String,LoadDistribution>> loadDistribution) {
            this.loadDistribution = loadDistribution;
            return this;
        }

        public Builder loadDistribution(@Nullable Either<String,LoadDistribution> loadDistribution) {
            this.loadDistribution = Output.ofNullable(loadDistribution);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder probe(@Nullable Output<SubResourceArgs> probe) {
            this.probe = probe;
            return this;
        }

        public Builder probe(@Nullable SubResourceArgs probe) {
            this.probe = Output.ofNullable(probe);
            return this;
        }

        public Builder protocol(Output<Either<String,TransportProtocol>> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder protocol(Either<String,TransportProtocol> protocol) {
            this.protocol = Output.of(Objects.requireNonNull(protocol));
            return this;
        }
        public LoadBalancingRuleArgs build() {
            return new LoadBalancingRuleArgs(backendAddressPool, backendPort, disableOutboundSnat, enableFloatingIP, enableTcpReset, frontendIPConfiguration, frontendPort, id, idleTimeoutInMinutes, loadDistribution, name, probe, protocol);
        }
    }
}
