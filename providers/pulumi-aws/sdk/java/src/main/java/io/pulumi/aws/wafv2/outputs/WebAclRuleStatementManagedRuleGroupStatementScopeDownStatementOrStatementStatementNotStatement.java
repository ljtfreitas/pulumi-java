// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatement;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatement {
    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    private final List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatement> statements;

    @CustomType.Constructor
    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatement(@CustomType.Parameter("statements") List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatement> statements) {
        this.statements = statements;
    }

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
    */
    public List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatement> getStatements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatement build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatement(statements);
        }
    }
}
