// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.RuleGroupStatement;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupOrStatement {
    private final List<RuleGroupStatement> statements;

    @CustomType.Constructor
    private RuleGroupOrStatement(@CustomType.Parameter("statements") List<RuleGroupStatement> statements) {
        this.statements = statements;
    }

    public List<RuleGroupStatement> getStatements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupOrStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupOrStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<RuleGroupStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public RuleGroupOrStatement build() {
            return new RuleGroupOrStatement(statements);
        }
    }
}
