// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This type describes a volume provided by an Azure Files file share.
 * 
 */
public final class VolumeProviderParametersAzureFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeProviderParametersAzureFileArgs Empty = new VolumeProviderParametersAzureFileArgs();

    /**
     * Access key of the Azure storage account for the File Share.
     * 
     */
    @InputImport(name="accountKey")
        private final @Nullable Input<String> accountKey;

    public Input<String> getAccountKey() {
        return this.accountKey == null ? Input.empty() : this.accountKey;
    }

    /**
     * Name of the Azure storage account for the File Share.
     * 
     */
    @InputImport(name="accountName", required=true)
        private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Name of the Azure Files file share that provides storage for the volume.
     * 
     */
    @InputImport(name="shareName", required=true)
        private final Input<String> shareName;

    public Input<String> getShareName() {
        return this.shareName;
    }

    public VolumeProviderParametersAzureFileArgs(
        @Nullable Input<String> accountKey,
        Input<String> accountName,
        Input<String> shareName) {
        this.accountKey = accountKey;
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
    }

    private VolumeProviderParametersAzureFileArgs() {
        this.accountKey = Input.empty();
        this.accountName = Input.empty();
        this.shareName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeProviderParametersAzureFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountKey;
        private Input<String> accountName;
        private Input<String> shareName;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeProviderParametersAzureFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.shareName = defaults.shareName;
        }

        public Builder setAccountKey(@Nullable Input<String> accountKey) {
            this.accountKey = accountKey;
            return this;
        }

        public Builder setAccountKey(@Nullable String accountKey) {
            this.accountKey = Input.ofNullable(accountKey);
            return this;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setShareName(Input<String> shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }

        public Builder setShareName(String shareName) {
            this.shareName = Input.of(Objects.requireNonNull(shareName));
            return this;
        }
        public VolumeProviderParametersAzureFileArgs build() {
            return new VolumeProviderParametersAzureFileArgs(accountKey, accountName, shareName);
        }
    }
}
