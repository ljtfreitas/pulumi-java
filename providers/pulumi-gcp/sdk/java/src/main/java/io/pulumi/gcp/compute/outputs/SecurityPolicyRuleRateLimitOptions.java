// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.SecurityPolicyRuleRateLimitOptionsBanThreshold;
import io.pulumi.gcp.compute.outputs.SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions;
import io.pulumi.gcp.compute.outputs.SecurityPolicyRuleRateLimitOptionsRateLimitThreshold;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityPolicyRuleRateLimitOptions {
    private final @Nullable Integer banDurationSec;
    private final @Nullable SecurityPolicyRuleRateLimitOptionsBanThreshold banThreshold;
    private final String conformAction;
    private final @Nullable String enforceOnKey;
    private final @Nullable String enforceOnKeyName;
    private final String exceedAction;
    private final @Nullable SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions exceedRedirectOptions;
    private final SecurityPolicyRuleRateLimitOptionsRateLimitThreshold rateLimitThreshold;

    @OutputCustomType.Constructor({"banDurationSec","banThreshold","conformAction","enforceOnKey","enforceOnKeyName","exceedAction","exceedRedirectOptions","rateLimitThreshold"})
    private SecurityPolicyRuleRateLimitOptions(
        @Nullable Integer banDurationSec,
        @Nullable SecurityPolicyRuleRateLimitOptionsBanThreshold banThreshold,
        String conformAction,
        @Nullable String enforceOnKey,
        @Nullable String enforceOnKeyName,
        String exceedAction,
        @Nullable SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions exceedRedirectOptions,
        SecurityPolicyRuleRateLimitOptionsRateLimitThreshold rateLimitThreshold) {
        this.banDurationSec = banDurationSec;
        this.banThreshold = banThreshold;
        this.conformAction = Objects.requireNonNull(conformAction);
        this.enforceOnKey = enforceOnKey;
        this.enforceOnKeyName = enforceOnKeyName;
        this.exceedAction = Objects.requireNonNull(exceedAction);
        this.exceedRedirectOptions = exceedRedirectOptions;
        this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold);
    }

    public Optional<Integer> getBanDurationSec() {
        return Optional.ofNullable(this.banDurationSec);
    }
    public Optional<SecurityPolicyRuleRateLimitOptionsBanThreshold> getBanThreshold() {
        return Optional.ofNullable(this.banThreshold);
    }
    public String getConformAction() {
        return this.conformAction;
    }
    public Optional<String> getEnforceOnKey() {
        return Optional.ofNullable(this.enforceOnKey);
    }
    public Optional<String> getEnforceOnKeyName() {
        return Optional.ofNullable(this.enforceOnKeyName);
    }
    public String getExceedAction() {
        return this.exceedAction;
    }
    public Optional<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions> getExceedRedirectOptions() {
        return Optional.ofNullable(this.exceedRedirectOptions);
    }
    public SecurityPolicyRuleRateLimitOptionsRateLimitThreshold getRateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer banDurationSec;
        private @Nullable SecurityPolicyRuleRateLimitOptionsBanThreshold banThreshold;
        private String conformAction;
        private @Nullable String enforceOnKey;
        private @Nullable String enforceOnKeyName;
        private String exceedAction;
        private @Nullable SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions exceedRedirectOptions;
        private SecurityPolicyRuleRateLimitOptionsRateLimitThreshold rateLimitThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptions defaults) {
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

        public Builder setBanDurationSec(@Nullable Integer banDurationSec) {
            this.banDurationSec = banDurationSec;
            return this;
        }

        public Builder setBanThreshold(@Nullable SecurityPolicyRuleRateLimitOptionsBanThreshold banThreshold) {
            this.banThreshold = banThreshold;
            return this;
        }

        public Builder setConformAction(String conformAction) {
            this.conformAction = Objects.requireNonNull(conformAction);
            return this;
        }

        public Builder setEnforceOnKey(@Nullable String enforceOnKey) {
            this.enforceOnKey = enforceOnKey;
            return this;
        }

        public Builder setEnforceOnKeyName(@Nullable String enforceOnKeyName) {
            this.enforceOnKeyName = enforceOnKeyName;
            return this;
        }

        public Builder setExceedAction(String exceedAction) {
            this.exceedAction = Objects.requireNonNull(exceedAction);
            return this;
        }

        public Builder setExceedRedirectOptions(@Nullable SecurityPolicyRuleRateLimitOptionsExceedRedirectOptions exceedRedirectOptions) {
            this.exceedRedirectOptions = exceedRedirectOptions;
            return this;
        }

        public Builder setRateLimitThreshold(SecurityPolicyRuleRateLimitOptionsRateLimitThreshold rateLimitThreshold) {
            this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold);
            return this;
        }

        public SecurityPolicyRuleRateLimitOptions build() {
            return new SecurityPolicyRuleRateLimitOptions(banDurationSec, banThreshold, conformAction, enforceOnKey, enforceOnKeyName, exceedAction, exceedRedirectOptions, rateLimitThreshold);
        }
    }
}