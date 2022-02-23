// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.ChangeFeedResponse;
import io.pulumi.azurenative.storage.outputs.CorsRulesResponse;
import io.pulumi.azurenative.storage.outputs.DeleteRetentionPolicyResponse;
import io.pulumi.azurenative.storage.outputs.LastAccessTimeTrackingPolicyResponse;
import io.pulumi.azurenative.storage.outputs.RestorePolicyPropertiesResponse;
import io.pulumi.azurenative.storage.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBlobServicePropertiesResult {
    /**
     * Deprecated in favor of isVersioningEnabled property.
     * 
     */
    private final @Nullable Boolean automaticSnapshotPolicyEnabled;
    /**
     * The blob service properties for change feed events.
     * 
     */
    private final @Nullable ChangeFeedResponse changeFeed;
    /**
     * The blob service properties for container soft delete.
     * 
     */
    private final @Nullable DeleteRetentionPolicyResponse containerDeleteRetentionPolicy;
    /**
     * Specifies CORS rules for the Blob service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Blob service.
     * 
     */
    private final @Nullable CorsRulesResponse cors;
    /**
     * DefaultServiceVersion indicates the default version to use for requests to the Blob service if an incoming request’s version is not specified. Possible values include version 2008-10-27 and all more recent versions.
     * 
     */
    private final @Nullable String defaultServiceVersion;
    /**
     * The blob service properties for blob soft delete.
     * 
     */
    private final @Nullable DeleteRetentionPolicyResponse deleteRetentionPolicy;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Versioning is enabled if set to true.
     * 
     */
    private final @Nullable Boolean isVersioningEnabled;
    /**
     * The blob service property to configure last access time based tracking policy.
     * 
     */
    private final @Nullable LastAccessTimeTrackingPolicyResponse lastAccessTimeTrackingPolicy;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The blob service properties for blob restore policy.
     * 
     */
    private final @Nullable RestorePolicyPropertiesResponse restorePolicy;
    /**
     * Sku name and tier.
     * 
     */
    private final SkuResponse sku;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"automaticSnapshotPolicyEnabled","changeFeed","containerDeleteRetentionPolicy","cors","defaultServiceVersion","deleteRetentionPolicy","id","isVersioningEnabled","lastAccessTimeTrackingPolicy","name","restorePolicy","sku","type"})
    private GetBlobServicePropertiesResult(
        @Nullable Boolean automaticSnapshotPolicyEnabled,
        @Nullable ChangeFeedResponse changeFeed,
        @Nullable DeleteRetentionPolicyResponse containerDeleteRetentionPolicy,
        @Nullable CorsRulesResponse cors,
        @Nullable String defaultServiceVersion,
        @Nullable DeleteRetentionPolicyResponse deleteRetentionPolicy,
        String id,
        @Nullable Boolean isVersioningEnabled,
        @Nullable LastAccessTimeTrackingPolicyResponse lastAccessTimeTrackingPolicy,
        String name,
        @Nullable RestorePolicyPropertiesResponse restorePolicy,
        SkuResponse sku,
        String type) {
        this.automaticSnapshotPolicyEnabled = automaticSnapshotPolicyEnabled;
        this.changeFeed = changeFeed;
        this.containerDeleteRetentionPolicy = containerDeleteRetentionPolicy;
        this.cors = cors;
        this.defaultServiceVersion = defaultServiceVersion;
        this.deleteRetentionPolicy = deleteRetentionPolicy;
        this.id = Objects.requireNonNull(id);
        this.isVersioningEnabled = isVersioningEnabled;
        this.lastAccessTimeTrackingPolicy = lastAccessTimeTrackingPolicy;
        this.name = Objects.requireNonNull(name);
        this.restorePolicy = restorePolicy;
        this.sku = Objects.requireNonNull(sku);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Deprecated in favor of isVersioningEnabled property.
     * 
     */
    public Optional<Boolean> getAutomaticSnapshotPolicyEnabled() {
        return Optional.ofNullable(this.automaticSnapshotPolicyEnabled);
    }
    /**
     * The blob service properties for change feed events.
     * 
     */
    public Optional<ChangeFeedResponse> getChangeFeed() {
        return Optional.ofNullable(this.changeFeed);
    }
    /**
     * The blob service properties for container soft delete.
     * 
     */
    public Optional<DeleteRetentionPolicyResponse> getContainerDeleteRetentionPolicy() {
        return Optional.ofNullable(this.containerDeleteRetentionPolicy);
    }
    /**
     * Specifies CORS rules for the Blob service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Blob service.
     * 
     */
    public Optional<CorsRulesResponse> getCors() {
        return Optional.ofNullable(this.cors);
    }
    /**
     * DefaultServiceVersion indicates the default version to use for requests to the Blob service if an incoming request’s version is not specified. Possible values include version 2008-10-27 and all more recent versions.
     * 
     */
    public Optional<String> getDefaultServiceVersion() {
        return Optional.ofNullable(this.defaultServiceVersion);
    }
    /**
     * The blob service properties for blob soft delete.
     * 
     */
    public Optional<DeleteRetentionPolicyResponse> getDeleteRetentionPolicy() {
        return Optional.ofNullable(this.deleteRetentionPolicy);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Versioning is enabled if set to true.
     * 
     */
    public Optional<Boolean> getIsVersioningEnabled() {
        return Optional.ofNullable(this.isVersioningEnabled);
    }
    /**
     * The blob service property to configure last access time based tracking policy.
     * 
     */
    public Optional<LastAccessTimeTrackingPolicyResponse> getLastAccessTimeTrackingPolicy() {
        return Optional.ofNullable(this.lastAccessTimeTrackingPolicy);
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The blob service properties for blob restore policy.
     * 
     */
    public Optional<RestorePolicyPropertiesResponse> getRestorePolicy() {
        return Optional.ofNullable(this.restorePolicy);
    }
    /**
     * Sku name and tier.
     * 
     */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBlobServicePropertiesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean automaticSnapshotPolicyEnabled;
        private @Nullable ChangeFeedResponse changeFeed;
        private @Nullable DeleteRetentionPolicyResponse containerDeleteRetentionPolicy;
        private @Nullable CorsRulesResponse cors;
        private @Nullable String defaultServiceVersion;
        private @Nullable DeleteRetentionPolicyResponse deleteRetentionPolicy;
        private String id;
        private @Nullable Boolean isVersioningEnabled;
        private @Nullable LastAccessTimeTrackingPolicyResponse lastAccessTimeTrackingPolicy;
        private String name;
        private @Nullable RestorePolicyPropertiesResponse restorePolicy;
        private SkuResponse sku;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlobServicePropertiesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticSnapshotPolicyEnabled = defaults.automaticSnapshotPolicyEnabled;
    	      this.changeFeed = defaults.changeFeed;
    	      this.containerDeleteRetentionPolicy = defaults.containerDeleteRetentionPolicy;
    	      this.cors = defaults.cors;
    	      this.defaultServiceVersion = defaults.defaultServiceVersion;
    	      this.deleteRetentionPolicy = defaults.deleteRetentionPolicy;
    	      this.id = defaults.id;
    	      this.isVersioningEnabled = defaults.isVersioningEnabled;
    	      this.lastAccessTimeTrackingPolicy = defaults.lastAccessTimeTrackingPolicy;
    	      this.name = defaults.name;
    	      this.restorePolicy = defaults.restorePolicy;
    	      this.sku = defaults.sku;
    	      this.type = defaults.type;
        }

        public Builder setAutomaticSnapshotPolicyEnabled(@Nullable Boolean automaticSnapshotPolicyEnabled) {
            this.automaticSnapshotPolicyEnabled = automaticSnapshotPolicyEnabled;
            return this;
        }

        public Builder setChangeFeed(@Nullable ChangeFeedResponse changeFeed) {
            this.changeFeed = changeFeed;
            return this;
        }

        public Builder setContainerDeleteRetentionPolicy(@Nullable DeleteRetentionPolicyResponse containerDeleteRetentionPolicy) {
            this.containerDeleteRetentionPolicy = containerDeleteRetentionPolicy;
            return this;
        }

        public Builder setCors(@Nullable CorsRulesResponse cors) {
            this.cors = cors;
            return this;
        }

        public Builder setDefaultServiceVersion(@Nullable String defaultServiceVersion) {
            this.defaultServiceVersion = defaultServiceVersion;
            return this;
        }

        public Builder setDeleteRetentionPolicy(@Nullable DeleteRetentionPolicyResponse deleteRetentionPolicy) {
            this.deleteRetentionPolicy = deleteRetentionPolicy;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsVersioningEnabled(@Nullable Boolean isVersioningEnabled) {
            this.isVersioningEnabled = isVersioningEnabled;
            return this;
        }

        public Builder setLastAccessTimeTrackingPolicy(@Nullable LastAccessTimeTrackingPolicyResponse lastAccessTimeTrackingPolicy) {
            this.lastAccessTimeTrackingPolicy = lastAccessTimeTrackingPolicy;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRestorePolicy(@Nullable RestorePolicyPropertiesResponse restorePolicy) {
            this.restorePolicy = restorePolicy;
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetBlobServicePropertiesResult build() {
            return new GetBlobServicePropertiesResult(automaticSnapshotPolicyEnabled, changeFeed, containerDeleteRetentionPolicy, cors, defaultServiceVersion, deleteRetentionPolicy, id, isVersioningEnabled, lastAccessTimeTrackingPolicy, name, restorePolicy, sku, type);
        }
    }
}
