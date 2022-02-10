// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.inputs.KeyVaultPropertiesResponse;
import io.pulumi.azurenative.videoanalyzer.inputs.ResourceIdentityResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountEncryptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final AccountEncryptionResponse Empty = new AccountEncryptionResponse();

    @InputImport(name="identity")
    private final @Nullable ResourceIdentityResponse identity;

    public Optional<ResourceIdentityResponse> getIdentity() {
        return this.identity == null ? Optional.empty() : Optional.ofNullable(this.identity);
    }

    @InputImport(name="keyVaultProperties")
    private final @Nullable KeyVaultPropertiesResponse keyVaultProperties;

    public Optional<KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Optional.empty() : Optional.ofNullable(this.keyVaultProperties);
    }

    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public AccountEncryptionResponse(
        @Nullable ResourceIdentityResponse identity,
        @Nullable KeyVaultPropertiesResponse keyVaultProperties,
        String status,
        String type) {
        this.identity = identity;
        this.keyVaultProperties = keyVaultProperties;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AccountEncryptionResponse() {
        this.identity = null;
        this.keyVaultProperties = null;
        this.status = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceIdentityResponse identity;
        private @Nullable KeyVaultPropertiesResponse keyVaultProperties;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setIdentity(@Nullable ResourceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AccountEncryptionResponse build() {
            return new AccountEncryptionResponse(identity, keyVaultProperties, status, type);
        }
    }
}