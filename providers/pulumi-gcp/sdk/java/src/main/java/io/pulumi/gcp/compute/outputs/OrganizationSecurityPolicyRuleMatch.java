// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.OrganizationSecurityPolicyRuleMatchConfig;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OrganizationSecurityPolicyRuleMatch {
    /**
     * The configuration options for matching the rule.
     * Structure is documented below.
     * 
     */
    private final OrganizationSecurityPolicyRuleMatchConfig config;
    /**
     * A description of the rule.
     * 
     */
    private final @Nullable String description;
    /**
     * Preconfigured versioned expression. For organization security policy rules,
     * the only supported type is "FIREWALL".
     * Default value is `FIREWALL`.
     * Possible values are `FIREWALL`.
     * 
     */
    private final @Nullable String versionedExpr;

    @OutputCustomType.Constructor({"config","description","versionedExpr"})
    private OrganizationSecurityPolicyRuleMatch(
        OrganizationSecurityPolicyRuleMatchConfig config,
        @Nullable String description,
        @Nullable String versionedExpr) {
        this.config = Objects.requireNonNull(config);
        this.description = description;
        this.versionedExpr = versionedExpr;
    }

    /**
     * The configuration options for matching the rule.
     * Structure is documented below.
     * 
     */
    public OrganizationSecurityPolicyRuleMatchConfig getConfig() {
        return this.config;
    }
    /**
     * A description of the rule.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Preconfigured versioned expression. For organization security policy rules,
     * the only supported type is "FIREWALL".
     * Default value is `FIREWALL`.
     * Possible values are `FIREWALL`.
     * 
     */
    public Optional<String> getVersionedExpr() {
        return Optional.ofNullable(this.versionedExpr);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationSecurityPolicyRuleMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationSecurityPolicyRuleMatchConfig config;
        private @Nullable String description;
        private @Nullable String versionedExpr;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationSecurityPolicyRuleMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.description = defaults.description;
    	      this.versionedExpr = defaults.versionedExpr;
        }

        public Builder setConfig(OrganizationSecurityPolicyRuleMatchConfig config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setVersionedExpr(@Nullable String versionedExpr) {
            this.versionedExpr = versionedExpr;
            return this;
        }
        public OrganizationSecurityPolicyRuleMatch build() {
            return new OrganizationSecurityPolicyRuleMatch(config, description, versionedExpr);
        }
    }
}
