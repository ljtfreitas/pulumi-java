// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchConfigGetArgs;
import io.pulumi.gcp.compute.inputs.SecurityPolicyRuleMatchExprGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleMatchGetArgs Empty = new SecurityPolicyRuleMatchGetArgs();

    /**
     * The configuration options available when specifying `versioned_expr`.
     * This field must be specified if `versioned_expr` is specified and cannot be specified if `versioned_expr` is not specified.
     * Structure is documented below.
     * 
     */
    @InputImport(name="config")
        private final @Nullable Input<SecurityPolicyRuleMatchConfigGetArgs> config;

    public Input<SecurityPolicyRuleMatchConfigGetArgs> getConfig() {
        return this.config == null ? Input.empty() : this.config;
    }

    /**
     * User defined CEVAL expression. A CEVAL expression is used to specify match criteria
     * such as origin.ip, source.region_code and contents in the request header.
     * Structure is documented below.
     * 
     */
    @InputImport(name="expr")
        private final @Nullable Input<SecurityPolicyRuleMatchExprGetArgs> expr;

    public Input<SecurityPolicyRuleMatchExprGetArgs> getExpr() {
        return this.expr == null ? Input.empty() : this.expr;
    }

    /**
     * Predefined rule expression. If this field is specified, `config` must also be specified.
     * Available options:
     * * SRC_IPS_V1: Must specify the corresponding `src_ip_ranges` field in `config`.
     * 
     */
    @InputImport(name="versionedExpr")
        private final @Nullable Input<String> versionedExpr;

    public Input<String> getVersionedExpr() {
        return this.versionedExpr == null ? Input.empty() : this.versionedExpr;
    }

    public SecurityPolicyRuleMatchGetArgs(
        @Nullable Input<SecurityPolicyRuleMatchConfigGetArgs> config,
        @Nullable Input<SecurityPolicyRuleMatchExprGetArgs> expr,
        @Nullable Input<String> versionedExpr) {
        this.config = config;
        this.expr = expr;
        this.versionedExpr = versionedExpr;
    }

    private SecurityPolicyRuleMatchGetArgs() {
        this.config = Input.empty();
        this.expr = Input.empty();
        this.versionedExpr = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SecurityPolicyRuleMatchConfigGetArgs> config;
        private @Nullable Input<SecurityPolicyRuleMatchExprGetArgs> expr;
        private @Nullable Input<String> versionedExpr;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.expr = defaults.expr;
    	      this.versionedExpr = defaults.versionedExpr;
        }

        public Builder setConfig(@Nullable Input<SecurityPolicyRuleMatchConfigGetArgs> config) {
            this.config = config;
            return this;
        }

        public Builder setConfig(@Nullable SecurityPolicyRuleMatchConfigGetArgs config) {
            this.config = Input.ofNullable(config);
            return this;
        }

        public Builder setExpr(@Nullable Input<SecurityPolicyRuleMatchExprGetArgs> expr) {
            this.expr = expr;
            return this;
        }

        public Builder setExpr(@Nullable SecurityPolicyRuleMatchExprGetArgs expr) {
            this.expr = Input.ofNullable(expr);
            return this;
        }

        public Builder setVersionedExpr(@Nullable Input<String> versionedExpr) {
            this.versionedExpr = versionedExpr;
            return this;
        }

        public Builder setVersionedExpr(@Nullable String versionedExpr) {
            this.versionedExpr = Input.ofNullable(versionedExpr);
            return this;
        }
        public SecurityPolicyRuleMatchGetArgs build() {
            return new SecurityPolicyRuleMatchGetArgs(config, expr, versionedExpr);
        }
    }
}
