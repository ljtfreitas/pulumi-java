// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerRegistryResponse {
    private final String password;
    /**
     * If omitted, the default is "docker.io".
     * 
     */
    private final @Nullable String registryServer;
    private final String userName;

    @OutputCustomType.Constructor({"password","registryServer","userName"})
    private ContainerRegistryResponse(
        String password,
        @Nullable String registryServer,
        String userName) {
        this.password = Objects.requireNonNull(password);
        this.registryServer = registryServer;
        this.userName = Objects.requireNonNull(userName);
    }

    public String getPassword() {
        return this.password;
    }
    /**
     * If omitted, the default is "docker.io".
     * 
     */
    public Optional<String> getRegistryServer() {
        return Optional.ofNullable(this.registryServer);
    }
    public String getUserName() {
        return this.userName;
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
