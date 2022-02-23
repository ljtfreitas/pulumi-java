// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.ActionListResponse;
import io.pulumi.azurenative.insights.outputs.AlertRuleAllOfConditionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetActivityLogAlertResult {
    /**
     * The actions that will activate when the condition is met.
     * 
     */
    private final ActionListResponse actions;
    /**
     * The condition that will cause this alert to activate.
     * 
     */
    private final AlertRuleAllOfConditionResponse condition;
    /**
     * A description of this Activity Log Alert rule.
     * 
     */
    private final @Nullable String description;
    /**
     * Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert rule is not enabled, then none of its actions will be activated.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The resource Id.
     * 
     */
    private final String id;
    /**
     * The location of the resource. Since Azure Activity Log Alerts is a global service, the location of the rules should always be 'global'.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * A list of resource IDs that will be used as prefixes. The alert will only apply to Activity Log events with resource IDs that fall under one of these prefixes. This list must include at least one item.
     * 
     */
    private final List<String> scopes;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"actions","condition","description","enabled","id","location","name","scopes","tags","type"})
    private GetActivityLogAlertResult(
        ActionListResponse actions,
        AlertRuleAllOfConditionResponse condition,
        @Nullable String description,
        @Nullable Boolean enabled,
        String id,
        @Nullable String location,
        String name,
        List<String> scopes,
        @Nullable Map<String,String> tags,
        String type) {
        this.actions = Objects.requireNonNull(actions);
        this.condition = Objects.requireNonNull(condition);
        this.description = description;
        this.enabled = enabled;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.scopes = Objects.requireNonNull(scopes);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The actions that will activate when the condition is met.
     * 
     */
    public ActionListResponse getActions() {
        return this.actions;
    }
    /**
     * The condition that will cause this alert to activate.
     * 
     */
    public AlertRuleAllOfConditionResponse getCondition() {
        return this.condition;
    }
    /**
     * A description of this Activity Log Alert rule.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert rule is not enabled, then none of its actions will be activated.
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The location of the resource. Since Azure Activity Log Alerts is a global service, the location of the rules should always be 'global'.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * A list of resource IDs that will be used as prefixes. The alert will only apply to Activity Log events with resource IDs that fall under one of these prefixes. This list must include at least one item.
     * 
     */
    public List<String> getScopes() {
        return this.scopes;
    }
    /**
     * The tags of the resource.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActivityLogAlertResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionListResponse actions;
        private AlertRuleAllOfConditionResponse condition;
        private @Nullable String description;
        private @Nullable Boolean enabled;
        private String id;
        private @Nullable String location;
        private String name;
        private List<String> scopes;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActivityLogAlertResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.condition = defaults.condition;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.scopes = defaults.scopes;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setActions(ActionListResponse actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setCondition(AlertRuleAllOfConditionResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setScopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
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
        public GetActivityLogAlertResult build() {
            return new GetActivityLogAlertResult(actions, condition, description, enabled, id, location, name, scopes, tags, type);
        }
    }
}
