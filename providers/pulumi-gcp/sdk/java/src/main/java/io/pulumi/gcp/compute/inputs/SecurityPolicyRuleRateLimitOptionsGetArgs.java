// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs;
import io.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs;
import io.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsRateLimitThresholdGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRateLimitOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRateLimitOptionsGetArgs Empty = new SecurityPolicyRuleRateLimitOptionsGetArgs();

    /**
     * Can only be specified if the `action` for the rule is "rate_based_ban".
     * If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
     * 
     */
    @Import(name="banDurationSec")
      private final @Nullable Output<Integer> banDurationSec;

    public Output<Integer> banDurationSec() {
        return this.banDurationSec == null ? Codegen.empty() : this.banDurationSec;
    }

    /**
     * Can only be specified if the `action` for the rule is "rate_based_ban".
     * If specified, the key will be banned for the configured 'ban_duration_sec' when the number of requests that exceed the 'rate_limit_threshold' also
     * exceed this 'ban_threshold'. Structure is documented below.
     * 
     */
    @Import(name="banThreshold")
      private final @Nullable Output<SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs> banThreshold;

    public Output<SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs> banThreshold() {
        return this.banThreshold == null ? Codegen.empty() : this.banThreshold;
    }

    /**
     * Action to take for requests that are under the configured rate limit threshold. Valid option is "allow" only.
     * 
     */
    @Import(name="conformAction", required=true)
      private final Output<String> conformAction;

    public Output<String> conformAction() {
        return this.conformAction;
    }

    /**
     * Determines the key to enforce the rate_limit_threshold on.
     * Possible values incude "ALL", "ALL_IPS", "HTTP_HEADER", "IP", "XFF_IP". If not specified, defaults to "ALL".
     * 
     */
    @Import(name="enforceOnKey")
      private final @Nullable Output<String> enforceOnKey;

    public Output<String> enforceOnKey() {
        return this.enforceOnKey == null ? Codegen.empty() : this.enforceOnKey;
    }

    /**
     * Rate limit key name applicable only for HTTP_HEADER key types. Name of the HTTP header whose value is taken as the key value.
     * 
     */
    @Import(name="enforceOnKeyName")
      private final @Nullable Output<String> enforceOnKeyName;

    public Output<String> enforceOnKeyName() {
        return this.enforceOnKeyName == null ? Codegen.empty() : this.enforceOnKeyName;
    }

    /**
     * When a request is denied, returns the HTTP response code specified.
     * Valid options are "deny()" where valid values for status are 403, 404, 429, and 502.
     * 
     */
    @Import(name="exceedAction", required=true)
      private final Output<String> exceedAction;

    public Output<String> exceedAction() {
        return this.exceedAction;
    }

    @Import(name="exceedRedirectOptions")
      private final @Nullable Output<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs> exceedRedirectOptions;

    public Output<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs> exceedRedirectOptions() {
        return this.exceedRedirectOptions == null ? Codegen.empty() : this.exceedRedirectOptions;
    }

    /**
     * Threshold at which to begin ratelimiting. Structure is documented below.
     * 
     */
    @Import(name="rateLimitThreshold", required=true)
      private final Output<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdGetArgs> rateLimitThreshold;

    public Output<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdGetArgs> rateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    public SecurityPolicyRuleRateLimitOptionsGetArgs(
        @Nullable Output<Integer> banDurationSec,
        @Nullable Output<SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs> banThreshold,
        Output<String> conformAction,
        @Nullable Output<String> enforceOnKey,
        @Nullable Output<String> enforceOnKeyName,
        Output<String> exceedAction,
        @Nullable Output<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs> exceedRedirectOptions,
        Output<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdGetArgs> rateLimitThreshold) {
        this.banDurationSec = banDurationSec;
        this.banThreshold = banThreshold;
        this.conformAction = Objects.requireNonNull(conformAction, "expected parameter 'conformAction' to be non-null");
        this.enforceOnKey = enforceOnKey;
        this.enforceOnKeyName = enforceOnKeyName;
        this.exceedAction = Objects.requireNonNull(exceedAction, "expected parameter 'exceedAction' to be non-null");
        this.exceedRedirectOptions = exceedRedirectOptions;
        this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold, "expected parameter 'rateLimitThreshold' to be non-null");
    }

    private SecurityPolicyRuleRateLimitOptionsGetArgs() {
        this.banDurationSec = Codegen.empty();
        this.banThreshold = Codegen.empty();
        this.conformAction = Codegen.empty();
        this.enforceOnKey = Codegen.empty();
        this.enforceOnKeyName = Codegen.empty();
        this.exceedAction = Codegen.empty();
        this.exceedRedirectOptions = Codegen.empty();
        this.rateLimitThreshold = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> banDurationSec;
        private @Nullable Output<SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs> banThreshold;
        private Output<String> conformAction;
        private @Nullable Output<String> enforceOnKey;
        private @Nullable Output<String> enforceOnKeyName;
        private Output<String> exceedAction;
        private @Nullable Output<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs> exceedRedirectOptions;
        private Output<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdGetArgs> rateLimitThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsGetArgs defaults) {
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

        public Builder banDurationSec(@Nullable Output<Integer> banDurationSec) {
            this.banDurationSec = banDurationSec;
            return this;
        }
        public Builder banDurationSec(@Nullable Integer banDurationSec) {
            this.banDurationSec = Codegen.ofNullable(banDurationSec);
            return this;
        }
        public Builder banThreshold(@Nullable Output<SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs> banThreshold) {
            this.banThreshold = banThreshold;
            return this;
        }
        public Builder banThreshold(@Nullable SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs banThreshold) {
            this.banThreshold = Codegen.ofNullable(banThreshold);
            return this;
        }
        public Builder conformAction(Output<String> conformAction) {
            this.conformAction = Objects.requireNonNull(conformAction);
            return this;
        }
        public Builder conformAction(String conformAction) {
            this.conformAction = Output.of(Objects.requireNonNull(conformAction));
            return this;
        }
        public Builder enforceOnKey(@Nullable Output<String> enforceOnKey) {
            this.enforceOnKey = enforceOnKey;
            return this;
        }
        public Builder enforceOnKey(@Nullable String enforceOnKey) {
            this.enforceOnKey = Codegen.ofNullable(enforceOnKey);
            return this;
        }
        public Builder enforceOnKeyName(@Nullable Output<String> enforceOnKeyName) {
            this.enforceOnKeyName = enforceOnKeyName;
            return this;
        }
        public Builder enforceOnKeyName(@Nullable String enforceOnKeyName) {
            this.enforceOnKeyName = Codegen.ofNullable(enforceOnKeyName);
            return this;
        }
        public Builder exceedAction(Output<String> exceedAction) {
            this.exceedAction = Objects.requireNonNull(exceedAction);
            return this;
        }
        public Builder exceedAction(String exceedAction) {
            this.exceedAction = Output.of(Objects.requireNonNull(exceedAction));
            return this;
        }
        public Builder exceedRedirectOptions(@Nullable Output<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs> exceedRedirectOptions) {
            this.exceedRedirectOptions = exceedRedirectOptions;
            return this;
        }
        public Builder exceedRedirectOptions(@Nullable SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs exceedRedirectOptions) {
            this.exceedRedirectOptions = Codegen.ofNullable(exceedRedirectOptions);
            return this;
        }
        public Builder rateLimitThreshold(Output<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdGetArgs> rateLimitThreshold) {
            this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold);
            return this;
        }
        public Builder rateLimitThreshold(SecurityPolicyRuleRateLimitOptionsRateLimitThresholdGetArgs rateLimitThreshold) {
            this.rateLimitThreshold = Output.of(Objects.requireNonNull(rateLimitThreshold));
            return this;
        }        public SecurityPolicyRuleRateLimitOptionsGetArgs build() {
            return new SecurityPolicyRuleRateLimitOptionsGetArgs(banDurationSec, banThreshold, conformAction, enforceOnKey, enforceOnKeyName, exceedAction, exceedRedirectOptions, rateLimitThreshold);
        }
    }
}
