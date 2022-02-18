// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IdentitySourceResponse {
    /**
     * The domain's NetBIOS name
     * 
     */
    private final @Nullable String alias;
    /**
     * The base distinguished name for groups
     * 
     */
    private final @Nullable String baseGroupDN;
    /**
     * The base distinguished name for users
     * 
     */
    private final @Nullable String baseUserDN;
    /**
     * The domain's dns name
     * 
     */
    private final @Nullable String domain;
    /**
     * The name of the identity source
     * 
     */
    private final @Nullable String name;
    /**
     * The password of the Active Directory user with a minimum of read-only access to Base DN for users and groups.
     * 
     */
    private final @Nullable String password;
    /**
     * Primary server URL
     * 
     */
    private final @Nullable String primaryServer;
    /**
     * Secondary server URL
     * 
     */
    private final @Nullable String secondaryServer;
    /**
     * Protect LDAP communication using SSL certificate (LDAPS)
     * 
     */
    private final @Nullable String ssl;
    /**
     * The ID of an Active Directory user with a minimum of read-only access to Base DN for users and group
     * 
     */
    private final @Nullable String username;

    @OutputCustomType.Constructor({"alias","baseGroupDN","baseUserDN","domain","name","password","primaryServer","secondaryServer","ssl","username"})
    private IdentitySourceResponse(
        @Nullable String alias,
        @Nullable String baseGroupDN,
        @Nullable String baseUserDN,
        @Nullable String domain,
        @Nullable String name,
        @Nullable String password,
        @Nullable String primaryServer,
        @Nullable String secondaryServer,
        @Nullable String ssl,
        @Nullable String username) {
        this.alias = alias;
        this.baseGroupDN = baseGroupDN;
        this.baseUserDN = baseUserDN;
        this.domain = domain;
        this.name = name;
        this.password = password;
        this.primaryServer = primaryServer;
        this.secondaryServer = secondaryServer;
        this.ssl = ssl;
        this.username = username;
    }

    /**
     * The domain's NetBIOS name
     * 
     */
    public Optional<String> getAlias() {
        return Optional.ofNullable(this.alias);
    }
    /**
     * The base distinguished name for groups
     * 
     */
    public Optional<String> getBaseGroupDN() {
        return Optional.ofNullable(this.baseGroupDN);
    }
    /**
     * The base distinguished name for users
     * 
     */
    public Optional<String> getBaseUserDN() {
        return Optional.ofNullable(this.baseUserDN);
    }
    /**
     * The domain's dns name
     * 
     */
    public Optional<String> getDomain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * The name of the identity source
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The password of the Active Directory user with a minimum of read-only access to Base DN for users and groups.
     * 
     */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Primary server URL
     * 
     */
    public Optional<String> getPrimaryServer() {
        return Optional.ofNullable(this.primaryServer);
    }
    /**
     * Secondary server URL
     * 
     */
    public Optional<String> getSecondaryServer() {
        return Optional.ofNullable(this.secondaryServer);
    }
    /**
     * Protect LDAP communication using SSL certificate (LDAPS)
     * 
     */
    public Optional<String> getSsl() {
        return Optional.ofNullable(this.ssl);
    }
    /**
     * The ID of an Active Directory user with a minimum of read-only access to Base DN for users and group
     * 
     */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentitySourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alias;
        private @Nullable String baseGroupDN;
        private @Nullable String baseUserDN;
        private @Nullable String domain;
        private @Nullable String name;
        private @Nullable String password;
        private @Nullable String primaryServer;
        private @Nullable String secondaryServer;
        private @Nullable String ssl;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentitySourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.baseGroupDN = defaults.baseGroupDN;
    	      this.baseUserDN = defaults.baseUserDN;
    	      this.domain = defaults.domain;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.primaryServer = defaults.primaryServer;
    	      this.secondaryServer = defaults.secondaryServer;
    	      this.ssl = defaults.ssl;
    	      this.username = defaults.username;
        }

        public Builder setAlias(@Nullable String alias) {
            this.alias = alias;
            return this;
        }

        public Builder setBaseGroupDN(@Nullable String baseGroupDN) {
            this.baseGroupDN = baseGroupDN;
            return this;
        }

        public Builder setBaseUserDN(@Nullable String baseUserDN) {
            this.baseUserDN = baseUserDN;
            return this;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setPrimaryServer(@Nullable String primaryServer) {
            this.primaryServer = primaryServer;
            return this;
        }

        public Builder setSecondaryServer(@Nullable String secondaryServer) {
            this.secondaryServer = secondaryServer;
            return this;
        }

        public Builder setSsl(@Nullable String ssl) {
            this.ssl = ssl;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public IdentitySourceResponse build() {
            return new IdentitySourceResponse(alias, baseGroupDN, baseUserDN, domain, name, password, primaryServer, secondaryServer, ssl, username);
        }
    }
}
