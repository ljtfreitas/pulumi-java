// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.azurenative.avs.enums.SslEnum;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * vCenter Single Sign On Identity Source
 * 
 */
public final class IdentitySourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentitySourceArgs Empty = new IdentitySourceArgs();

    /**
     * The domain's NetBIOS name
     * 
     */
    @Import(name="alias")
      private final @Nullable Output<String> alias;

    public Output<String> getAlias() {
        return this.alias == null ? Output.empty() : this.alias;
    }

    /**
     * The base distinguished name for groups
     * 
     */
    @Import(name="baseGroupDN")
      private final @Nullable Output<String> baseGroupDN;

    public Output<String> getBaseGroupDN() {
        return this.baseGroupDN == null ? Output.empty() : this.baseGroupDN;
    }

    /**
     * The base distinguished name for users
     * 
     */
    @Import(name="baseUserDN")
      private final @Nullable Output<String> baseUserDN;

    public Output<String> getBaseUserDN() {
        return this.baseUserDN == null ? Output.empty() : this.baseUserDN;
    }

    /**
     * The domain's dns name
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Output.empty() : this.domain;
    }

    /**
     * The name of the identity source
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The password of the Active Directory user with a minimum of read-only access to Base DN for users and groups.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * Primary server URL
     * 
     */
    @Import(name="primaryServer")
      private final @Nullable Output<String> primaryServer;

    public Output<String> getPrimaryServer() {
        return this.primaryServer == null ? Output.empty() : this.primaryServer;
    }

    /**
     * Secondary server URL
     * 
     */
    @Import(name="secondaryServer")
      private final @Nullable Output<String> secondaryServer;

    public Output<String> getSecondaryServer() {
        return this.secondaryServer == null ? Output.empty() : this.secondaryServer;
    }

    /**
     * Protect LDAP communication using SSL certificate (LDAPS)
     * 
     */
    @Import(name="ssl")
      private final @Nullable Output<Either<String,SslEnum>> ssl;

    public Output<Either<String,SslEnum>> getSsl() {
        return this.ssl == null ? Output.empty() : this.ssl;
    }

    /**
     * The ID of an Active Directory user with a minimum of read-only access to Base DN for users and group
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> getUsername() {
        return this.username == null ? Output.empty() : this.username;
    }

    public IdentitySourceArgs(
        @Nullable Output<String> alias,
        @Nullable Output<String> baseGroupDN,
        @Nullable Output<String> baseUserDN,
        @Nullable Output<String> domain,
        @Nullable Output<String> name,
        @Nullable Output<String> password,
        @Nullable Output<String> primaryServer,
        @Nullable Output<String> secondaryServer,
        @Nullable Output<Either<String,SslEnum>> ssl,
        @Nullable Output<String> username) {
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

    private IdentitySourceArgs() {
        this.alias = Output.empty();
        this.baseGroupDN = Output.empty();
        this.baseUserDN = Output.empty();
        this.domain = Output.empty();
        this.name = Output.empty();
        this.password = Output.empty();
        this.primaryServer = Output.empty();
        this.secondaryServer = Output.empty();
        this.ssl = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentitySourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alias;
        private @Nullable Output<String> baseGroupDN;
        private @Nullable Output<String> baseUserDN;
        private @Nullable Output<String> domain;
        private @Nullable Output<String> name;
        private @Nullable Output<String> password;
        private @Nullable Output<String> primaryServer;
        private @Nullable Output<String> secondaryServer;
        private @Nullable Output<Either<String,SslEnum>> ssl;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentitySourceArgs defaults) {
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

        public Builder alias(@Nullable Output<String> alias) {
            this.alias = alias;
            return this;
        }

        public Builder alias(@Nullable String alias) {
            this.alias = Output.ofNullable(alias);
            return this;
        }

        public Builder baseGroupDN(@Nullable Output<String> baseGroupDN) {
            this.baseGroupDN = baseGroupDN;
            return this;
        }

        public Builder baseGroupDN(@Nullable String baseGroupDN) {
            this.baseGroupDN = Output.ofNullable(baseGroupDN);
            return this;
        }

        public Builder baseUserDN(@Nullable Output<String> baseUserDN) {
            this.baseUserDN = baseUserDN;
            return this;
        }

        public Builder baseUserDN(@Nullable String baseUserDN) {
            this.baseUserDN = Output.ofNullable(baseUserDN);
            return this;
        }

        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }

        public Builder domain(@Nullable String domain) {
            this.domain = Output.ofNullable(domain);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }

        public Builder primaryServer(@Nullable Output<String> primaryServer) {
            this.primaryServer = primaryServer;
            return this;
        }

        public Builder primaryServer(@Nullable String primaryServer) {
            this.primaryServer = Output.ofNullable(primaryServer);
            return this;
        }

        public Builder secondaryServer(@Nullable Output<String> secondaryServer) {
            this.secondaryServer = secondaryServer;
            return this;
        }

        public Builder secondaryServer(@Nullable String secondaryServer) {
            this.secondaryServer = Output.ofNullable(secondaryServer);
            return this;
        }

        public Builder ssl(@Nullable Output<Either<String,SslEnum>> ssl) {
            this.ssl = ssl;
            return this;
        }

        public Builder ssl(@Nullable Either<String,SslEnum> ssl) {
            this.ssl = Output.ofNullable(ssl);
            return this;
        }

        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = Output.ofNullable(username);
            return this;
        }
        public IdentitySourceArgs build() {
            return new IdentitySourceArgs(alias, baseGroupDN, baseUserDN, domain, name, password, primaryServer, secondaryServer, ssl, username);
        }
    }
}
