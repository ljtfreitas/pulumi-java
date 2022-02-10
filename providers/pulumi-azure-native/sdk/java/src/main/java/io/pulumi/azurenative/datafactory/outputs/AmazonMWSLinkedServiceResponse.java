// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AmazonMWSLinkedServiceResponse {
    private final Object accessKeyId;
    private final @Nullable List<Object> annotations;
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    private final @Nullable String description;
    private final @Nullable Object encryptedCredential;
    private final Object endpoint;
    private final Object marketplaceID;
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> mwsAuthToken;
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretKey;
    private final Object sellerID;
    private final String type;
    private final @Nullable Object useEncryptedEndpoints;
    private final @Nullable Object useHostVerification;
    private final @Nullable Object usePeerVerification;

    @OutputCustomType.Constructor({"accessKeyId","annotations","connectVia","description","encryptedCredential","endpoint","marketplaceID","mwsAuthToken","parameters","secretKey","sellerID","type","useEncryptedEndpoints","useHostVerification","usePeerVerification"})
    private AmazonMWSLinkedServiceResponse(
        Object accessKeyId,
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        Object endpoint,
        Object marketplaceID,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> mwsAuthToken,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretKey,
        Object sellerID,
        String type,
        @Nullable Object useEncryptedEndpoints,
        @Nullable Object useHostVerification,
        @Nullable Object usePeerVerification) {
        this.accessKeyId = Objects.requireNonNull(accessKeyId);
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.endpoint = Objects.requireNonNull(endpoint);
        this.marketplaceID = Objects.requireNonNull(marketplaceID);
        this.mwsAuthToken = mwsAuthToken;
        this.parameters = parameters;
        this.secretKey = secretKey;
        this.sellerID = Objects.requireNonNull(sellerID);
        this.type = Objects.requireNonNull(type);
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    public Object getAccessKeyId() {
        return this.accessKeyId;
    }
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    public Object getEndpoint() {
        return this.endpoint;
    }
    public Object getMarketplaceID() {
        return this.marketplaceID;
    }
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getMwsAuthToken() {
        return Optional.ofNullable(this.mwsAuthToken);
    }
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getSecretKey() {
        return Optional.ofNullable(this.secretKey);
    }
    public Object getSellerID() {
        return this.sellerID;
    }
    public String getType() {
        return this.type;
    }
    public Optional<Object> getUseEncryptedEndpoints() {
        return Optional.ofNullable(this.useEncryptedEndpoints);
    }
    public Optional<Object> getUseHostVerification() {
        return Optional.ofNullable(this.useHostVerification);
    }
    public Optional<Object> getUsePeerVerification() {
        return Optional.ofNullable(this.usePeerVerification);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonMWSLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object accessKeyId;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object endpoint;
        private Object marketplaceID;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> mwsAuthToken;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretKey;
        private Object sellerID;
        private String type;
        private @Nullable Object useEncryptedEndpoints;
        private @Nullable Object useHostVerification;
        private @Nullable Object usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonMWSLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.endpoint = defaults.endpoint;
    	      this.marketplaceID = defaults.marketplaceID;
    	      this.mwsAuthToken = defaults.mwsAuthToken;
    	      this.parameters = defaults.parameters;
    	      this.secretKey = defaults.secretKey;
    	      this.sellerID = defaults.sellerID;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
        }

        public Builder setAccessKeyId(Object accessKeyId) {
            this.accessKeyId = Objects.requireNonNull(accessKeyId);
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setEndpoint(Object endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setMarketplaceID(Object marketplaceID) {
            this.marketplaceID = Objects.requireNonNull(marketplaceID);
            return this;
        }

        public Builder setMwsAuthToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> mwsAuthToken) {
            this.mwsAuthToken = mwsAuthToken;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setSecretKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        public Builder setSellerID(Object sellerID) {
            this.sellerID = Objects.requireNonNull(sellerID);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUseEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder setUseHostVerification(@Nullable Object useHostVerification) {
            this.useHostVerification = useHostVerification;
            return this;
        }

        public Builder setUsePeerVerification(@Nullable Object usePeerVerification) {
            this.usePeerVerification = usePeerVerification;
            return this;
        }

        public AmazonMWSLinkedServiceResponse build() {
            return new AmazonMWSLinkedServiceResponse(accessKeyId, annotations, connectVia, description, encryptedCredential, endpoint, marketplaceID, mwsAuthToken, parameters, secretKey, sellerID, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}