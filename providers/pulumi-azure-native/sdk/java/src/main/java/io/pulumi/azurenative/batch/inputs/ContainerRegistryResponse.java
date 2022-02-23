// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerRegistryResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerRegistryResponse Empty = new ContainerRegistryResponse();

    @InputImport(name="password", required=true)
        private final String password;

    public String getPassword() {
        return this.password;
    }

    /**
     * If omitted, the default is "docker.io".
     * 
     */
    @InputImport(name="registryServer")
        private final @Nullable String registryServer;

    public Optional<String> getRegistryServer() {
        return this.registryServer == null ? Optional.empty() : Optional.ofNullable(this.registryServer);
    }

    @InputImport(name="userName", required=true)
        private final String userName;

    public String getUserName() {
        return this.userName;
    }

    public ContainerRegistryResponse(
        String password,
        @Nullable String registryServer,
        String userName) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.registryServer = registryServer;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private ContainerRegistryResponse() {
        this.password = null;
        this.registryServer = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRegistryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private @Nullable String registryServer;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRegistryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.registryServer = defaults.registryServer;
    	      this.userName = defaults.userName;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setRegistryServer(@Nullable String registryServer) {
            this.registryServer = registryServer;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public ContainerRegistryResponse build() {
            return new ContainerRegistryResponse(password, registryServer, userName);
        }
    }
}
