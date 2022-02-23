// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.inputs.MetricConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class MonitoringConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringConfigArgs Empty = new MonitoringConfigArgs();

    /**
     * The device name.
     * 
     */
    @InputImport(name="deviceName", required=true)
        private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * The metrics configuration details
     * 
     */
    @InputImport(name="metricConfigurations", required=true)
        private final Input<List<MetricConfigurationArgs>> metricConfigurations;

    public Input<List<MetricConfigurationArgs>> getMetricConfigurations() {
        return this.metricConfigurations;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The role name.
     * 
     */
    @InputImport(name="roleName", required=true)
        private final Input<String> roleName;

    public Input<String> getRoleName() {
        return this.roleName;
    }

    public MonitoringConfigArgs(
        Input<String> deviceName,
        Input<List<MetricConfigurationArgs>> metricConfigurations,
        Input<String> resourceGroupName,
        Input<String> roleName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.metricConfigurations = Objects.requireNonNull(metricConfigurations, "expected parameter 'metricConfigurations' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.roleName = Objects.requireNonNull(roleName, "expected parameter 'roleName' to be non-null");
    }

    private MonitoringConfigArgs() {
        this.deviceName = Input.empty();
        this.metricConfigurations = Input.empty();
        this.resourceGroupName = Input.empty();
        this.roleName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> deviceName;
        private Input<List<MetricConfigurationArgs>> metricConfigurations;
        private Input<String> resourceGroupName;
        private Input<String> roleName;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.metricConfigurations = defaults.metricConfigurations;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roleName = defaults.roleName;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setMetricConfigurations(Input<List<MetricConfigurationArgs>> metricConfigurations) {
            this.metricConfigurations = Objects.requireNonNull(metricConfigurations);
            return this;
        }

        public Builder setMetricConfigurations(List<MetricConfigurationArgs> metricConfigurations) {
            this.metricConfigurations = Input.of(Objects.requireNonNull(metricConfigurations));
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

        public Builder setRoleName(Input<String> roleName) {
            this.roleName = Objects.requireNonNull(roleName);
            return this;
        }

        public Builder setRoleName(String roleName) {
            this.roleName = Input.of(Objects.requireNonNull(roleName));
            return this;
        }
        public MonitoringConfigArgs build() {
            return new MonitoringConfigArgs(deviceName, metricConfigurations, resourceGroupName, roleName);
        }
    }
}
