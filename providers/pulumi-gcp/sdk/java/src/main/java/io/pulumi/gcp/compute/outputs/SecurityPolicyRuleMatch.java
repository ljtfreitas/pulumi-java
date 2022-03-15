// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.SecurityPolicyRuleMatchConfig;
import io.pulumi.gcp.compute.outputs.SecurityPolicyRuleMatchExpr;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityPolicyRuleMatch {
    /**
     * The configuration options available when specifying `versioned_expr`.
     * This field must be specified if `versioned_expr` is specified and cannot be specified if `versioned_expr` is not specified.
     * Structure is documented below.
     * 
     */
    private final @Nullable SecurityPolicyRuleMatchConfig config;
    /**
     * User defined CEVAL expression. A CEVAL expression is used to specify match criteria
     * such as origin.ip, source.region_code and contents in the request header.
     * Structure is documented below.
     * 
     */
    private final @Nullable SecurityPolicyRuleMatchExpr expr;
    /**
     * Predefined rule expression. If this field is specified, `config` must also be specified.
     * Available options:
     * * SRC_IPS_V1: Must specify the corresponding `src_ip_ranges` field in `config`.
     * 
     */
    private final @Nullable String versionedExpr;

    @CustomType.Constructor
    private SecurityPolicyRuleMatch(
        @CustomType.Parameter("config") @Nullable SecurityPolicyRuleMatchConfig config,
        @CustomType.Parameter("expr") @Nullable SecurityPolicyRuleMatchExpr expr,
        @CustomType.Parameter("versionedExpr") @Nullable String versionedExpr) {
        this.config = config;
        this.expr = expr;
        this.versionedExpr = versionedExpr;
    }

    /**
     * The configuration options available when specifying `versioned_expr`.
     * This field must be specified if `versioned_expr` is specified and cannot be specified if `versioned_expr` is not specified.
     * Structure is documented below.
     * 
    */
    public Optional<SecurityPolicyRuleMatchConfig> getConfig() {
        return Optional.ofNullable(this.config);
    }
    /**
     * User defined CEVAL expression. A CEVAL expression is used to specify match criteria
     * such as origin.ip, source.region_code and contents in the request header.
     * Structure is documented below.
     * 
    */
    public Optional<SecurityPolicyRuleMatchExpr> getExpr() {
        return Optional.ofNullable(this.expr);
    }
    /**
     * Predefined rule expression. If this field is specified, `config` must also be specified.
     * Available options:
     * * SRC_IPS_V1: Must specify the corresponding `src_ip_ranges` field in `config`.
     * 
    */
    public Optional<String> getVersionedExpr() {
        return Optional.ofNullable(this.versionedExpr);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecurityPolicyRuleMatchConfig config;
        private @Nullable SecurityPolicyRuleMatchExpr expr;
        private @Nullable String versionedExpr;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.expr = defaults.expr;
    	      this.versionedExpr = defaults.versionedExpr;
        }

        public Builder config(@Nullable SecurityPolicyRuleMatchConfig config) {
            this.config = config;
            return this;
        }

        public Builder expr(@Nullable SecurityPolicyRuleMatchExpr expr) {
            this.expr = expr;
            return this;
        }

        public Builder versionedExpr(@Nullable String versionedExpr) {
            this.versionedExpr = versionedExpr;
            return this;
        }
        public SecurityPolicyRuleMatch build() {
            return new SecurityPolicyRuleMatch(config, expr, versionedExpr);
        }
    }
}
