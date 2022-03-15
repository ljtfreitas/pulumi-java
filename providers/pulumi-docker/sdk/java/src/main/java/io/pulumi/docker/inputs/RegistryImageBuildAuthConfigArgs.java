// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryImageBuildAuthConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryImageBuildAuthConfigArgs Empty = new RegistryImageBuildAuthConfigArgs();

    @Import(name="auth")
      private final @Nullable Output<String> auth;

    public Output<String> getAuth() {
        return this.auth == null ? Output.empty() : this.auth;
    }

    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Output.empty() : this.email;
    }

    @Import(name="hostName", required=true)
      private final Output<String> hostName;

    public Output<String> getHostName() {
        return this.hostName;
    }

    @Import(name="identityToken")
      private final @Nullable Output<String> identityToken;

    public Output<String> getIdentityToken() {
        return this.identityToken == null ? Output.empty() : this.identityToken;
    }

    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    @Import(name="registryToken")
      private final @Nullable Output<String> registryToken;

    public Output<String> getRegistryToken() {
        return this.registryToken == null ? Output.empty() : this.registryToken;
    }

    @Import(name="serverAddress")
      private final @Nullable Output<String> serverAddress;

    public Output<String> getServerAddress() {
        return this.serverAddress == null ? Output.empty() : this.serverAddress;
    }

    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> getUserName() {
        return this.userName == null ? Output.empty() : this.userName;
    }

    public RegistryImageBuildAuthConfigArgs(
        @Nullable Output<String> auth,
        @Nullable Output<String> email,
        Output<String> hostName,
        @Nullable Output<String> identityToken,
        @Nullable Output<String> password,
        @Nullable Output<String> registryToken,
        @Nullable Output<String> serverAddress,
        @Nullable Output<String> userName) {
        this.auth = auth;
        this.email = email;
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.identityToken = identityToken;
        this.password = password;
        this.registryToken = registryToken;
        this.serverAddress = serverAddress;
        this.userName = userName;
    }

    private RegistryImageBuildAuthConfigArgs() {
        this.auth = Output.empty();
        this.email = Output.empty();
        this.hostName = Output.empty();
        this.identityToken = Output.empty();
        this.password = Output.empty();
        this.registryToken = Output.empty();
        this.serverAddress = Output.empty();
        this.userName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryImageBuildAuthConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> auth;
        private @Nullable Output<String> email;
        private Output<String> hostName;
        private @Nullable Output<String> identityToken;
        private @Nullable Output<String> password;
        private @Nullable Output<String> registryToken;
        private @Nullable Output<String> serverAddress;
        private @Nullable Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryImageBuildAuthConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.email = defaults.email;
    	      this.hostName = defaults.hostName;
    	      this.identityToken = defaults.identityToken;
    	      this.password = defaults.password;
    	      this.registryToken = defaults.registryToken;
    	      this.serverAddress = defaults.serverAddress;
    	      this.userName = defaults.userName;
        }

        public Builder auth(@Nullable Output<String> auth) {
            this.auth = auth;
            return this;
        }

        public Builder auth(@Nullable String auth) {
            this.auth = Output.ofNullable(auth);
            return this;
        }

        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(@Nullable String email) {
            this.email = Output.ofNullable(email);
            return this;
        }

        public Builder hostName(Output<String> hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder hostName(String hostName) {
            this.hostName = Output.of(Objects.requireNonNull(hostName));
            return this;
        }

        public Builder identityToken(@Nullable Output<String> identityToken) {
            this.identityToken = identityToken;
            return this;
        }

        public Builder identityToken(@Nullable String identityToken) {
            this.identityToken = Output.ofNullable(identityToken);
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

        public Builder registryToken(@Nullable Output<String> registryToken) {
            this.registryToken = registryToken;
            return this;
        }

        public Builder registryToken(@Nullable String registryToken) {
            this.registryToken = Output.ofNullable(registryToken);
            return this;
        }

        public Builder serverAddress(@Nullable Output<String> serverAddress) {
            this.serverAddress = serverAddress;
            return this;
        }

        public Builder serverAddress(@Nullable String serverAddress) {
            this.serverAddress = Output.ofNullable(serverAddress);
            return this;
        }

        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder userName(@Nullable String userName) {
            this.userName = Output.ofNullable(userName);
            return this;
        }
        public RegistryImageBuildAuthConfigArgs build() {
            return new RegistryImageBuildAuthConfigArgs(auth, email, hostName, identityToken, password, registryToken, serverAddress, userName);
        }
    }
}
