// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.SecurityPolicyRuleRateLimitOptionsEnforceOnKey;
import io.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleRateLimitOptionsThresholdArgs;
import io.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleRedirectOptionsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRateLimitOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRateLimitOptionsArgs Empty = new SecurityPolicyRuleRateLimitOptionsArgs();

    /**
     * Can only be specified if the action for the rule is "rate_based_ban". If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
     * 
     */
    @InputImport(name="banDurationSec")
      private final @Nullable Input<Integer> banDurationSec;

    public Input<Integer> getBanDurationSec() {
        return this.banDurationSec == null ? Input.empty() : this.banDurationSec;
    }

    /**
     * Can only be specified if the action for the rule is "rate_based_ban". If specified, the key will be banned for the configured 'ban_duration_sec' when the number of requests that exceed the 'rate_limit_threshold' also exceed this 'ban_threshold'.
     * 
     */
    @InputImport(name="banThreshold")
      private final @Nullable Input<SecurityPolicyRuleRateLimitOptionsThresholdArgs> banThreshold;

    public Input<SecurityPolicyRuleRateLimitOptionsThresholdArgs> getBanThreshold() {
        return this.banThreshold == null ? Input.empty() : this.banThreshold;
    }

    /**
     * Action to take for requests that are under the configured rate limit threshold. Valid option is "allow" only.
     * 
     */
    @InputImport(name="conformAction")
      private final @Nullable Input<String> conformAction;

    public Input<String> getConformAction() {
        return this.conformAction == null ? Input.empty() : this.conformAction;
    }

    /**
     * Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if this field 'enforce_on_key' is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under "enforce_on_key_name". The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key type defaults to ALL. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under "enforce_on_key_name". The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL.
     * 
     */
    @InputImport(name="enforceOnKey")
      private final @Nullable Input<SecurityPolicyRuleRateLimitOptionsEnforceOnKey> enforceOnKey;

    public Input<SecurityPolicyRuleRateLimitOptionsEnforceOnKey> getEnforceOnKey() {
        return this.enforceOnKey == null ? Input.empty() : this.enforceOnKey;
    }

    /**
     * Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
     * 
     */
    @InputImport(name="enforceOnKeyName")
      private final @Nullable Input<String> enforceOnKeyName;

    public Input<String> getEnforceOnKeyName() {
        return this.enforceOnKeyName == null ? Input.empty() : this.enforceOnKeyName;
    }

    /**
     * Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are "deny()" where valid values for status are 403, 404, 429, and 502, and "redirect" where the redirect parameters come from exceed_redirect_options below.
     * 
     */
    @InputImport(name="exceedAction")
      private final @Nullable Input<String> exceedAction;

    public Input<String> getExceedAction() {
        return this.exceedAction == null ? Input.empty() : this.exceedAction;
    }

    /**
     * Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect.
     * 
     */
    @InputImport(name="exceedRedirectOptions")
      private final @Nullable Input<SecurityPolicyRuleRedirectOptionsArgs> exceedRedirectOptions;

    public Input<SecurityPolicyRuleRedirectOptionsArgs> getExceedRedirectOptions() {
        return this.exceedRedirectOptions == null ? Input.empty() : this.exceedRedirectOptions;
    }

    /**
     * Threshold at which to begin ratelimiting.
     * 
     */
    @InputImport(name="rateLimitThreshold")
      private final @Nullable Input<SecurityPolicyRuleRateLimitOptionsThresholdArgs> rateLimitThreshold;

    public Input<SecurityPolicyRuleRateLimitOptionsThresholdArgs> getRateLimitThreshold() {
        return this.rateLimitThreshold == null ? Input.empty() : this.rateLimitThreshold;
    }

    public SecurityPolicyRuleRateLimitOptionsArgs(
        @Nullable Input<Integer> banDurationSec,
        @Nullable Input<SecurityPolicyRuleRateLimitOptionsThresholdArgs> banThreshold,
        @Nullable Input<String> conformAction,
        @Nullable Input<SecurityPolicyRuleRateLimitOptionsEnforceOnKey> enforceOnKey,
        @Nullable Input<String> enforceOnKeyName,
        @Nullable Input<String> exceedAction,
        @Nullable Input<SecurityPolicyRuleRedirectOptionsArgs> exceedRedirectOptions,
        @Nullable Input<SecurityPolicyRuleRateLimitOptionsThresholdArgs> rateLimitThreshold) {
        this.banDurationSec = banDurationSec;
        this.banThreshold = banThreshold;
        this.conformAction = conformAction;
        this.enforceOnKey = enforceOnKey;
        this.enforceOnKeyName = enforceOnKeyName;
        this.exceedAction = exceedAction;
        this.exceedRedirectOptions = exceedRedirectOptions;
        this.rateLimitThreshold = rateLimitThreshold;
    }

    private SecurityPolicyRuleRateLimitOptionsArgs() {
        this.banDurationSec = Input.empty();
        this.banThreshold = Input.empty();
        this.conformAction = Input.empty();
        this.enforceOnKey = Input.empty();
        this.enforceOnKeyName = Input.empty();
        this.exceedAction = Input.empty();
        this.exceedRedirectOptions = Input.empty();
        this.rateLimitThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> banDurationSec;
        private @Nullable Input<SecurityPolicyRuleRateLimitOptionsThresholdArgs> banThreshold;
        private @Nullable Input<String> conformAction;
        private @Nullable Input<SecurityPolicyRuleRateLimitOptionsEnforceOnKey> enforceOnKey;
        private @Nullable Input<String> enforceOnKeyName;
        private @Nullable Input<String> exceedAction;
        private @Nullable Input<SecurityPolicyRuleRedirectOptionsArgs> exceedRedirectOptions;
        private @Nullable Input<SecurityPolicyRuleRateLimitOptionsThresholdArgs> rateLimitThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.banDurationSec = defaults.banDurationSec;
    	      this.banThreshold = defaults.banThreshold;
    	      this.conformAction = defaults.conformAction;
    	      this.enforceOnKey = defaults.enforceOnKey;
    	      this.enforceOnKeyName = defaults.enforceOnKeyName;
    	      this.exceedAction = defaults.exceedAction;
    	      this.exceedRedirectOptions = defaults.exceedRedirectOptions;
    	      this.rateLimitThreshold = defaults.rateLimitThreshold;
        }

        public Builder setBanDurationSec(@Nullable Input<Integer> banDurationSec) {
            this.banDurationSec = banDurationSec;
            return this;
        }

        public Builder setBanDurationSec(@Nullable Integer banDurationSec) {
            this.banDurationSec = Input.ofNullable(banDurationSec);
            return this;
        }

        public Builder setBanThreshold(@Nullable Input<SecurityPolicyRuleRateLimitOptionsThresholdArgs> banThreshold) {
            this.banThreshold = banThreshold;
            return this;
        }

        public Builder setBanThreshold(@Nullable SecurityPolicyRuleRateLimitOptionsThresholdArgs banThreshold) {
            this.banThreshold = Input.ofNullable(banThreshold);
            return this;
        }

        public Builder setConformAction(@Nullable Input<String> conformAction) {
            this.conformAction = conformAction;
            return this;
        }

        public Builder setConformAction(@Nullable String conformAction) {
            this.conformAction = Input.ofNullable(conformAction);
            return this;
        }

        public Builder setEnforceOnKey(@Nullable Input<SecurityPolicyRuleRateLimitOptionsEnforceOnKey> enforceOnKey) {
            this.enforceOnKey = enforceOnKey;
            return this;
        }

        public Builder setEnforceOnKey(@Nullable SecurityPolicyRuleRateLimitOptionsEnforceOnKey enforceOnKey) {
            this.enforceOnKey = Input.ofNullable(enforceOnKey);
            return this;
        }

        public Builder setEnforceOnKeyName(@Nullable Input<String> enforceOnKeyName) {
            this.enforceOnKeyName = enforceOnKeyName;
            return this;
        }

        public Builder setEnforceOnKeyName(@Nullable String enforceOnKeyName) {
            this.enforceOnKeyName = Input.ofNullable(enforceOnKeyName);
            return this;
        }

        public Builder setExceedAction(@Nullable Input<String> exceedAction) {
            this.exceedAction = exceedAction;
            return this;
        }

        public Builder setExceedAction(@Nullable String exceedAction) {
            this.exceedAction = Input.ofNullable(exceedAction);
            return this;
        }

        public Builder setExceedRedirectOptions(@Nullable Input<SecurityPolicyRuleRedirectOptionsArgs> exceedRedirectOptions) {
            this.exceedRedirectOptions = exceedRedirectOptions;
            return this;
        }

        public Builder setExceedRedirectOptions(@Nullable SecurityPolicyRuleRedirectOptionsArgs exceedRedirectOptions) {
            this.exceedRedirectOptions = Input.ofNullable(exceedRedirectOptions);
            return this;
        }

        public Builder setRateLimitThreshold(@Nullable Input<SecurityPolicyRuleRateLimitOptionsThresholdArgs> rateLimitThreshold) {
            this.rateLimitThreshold = rateLimitThreshold;
            return this;
        }

        public Builder setRateLimitThreshold(@Nullable SecurityPolicyRuleRateLimitOptionsThresholdArgs rateLimitThreshold) {
            this.rateLimitThreshold = Input.ofNullable(rateLimitThreshold);
            return this;
        }
        public SecurityPolicyRuleRateLimitOptionsArgs build() {
            return new SecurityPolicyRuleRateLimitOptionsArgs(banDurationSec, banThreshold, conformAction, enforceOnKey, enforceOnKeyName, exceedAction, exceedRedirectOptions, rateLimitThreshold);
        }
    }
}
