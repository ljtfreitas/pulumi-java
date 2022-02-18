// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql;

import io.pulumi.azurenative.dbforpostgresql.enums.ServerKeyType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerKeyArgs Empty = new ServerKeyArgs();

    /**
     * The name of the PostgreSQL Server key to be operated on (updated or created).
     * 
     */
    @InputImport(name="keyName")
    private final @Nullable Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName == null ? Input.empty() : this.keyName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The key type like 'AzureKeyVault'.
     * 
     */
    @InputImport(name="serverKeyType", required=true)
    private final Input<Either<String,ServerKeyType>> serverKeyType;

    public Input<Either<String,ServerKeyType>> getServerKeyType() {
        return this.serverKeyType;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
    private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    /**
     * The URI of the key.
     * 
     */
    @InputImport(name="uri")
    private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public ServerKeyArgs(
        @Nullable Input<String> keyName,
        Input<String> resourceGroupName,
        Input<Either<String,ServerKeyType>> serverKeyType,
        Input<String> serverName,
        @Nullable Input<String> uri) {
        this.keyName = keyName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverKeyType = Objects.requireNonNull(serverKeyType, "expected parameter 'serverKeyType' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.uri = uri;
    }

    private ServerKeyArgs() {
        this.keyName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverKeyType = Input.empty();
        this.serverName = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyName;
        private Input<String> resourceGroupName;
        private Input<Either<String,ServerKeyType>> serverKeyType;
        private Input<String> serverName;
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverKeyType = defaults.serverKeyType;
    	      this.serverName = defaults.serverName;
    	      this.uri = defaults.uri;
        }

        public Builder setKeyName(@Nullable Input<String> keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = Input.ofNullable(keyName);
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

        public Builder setServerKeyType(Input<Either<String,ServerKeyType>> serverKeyType) {
            this.serverKeyType = Objects.requireNonNull(serverKeyType);
            return this;
        }

        public Builder setServerKeyType(Either<String,ServerKeyType> serverKeyType) {
            this.serverKeyType = Input.of(Objects.requireNonNull(serverKeyType));
            return this;
        }

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }

        public ServerKeyArgs build() {
            return new ServerKeyArgs(keyName, resourceGroupName, serverKeyType, serverName, uri);
        }
    }
}
