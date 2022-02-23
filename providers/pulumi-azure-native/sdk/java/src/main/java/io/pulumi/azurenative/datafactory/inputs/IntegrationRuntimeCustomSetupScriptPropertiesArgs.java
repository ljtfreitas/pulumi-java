// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Custom setup script properties for a managed dedicated integration runtime.
 * 
 */
public final class IntegrationRuntimeCustomSetupScriptPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeCustomSetupScriptPropertiesArgs Empty = new IntegrationRuntimeCustomSetupScriptPropertiesArgs();

    /**
     * The URI of the Azure blob container that contains the custom setup script.
     * 
     */
    @InputImport(name="blobContainerUri")
        private final @Nullable Input<String> blobContainerUri;

    public Input<String> getBlobContainerUri() {
        return this.blobContainerUri == null ? Input.empty() : this.blobContainerUri;
    }

    /**
     * The SAS token of the Azure blob container.
     * 
     */
    @InputImport(name="sasToken")
        private final @Nullable Input<SecureStringArgs> sasToken;

    public Input<SecureStringArgs> getSasToken() {
        return this.sasToken == null ? Input.empty() : this.sasToken;
    }

    public IntegrationRuntimeCustomSetupScriptPropertiesArgs(
        @Nullable Input<String> blobContainerUri,
        @Nullable Input<SecureStringArgs> sasToken) {
        this.blobContainerUri = blobContainerUri;
        this.sasToken = sasToken;
    }

    private IntegrationRuntimeCustomSetupScriptPropertiesArgs() {
        this.blobContainerUri = Input.empty();
        this.sasToken = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeCustomSetupScriptPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> blobContainerUri;
        private @Nullable Input<SecureStringArgs> sasToken;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeCustomSetupScriptPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobContainerUri = defaults.blobContainerUri;
    	      this.sasToken = defaults.sasToken;
        }

        public Builder setBlobContainerUri(@Nullable Input<String> blobContainerUri) {
            this.blobContainerUri = blobContainerUri;
            return this;
        }

        public Builder setBlobContainerUri(@Nullable String blobContainerUri) {
            this.blobContainerUri = Input.ofNullable(blobContainerUri);
            return this;
        }

        public Builder setSasToken(@Nullable Input<SecureStringArgs> sasToken) {
            this.sasToken = sasToken;
            return this;
        }

        public Builder setSasToken(@Nullable SecureStringArgs sasToken) {
            this.sasToken = Input.ofNullable(sasToken);
            return this;
        }
        public IntegrationRuntimeCustomSetupScriptPropertiesArgs build() {
            return new IntegrationRuntimeCustomSetupScriptPropertiesArgs(blobContainerUri, sasToken);
        }
    }
}
