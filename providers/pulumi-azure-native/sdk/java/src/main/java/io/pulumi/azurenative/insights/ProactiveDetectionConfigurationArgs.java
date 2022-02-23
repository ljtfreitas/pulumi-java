// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.insights.inputs.ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProactiveDetectionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProactiveDetectionConfigurationArgs Empty = new ProactiveDetectionConfigurationArgs();

    /**
     * The ProactiveDetection configuration ID. This is unique within a Application Insights component.
     * 
     */
    @InputImport(name="configurationId")
        private final @Nullable Input<String> configurationId;

    public Input<String> getConfigurationId() {
        return this.configurationId == null ? Input.empty() : this.configurationId;
    }

    /**
     * Custom email addresses for this rule notifications
     * 
     */
    @InputImport(name="customEmails")
        private final @Nullable Input<List<String>> customEmails;

    public Input<List<String>> getCustomEmails() {
        return this.customEmails == null ? Input.empty() : this.customEmails;
    }

    /**
     * A flag that indicates whether this rule is enabled by the user
     * 
     */
    @InputImport(name="enabled")
        private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The last time this rule was updated
     * 
     */
    @InputImport(name="lastUpdatedTime")
        private final @Nullable Input<String> lastUpdatedTime;

    public Input<String> getLastUpdatedTime() {
        return this.lastUpdatedTime == null ? Input.empty() : this.lastUpdatedTime;
    }

    /**
     * The rule name
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Application Insights component resource.
     * 
     */
    @InputImport(name="resourceName", required=true)
        private final Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName;
    }

    /**
     * Static definitions of the ProactiveDetection configuration rule (same values for all components).
     * 
     */
    @InputImport(name="ruleDefinitions")
        private final @Nullable Input<ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs> ruleDefinitions;

    public Input<ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs> getRuleDefinitions() {
        return this.ruleDefinitions == null ? Input.empty() : this.ruleDefinitions;
    }

    /**
     * A flag that indicated whether notifications on this rule should be sent to subscription owners
     * 
     */
    @InputImport(name="sendEmailsToSubscriptionOwners")
        private final @Nullable Input<Boolean> sendEmailsToSubscriptionOwners;

    public Input<Boolean> getSendEmailsToSubscriptionOwners() {
        return this.sendEmailsToSubscriptionOwners == null ? Input.empty() : this.sendEmailsToSubscriptionOwners;
    }

    public ProactiveDetectionConfigurationArgs(
        @Nullable Input<String> configurationId,
        @Nullable Input<List<String>> customEmails,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> lastUpdatedTime,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        Input<String> resourceName,
        @Nullable Input<ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs> ruleDefinitions,
        @Nullable Input<Boolean> sendEmailsToSubscriptionOwners) {
        this.configurationId = configurationId;
        this.customEmails = customEmails;
        this.enabled = enabled;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.ruleDefinitions = ruleDefinitions;
        this.sendEmailsToSubscriptionOwners = sendEmailsToSubscriptionOwners;
    }

    private ProactiveDetectionConfigurationArgs() {
        this.configurationId = Input.empty();
        this.customEmails = Input.empty();
        this.enabled = Input.empty();
        this.lastUpdatedTime = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.ruleDefinitions = Input.empty();
        this.sendEmailsToSubscriptionOwners = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProactiveDetectionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configurationId;
        private @Nullable Input<List<String>> customEmails;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> lastUpdatedTime;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private Input<String> resourceName;
        private @Nullable Input<ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs> ruleDefinitions;
        private @Nullable Input<Boolean> sendEmailsToSubscriptionOwners;

        public Builder() {
    	      // Empty
        }

        public Builder(ProactiveDetectionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationId = defaults.configurationId;
    	      this.customEmails = defaults.customEmails;
    	      this.enabled = defaults.enabled;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.ruleDefinitions = defaults.ruleDefinitions;
    	      this.sendEmailsToSubscriptionOwners = defaults.sendEmailsToSubscriptionOwners;
        }

        public Builder setConfigurationId(@Nullable Input<String> configurationId) {
            this.configurationId = configurationId;
            return this;
        }

        public Builder setConfigurationId(@Nullable String configurationId) {
            this.configurationId = Input.ofNullable(configurationId);
            return this;
        }

        public Builder setCustomEmails(@Nullable Input<List<String>> customEmails) {
            this.customEmails = customEmails;
            return this;
        }

        public Builder setCustomEmails(@Nullable List<String> customEmails) {
            this.customEmails = Input.ofNullable(customEmails);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable Input<String> lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = Input.ofNullable(lastUpdatedTime);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setResourceName(Input<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Input.of(Objects.requireNonNull(resourceName));
            return this;
        }

        public Builder setRuleDefinitions(@Nullable Input<ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs> ruleDefinitions) {
            this.ruleDefinitions = ruleDefinitions;
            return this;
        }

        public Builder setRuleDefinitions(@Nullable ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs ruleDefinitions) {
            this.ruleDefinitions = Input.ofNullable(ruleDefinitions);
            return this;
        }

        public Builder setSendEmailsToSubscriptionOwners(@Nullable Input<Boolean> sendEmailsToSubscriptionOwners) {
            this.sendEmailsToSubscriptionOwners = sendEmailsToSubscriptionOwners;
            return this;
        }

        public Builder setSendEmailsToSubscriptionOwners(@Nullable Boolean sendEmailsToSubscriptionOwners) {
            this.sendEmailsToSubscriptionOwners = Input.ofNullable(sendEmailsToSubscriptionOwners);
            return this;
        }
        public ProactiveDetectionConfigurationArgs build() {
            return new ProactiveDetectionConfigurationArgs(configurationId, customEmails, enabled, lastUpdatedTime, name, resourceGroupName, resourceName, ruleDefinitions, sendEmailsToSubscriptionOwners);
        }
    }
}
