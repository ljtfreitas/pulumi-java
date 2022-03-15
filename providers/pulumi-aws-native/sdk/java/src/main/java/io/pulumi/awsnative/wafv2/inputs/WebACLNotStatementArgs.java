// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class WebACLNotStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLNotStatementArgs Empty = new WebACLNotStatementArgs();

    @Import(name="statement", required=true)
      private final Output<WebACLStatementArgs> statement;

    public Output<WebACLStatementArgs> getStatement() {
        return this.statement;
    }

    public WebACLNotStatementArgs(Output<WebACLStatementArgs> statement) {
        this.statement = Objects.requireNonNull(statement, "expected parameter 'statement' to be non-null");
    }

    private WebACLNotStatementArgs() {
        this.statement = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLNotStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<WebACLStatementArgs> statement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLNotStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statement = defaults.statement;
        }

        public Builder statement(Output<WebACLStatementArgs> statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }

        public Builder statement(WebACLStatementArgs statement) {
            this.statement = Output.of(Objects.requireNonNull(statement));
            return this;
        }
        public WebACLNotStatementArgs build() {
            return new WebACLNotStatementArgs(statement);
        }
    }
}
