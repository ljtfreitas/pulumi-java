// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.CustomRuleListArgs;
import io.pulumi.azurenative.network.inputs.FrontDoorPolicySettingsArgs;
import io.pulumi.azurenative.network.inputs.ManagedRuleSetListArgs;
import io.pulumi.azurenative.network.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * Describes custom rules inside the policy.
     * 
     */
    @InputImport(name="customRules")
    private final @Nullable Input<CustomRuleListArgs> customRules;

    public Input<CustomRuleListArgs> getCustomRules() {
        return this.customRules == null ? Input.empty() : this.customRules;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Describes managed rules inside the policy.
     * 
     */
    @InputImport(name="managedRules")
    private final @Nullable Input<ManagedRuleSetListArgs> managedRules;

    public Input<ManagedRuleSetListArgs> getManagedRules() {
        return this.managedRules == null ? Input.empty() : this.managedRules;
    }

    /**
     * The name of the Web Application Firewall Policy.
     * 
     */
    @InputImport(name="policyName")
    private final @Nullable Input<String> policyName;

    public Input<String> getPolicyName() {
        return this.policyName == null ? Input.empty() : this.policyName;
    }

    /**
     * Describes settings for the policy.
     * 
     */
    @InputImport(name="policySettings")
    private final @Nullable Input<FrontDoorPolicySettingsArgs> policySettings;

    public Input<FrontDoorPolicySettingsArgs> getPolicySettings() {
        return this.policySettings == null ? Input.empty() : this.policySettings;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The pricing tier of web application firewall policy. Defaults to Classic_AzureFrontDoor if not specified.
     * 
     */
    @InputImport(name="sku")
    private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public PolicyArgs(
        @Nullable Input<CustomRuleListArgs> customRules,
        @Nullable Input<String> location,
        @Nullable Input<ManagedRuleSetListArgs> managedRules,
        @Nullable Input<String> policyName,
        @Nullable Input<FrontDoorPolicySettingsArgs> policySettings,
        Input<String> resourceGroupName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.customRules = customRules;
        this.location = location;
        this.managedRules = managedRules;
        this.policyName = policyName;
        this.policySettings = policySettings;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private PolicyArgs() {
        this.customRules = Input.empty();
        this.location = Input.empty();
        this.managedRules = Input.empty();
        this.policyName = Input.empty();
        this.policySettings = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CustomRuleListArgs> customRules;
        private @Nullable Input<String> location;
        private @Nullable Input<ManagedRuleSetListArgs> managedRules;
        private @Nullable Input<String> policyName;
        private @Nullable Input<FrontDoorPolicySettingsArgs> policySettings;
        private Input<String> resourceGroupName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRules = defaults.customRules;
    	      this.location = defaults.location;
    	      this.managedRules = defaults.managedRules;
    	      this.policyName = defaults.policyName;
    	      this.policySettings = defaults.policySettings;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setCustomRules(@Nullable Input<CustomRuleListArgs> customRules) {
            this.customRules = customRules;
            return this;
        }

        public Builder setCustomRules(@Nullable CustomRuleListArgs customRules) {
            this.customRules = Input.ofNullable(customRules);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setManagedRules(@Nullable Input<ManagedRuleSetListArgs> managedRules) {
            this.managedRules = managedRules;
            return this;
        }

        public Builder setManagedRules(@Nullable ManagedRuleSetListArgs managedRules) {
            this.managedRules = Input.ofNullable(managedRules);
            return this;
        }

        public Builder setPolicyName(@Nullable Input<String> policyName) {
            this.policyName = policyName;
            return this;
        }

        public Builder setPolicyName(@Nullable String policyName) {
            this.policyName = Input.ofNullable(policyName);
            return this;
        }

        public Builder setPolicySettings(@Nullable Input<FrontDoorPolicySettingsArgs> policySettings) {
            this.policySettings = policySettings;
            return this;
        }

        public Builder setPolicySettings(@Nullable FrontDoorPolicySettingsArgs policySettings) {
            this.policySettings = Input.ofNullable(policySettings);
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

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public PolicyArgs build() {
            return new PolicyArgs(customRules, location, managedRules, policyName, policySettings, resourceGroupName, sku, tags);
        }
    }
}
