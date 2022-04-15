// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClientState extends io.pulumi.resources.ResourceArgs {

    public static final ClientState Empty = new ClientState();

    /**
     * Identifier of the brand to which this client
     * is attached to. The format is
     * `projects/{project_number}/brands/{brand_id}/identityAwareProxyClients/{client_id}`.
     * 
     */
    @Import(name="brand")
      private final @Nullable Output<String> brand;

    public Output<String> brand() {
        return this.brand == null ? Codegen.empty() : this.brand;
    }

    /**
     * Output only. Unique identifier of the OAuth client.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId == null ? Codegen.empty() : this.clientId;
    }

    /**
     * Human-friendly name given to the OAuth client.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Output only. Client secret of the OAuth client.
     * 
     */
    @Import(name="secret")
      private final @Nullable Output<String> secret;

    public Output<String> secret() {
        return this.secret == null ? Codegen.empty() : this.secret;
    }

    public ClientState(
        @Nullable Output<String> brand,
        @Nullable Output<String> clientId,
        @Nullable Output<String> displayName,
        @Nullable Output<String> secret) {
        this.brand = brand;
        this.clientId = clientId;
        this.displayName = displayName;
        this.secret = secret;
    }

    private ClientState() {
        this.brand = Codegen.empty();
        this.clientId = Codegen.empty();
        this.displayName = Codegen.empty();
        this.secret = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> brand;
        private @Nullable Output<String> clientId;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brand = defaults.brand;
    	      this.clientId = defaults.clientId;
    	      this.displayName = defaults.displayName;
    	      this.secret = defaults.secret;
        }

        public Builder brand(@Nullable Output<String> brand) {
            this.brand = brand;
            return this;
        }
        public Builder brand(@Nullable String brand) {
            this.brand = Codegen.ofNullable(brand);
            return this;
        }
        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = Codegen.ofNullable(clientId);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder secret(@Nullable Output<String> secret) {
            this.secret = secret;
            return this;
        }
        public Builder secret(@Nullable String secret) {
            this.secret = Codegen.ofNullable(secret);
            return this;
        }        public ClientState build() {
            return new ClientState(brand, clientId, displayName, secret);
        }
    }
}
