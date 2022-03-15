// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A single label name condition.
 * 
 */
public final class LoggingConfigurationConditionLabelNameConditionProperties extends io.pulumi.resources.InvokeArgs {

    public static final LoggingConfigurationConditionLabelNameConditionProperties Empty = new LoggingConfigurationConditionLabelNameConditionProperties();

    /**
     * The label name that a log record must contain in order to meet the condition. This must be a fully qualified label name. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule that added the label.
     * 
     */
    @Import(name="labelName", required=true)
      private final String labelName;

    public String getLabelName() {
        return this.labelName;
    }

    public LoggingConfigurationConditionLabelNameConditionProperties(String labelName) {
        this.labelName = Objects.requireNonNull(labelName, "expected parameter 'labelName' to be non-null");
    }

    private LoggingConfigurationConditionLabelNameConditionProperties() {
        this.labelName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationConditionLabelNameConditionProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String labelName;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationConditionLabelNameConditionProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelName = defaults.labelName;
        }

        public Builder labelName(String labelName) {
            this.labelName = Objects.requireNonNull(labelName);
            return this;
        }
        public LoggingConfigurationConditionLabelNameConditionProperties build() {
            return new LoggingConfigurationConditionLabelNameConditionProperties(labelName);
        }
    }
}
