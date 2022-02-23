// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine;

import io.pulumi.azurenative.sqlvirtualmachine.inputs.LoadBalancerConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AvailabilityGroupListenerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AvailabilityGroupListenerArgs Empty = new AvailabilityGroupListenerArgs();

    /**
     * Name of the availability group listener.
     * 
     */
    @InputImport(name="availabilityGroupListenerName")
        private final @Nullable Input<String> availabilityGroupListenerName;

    public Input<String> getAvailabilityGroupListenerName() {
        return this.availabilityGroupListenerName == null ? Input.empty() : this.availabilityGroupListenerName;
    }

    /**
     * Name of the availability group.
     * 
     */
    @InputImport(name="availabilityGroupName")
        private final @Nullable Input<String> availabilityGroupName;

    public Input<String> getAvailabilityGroupName() {
        return this.availabilityGroupName == null ? Input.empty() : this.availabilityGroupName;
    }

    /**
     * Create a default availability group if it does not exist.
     * 
     */
    @InputImport(name="createDefaultAvailabilityGroupIfNotExist")
        private final @Nullable Input<Boolean> createDefaultAvailabilityGroupIfNotExist;

    public Input<Boolean> getCreateDefaultAvailabilityGroupIfNotExist() {
        return this.createDefaultAvailabilityGroupIfNotExist == null ? Input.empty() : this.createDefaultAvailabilityGroupIfNotExist;
    }

    /**
     * List of load balancer configurations for an availability group listener.
     * 
     */
    @InputImport(name="loadBalancerConfigurations")
        private final @Nullable Input<List<LoadBalancerConfigurationArgs>> loadBalancerConfigurations;

    public Input<List<LoadBalancerConfigurationArgs>> getLoadBalancerConfigurations() {
        return this.loadBalancerConfigurations == null ? Input.empty() : this.loadBalancerConfigurations;
    }

    /**
     * Listener port.
     * 
     */
    @InputImport(name="port")
        private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the SQL virtual machine group.
     * 
     */
    @InputImport(name="sqlVirtualMachineGroupName", required=true)
        private final Input<String> sqlVirtualMachineGroupName;

    public Input<String> getSqlVirtualMachineGroupName() {
        return this.sqlVirtualMachineGroupName;
    }

    public AvailabilityGroupListenerArgs(
        @Nullable Input<String> availabilityGroupListenerName,
        @Nullable Input<String> availabilityGroupName,
        @Nullable Input<Boolean> createDefaultAvailabilityGroupIfNotExist,
        @Nullable Input<List<LoadBalancerConfigurationArgs>> loadBalancerConfigurations,
        @Nullable Input<Integer> port,
        Input<String> resourceGroupName,
        Input<String> sqlVirtualMachineGroupName) {
        this.availabilityGroupListenerName = availabilityGroupListenerName;
        this.availabilityGroupName = availabilityGroupName;
        this.createDefaultAvailabilityGroupIfNotExist = createDefaultAvailabilityGroupIfNotExist;
        this.loadBalancerConfigurations = loadBalancerConfigurations;
        this.port = port;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlVirtualMachineGroupName = Objects.requireNonNull(sqlVirtualMachineGroupName, "expected parameter 'sqlVirtualMachineGroupName' to be non-null");
    }

    private AvailabilityGroupListenerArgs() {
        this.availabilityGroupListenerName = Input.empty();
        this.availabilityGroupName = Input.empty();
        this.createDefaultAvailabilityGroupIfNotExist = Input.empty();
        this.loadBalancerConfigurations = Input.empty();
        this.port = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sqlVirtualMachineGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailabilityGroupListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> availabilityGroupListenerName;
        private @Nullable Input<String> availabilityGroupName;
        private @Nullable Input<Boolean> createDefaultAvailabilityGroupIfNotExist;
        private @Nullable Input<List<LoadBalancerConfigurationArgs>> loadBalancerConfigurations;
        private @Nullable Input<Integer> port;
        private Input<String> resourceGroupName;
        private Input<String> sqlVirtualMachineGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(AvailabilityGroupListenerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityGroupListenerName = defaults.availabilityGroupListenerName;
    	      this.availabilityGroupName = defaults.availabilityGroupName;
    	      this.createDefaultAvailabilityGroupIfNotExist = defaults.createDefaultAvailabilityGroupIfNotExist;
    	      this.loadBalancerConfigurations = defaults.loadBalancerConfigurations;
    	      this.port = defaults.port;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlVirtualMachineGroupName = defaults.sqlVirtualMachineGroupName;
        }

        public Builder setAvailabilityGroupListenerName(@Nullable Input<String> availabilityGroupListenerName) {
            this.availabilityGroupListenerName = availabilityGroupListenerName;
            return this;
        }

        public Builder setAvailabilityGroupListenerName(@Nullable String availabilityGroupListenerName) {
            this.availabilityGroupListenerName = Input.ofNullable(availabilityGroupListenerName);
            return this;
        }

        public Builder setAvailabilityGroupName(@Nullable Input<String> availabilityGroupName) {
            this.availabilityGroupName = availabilityGroupName;
            return this;
        }

        public Builder setAvailabilityGroupName(@Nullable String availabilityGroupName) {
            this.availabilityGroupName = Input.ofNullable(availabilityGroupName);
            return this;
        }

        public Builder setCreateDefaultAvailabilityGroupIfNotExist(@Nullable Input<Boolean> createDefaultAvailabilityGroupIfNotExist) {
            this.createDefaultAvailabilityGroupIfNotExist = createDefaultAvailabilityGroupIfNotExist;
            return this;
        }

        public Builder setCreateDefaultAvailabilityGroupIfNotExist(@Nullable Boolean createDefaultAvailabilityGroupIfNotExist) {
            this.createDefaultAvailabilityGroupIfNotExist = Input.ofNullable(createDefaultAvailabilityGroupIfNotExist);
            return this;
        }

        public Builder setLoadBalancerConfigurations(@Nullable Input<List<LoadBalancerConfigurationArgs>> loadBalancerConfigurations) {
            this.loadBalancerConfigurations = loadBalancerConfigurations;
            return this;
        }

        public Builder setLoadBalancerConfigurations(@Nullable List<LoadBalancerConfigurationArgs> loadBalancerConfigurations) {
            this.loadBalancerConfigurations = Input.ofNullable(loadBalancerConfigurations);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSqlVirtualMachineGroupName(Input<String> sqlVirtualMachineGroupName) {
            this.sqlVirtualMachineGroupName = Objects.requireNonNull(sqlVirtualMachineGroupName);
            return this;
        }

        public Builder setSqlVirtualMachineGroupName(String sqlVirtualMachineGroupName) {
            this.sqlVirtualMachineGroupName = Input.of(Objects.requireNonNull(sqlVirtualMachineGroupName));
            return this;
        }
        public AvailabilityGroupListenerArgs build() {
            return new AvailabilityGroupListenerArgs(availabilityGroupListenerName, availabilityGroupName, createDefaultAvailabilityGroupIfNotExist, loadBalancerConfigurations, port, resourceGroupName, sqlVirtualMachineGroupName);
        }
    }
}
