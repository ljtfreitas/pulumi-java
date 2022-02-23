// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.storage.inputs.PermissionScopeArgs;
import io.pulumi.azurenative.storage.inputs.SshPublicKeyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocalUserArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalUserArgs Empty = new LocalUserArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @InputImport(name="accountName", required=true)
        private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Indicates whether shared key exists. Set it to false to remove existing shared key.
     * 
     */
    @InputImport(name="hasSharedKey")
        private final @Nullable Input<Boolean> hasSharedKey;

    public Input<Boolean> getHasSharedKey() {
        return this.hasSharedKey == null ? Input.empty() : this.hasSharedKey;
    }

    /**
     * Indicates whether ssh key exists. Set it to false to remove existing SSH key.
     * 
     */
    @InputImport(name="hasSshKey")
        private final @Nullable Input<Boolean> hasSshKey;

    public Input<Boolean> getHasSshKey() {
        return this.hasSshKey == null ? Input.empty() : this.hasSshKey;
    }

    /**
     * Indicates whether ssh password exists. Set it to false to remove existing SSH password.
     * 
     */
    @InputImport(name="hasSshPassword")
        private final @Nullable Input<Boolean> hasSshPassword;

    public Input<Boolean> getHasSshPassword() {
        return this.hasSshPassword == null ? Input.empty() : this.hasSshPassword;
    }

    /**
     * Optional, local user home directory.
     * 
     */
    @InputImport(name="homeDirectory")
        private final @Nullable Input<String> homeDirectory;

    public Input<String> getHomeDirectory() {
        return this.homeDirectory == null ? Input.empty() : this.homeDirectory;
    }

    /**
     * The permission scopes of the local user.
     * 
     */
    @InputImport(name="permissionScopes")
        private final @Nullable Input<List<PermissionScopeArgs>> permissionScopes;

    public Input<List<PermissionScopeArgs>> getPermissionScopes() {
        return this.permissionScopes == null ? Input.empty() : this.permissionScopes;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Optional, local user ssh authorized keys for SFTP.
     * 
     */
    @InputImport(name="sshAuthorizedKeys")
        private final @Nullable Input<List<SshPublicKeyArgs>> sshAuthorizedKeys;

    public Input<List<SshPublicKeyArgs>> getSshAuthorizedKeys() {
        return this.sshAuthorizedKeys == null ? Input.empty() : this.sshAuthorizedKeys;
    }

    /**
     * The name of local user. The username must contain lowercase letters and numbers only. It must be unique only within the storage account.
     * 
     */
    @InputImport(name="username")
        private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public LocalUserArgs(
        Input<String> accountName,
        @Nullable Input<Boolean> hasSharedKey,
        @Nullable Input<Boolean> hasSshKey,
        @Nullable Input<Boolean> hasSshPassword,
        @Nullable Input<String> homeDirectory,
        @Nullable Input<List<PermissionScopeArgs>> permissionScopes,
        Input<String> resourceGroupName,
        @Nullable Input<List<SshPublicKeyArgs>> sshAuthorizedKeys,
        @Nullable Input<String> username) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.hasSharedKey = hasSharedKey;
        this.hasSshKey = hasSshKey;
        this.hasSshPassword = hasSshPassword;
        this.homeDirectory = homeDirectory;
        this.permissionScopes = permissionScopes;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sshAuthorizedKeys = sshAuthorizedKeys;
        this.username = username;
    }

    private LocalUserArgs() {
        this.accountName = Input.empty();
        this.hasSharedKey = Input.empty();
        this.hasSshKey = Input.empty();
        this.hasSshPassword = Input.empty();
        this.homeDirectory = Input.empty();
        this.permissionScopes = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sshAuthorizedKeys = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<Boolean> hasSharedKey;
        private @Nullable Input<Boolean> hasSshKey;
        private @Nullable Input<Boolean> hasSshPassword;
        private @Nullable Input<String> homeDirectory;
        private @Nullable Input<List<PermissionScopeArgs>> permissionScopes;
        private Input<String> resourceGroupName;
        private @Nullable Input<List<SshPublicKeyArgs>> sshAuthorizedKeys;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.hasSharedKey = defaults.hasSharedKey;
    	      this.hasSshKey = defaults.hasSshKey;
    	      this.hasSshPassword = defaults.hasSshPassword;
    	      this.homeDirectory = defaults.homeDirectory;
    	      this.permissionScopes = defaults.permissionScopes;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sshAuthorizedKeys = defaults.sshAuthorizedKeys;
    	      this.username = defaults.username;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setHasSharedKey(@Nullable Input<Boolean> hasSharedKey) {
            this.hasSharedKey = hasSharedKey;
            return this;
        }

        public Builder setHasSharedKey(@Nullable Boolean hasSharedKey) {
            this.hasSharedKey = Input.ofNullable(hasSharedKey);
            return this;
        }

        public Builder setHasSshKey(@Nullable Input<Boolean> hasSshKey) {
            this.hasSshKey = hasSshKey;
            return this;
        }

        public Builder setHasSshKey(@Nullable Boolean hasSshKey) {
            this.hasSshKey = Input.ofNullable(hasSshKey);
            return this;
        }

        public Builder setHasSshPassword(@Nullable Input<Boolean> hasSshPassword) {
            this.hasSshPassword = hasSshPassword;
            return this;
        }

        public Builder setHasSshPassword(@Nullable Boolean hasSshPassword) {
            this.hasSshPassword = Input.ofNullable(hasSshPassword);
            return this;
        }

        public Builder setHomeDirectory(@Nullable Input<String> homeDirectory) {
            this.homeDirectory = homeDirectory;
            return this;
        }

        public Builder setHomeDirectory(@Nullable String homeDirectory) {
            this.homeDirectory = Input.ofNullable(homeDirectory);
            return this;
        }

        public Builder setPermissionScopes(@Nullable Input<List<PermissionScopeArgs>> permissionScopes) {
            this.permissionScopes = permissionScopes;
            return this;
        }

        public Builder setPermissionScopes(@Nullable List<PermissionScopeArgs> permissionScopes) {
            this.permissionScopes = Input.ofNullable(permissionScopes);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSshAuthorizedKeys(@Nullable Input<List<SshPublicKeyArgs>> sshAuthorizedKeys) {
            this.sshAuthorizedKeys = sshAuthorizedKeys;
            return this;
        }

        public Builder setSshAuthorizedKeys(@Nullable List<SshPublicKeyArgs> sshAuthorizedKeys) {
            this.sshAuthorizedKeys = Input.ofNullable(sshAuthorizedKeys);
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }
        public LocalUserArgs build() {
            return new LocalUserArgs(accountName, hasSharedKey, hasSshKey, hasSshPassword, homeDirectory, permissionScopes, resourceGroupName, sshAuthorizedKeys, username);
        }
    }
}
