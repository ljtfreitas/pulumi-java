// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.AccountAuditConfigurationAuditNotificationTarget;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccountAuditConfigurationAuditNotificationTargetConfigurations {
    private final @Nullable AccountAuditConfigurationAuditNotificationTarget sns;

    @OutputCustomType.Constructor({"sns"})
    private AccountAuditConfigurationAuditNotificationTargetConfigurations(@Nullable AccountAuditConfigurationAuditNotificationTarget sns) {
        this.sns = sns;
    }

    public Optional<AccountAuditConfigurationAuditNotificationTarget> getSns() {
        return Optional.ofNullable(this.sns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountAuditConfigurationAuditNotificationTargetConfigurations defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AccountAuditConfigurationAuditNotificationTarget sns;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountAuditConfigurationAuditNotificationTargetConfigurations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sns = defaults.sns;
        }

        public Builder setSns(@Nullable AccountAuditConfigurationAuditNotificationTarget sns) {
            this.sns = sns;
            return this;
        }
        public AccountAuditConfigurationAuditNotificationTargetConfigurations build() {
            return new AccountAuditConfigurationAuditNotificationTargetConfigurations(sns);
        }
    }
}
