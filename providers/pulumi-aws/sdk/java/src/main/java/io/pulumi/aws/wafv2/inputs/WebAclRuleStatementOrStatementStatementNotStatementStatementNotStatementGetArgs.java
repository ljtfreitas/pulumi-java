// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementGetArgs();

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    @InputImport(name="statements", required=true)
    private final Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementGetArgs>> statements;

    public Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementGetArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementGetArgs(Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementGetArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementGetArgs() {
        this.statements = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementGetArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder setStatements(Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementGetArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder setStatements(List<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementGetArgs> statements) {
            this.statements = Input.of(Objects.requireNonNull(statements));
            return this;
        }
        public WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementGetArgs(statements);
        }
    }
}