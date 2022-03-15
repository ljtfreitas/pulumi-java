// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs Empty = new WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs();

    /**
     * A single action condition. See Action Condition below for more details.
     * 
     */
    @Import(name="actionCondition")
      private final @Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionGetArgs> actionCondition;

    public Output<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionGetArgs> getActionCondition() {
        return this.actionCondition == null ? Output.empty() : this.actionCondition;
    }

    /**
     * A single label name condition. See Label Name Condition below for more details.
     * 
     */
    @Import(name="labelNameCondition")
      private final @Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionGetArgs> labelNameCondition;

    public Output<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionGetArgs> getLabelNameCondition() {
        return this.labelNameCondition == null ? Output.empty() : this.labelNameCondition;
    }

    public WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs(
        @Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionGetArgs> actionCondition,
        @Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionGetArgs> labelNameCondition) {
        this.actionCondition = actionCondition;
        this.labelNameCondition = labelNameCondition;
    }

    private WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs() {
        this.actionCondition = Output.empty();
        this.labelNameCondition = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionGetArgs> actionCondition;
        private @Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionGetArgs> labelNameCondition;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionCondition = defaults.actionCondition;
    	      this.labelNameCondition = defaults.labelNameCondition;
        }

        public Builder actionCondition(@Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionGetArgs> actionCondition) {
            this.actionCondition = actionCondition;
            return this;
        }

        public Builder actionCondition(@Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionGetArgs actionCondition) {
            this.actionCondition = Output.ofNullable(actionCondition);
            return this;
        }

        public Builder labelNameCondition(@Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionGetArgs> labelNameCondition) {
            this.labelNameCondition = labelNameCondition;
            return this;
        }

        public Builder labelNameCondition(@Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionGetArgs labelNameCondition) {
            this.labelNameCondition = Output.ofNullable(labelNameCondition);
            return this;
        }
        public WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs build() {
            return new WebAclLoggingConfigurationLoggingFilterFilterConditionGetArgs(actionCondition, labelNameCondition);
        }
    }
}
