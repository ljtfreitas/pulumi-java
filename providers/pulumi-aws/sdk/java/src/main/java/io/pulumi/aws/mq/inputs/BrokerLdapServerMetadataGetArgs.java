// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BrokerLdapServerMetadataGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BrokerLdapServerMetadataGetArgs Empty = new BrokerLdapServerMetadataGetArgs();

    /**
     * List of a fully qualified domain name of the LDAP server and an optional failover server.
     * 
     */
    @Import(name="hosts")
      private final @Nullable Output<List<String>> hosts;

    public Output<List<String>> getHosts() {
        return this.hosts == null ? Output.empty() : this.hosts;
    }

    /**
     * Fully qualified name of the directory to search for a user’s groups.
     * 
     */
    @Import(name="roleBase")
      private final @Nullable Output<String> roleBase;

    public Output<String> getRoleBase() {
        return this.roleBase == null ? Output.empty() : this.roleBase;
    }

    /**
     * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group membership query.
     * 
     */
    @Import(name="roleName")
      private final @Nullable Output<String> roleName;

    public Output<String> getRoleName() {
        return this.roleName == null ? Output.empty() : this.roleName;
    }

    /**
     * Search criteria for groups.
     * 
     */
    @Import(name="roleSearchMatching")
      private final @Nullable Output<String> roleSearchMatching;

    public Output<String> getRoleSearchMatching() {
        return this.roleSearchMatching == null ? Output.empty() : this.roleSearchMatching;
    }

    /**
     * Whether the directory search scope is the entire sub-tree.
     * 
     */
    @Import(name="roleSearchSubtree")
      private final @Nullable Output<Boolean> roleSearchSubtree;

    public Output<Boolean> getRoleSearchSubtree() {
        return this.roleSearchSubtree == null ? Output.empty() : this.roleSearchSubtree;
    }

    /**
     * Service account password.
     * 
     */
    @Import(name="serviceAccountPassword")
      private final @Nullable Output<String> serviceAccountPassword;

    public Output<String> getServiceAccountPassword() {
        return this.serviceAccountPassword == null ? Output.empty() : this.serviceAccountPassword;
    }

    /**
     * Service account username.
     * 
     */
    @Import(name="serviceAccountUsername")
      private final @Nullable Output<String> serviceAccountUsername;

    public Output<String> getServiceAccountUsername() {
        return this.serviceAccountUsername == null ? Output.empty() : this.serviceAccountUsername;
    }

    /**
     * Fully qualified name of the directory where you want to search for users.
     * 
     */
    @Import(name="userBase")
      private final @Nullable Output<String> userBase;

    public Output<String> getUserBase() {
        return this.userBase == null ? Output.empty() : this.userBase;
    }

    /**
     * Specifies the name of the LDAP attribute for the user group membership.
     * 
     */
    @Import(name="userRoleName")
      private final @Nullable Output<String> userRoleName;

    public Output<String> getUserRoleName() {
        return this.userRoleName == null ? Output.empty() : this.userRoleName;
    }

    /**
     * Search criteria for users.
     * 
     */
    @Import(name="userSearchMatching")
      private final @Nullable Output<String> userSearchMatching;

    public Output<String> getUserSearchMatching() {
        return this.userSearchMatching == null ? Output.empty() : this.userSearchMatching;
    }

    /**
     * Whether the directory search scope is the entire sub-tree.
     * 
     */
    @Import(name="userSearchSubtree")
      private final @Nullable Output<Boolean> userSearchSubtree;

    public Output<Boolean> getUserSearchSubtree() {
        return this.userSearchSubtree == null ? Output.empty() : this.userSearchSubtree;
    }

    public BrokerLdapServerMetadataGetArgs(
        @Nullable Output<List<String>> hosts,
        @Nullable Output<String> roleBase,
        @Nullable Output<String> roleName,
        @Nullable Output<String> roleSearchMatching,
        @Nullable Output<Boolean> roleSearchSubtree,
        @Nullable Output<String> serviceAccountPassword,
        @Nullable Output<String> serviceAccountUsername,
        @Nullable Output<String> userBase,
        @Nullable Output<String> userRoleName,
        @Nullable Output<String> userSearchMatching,
        @Nullable Output<Boolean> userSearchSubtree) {
        this.hosts = hosts;
        this.roleBase = roleBase;
        this.roleName = roleName;
        this.roleSearchMatching = roleSearchMatching;
        this.roleSearchSubtree = roleSearchSubtree;
        this.serviceAccountPassword = serviceAccountPassword;
        this.serviceAccountUsername = serviceAccountUsername;
        this.userBase = userBase;
        this.userRoleName = userRoleName;
        this.userSearchMatching = userSearchMatching;
        this.userSearchSubtree = userSearchSubtree;
    }

    private BrokerLdapServerMetadataGetArgs() {
        this.hosts = Output.empty();
        this.roleBase = Output.empty();
        this.roleName = Output.empty();
        this.roleSearchMatching = Output.empty();
        this.roleSearchSubtree = Output.empty();
        this.serviceAccountPassword = Output.empty();
        this.serviceAccountUsername = Output.empty();
        this.userBase = Output.empty();
        this.userRoleName = Output.empty();
        this.userSearchMatching = Output.empty();
        this.userSearchSubtree = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerLdapServerMetadataGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> hosts;
        private @Nullable Output<String> roleBase;
        private @Nullable Output<String> roleName;
        private @Nullable Output<String> roleSearchMatching;
        private @Nullable Output<Boolean> roleSearchSubtree;
        private @Nullable Output<String> serviceAccountPassword;
        private @Nullable Output<String> serviceAccountUsername;
        private @Nullable Output<String> userBase;
        private @Nullable Output<String> userRoleName;
        private @Nullable Output<String> userSearchMatching;
        private @Nullable Output<Boolean> userSearchSubtree;

        public Builder() {
    	      // Empty
        }

        public Builder(BrokerLdapServerMetadataGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.roleBase = defaults.roleBase;
    	      this.roleName = defaults.roleName;
    	      this.roleSearchMatching = defaults.roleSearchMatching;
    	      this.roleSearchSubtree = defaults.roleSearchSubtree;
    	      this.serviceAccountPassword = defaults.serviceAccountPassword;
    	      this.serviceAccountUsername = defaults.serviceAccountUsername;
    	      this.userBase = defaults.userBase;
    	      this.userRoleName = defaults.userRoleName;
    	      this.userSearchMatching = defaults.userSearchMatching;
    	      this.userSearchSubtree = defaults.userSearchSubtree;
        }

        public Builder hosts(@Nullable Output<List<String>> hosts) {
            this.hosts = hosts;
            return this;
        }

        public Builder hosts(@Nullable List<String> hosts) {
            this.hosts = Output.ofNullable(hosts);
            return this;
        }

        public Builder roleBase(@Nullable Output<String> roleBase) {
            this.roleBase = roleBase;
            return this;
        }

        public Builder roleBase(@Nullable String roleBase) {
            this.roleBase = Output.ofNullable(roleBase);
            return this;
        }

        public Builder roleName(@Nullable Output<String> roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder roleName(@Nullable String roleName) {
            this.roleName = Output.ofNullable(roleName);
            return this;
        }

        public Builder roleSearchMatching(@Nullable Output<String> roleSearchMatching) {
            this.roleSearchMatching = roleSearchMatching;
            return this;
        }

        public Builder roleSearchMatching(@Nullable String roleSearchMatching) {
            this.roleSearchMatching = Output.ofNullable(roleSearchMatching);
            return this;
        }

        public Builder roleSearchSubtree(@Nullable Output<Boolean> roleSearchSubtree) {
            this.roleSearchSubtree = roleSearchSubtree;
            return this;
        }

        public Builder roleSearchSubtree(@Nullable Boolean roleSearchSubtree) {
            this.roleSearchSubtree = Output.ofNullable(roleSearchSubtree);
            return this;
        }

        public Builder serviceAccountPassword(@Nullable Output<String> serviceAccountPassword) {
            this.serviceAccountPassword = serviceAccountPassword;
            return this;
        }

        public Builder serviceAccountPassword(@Nullable String serviceAccountPassword) {
            this.serviceAccountPassword = Output.ofNullable(serviceAccountPassword);
            return this;
        }

        public Builder serviceAccountUsername(@Nullable Output<String> serviceAccountUsername) {
            this.serviceAccountUsername = serviceAccountUsername;
            return this;
        }

        public Builder serviceAccountUsername(@Nullable String serviceAccountUsername) {
            this.serviceAccountUsername = Output.ofNullable(serviceAccountUsername);
            return this;
        }

        public Builder userBase(@Nullable Output<String> userBase) {
            this.userBase = userBase;
            return this;
        }

        public Builder userBase(@Nullable String userBase) {
            this.userBase = Output.ofNullable(userBase);
            return this;
        }

        public Builder userRoleName(@Nullable Output<String> userRoleName) {
            this.userRoleName = userRoleName;
            return this;
        }

        public Builder userRoleName(@Nullable String userRoleName) {
            this.userRoleName = Output.ofNullable(userRoleName);
            return this;
        }

        public Builder userSearchMatching(@Nullable Output<String> userSearchMatching) {
            this.userSearchMatching = userSearchMatching;
            return this;
        }

        public Builder userSearchMatching(@Nullable String userSearchMatching) {
            this.userSearchMatching = Output.ofNullable(userSearchMatching);
            return this;
        }

        public Builder userSearchSubtree(@Nullable Output<Boolean> userSearchSubtree) {
            this.userSearchSubtree = userSearchSubtree;
            return this;
        }

        public Builder userSearchSubtree(@Nullable Boolean userSearchSubtree) {
            this.userSearchSubtree = Output.ofNullable(userSearchSubtree);
            return this;
        }
        public BrokerLdapServerMetadataGetArgs build() {
            return new BrokerLdapServerMetadataGetArgs(hosts, roleBase, roleName, roleSearchMatching, roleSearchSubtree, serviceAccountPassword, serviceAccountUsername, userBase, userRoleName, userSearchMatching, userSearchSubtree);
        }
    }
}
