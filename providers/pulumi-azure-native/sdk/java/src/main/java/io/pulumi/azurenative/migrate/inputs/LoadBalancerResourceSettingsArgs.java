// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.LBBackendAddressPoolResourceSettingsArgs;
import io.pulumi.azurenative.migrate.inputs.LBFrontendIPConfigurationResourceSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerResourceSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerResourceSettingsArgs Empty = new LoadBalancerResourceSettingsArgs();

    @InputImport(name="backendAddressPools")
    private final @Nullable Input<List<LBBackendAddressPoolResourceSettingsArgs>> backendAddressPools;

    public Input<List<LBBackendAddressPoolResourceSettingsArgs>> getBackendAddressPools() {
        return this.backendAddressPools == null ? Input.empty() : this.backendAddressPools;
    }

    @InputImport(name="frontendIPConfigurations")
    private final @Nullable Input<List<LBFrontendIPConfigurationResourceSettingsArgs>> frontendIPConfigurations;

    public Input<List<LBFrontendIPConfigurationResourceSettingsArgs>> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations == null ? Input.empty() : this.frontendIPConfigurations;
    }

    @InputImport(name="resourceType", required=true)
    private final Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType;
    }

    @InputImport(name="sku")
    private final @Nullable Input<String> sku;

    public Input<String> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="targetResourceName", required=true)
    private final Input<String> targetResourceName;

    public Input<String> getTargetResourceName() {
        return this.targetResourceName;
    }

    @InputImport(name="zones")
    private final @Nullable Input<String> zones;

    public Input<String> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public LoadBalancerResourceSettingsArgs(
        @Nullable Input<List<LBBackendAddressPoolResourceSettingsArgs>> backendAddressPools,
        @Nullable Input<List<LBFrontendIPConfigurationResourceSettingsArgs>> frontendIPConfigurations,
        Input<String> resourceType,
        @Nullable Input<String> sku,
        Input<String> targetResourceName,
        @Nullable Input<String> zones) {
        this.backendAddressPools = backendAddressPools;
        this.frontendIPConfigurations = frontendIPConfigurations;
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.sku = sku;
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
        this.zones = zones;
    }

    private LoadBalancerResourceSettingsArgs() {
        this.backendAddressPools = Input.empty();
        this.frontendIPConfigurations = Input.empty();
        this.resourceType = Input.empty();
        this.sku = Input.empty();
        this.targetResourceName = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<LBBackendAddressPoolResourceSettingsArgs>> backendAddressPools;
        private @Nullable Input<List<LBFrontendIPConfigurationResourceSettingsArgs>> frontendIPConfigurations;
        private Input<String> resourceType;
        private @Nullable Input<String> sku;
        private Input<String> targetResourceName;
        private @Nullable Input<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerResourceSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPools = defaults.backendAddressPools;
    	      this.frontendIPConfigurations = defaults.frontendIPConfigurations;
    	      this.resourceType = defaults.resourceType;
    	      this.sku = defaults.sku;
    	      this.targetResourceName = defaults.targetResourceName;
    	      this.zones = defaults.zones;
        }

        public Builder setBackendAddressPools(@Nullable Input<List<LBBackendAddressPoolResourceSettingsArgs>> backendAddressPools) {
            this.backendAddressPools = backendAddressPools;
            return this;
        }

        public Builder setBackendAddressPools(@Nullable List<LBBackendAddressPoolResourceSettingsArgs> backendAddressPools) {
            this.backendAddressPools = Input.ofNullable(backendAddressPools);
            return this;
        }

        public Builder setFrontendIPConfigurations(@Nullable Input<List<LBFrontendIPConfigurationResourceSettingsArgs>> frontendIPConfigurations) {
            this.frontendIPConfigurations = frontendIPConfigurations;
            return this;
        }

        public Builder setFrontendIPConfigurations(@Nullable List<LBFrontendIPConfigurationResourceSettingsArgs> frontendIPConfigurations) {
            this.frontendIPConfigurations = Input.ofNullable(frontendIPConfigurations);
            return this;
        }

        public Builder setResourceType(Input<String> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Input.of(Objects.requireNonNull(resourceType));
            return this;
        }

        public Builder setSku(@Nullable Input<String> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable String sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setTargetResourceName(Input<String> targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public Builder setTargetResourceName(String targetResourceName) {
            this.targetResourceName = Input.of(Objects.requireNonNull(targetResourceName));
            return this;
        }

        public Builder setZones(@Nullable Input<String> zones) {
            this.zones = zones;
            return this;
        }

        public Builder setZones(@Nullable String zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }

        public LoadBalancerResourceSettingsArgs build() {
            return new LoadBalancerResourceSettingsArgs(backendAddressPools, frontendIPConfigurations, resourceType, sku, targetResourceName, zones);
        }
    }
}