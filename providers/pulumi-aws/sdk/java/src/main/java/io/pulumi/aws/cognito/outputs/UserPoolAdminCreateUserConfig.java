// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.aws.cognito.outputs.UserPoolAdminCreateUserConfigInviteMessageTemplate;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserPoolAdminCreateUserConfig {
    /**
     * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
     * 
     */
    private final @Nullable Boolean allowAdminCreateUserOnly;
    /**
     * Invite message template structure. Detailed below.
     * 
     */
    private final @Nullable UserPoolAdminCreateUserConfigInviteMessageTemplate inviteMessageTemplate;

    @OutputCustomType.Constructor({"allowAdminCreateUserOnly","inviteMessageTemplate"})
    private UserPoolAdminCreateUserConfig(
        @Nullable Boolean allowAdminCreateUserOnly,
        @Nullable UserPoolAdminCreateUserConfigInviteMessageTemplate inviteMessageTemplate) {
        this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
        this.inviteMessageTemplate = inviteMessageTemplate;
    }

    /**
     * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
     * 
     */
    public Optional<Boolean> getAllowAdminCreateUserOnly() {
        return Optional.ofNullable(this.allowAdminCreateUserOnly);
    }
    /**
     * Invite message template structure. Detailed below.
     * 
     */
    public Optional<UserPoolAdminCreateUserConfigInviteMessageTemplate> getInviteMessageTemplate() {
        return Optional.ofNullable(this.inviteMessageTemplate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolAdminCreateUserConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowAdminCreateUserOnly;
        private @Nullable UserPoolAdminCreateUserConfigInviteMessageTemplate inviteMessageTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolAdminCreateUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAdminCreateUserOnly = defaults.allowAdminCreateUserOnly;
    	      this.inviteMessageTemplate = defaults.inviteMessageTemplate;
        }

        public Builder setAllowAdminCreateUserOnly(@Nullable Boolean allowAdminCreateUserOnly) {
            this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
            return this;
        }

        public Builder setInviteMessageTemplate(@Nullable UserPoolAdminCreateUserConfigInviteMessageTemplate inviteMessageTemplate) {
            this.inviteMessageTemplate = inviteMessageTemplate;
            return this;
        }
        public UserPoolAdminCreateUserConfig build() {
            return new UserPoolAdminCreateUserConfig(allowAdminCreateUserOnly, inviteMessageTemplate);
        }
    }
}