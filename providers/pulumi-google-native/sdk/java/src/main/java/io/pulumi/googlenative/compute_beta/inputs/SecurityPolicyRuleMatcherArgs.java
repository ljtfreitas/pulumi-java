// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.enums.SecurityPolicyRuleMatcherVersionedExpr;
import io.pulumi.googlenative.compute_beta.inputs.ExprArgs;
import io.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRuleMatcherConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a match condition that incoming traffic is evaluated against. Exactly one field must be specified.
 * 
 */
public final class SecurityPolicyRuleMatcherArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleMatcherArgs Empty = new SecurityPolicyRuleMatcherArgs();

    /**
     * The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
     * 
     */
    @Import(name="config")
      private final @Nullable Output<SecurityPolicyRuleMatcherConfigArgs> config;

    public Output<SecurityPolicyRuleMatcherConfigArgs> getConfig() {
        return this.config == null ? Output.empty() : this.config;
    }

    /**
     * User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * 
     */
    @Import(name="expr")
      private final @Nullable Output<ExprArgs> expr;

    public Output<ExprArgs> getExpr() {
        return this.expr == null ? Output.empty() : this.expr;
    }

    /**
     * Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
     * 
     */
    @Import(name="versionedExpr")
      private final @Nullable Output<SecurityPolicyRuleMatcherVersionedExpr> versionedExpr;

    public Output<SecurityPolicyRuleMatcherVersionedExpr> getVersionedExpr() {
        return this.versionedExpr == null ? Output.empty() : this.versionedExpr;
    }

    public SecurityPolicyRuleMatcherArgs(
        @Nullable Output<SecurityPolicyRuleMatcherConfigArgs> config,
        @Nullable Output<ExprArgs> expr,
        @Nullable Output<SecurityPolicyRuleMatcherVersionedExpr> versionedExpr) {
        this.config = config;
        this.expr = expr;
        this.versionedExpr = versionedExpr;
    }

    private SecurityPolicyRuleMatcherArgs() {
        this.config = Output.empty();
        this.expr = Output.empty();
        this.versionedExpr = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecurityPolicyRuleMatcherConfigArgs> config;
        private @Nullable Output<ExprArgs> expr;
        private @Nullable Output<SecurityPolicyRuleMatcherVersionedExpr> versionedExpr;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.expr = defaults.expr;
    	      this.versionedExpr = defaults.versionedExpr;
        }

        public Builder config(@Nullable Output<SecurityPolicyRuleMatcherConfigArgs> config) {
            this.config = config;
            return this;
        }

        public Builder config(@Nullable SecurityPolicyRuleMatcherConfigArgs config) {
            this.config = Output.ofNullable(config);
            return this;
        }

        public Builder expr(@Nullable Output<ExprArgs> expr) {
            this.expr = expr;
            return this;
        }

        public Builder expr(@Nullable ExprArgs expr) {
            this.expr = Output.ofNullable(expr);
            return this;
        }

        public Builder versionedExpr(@Nullable Output<SecurityPolicyRuleMatcherVersionedExpr> versionedExpr) {
            this.versionedExpr = versionedExpr;
            return this;
        }

        public Builder versionedExpr(@Nullable SecurityPolicyRuleMatcherVersionedExpr versionedExpr) {
            this.versionedExpr = Output.ofNullable(versionedExpr);
            return this;
        }
        public SecurityPolicyRuleMatcherArgs build() {
            return new SecurityPolicyRuleMatcherArgs(config, expr, versionedExpr);
        }
    }
}
