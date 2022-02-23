// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationLoggingFilterFilterConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationLoggingFilterFilterConditionArgs Empty = new WebAclLoggingConfigurationLoggingFilterFilterConditionArgs();

    /**
     * A single action condition. See Action Condition below for more details.
     * 
     */
    @InputImport(name="actionCondition")
    private final @Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs> actionCondition;

    public Input<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs> getActionCondition() {
        return this.actionCondition == null ? Input.empty() : this.actionCondition;
    }

    /**
     * A single label name condition. See Label Name Condition below for more details.
     * 
     */
    @InputImport(name="labelNameCondition")
    private final @Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs> labelNameCondition;

    public Input<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs> getLabelNameCondition() {
        return this.labelNameCondition == null ? Input.empty() : this.labelNameCondition;
    }

    public WebAclLoggingConfigurationLoggingFilterFilterConditionArgs(
        @Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs> actionCondition,
        @Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs> labelNameCondition) {
        this.actionCondition = actionCondition;
        this.labelNameCondition = labelNameCondition;
    }

    private WebAclLoggingConfigurationLoggingFilterFilterConditionArgs() {
        this.actionCondition = Input.empty();
        this.labelNameCondition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationLoggingFilterFilterConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs> actionCondition;
        private @Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs> labelNameCondition;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationLoggingFilterFilterConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionCondition = defaults.actionCondition;
    	      this.labelNameCondition = defaults.labelNameCondition;
        }

        public Builder setActionCondition(@Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs> actionCondition) {
            this.actionCondition = actionCondition;
            return this;
        }

        public Builder setActionCondition(@Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs actionCondition) {
            this.actionCondition = Input.ofNullable(actionCondition);
            return this;
        }

        public Builder setLabelNameCondition(@Nullable Input<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs> labelNameCondition) {
            this.labelNameCondition = labelNameCondition;
            return this;
        }

        public Builder setLabelNameCondition(@Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs labelNameCondition) {
            this.labelNameCondition = Input.ofNullable(labelNameCondition);
            return this;
        }
        public WebAclLoggingConfigurationLoggingFilterFilterConditionArgs build() {
            return new WebAclLoggingConfigurationLoggingFilterFilterConditionArgs(actionCondition, labelNameCondition);
        }
    }
}