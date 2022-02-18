// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the encryption key properties
 * 
 */
public final class EncryptionKeyDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionKeyDetailsResponse Empty = new EncryptionKeyDetailsResponse();

    /**
     * The type of kek encryption key
     * 
     */
    @InputImport(name="kekType")
    private final @Nullable String kekType;

    public Optional<String> getKekType() {
        return this.kekType == null ? Optional.empty() : Optional.ofNullable(this.kekType);
    }

    /**
     * Specifies the url for kek encryption key.
     * 
     */
    @InputImport(name="kekUrl")
    private final @Nullable String kekUrl;

    public Optional<String> getKekUrl() {
        return this.kekUrl == null ? Optional.empty() : Optional.ofNullable(this.kekUrl);
    }

    /**
     * Specifies the keyvault resource id for kek encryption key.
     * 
     */
    @InputImport(name="kekVaultResourceID")
    private final @Nullable String kekVaultResourceID;

    public Optional<String> getKekVaultResourceID() {
        return this.kekVaultResourceID == null ? Optional.empty() : Optional.ofNullable(this.kekVaultResourceID);
    }

    public EncryptionKeyDetailsResponse(
        @Nullable String kekType,
        @Nullable String kekUrl,
        @Nullable String kekVaultResourceID) {
        this.kekType = kekType == null ? "MicrosoftManaged" : kekType;
        this.kekUrl = kekUrl;
        this.kekVaultResourceID = kekVaultResourceID;
    }

    private EncryptionKeyDetailsResponse() {
        this.kekType = null;
        this.kekUrl = null;
        this.kekVaultResourceID = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionKeyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kekType;
        private @Nullable String kekUrl;
        private @Nullable String kekVaultResourceID;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionKeyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kekType = defaults.kekType;
    	      this.kekUrl = defaults.kekUrl;
    	      this.kekVaultResourceID = defaults.kekVaultResourceID;
        }

        public Builder setKekType(@Nullable String kekType) {
            this.kekType = kekType;
            return this;
        }

        public Builder setKekUrl(@Nullable String kekUrl) {
            this.kekUrl = kekUrl;
            return this;
        }

        public Builder setKekVaultResourceID(@Nullable String kekVaultResourceID) {
            this.kekVaultResourceID = kekVaultResourceID;
            return this;
        }

        public EncryptionKeyDetailsResponse build() {
            return new EncryptionKeyDetailsResponse(kekType, kekUrl, kekVaultResourceID);
        }
    }
}
