// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserAccountCredentialsResponse {
    /**
     * Name of the administrator user account which can be used to SSH to nodes.
     * 
     */
    private final String adminUserName;
    /**
     * Password of the administrator user account.
     * 
     */
    private final @Nullable String adminUserPassword;
    /**
     * SSH public key of the administrator user account.
     * 
     */
    private final @Nullable String adminUserSshPublicKey;

    @OutputCustomType.Constructor({"adminUserName","adminUserPassword","adminUserSshPublicKey"})
    private UserAccountCredentialsResponse(
        String adminUserName,
        @Nullable String adminUserPassword,
        @Nullable String adminUserSshPublicKey) {
        this.adminUserName = Objects.requireNonNull(adminUserName);
        this.adminUserPassword = adminUserPassword;
        this.adminUserSshPublicKey = adminUserSshPublicKey;
    }

    /**
     * Name of the administrator user account which can be used to SSH to nodes.
     * 
     */
    public String getAdminUserName() {
        return this.adminUserName;
    }
    /**
     * Password of the administrator user account.
     * 
     */
    public Optional<String> getAdminUserPassword() {
        return Optional.ofNullable(this.adminUserPassword);
    }
    /**
     * SSH public key of the administrator user account.
     * 
     */
    public Optional<String> getAdminUserSshPublicKey() {
        return Optional.ofNullable(this.adminUserSshPublicKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAccountCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adminUserName;
        private @Nullable String adminUserPassword;
        private @Nullable String adminUserSshPublicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAccountCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUserName = defaults.adminUserName;
    	      this.adminUserPassword = defaults.adminUserPassword;
    	      this.adminUserSshPublicKey = defaults.adminUserSshPublicKey;
        }

        public Builder setAdminUserName(String adminUserName) {
            this.adminUserName = Objects.requireNonNull(adminUserName);
            return this;
        }

        public Builder setAdminUserPassword(@Nullable String adminUserPassword) {
            this.adminUserPassword = adminUserPassword;
            return this;
        }

        public Builder setAdminUserSshPublicKey(@Nullable String adminUserSshPublicKey) {
            this.adminUserSshPublicKey = adminUserSshPublicKey;
            return this;
        }

        public UserAccountCredentialsResponse build() {
            return new UserAccountCredentialsResponse(adminUserName, adminUserPassword, adminUserSshPublicKey);
        }
    }
}
