// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ListenerRuleConditionHttpRequestMethodGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleConditionHttpRequestMethodGetArgs Empty = new ListenerRuleConditionHttpRequestMethodGetArgs();

    /**
     * List of header value patterns to match. Maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request they will be searched in order until a match is found. Only one pattern needs to match for the condition to be satisfied. To require that all of the strings are a match, create one condition block per string.
     * 
     */
    @InputImport(name="values", required=true)
    private final Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values;
    }

    public ListenerRuleConditionHttpRequestMethodGetArgs(Input<List<String>> values) {
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ListenerRuleConditionHttpRequestMethodGetArgs() {
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleConditionHttpRequestMethodGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleConditionHttpRequestMethodGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder setValues(Input<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Input.of(Objects.requireNonNull(values));
            return this;
        }
        public ListenerRuleConditionHttpRequestMethodGetArgs build() {
            return new ListenerRuleConditionHttpRequestMethodGetArgs(values);
        }
    }
}
