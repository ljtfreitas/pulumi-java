// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.AutomationRuleModifyPropertiesActionActionConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes an automation rule action to modify an object's properties
 * 
 */
public final class AutomationRuleModifyPropertiesActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomationRuleModifyPropertiesActionArgs Empty = new AutomationRuleModifyPropertiesActionArgs();

    /**
     * The configuration of the modify properties automation rule action
     * 
     */
    @InputImport(name="actionConfiguration", required=true)
    private final Input<AutomationRuleModifyPropertiesActionActionConfigurationArgs> actionConfiguration;

    public Input<AutomationRuleModifyPropertiesActionActionConfigurationArgs> getActionConfiguration() {
        return this.actionConfiguration;
    }

    /**
     * The type of the automation rule action
     * Expected value is 'ModifyProperties'.
     * 
     */
    @InputImport(name="actionType", required=true)
    private final Input<String> actionType;

    public Input<String> getActionType() {
        return this.actionType;
    }

    /**
     * The order of execution of the automation rule action
     * 
     */
    @InputImport(name="order", required=true)
    private final Input<Integer> order;

    public Input<Integer> getOrder() {
        return this.order;
    }

    public AutomationRuleModifyPropertiesActionArgs(
        Input<AutomationRuleModifyPropertiesActionActionConfigurationArgs> actionConfiguration,
        Input<String> actionType,
        Input<Integer> order) {
        this.actionConfiguration = Objects.requireNonNull(actionConfiguration, "expected parameter 'actionConfiguration' to be non-null");
        this.actionType = Objects.requireNonNull(actionType, "expected parameter 'actionType' to be non-null");
        this.order = Objects.requireNonNull(order, "expected parameter 'order' to be non-null");
    }

    private AutomationRuleModifyPropertiesActionArgs() {
        this.actionConfiguration = Input.empty();
        this.actionType = Input.empty();
        this.order = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleModifyPropertiesActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AutomationRuleModifyPropertiesActionActionConfigurationArgs> actionConfiguration;
        private Input<String> actionType;
        private Input<Integer> order;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleModifyPropertiesActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionConfiguration = defaults.actionConfiguration;
    	      this.actionType = defaults.actionType;
    	      this.order = defaults.order;
        }

        public Builder setActionConfiguration(Input<AutomationRuleModifyPropertiesActionActionConfigurationArgs> actionConfiguration) {
            this.actionConfiguration = Objects.requireNonNull(actionConfiguration);
            return this;
        }

        public Builder setActionConfiguration(AutomationRuleModifyPropertiesActionActionConfigurationArgs actionConfiguration) {
            this.actionConfiguration = Input.of(Objects.requireNonNull(actionConfiguration));
            return this;
        }

        public Builder setActionType(Input<String> actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }

        public Builder setActionType(String actionType) {
            this.actionType = Input.of(Objects.requireNonNull(actionType));
            return this;
        }

        public Builder setOrder(Input<Integer> order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }

        public Builder setOrder(Integer order) {
            this.order = Input.of(Objects.requireNonNull(order));
            return this;
        }

        public AutomationRuleModifyPropertiesActionArgs build() {
            return new AutomationRuleModifyPropertiesActionArgs(actionConfiguration, actionType, order);
        }
    }
}
