// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This type describes a volume provided by an Azure Files file share.
 * 
 */
public final class VolumeProviderParametersAzureFileResponse extends io.pulumi.resources.InvokeArgs {

    public static final VolumeProviderParametersAzureFileResponse Empty = new VolumeProviderParametersAzureFileResponse();

    /**
     * Access key of the Azure storage account for the File Share.
     * 
     */
    @InputImport(name="accountKey")
    private final @Nullable String accountKey;

    public Optional<String> getAccountKey() {
        return this.accountKey == null ? Optional.empty() : Optional.ofNullable(this.accountKey);
    }

    /**
     * Name of the Azure storage account for the File Share.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Name of the Azure Files file share that provides storage for the volume.
     * 
     */
    @InputImport(name="shareName", required=true)
    private final String shareName;

    public String getShareName() {
        return this.shareName;
    }

    public VolumeProviderParametersAzureFileResponse(
        @Nullable String accountKey,
        String accountName,
        String shareName) {
        this.accountKey = accountKey;
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
    }

    private VolumeProviderParametersAzureFileResponse() {
        this.accountKey = null;
        this.accountName = null;
        this.shareName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeProviderParametersAzureFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountKey;
        private String accountName;
        private String shareName;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeProviderParametersAzureFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.shareName = defaults.shareName;
        }

        public Builder setAccountKey(@Nullable String accountKey) {
            this.accountKey = accountKey;
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setShareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }

        public VolumeProviderParametersAzureFileResponse build() {
            return new VolumeProviderParametersAzureFileResponse(accountKey, accountName, shareName);
        }
    }
}
