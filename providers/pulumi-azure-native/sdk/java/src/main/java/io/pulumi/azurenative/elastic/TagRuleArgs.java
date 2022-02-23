// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic;

import io.pulumi.azurenative.elastic.inputs.MonitoringTagRulesPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagRuleArgs Empty = new TagRuleArgs();

    /**
     * Monitor resource name
     * 
     */
    @InputImport(name="monitorName", required=true)
        private final Input<String> monitorName;

    public Input<String> getMonitorName() {
        return this.monitorName;
    }

    /**
     * Properties of the monitoring tag rules.
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Input<MonitoringTagRulesPropertiesArgs> properties;

    public Input<MonitoringTagRulesPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group to which the Elastic resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tag Rule Set resource name
     * 
     */
    @InputImport(name="ruleSetName")
        private final @Nullable Input<String> ruleSetName;

    public Input<String> getRuleSetName() {
        return this.ruleSetName == null ? Input.empty() : this.ruleSetName;
    }

    public TagRuleArgs(
        Input<String> monitorName,
        @Nullable Input<MonitoringTagRulesPropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<String> ruleSetName) {
        this.monitorName = Objects.requireNonNull(monitorName, "expected parameter 'monitorName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleSetName = ruleSetName;
    }

    private TagRuleArgs() {
        this.monitorName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleSetName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> monitorName;
        private @Nullable Input<MonitoringTagRulesPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> ruleSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(TagRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitorName = defaults.monitorName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleSetName = defaults.ruleSetName;
        }

        public Builder setMonitorName(Input<String> monitorName) {
            this.monitorName = Objects.requireNonNull(monitorName);
            return this;
        }

        public Builder setMonitorName(String monitorName) {
            this.monitorName = Input.of(Objects.requireNonNull(monitorName));
            return this;
        }

        public Builder setProperties(@Nullable Input<MonitoringTagRulesPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable MonitoringTagRulesPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
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

        public Builder setRuleSetName(@Nullable Input<String> ruleSetName) {
            this.ruleSetName = ruleSetName;
            return this;
        }

        public Builder setRuleSetName(@Nullable String ruleSetName) {
            this.ruleSetName = Input.ofNullable(ruleSetName);
            return this;
        }
        public TagRuleArgs build() {
            return new TagRuleArgs(monitorName, properties, resourceGroupName, ruleSetName);
        }
    }
}
