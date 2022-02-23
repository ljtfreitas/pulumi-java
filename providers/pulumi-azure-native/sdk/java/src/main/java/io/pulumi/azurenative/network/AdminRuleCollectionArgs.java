// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.NetworkManagerSecurityGroupItemArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AdminRuleCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdminRuleCollectionArgs Empty = new AdminRuleCollectionArgs();

    /**
     * Groups for configuration
     * 
     */
    @InputImport(name="appliesToGroups")
        private final @Nullable Input<List<NetworkManagerSecurityGroupItemArgs>> appliesToGroups;

    public Input<List<NetworkManagerSecurityGroupItemArgs>> getAppliesToGroups() {
        return this.appliesToGroups == null ? Input.empty() : this.appliesToGroups;
    }

    /**
     * The name of the network manager security Configuration.
     * 
     */
    @InputImport(name="configurationName", required=true)
        private final Input<String> configurationName;

    public Input<String> getConfigurationName() {
        return this.configurationName;
    }

    /**
     * A description of the rule collection.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A display name of the rule collection.
     * 
     */
    @InputImport(name="displayName")
        private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The name of the network manager.
     * 
     */
    @InputImport(name="networkManagerName", required=true)
        private final Input<String> networkManagerName;

    public Input<String> getNetworkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the network manager security Configuration rule collection.
     * 
     */
    @InputImport(name="ruleCollectionName")
        private final @Nullable Input<String> ruleCollectionName;

    public Input<String> getRuleCollectionName() {
        return this.ruleCollectionName == null ? Input.empty() : this.ruleCollectionName;
    }

    public AdminRuleCollectionArgs(
        @Nullable Input<List<NetworkManagerSecurityGroupItemArgs>> appliesToGroups,
        Input<String> configurationName,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        Input<String> networkManagerName,
        Input<String> resourceGroupName,
        @Nullable Input<String> ruleCollectionName) {
        this.appliesToGroups = appliesToGroups;
        this.configurationName = Objects.requireNonNull(configurationName, "expected parameter 'configurationName' to be non-null");
        this.description = description;
        this.displayName = displayName;
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleCollectionName = ruleCollectionName;
    }

    private AdminRuleCollectionArgs() {
        this.appliesToGroups = Input.empty();
        this.configurationName = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.networkManagerName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleCollectionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdminRuleCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<NetworkManagerSecurityGroupItemArgs>> appliesToGroups;
        private Input<String> configurationName;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private Input<String> networkManagerName;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> ruleCollectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(AdminRuleCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliesToGroups = defaults.appliesToGroups;
    	      this.configurationName = defaults.configurationName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleCollectionName = defaults.ruleCollectionName;
        }

        public Builder setAppliesToGroups(@Nullable Input<List<NetworkManagerSecurityGroupItemArgs>> appliesToGroups) {
            this.appliesToGroups = appliesToGroups;
            return this;
        }

        public Builder setAppliesToGroups(@Nullable List<NetworkManagerSecurityGroupItemArgs> appliesToGroups) {
            this.appliesToGroups = Input.ofNullable(appliesToGroups);
            return this;
        }

        public Builder setConfigurationName(Input<String> configurationName) {
            this.configurationName = Objects.requireNonNull(configurationName);
            return this;
        }

        public Builder setConfigurationName(String configurationName) {
            this.configurationName = Input.of(Objects.requireNonNull(configurationName));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setNetworkManagerName(Input<String> networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }

        public Builder setNetworkManagerName(String networkManagerName) {
            this.networkManagerName = Input.of(Objects.requireNonNull(networkManagerName));
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

        public Builder setRuleCollectionName(@Nullable Input<String> ruleCollectionName) {
            this.ruleCollectionName = ruleCollectionName;
            return this;
        }

        public Builder setRuleCollectionName(@Nullable String ruleCollectionName) {
            this.ruleCollectionName = Input.ofNullable(ruleCollectionName);
            return this;
        }
        public AdminRuleCollectionArgs build() {
            return new AdminRuleCollectionArgs(appliesToGroups, configurationName, description, displayName, networkManagerName, resourceGroupName, ruleCollectionName);
        }
    }
}
