// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementOrStatementStatementGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleStatementNotStatementStatementOrStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementOrStatementGetArgs Empty = new RuleGroupRuleStatementNotStatementStatementOrStatementGetArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @InputImport(name="statements", required=true)
    private final Input<List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementGetArgs>> statements;

    public Input<List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementGetArgs>> getStatements() {
        return this.statements;
    }

    public RuleGroupRuleStatementNotStatementStatementOrStatementGetArgs(Input<List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementGetArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private RuleGroupRuleStatementNotStatementStatementOrStatementGetArgs() {
        this.statements = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementOrStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementGetArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementOrStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder setStatements(Input<List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementGetArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder setStatements(List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementGetArgs> statements) {
            this.statements = Input.of(Objects.requireNonNull(statements));
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementOrStatementGetArgs build() {
            return new RuleGroupRuleStatementNotStatementStatementOrStatementGetArgs(statements);
        }
    }
}
