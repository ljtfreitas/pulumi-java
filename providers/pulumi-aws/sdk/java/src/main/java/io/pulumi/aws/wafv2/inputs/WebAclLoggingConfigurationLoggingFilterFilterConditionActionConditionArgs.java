// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs Empty = new WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs();

    /**
     * The action setting that a log record must contain in order to meet the condition. Valid values: `ALLOW`, `BLOCK`, `COUNT`.
     * 
     */
    @InputImport(name="action", required=true)
    private final Input<String> action;

    public Input<String> getAction() {
        return this.action;
    }

    public WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs(Input<String> action) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
    }

    private WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs() {
        this.action = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> action;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
        }

        public Builder setAction(Input<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(String action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }
        public WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs build() {
            return new WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs(action);
        }
    }
}
