// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.AutomationRuleModifyPropertiesActionResponseActionConfiguration;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes an automation rule action to modify an object's properties
 * 
 */
public final class AutomationRuleModifyPropertiesActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutomationRuleModifyPropertiesActionResponse Empty = new AutomationRuleModifyPropertiesActionResponse();

    /**
     * The configuration of the modify properties automation rule action
     * 
     */
    @Import(name="actionConfiguration", required=true)
      private final AutomationRuleModifyPropertiesActionResponseActionConfiguration actionConfiguration;

    public AutomationRuleModifyPropertiesActionResponseActionConfiguration getActionConfiguration() {
        return this.actionConfiguration;
    }

    /**
     * The type of the automation rule action
     * Expected value is 'ModifyProperties'.
     * 
     */
    @Import(name="actionType", required=true)
      private final String actionType;

    public String getActionType() {
        return this.actionType;
    }

    /**
     * The order of execution of the automation rule action
     * 
     */
    @Import(name="order", required=true)
      private final Integer order;

    public Integer getOrder() {
        return this.order;
    }

    public AutomationRuleModifyPropertiesActionResponse(
        AutomationRuleModifyPropertiesActionResponseActionConfiguration actionConfiguration,
        String actionType,
        Integer order) {
        this.actionConfiguration = Objects.requireNonNull(actionConfiguration, "expected parameter 'actionConfiguration' to be non-null");
        this.actionType = Objects.requireNonNull(actionType, "expected parameter 'actionType' to be non-null");
        this.order = Objects.requireNonNull(order, "expected parameter 'order' to be non-null");
    }

    private AutomationRuleModifyPropertiesActionResponse() {
        this.actionConfiguration = null;
        this.actionType = null;
        this.order = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleModifyPropertiesActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationRuleModifyPropertiesActionResponseActionConfiguration actionConfiguration;
        private String actionType;
        private Integer order;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleModifyPropertiesActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionConfiguration = defaults.actionConfiguration;
    	      this.actionType = defaults.actionType;
    	      this.order = defaults.order;
        }

        public Builder actionConfiguration(AutomationRuleModifyPropertiesActionResponseActionConfiguration actionConfiguration) {
            this.actionConfiguration = Objects.requireNonNull(actionConfiguration);
            return this;
        }

        public Builder actionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }

        public Builder order(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        public AutomationRuleModifyPropertiesActionResponse build() {
            return new AutomationRuleModifyPropertiesActionResponse(actionConfiguration, actionType, order);
        }
    }
}
