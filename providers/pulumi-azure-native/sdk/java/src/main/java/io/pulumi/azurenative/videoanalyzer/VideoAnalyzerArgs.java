// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.videoanalyzer.inputs.AccountEncryptionArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.StorageAccountArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.VideoAnalyzerIdentityArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VideoAnalyzerArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoAnalyzerArgs Empty = new VideoAnalyzerArgs();

    /**
     * The Video Analyzer account name.
     * 
     */
    @Import(name="accountName")
      private final @Nullable Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName == null ? Output.empty() : this.accountName;
    }

    /**
     * The account encryption properties.
     * 
     */
    @Import(name="encryption", required=true)
      private final Output<AccountEncryptionArgs> encryption;

    public Output<AccountEncryptionArgs> getEncryption() {
        return this.encryption;
    }

    /**
     * The set of managed identities associated with the Video Analyzer resource.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<VideoAnalyzerIdentityArgs> identity;

    public Output<VideoAnalyzerIdentityArgs> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The storage accounts for this resource.
     * 
     */
    @Import(name="storageAccounts", required=true)
      private final Output<List<StorageAccountArgs>> storageAccounts;

    public Output<List<StorageAccountArgs>> getStorageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public VideoAnalyzerArgs(
        @Nullable Output<String> accountName,
        Output<AccountEncryptionArgs> encryption,
        @Nullable Output<VideoAnalyzerIdentityArgs> identity,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        Output<List<StorageAccountArgs>> storageAccounts,
        @Nullable Output<Map<String,String>> tags) {
        this.accountName = accountName;
        this.encryption = Objects.requireNonNull(encryption, "expected parameter 'encryption' to be non-null");
        this.identity = identity;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccounts = Objects.requireNonNull(storageAccounts, "expected parameter 'storageAccounts' to be non-null");
        this.tags = tags;
    }

    private VideoAnalyzerArgs() {
        this.accountName = Output.empty();
        this.encryption = Output.empty();
        this.identity = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.storageAccounts = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoAnalyzerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountName;
        private Output<AccountEncryptionArgs> encryption;
        private @Nullable Output<VideoAnalyzerIdentityArgs> identity;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private Output<List<StorageAccountArgs>> storageAccounts;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoAnalyzerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.encryption = defaults.encryption;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccounts = defaults.storageAccounts;
    	      this.tags = defaults.tags;
        }

        public Builder accountName(@Nullable Output<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder accountName(@Nullable String accountName) {
            this.accountName = Output.ofNullable(accountName);
            return this;
        }

        public Builder encryption(Output<AccountEncryptionArgs> encryption) {
            this.encryption = Objects.requireNonNull(encryption);
            return this;
        }

        public Builder encryption(AccountEncryptionArgs encryption) {
            this.encryption = Output.of(Objects.requireNonNull(encryption));
            return this;
        }

        public Builder identity(@Nullable Output<VideoAnalyzerIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable VideoAnalyzerIdentityArgs identity) {
            this.identity = Output.ofNullable(identity);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder storageAccounts(Output<List<StorageAccountArgs>> storageAccounts) {
            this.storageAccounts = Objects.requireNonNull(storageAccounts);
            return this;
        }

        public Builder storageAccounts(List<StorageAccountArgs> storageAccounts) {
            this.storageAccounts = Output.of(Objects.requireNonNull(storageAccounts));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public VideoAnalyzerArgs build() {
            return new VideoAnalyzerArgs(accountName, encryption, identity, location, resourceGroupName, storageAccounts, tags);
        }
    }
}
