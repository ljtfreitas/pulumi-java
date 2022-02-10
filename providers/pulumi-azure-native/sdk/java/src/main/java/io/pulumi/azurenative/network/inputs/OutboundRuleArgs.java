// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.LoadBalancerOutboundRuleProtocol;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OutboundRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final OutboundRuleArgs Empty = new OutboundRuleArgs();

    @InputImport(name="allocatedOutboundPorts")
    private final @Nullable Input<Integer> allocatedOutboundPorts;

    public Input<Integer> getAllocatedOutboundPorts() {
        return this.allocatedOutboundPorts == null ? Input.empty() : this.allocatedOutboundPorts;
    }

    @InputImport(name="backendAddressPool", required=true)
    private final Input<SubResourceArgs> backendAddressPool;

    public Input<SubResourceArgs> getBackendAddressPool() {
        return this.backendAddressPool;
    }

    @InputImport(name="enableTcpReset")
    private final @Nullable Input<Boolean> enableTcpReset;

    public Input<Boolean> getEnableTcpReset() {
        return this.enableTcpReset == null ? Input.empty() : this.enableTcpReset;
    }

    @InputImport(name="frontendIPConfigurations", required=true)
    private final Input<List<SubResourceArgs>> frontendIPConfigurations;

    public Input<List<SubResourceArgs>> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="idleTimeoutInMinutes")
    private final @Nullable Input<Integer> idleTimeoutInMinutes;

    public Input<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Input.empty() : this.idleTimeoutInMinutes;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="protocol", required=true)
    private final Input<Either<String,LoadBalancerOutboundRuleProtocol>> protocol;

    public Input<Either<String,LoadBalancerOutboundRuleProtocol>> getProtocol() {
        return this.protocol;
    }

    public OutboundRuleArgs(
        @Nullable Input<Integer> allocatedOutboundPorts,
        Input<SubResourceArgs> backendAddressPool,
        @Nullable Input<Boolean> enableTcpReset,
        Input<List<SubResourceArgs>> frontendIPConfigurations,
        @Nullable Input<String> id,
        @Nullable Input<Integer> idleTimeoutInMinutes,
        @Nullable Input<String> name,
        Input<Either<String,LoadBalancerOutboundRuleProtocol>> protocol) {
        this.allocatedOutboundPorts = allocatedOutboundPorts;
        this.backendAddressPool = Objects.requireNonNull(backendAddressPool, "expected parameter 'backendAddressPool' to be non-null");
        this.enableTcpReset = enableTcpReset;
        this.frontendIPConfigurations = Objects.requireNonNull(frontendIPConfigurations, "expected parameter 'frontendIPConfigurations' to be non-null");
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.name = name;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private OutboundRuleArgs() {
        this.allocatedOutboundPorts = Input.empty();
        this.backendAddressPool = Input.empty();
        this.enableTcpReset = Input.empty();
        this.frontendIPConfigurations = Input.empty();
        this.id = Input.empty();
        this.idleTimeoutInMinutes = Input.empty();
        this.name = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutboundRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> allocatedOutboundPorts;
        private Input<SubResourceArgs> backendAddressPool;
        private @Nullable Input<Boolean> enableTcpReset;
        private Input<List<SubResourceArgs>> frontendIPConfigurations;
        private @Nullable Input<String> id;
        private @Nullable Input<Integer> idleTimeoutInMinutes;
        private @Nullable Input<String> name;
        private Input<Either<String,LoadBalancerOutboundRuleProtocol>> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(OutboundRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedOutboundPorts = defaults.allocatedOutboundPorts;
    	      this.backendAddressPool = defaults.backendAddressPool;
    	      this.enableTcpReset = defaults.enableTcpReset;
    	      this.frontendIPConfigurations = defaults.frontendIPConfigurations;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder setAllocatedOutboundPorts(@Nullable Input<Integer> allocatedOutboundPorts) {
            this.allocatedOutboundPorts = allocatedOutboundPorts;
            return this;
        }

        public Builder setAllocatedOutboundPorts(@Nullable Integer allocatedOutboundPorts) {
            this.allocatedOutboundPorts = Input.ofNullable(allocatedOutboundPorts);
            return this;
        }

        public Builder setBackendAddressPool(Input<SubResourceArgs> backendAddressPool) {
            this.backendAddressPool = Objects.requireNonNull(backendAddressPool);
            return this;
        }

        public Builder setBackendAddressPool(SubResourceArgs backendAddressPool) {
            this.backendAddressPool = Input.of(Objects.requireNonNull(backendAddressPool));
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

        public Builder setFrontendIPConfigurations(Input<List<SubResourceArgs>> frontendIPConfigurations) {
            this.frontendIPConfigurations = Objects.requireNonNull(frontendIPConfigurations);
            return this;
        }

        public Builder setFrontendIPConfigurations(List<SubResourceArgs> frontendIPConfigurations) {
            this.frontendIPConfigurations = Input.of(Objects.requireNonNull(frontendIPConfigurations));
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

        public Builder setProtocol(Input<Either<String,LoadBalancerOutboundRuleProtocol>> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProtocol(Either<String,LoadBalancerOutboundRuleProtocol> protocol) {
            this.protocol = Input.of(Objects.requireNonNull(protocol));
            return this;
        }

        public OutboundRuleArgs build() {
            return new OutboundRuleArgs(allocatedOutboundPorts, backendAddressPool, enableTcpReset, frontendIPConfigurations, id, idleTimeoutInMinutes, name, protocol);
        }
    }
}