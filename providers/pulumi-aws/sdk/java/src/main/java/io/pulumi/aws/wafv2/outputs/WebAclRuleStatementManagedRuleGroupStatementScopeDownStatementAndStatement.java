// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatement;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatement {
    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private final List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatement> statements;

    @CustomType.Constructor
    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatement(@CustomType.Parameter("statements") List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatement> statements) {
        this.statements = statements;
    }

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
    */
    public List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatement> getStatements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatement build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatement(statements);
        }
    }
}
