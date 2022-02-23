// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs Empty = new RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs();

    /**
     * The relative processing order for multiple transformations that are defined for a rule statement. AWS WAF processes all transformations, from lowest priority to highest, before inspecting the transformed content.
     * 
     */
    @InputImport(name="priority", required=true)
    private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    /**
     * The transformation to apply, please refer to the Text Transformation [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_TextTransformation.html) for more details.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs(
        Input<Integer> priority,
        Input<String> type) {
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs() {
        this.priority = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> priority;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs build() {
            return new RuleGroupRuleStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationArgs(priority, type);
        }
    }
}
