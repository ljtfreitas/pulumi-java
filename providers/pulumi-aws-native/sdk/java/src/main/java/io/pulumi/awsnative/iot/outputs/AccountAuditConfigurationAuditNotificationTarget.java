// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccountAuditConfigurationAuditNotificationTarget {
    /**
     * True if notifications to the target are enabled.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The ARN of the role that grants permission to send notifications to the target.
     * 
     */
    private final @Nullable String roleArn;
    /**
     * The ARN of the target (SNS topic) to which audit notifications are sent.
     * 
     */
    private final @Nullable String targetArn;

    @CustomType.Constructor
    private AccountAuditConfigurationAuditNotificationTarget(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("targetArn") @Nullable String targetArn) {
        this.enabled = enabled;
        this.roleArn = roleArn;
        this.targetArn = targetArn;
    }

    /**
     * True if notifications to the target are enabled.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The ARN of the role that grants permission to send notifications to the target.
     * 
    */
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * The ARN of the target (SNS topic) to which audit notifications are sent.
     * 
    */
    public Optional<String> getTargetArn() {
        return Optional.ofNullable(this.targetArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAuditConfigurationAuditNotificationTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String roleArn;
        private @Nullable String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAuditConfigurationAuditNotificationTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.roleArn = defaults.roleArn;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder targetArn(@Nullable String targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public AccountAuditConfigurationAuditNotificationTarget build() {
            return new AccountAuditConfigurationAuditNotificationTarget(enabled, roleArn, targetArn);
        }
    }
}
