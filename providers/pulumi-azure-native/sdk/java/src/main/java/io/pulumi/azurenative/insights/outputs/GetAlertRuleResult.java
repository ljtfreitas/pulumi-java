// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.LocationThresholdRuleConditionResponse;
import io.pulumi.azurenative.insights.outputs.ManagementEventRuleConditionResponse;
import io.pulumi.azurenative.insights.outputs.RuleEmailActionResponse;
import io.pulumi.azurenative.insights.outputs.RuleWebhookActionResponse;
import io.pulumi.azurenative.insights.outputs.ThresholdRuleConditionResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAlertRuleResult {
    /**
     * action that is performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    private final @Nullable Either<RuleEmailActionResponse,RuleWebhookActionResponse> action;
    /**
     * the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    private final @Nullable List<Either<RuleEmailActionResponse,RuleWebhookActionResponse>> actions;
    /**
     * the condition that results in the alert rule being activated.
     * 
     */
    private final Object condition;
    /**
     * the description of the alert rule that will be included in the alert email.
     * 
     */
    private final @Nullable String description;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * the flag that indicates whether the alert rule is enabled.
     * 
     */
    private final Boolean isEnabled;
    /**
     * Last time the rule was updated in ISO8601 format.
     * 
     */
    private final String lastUpdatedTime;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * the provisioning state.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"action","actions","condition","description","id","isEnabled","lastUpdatedTime","location","name","provisioningState","tags","type"})
    private GetAlertRuleResult(
        @Nullable Either<RuleEmailActionResponse,RuleWebhookActionResponse> action,
        @Nullable List<Either<RuleEmailActionResponse,RuleWebhookActionResponse>> actions,
        Object condition,
        @Nullable String description,
        String id,
        Boolean isEnabled,
        String lastUpdatedTime,
        String location,
        String name,
        @Nullable String provisioningState,
        @Nullable Map<String,String> tags,
        String type) {
        this.action = action;
        this.actions = actions;
        this.condition = Objects.requireNonNull(condition);
        this.description = description;
        this.id = Objects.requireNonNull(id);
        this.isEnabled = Objects.requireNonNull(isEnabled);
        this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * action that is performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    public Optional<Either<RuleEmailActionResponse,RuleWebhookActionResponse>> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    public List<Either<RuleEmailActionResponse,RuleWebhookActionResponse>> getActions() {
        return this.actions == null ? List.of() : this.actions;
    }
    /**
     * the condition that results in the alert rule being activated.
     * 
     */
    public Object getCondition() {
        return this.condition;
    }
    /**
     * the description of the alert rule that will be included in the alert email.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Azure resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * the flag that indicates whether the alert rule is enabled.
     * 
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Last time the rule was updated in ISO8601 format.
     * 
     */
    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * Resource location
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Azure resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * the provisioning state.
     * 
     */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Resource tags
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Azure resource type
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<RuleEmailActionResponse,RuleWebhookActionResponse> action;
        private @Nullable List<Either<RuleEmailActionResponse,RuleWebhookActionResponse>> actions;
        private Object condition;
        private @Nullable String description;
        private String id;
        private Boolean isEnabled;
        private String lastUpdatedTime;
        private String location;
        private String name;
        private @Nullable String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlertRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.actions = defaults.actions;
    	      this.condition = defaults.condition;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.isEnabled = defaults.isEnabled;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAction(@Nullable Either<RuleEmailActionResponse,RuleWebhookActionResponse> action) {
            this.action = action;
            return this;
        }

        public Builder setActions(@Nullable List<Either<RuleEmailActionResponse,RuleWebhookActionResponse>> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setCondition(Object condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setLastUpdatedTime(String lastUpdatedTime) {
            this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetAlertRuleResult build() {
            return new GetAlertRuleResult(action, actions, condition, description, id, isEnabled, lastUpdatedTime, location, name, provisioningState, tags, type);
        }
    }
}
