// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatement;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupRuleStatementOrStatementStatementNotStatement {
    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    private final List<RuleGroupRuleStatementOrStatementStatementNotStatementStatement> statements;

    @OutputCustomType.Constructor({"statements"})
    private RuleGroupRuleStatementOrStatementStatementNotStatement(List<RuleGroupRuleStatementOrStatementStatementNotStatementStatement> statements) {
        this.statements = Objects.requireNonNull(statements);
    }

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    public List<RuleGroupRuleStatementOrStatementStatementNotStatementStatement> getStatements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementNotStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupRuleStatementOrStatementStatementNotStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder setStatements(List<RuleGroupRuleStatementOrStatementStatementNotStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public RuleGroupRuleStatementOrStatementStatementNotStatement build() {
            return new RuleGroupRuleStatementOrStatementStatementNotStatement(statements);
        }
    }
}