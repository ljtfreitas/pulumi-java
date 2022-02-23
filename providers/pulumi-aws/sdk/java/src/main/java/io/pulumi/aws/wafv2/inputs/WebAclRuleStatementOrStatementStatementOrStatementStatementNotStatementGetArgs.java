// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs();

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    @InputImport(name="statements", required=true)
    private final Input<List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGetArgs>> statements;

    public Input<List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGetArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs(Input<List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGetArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs() {
        this.statements = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGetArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder setStatements(Input<List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGetArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder setStatements(List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGetArgs> statements) {
            this.statements = Input.of(Objects.requireNonNull(statements));
            return this;
        }
        public WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs(statements);
        }
    }
}
