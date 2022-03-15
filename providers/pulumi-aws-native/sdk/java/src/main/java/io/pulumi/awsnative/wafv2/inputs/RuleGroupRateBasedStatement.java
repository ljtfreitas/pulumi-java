// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupRateBasedStatementAggregateKeyType;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupForwardedIPConfiguration;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupStatement;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRateBasedStatement extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupRateBasedStatement Empty = new RuleGroupRateBasedStatement();

    @Import(name="aggregateKeyType", required=true)
      private final RuleGroupRateBasedStatementAggregateKeyType aggregateKeyType;

    public RuleGroupRateBasedStatementAggregateKeyType getAggregateKeyType() {
        return this.aggregateKeyType;
    }

    @Import(name="forwardedIPConfig")
      private final @Nullable RuleGroupForwardedIPConfiguration forwardedIPConfig;

    public Optional<RuleGroupForwardedIPConfiguration> getForwardedIPConfig() {
        return this.forwardedIPConfig == null ? Optional.empty() : Optional.ofNullable(this.forwardedIPConfig);
    }

    @Import(name="limit", required=true)
      private final Integer limit;

    public Integer getLimit() {
        return this.limit;
    }

    @Import(name="scopeDownStatement")
      private final @Nullable RuleGroupStatement scopeDownStatement;

    public Optional<RuleGroupStatement> getScopeDownStatement() {
        return this.scopeDownStatement == null ? Optional.empty() : Optional.ofNullable(this.scopeDownStatement);
    }

    public RuleGroupRateBasedStatement(
        RuleGroupRateBasedStatementAggregateKeyType aggregateKeyType,
        @Nullable RuleGroupForwardedIPConfiguration forwardedIPConfig,
        Integer limit,
        @Nullable RuleGroupStatement scopeDownStatement) {
        this.aggregateKeyType = Objects.requireNonNull(aggregateKeyType, "expected parameter 'aggregateKeyType' to be non-null");
        this.forwardedIPConfig = forwardedIPConfig;
        this.limit = Objects.requireNonNull(limit, "expected parameter 'limit' to be non-null");
        this.scopeDownStatement = scopeDownStatement;
    }

    private RuleGroupRateBasedStatement() {
        this.aggregateKeyType = null;
        this.forwardedIPConfig = null;
        this.limit = null;
        this.scopeDownStatement = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRateBasedStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRateBasedStatementAggregateKeyType aggregateKeyType;
        private @Nullable RuleGroupForwardedIPConfiguration forwardedIPConfig;
        private Integer limit;
        private @Nullable RuleGroupStatement scopeDownStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRateBasedStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregateKeyType = defaults.aggregateKeyType;
    	      this.forwardedIPConfig = defaults.forwardedIPConfig;
    	      this.limit = defaults.limit;
    	      this.scopeDownStatement = defaults.scopeDownStatement;
        }

        public Builder aggregateKeyType(RuleGroupRateBasedStatementAggregateKeyType aggregateKeyType) {
            this.aggregateKeyType = Objects.requireNonNull(aggregateKeyType);
            return this;
        }

        public Builder forwardedIPConfig(@Nullable RuleGroupForwardedIPConfiguration forwardedIPConfig) {
            this.forwardedIPConfig = forwardedIPConfig;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }

        public Builder scopeDownStatement(@Nullable RuleGroupStatement scopeDownStatement) {
            this.scopeDownStatement = scopeDownStatement;
            return this;
        }
        public RuleGroupRateBasedStatement build() {
            return new RuleGroupRateBasedStatement(aggregateKeyType, forwardedIPConfig, limit, scopeDownStatement);
        }
    }
}
