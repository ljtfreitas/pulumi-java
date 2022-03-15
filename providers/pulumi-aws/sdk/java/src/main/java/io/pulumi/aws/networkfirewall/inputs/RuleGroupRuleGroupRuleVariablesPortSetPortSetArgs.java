// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs Empty = new RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs();

    /**
     * Set of port ranges.
     * 
     */
    @Import(name="definitions", required=true)
      private final Output<List<String>> definitions;

    public Output<List<String>> getDefinitions() {
        return this.definitions;
    }

    public RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs(Output<List<String>> definitions) {
        this.definitions = Objects.requireNonNull(definitions, "expected parameter 'definitions' to be non-null");
    }

    private RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs() {
        this.definitions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> definitions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definitions = defaults.definitions;
        }

        public Builder definitions(Output<List<String>> definitions) {
            this.definitions = Objects.requireNonNull(definitions);
            return this;
        }

        public Builder definitions(List<String> definitions) {
            this.definitions = Output.of(Objects.requireNonNull(definitions));
            return this;
        }
        public RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs build() {
            return new RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs(definitions);
        }
    }
}
