// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatement;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupRuleStatementOrStatementStatementOrStatement {
    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private final List<RuleGroupRuleStatementOrStatementStatementOrStatementStatement> statements;

    @OutputCustomType.Constructor({"statements"})
    private RuleGroupRuleStatementOrStatementStatementOrStatement(List<RuleGroupRuleStatementOrStatementStatementOrStatementStatement> statements) {
        this.statements = Objects.requireNonNull(statements);
    }

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public List<RuleGroupRuleStatementOrStatementStatementOrStatementStatement> getStatements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementOrStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupRuleStatementOrStatementStatementOrStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementOrStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder setStatements(List<RuleGroupRuleStatementOrStatementStatementOrStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public RuleGroupRuleStatementOrStatementStatementOrStatement build() {
            return new RuleGroupRuleStatementOrStatementStatementOrStatement(statements);
        }
    }
}
