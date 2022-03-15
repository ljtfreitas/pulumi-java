// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.SecurityPolicyRuleMatch;
import io.pulumi.gcp.compute.outputs.SecurityPolicyRuleRateLimitOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityPolicyRule {
    /**
     * Action to take when `match` matches the request. Valid values:
     * * "allow" : allow access to target
     * * "deny(status)" : deny access to target, returns the  HTTP response code specified (valid values are 403, 404 and 502)
     * * "rate_based_ban" : limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rateLimitOptions to be set.
     * * "threshold" : limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rateLimitOptions to be set for this.
     * 
     */
    private final String action;
    /**
     * An optional description of this rule. Max size is 64.
     * 
     */
    private final @Nullable String description;
    /**
     * A match condition that incoming traffic is evaluated against.
     * If it evaluates to true, the corresponding `action` is enforced. Structure is documented below.
     * 
     */
    private final SecurityPolicyRuleMatch match;
    /**
     * When set to true, the `action` specified above is not enforced.
     * Stackdriver logs for requests that trigger a preview action are annotated as such.
     * 
     */
    private final @Nullable Boolean preview;
    /**
     * An unique positive integer indicating the priority of evaluation for a rule.
     * Rules are evaluated from highest priority (lowest numerically) to lowest priority (highest numerically) in order.
     * 
     */
    private final Integer priority;
    /**
     * )
     * Must be specified if the `action` is "rate_based_bad" or "throttle". Cannot be specified for other actions. Structure is documented below.
     * 
     */
    private final @Nullable SecurityPolicyRuleRateLimitOptions rateLimitOptions;

    @CustomType.Constructor
    private SecurityPolicyRule(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("match") SecurityPolicyRuleMatch match,
        @CustomType.Parameter("preview") @Nullable Boolean preview,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("rateLimitOptions") @Nullable SecurityPolicyRuleRateLimitOptions rateLimitOptions) {
        this.action = action;
        this.description = description;
        this.match = match;
        this.preview = preview;
        this.priority = priority;
        this.rateLimitOptions = rateLimitOptions;
    }

    /**
     * Action to take when `match` matches the request. Valid values:
     * * "allow" : allow access to target
     * * "deny(status)" : deny access to target, returns the  HTTP response code specified (valid values are 403, 404 and 502)
     * * "rate_based_ban" : limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rateLimitOptions to be set.
     * * "threshold" : limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rateLimitOptions to be set for this.
     * 
    */
    public String getAction() {
        return this.action;
    }
    /**
     * An optional description of this rule. Max size is 64.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * A match condition that incoming traffic is evaluated against.
     * If it evaluates to true, the corresponding `action` is enforced. Structure is documented below.
     * 
    */
    public SecurityPolicyRuleMatch getMatch() {
        return this.match;
    }
    /**
     * When set to true, the `action` specified above is not enforced.
     * Stackdriver logs for requests that trigger a preview action are annotated as such.
     * 
    */
    public Optional<Boolean> getPreview() {
        return Optional.ofNullable(this.preview);
    }
    /**
     * An unique positive integer indicating the priority of evaluation for a rule.
     * Rules are evaluated from highest priority (lowest numerically) to lowest priority (highest numerically) in order.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * )
     * Must be specified if the `action` is "rate_based_bad" or "throttle". Cannot be specified for other actions. Structure is documented below.
     * 
    */
    public Optional<SecurityPolicyRuleRateLimitOptions> getRateLimitOptions() {
        return Optional.ofNullable(this.rateLimitOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private @Nullable String description;
        private SecurityPolicyRuleMatch match;
        private @Nullable Boolean preview;
        private Integer priority;
        private @Nullable SecurityPolicyRuleRateLimitOptions rateLimitOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.match = defaults.match;
    	      this.preview = defaults.preview;
    	      this.priority = defaults.priority;
    	      this.rateLimitOptions = defaults.rateLimitOptions;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder match(SecurityPolicyRuleMatch match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder preview(@Nullable Boolean preview) {
            this.preview = preview;
            return this;
        }

        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder rateLimitOptions(@Nullable SecurityPolicyRuleRateLimitOptions rateLimitOptions) {
            this.rateLimitOptions = rateLimitOptions;
            return this;
        }
        public SecurityPolicyRule build() {
            return new SecurityPolicyRule(action, description, match, preview, priority, rateLimitOptions);
        }
    }
}
