// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom setup script properties for a managed dedicated integration runtime.
 * 
 */
public final class IntegrationRuntimeCustomSetupScriptPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final IntegrationRuntimeCustomSetupScriptPropertiesResponse Empty = new IntegrationRuntimeCustomSetupScriptPropertiesResponse();

    /**
     * The URI of the Azure blob container that contains the custom setup script.
     * 
     */
    @InputImport(name="blobContainerUri")
    private final @Nullable String blobContainerUri;

    public Optional<String> getBlobContainerUri() {
        return this.blobContainerUri == null ? Optional.empty() : Optional.ofNullable(this.blobContainerUri);
    }

    /**
     * The SAS token of the Azure blob container.
     * 
     */
    @InputImport(name="sasToken")
    private final @Nullable SecureStringResponse sasToken;

    public Optional<SecureStringResponse> getSasToken() {
        return this.sasToken == null ? Optional.empty() : Optional.ofNullable(this.sasToken);
    }

    public IntegrationRuntimeCustomSetupScriptPropertiesResponse(
        @Nullable String blobContainerUri,
        @Nullable SecureStringResponse sasToken) {
        this.blobContainerUri = blobContainerUri;
        this.sasToken = sasToken;
    }

    private IntegrationRuntimeCustomSetupScriptPropertiesResponse() {
        this.blobContainerUri = null;
        this.sasToken = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeCustomSetupScriptPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blobContainerUri;
        private @Nullable SecureStringResponse sasToken;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeCustomSetupScriptPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobContainerUri = defaults.blobContainerUri;
    	      this.sasToken = defaults.sasToken;
        }

        public Builder setBlobContainerUri(@Nullable String blobContainerUri) {
            this.blobContainerUri = blobContainerUri;
            return this;
        }

        public Builder setSasToken(@Nullable SecureStringResponse sasToken) {
            this.sasToken = sasToken;
            return this;
        }

        public IntegrationRuntimeCustomSetupScriptPropertiesResponse build() {
            return new IntegrationRuntimeCustomSetupScriptPropertiesResponse(blobContainerUri, sasToken);
        }
    }
}
