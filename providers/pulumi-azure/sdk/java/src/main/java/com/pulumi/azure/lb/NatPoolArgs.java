// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NatPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final NatPoolArgs Empty = new NatPoolArgs();

    /**
     * The port used for the internal endpoint. Possible values range between 1 and 65535, inclusive.
     * 
     */
    @Import(name="backendPort", required=true)
    private Output<Integer> backendPort;

    /**
     * @return The port used for the internal endpoint. Possible values range between 1 and 65535, inclusive.
     * 
     */
    public Output<Integer> backendPort() {
        return this.backendPort;
    }

    /**
     * Are the floating IPs enabled for this Load Balancer Rule? A floating IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
     * 
     */
    @Import(name="floatingIpEnabled")
    private @Nullable Output<Boolean> floatingIpEnabled;

    /**
     * @return Are the floating IPs enabled for this Load Balancer Rule? A floating IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> floatingIpEnabled() {
        return Optional.ofNullable(this.floatingIpEnabled);
    }

    /**
     * The name of the frontend IP configuration exposing this rule.
     * 
     */
    @Import(name="frontendIpConfigurationName", required=true)
    private Output<String> frontendIpConfigurationName;

    /**
     * @return The name of the frontend IP configuration exposing this rule.
     * 
     */
    public Output<String> frontendIpConfigurationName() {
        return this.frontendIpConfigurationName;
    }

    /**
     * The last port number in the range of external ports that will be used to provide Inbound NAT to NICs associated with this Load Balancer. Possible values range between 1 and 65534, inclusive.
     * 
     */
    @Import(name="frontendPortEnd", required=true)
    private Output<Integer> frontendPortEnd;

    /**
     * @return The last port number in the range of external ports that will be used to provide Inbound NAT to NICs associated with this Load Balancer. Possible values range between 1 and 65534, inclusive.
     * 
     */
    public Output<Integer> frontendPortEnd() {
        return this.frontendPortEnd;
    }

    /**
     * The first port number in the range of external ports that will be used to provide Inbound NAT to NICs associated with this Load Balancer. Possible values range between 1 and 65534, inclusive.
     * 
     */
    @Import(name="frontendPortStart", required=true)
    private Output<Integer> frontendPortStart;

    /**
     * @return The first port number in the range of external ports that will be used to provide Inbound NAT to NICs associated with this Load Balancer. Possible values range between 1 and 65534, inclusive.
     * 
     */
    public Output<Integer> frontendPortStart() {
        return this.frontendPortStart;
    }

    /**
     * Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `30`. Defaults to `4`.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
    private @Nullable Output<Integer> idleTimeoutInMinutes;

    /**
     * @return Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `30`. Defaults to `4`.
     * 
     */
    public Optional<Output<Integer>> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * The ID of the Load Balancer in which to create the NAT pool.
     * 
     */
    @Import(name="loadbalancerId", required=true)
    private Output<String> loadbalancerId;

    /**
     * @return The ID of the Load Balancer in which to create the NAT pool.
     * 
     */
    public Output<String> loadbalancerId() {
        return this.loadbalancerId;
    }

    /**
     * Specifies the name of the NAT pool.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the NAT pool.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The transport protocol for the external endpoint. Possible values are `Udp` or `Tcp`.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The transport protocol for the external endpoint. Possible values are `Udp` or `Tcp`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * The name of the resource group in which to create the resource.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the resource.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Is TCP Reset enabled for this Load Balancer Rule? Defaults to `false`.
     * 
     */
    @Import(name="tcpResetEnabled")
    private @Nullable Output<Boolean> tcpResetEnabled;

    /**
     * @return Is TCP Reset enabled for this Load Balancer Rule? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> tcpResetEnabled() {
        return Optional.ofNullable(this.tcpResetEnabled);
    }

    private NatPoolArgs() {}

    private NatPoolArgs(NatPoolArgs $) {
        this.backendPort = $.backendPort;
        this.floatingIpEnabled = $.floatingIpEnabled;
        this.frontendIpConfigurationName = $.frontendIpConfigurationName;
        this.frontendPortEnd = $.frontendPortEnd;
        this.frontendPortStart = $.frontendPortStart;
        this.idleTimeoutInMinutes = $.idleTimeoutInMinutes;
        this.loadbalancerId = $.loadbalancerId;
        this.name = $.name;
        this.protocol = $.protocol;
        this.resourceGroupName = $.resourceGroupName;
        this.tcpResetEnabled = $.tcpResetEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NatPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NatPoolArgs $;

        public Builder() {
            $ = new NatPoolArgs();
        }

        public Builder(NatPoolArgs defaults) {
            $ = new NatPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendPort The port used for the internal endpoint. Possible values range between 1 and 65535, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder backendPort(Output<Integer> backendPort) {
            $.backendPort = backendPort;
            return this;
        }

        /**
         * @param backendPort The port used for the internal endpoint. Possible values range between 1 and 65535, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder backendPort(Integer backendPort) {
            return backendPort(Output.of(backendPort));
        }

        /**
         * @param floatingIpEnabled Are the floating IPs enabled for this Load Balancer Rule? A floating IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder floatingIpEnabled(@Nullable Output<Boolean> floatingIpEnabled) {
            $.floatingIpEnabled = floatingIpEnabled;
            return this;
        }

        /**
         * @param floatingIpEnabled Are the floating IPs enabled for this Load Balancer Rule? A floating IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder floatingIpEnabled(Boolean floatingIpEnabled) {
            return floatingIpEnabled(Output.of(floatingIpEnabled));
        }

        /**
         * @param frontendIpConfigurationName The name of the frontend IP configuration exposing this rule.
         * 
         * @return builder
         * 
         */
        public Builder frontendIpConfigurationName(Output<String> frontendIpConfigurationName) {
            $.frontendIpConfigurationName = frontendIpConfigurationName;
            return this;
        }

        /**
         * @param frontendIpConfigurationName The name of the frontend IP configuration exposing this rule.
         * 
         * @return builder
         * 
         */
        public Builder frontendIpConfigurationName(String frontendIpConfigurationName) {
            return frontendIpConfigurationName(Output.of(frontendIpConfigurationName));
        }

        /**
         * @param frontendPortEnd The last port number in the range of external ports that will be used to provide Inbound NAT to NICs associated with this Load Balancer. Possible values range between 1 and 65534, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder frontendPortEnd(Output<Integer> frontendPortEnd) {
            $.frontendPortEnd = frontendPortEnd;
            return this;
        }

        /**
         * @param frontendPortEnd The last port number in the range of external ports that will be used to provide Inbound NAT to NICs associated with this Load Balancer. Possible values range between 1 and 65534, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder frontendPortEnd(Integer frontendPortEnd) {
            return frontendPortEnd(Output.of(frontendPortEnd));
        }

        /**
         * @param frontendPortStart The first port number in the range of external ports that will be used to provide Inbound NAT to NICs associated with this Load Balancer. Possible values range between 1 and 65534, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder frontendPortStart(Output<Integer> frontendPortStart) {
            $.frontendPortStart = frontendPortStart;
            return this;
        }

        /**
         * @param frontendPortStart The first port number in the range of external ports that will be used to provide Inbound NAT to NICs associated with this Load Balancer. Possible values range between 1 and 65534, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder frontendPortStart(Integer frontendPortStart) {
            return frontendPortStart(Output.of(frontendPortStart));
        }

        /**
         * @param idleTimeoutInMinutes Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `30`. Defaults to `4`.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            $.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        /**
         * @param idleTimeoutInMinutes Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `30`. Defaults to `4`.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
            return idleTimeoutInMinutes(Output.of(idleTimeoutInMinutes));
        }

        /**
         * @param loadbalancerId The ID of the Load Balancer in which to create the NAT pool.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerId(Output<String> loadbalancerId) {
            $.loadbalancerId = loadbalancerId;
            return this;
        }

        /**
         * @param loadbalancerId The ID of the Load Balancer in which to create the NAT pool.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerId(String loadbalancerId) {
            return loadbalancerId(Output.of(loadbalancerId));
        }

        /**
         * @param name Specifies the name of the NAT pool.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the NAT pool.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protocol The transport protocol for the external endpoint. Possible values are `Udp` or `Tcp`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The transport protocol for the external endpoint. Possible values are `Udp` or `Tcp`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tcpResetEnabled Is TCP Reset enabled for this Load Balancer Rule? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tcpResetEnabled(@Nullable Output<Boolean> tcpResetEnabled) {
            $.tcpResetEnabled = tcpResetEnabled;
            return this;
        }

        /**
         * @param tcpResetEnabled Is TCP Reset enabled for this Load Balancer Rule? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tcpResetEnabled(Boolean tcpResetEnabled) {
            return tcpResetEnabled(Output.of(tcpResetEnabled));
        }

        public NatPoolArgs build() {
            $.backendPort = Objects.requireNonNull($.backendPort, "expected parameter 'backendPort' to be non-null");
            $.frontendIpConfigurationName = Objects.requireNonNull($.frontendIpConfigurationName, "expected parameter 'frontendIpConfigurationName' to be non-null");
            $.frontendPortEnd = Objects.requireNonNull($.frontendPortEnd, "expected parameter 'frontendPortEnd' to be non-null");
            $.frontendPortStart = Objects.requireNonNull($.frontendPortStart, "expected parameter 'frontendPortStart' to be non-null");
            $.loadbalancerId = Objects.requireNonNull($.loadbalancerId, "expected parameter 'loadbalancerId' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
