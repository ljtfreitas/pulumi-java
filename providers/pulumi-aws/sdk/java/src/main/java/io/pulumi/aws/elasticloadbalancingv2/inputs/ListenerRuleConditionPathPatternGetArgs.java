// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ListenerRuleConditionPathPatternGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleConditionPathPatternGetArgs Empty = new ListenerRuleConditionPathPatternGetArgs();

    /**
     * List of header value patterns to match. Maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request they will be searched in order until a match is found. Only one pattern needs to match for the condition to be satisfied. To require that all of the strings are a match, create one condition block per string.
     * 
     */
    @Import(name="values", required=true)
      private final Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values;
    }

    public ListenerRuleConditionPathPatternGetArgs(Output<List<String>> values) {
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ListenerRuleConditionPathPatternGetArgs() {
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleConditionPathPatternGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleConditionPathPatternGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder values(Output<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Output.of(Objects.requireNonNull(values));
            return this;
        }
        public ListenerRuleConditionPathPatternGetArgs build() {
            return new ListenerRuleConditionPathPatternGetArgs(values);
        }
    }
}
