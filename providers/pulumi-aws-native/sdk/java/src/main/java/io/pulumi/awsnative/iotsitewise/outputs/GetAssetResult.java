// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.awsnative.iotsitewise.outputs.AssetHierarchy;
import io.pulumi.awsnative.iotsitewise.outputs.AssetProperty;
import io.pulumi.awsnative.iotsitewise.outputs.AssetTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAssetResult {
    /**
     * The ARN of the asset
     * 
     */
    private final @Nullable String assetArn;
    private final @Nullable List<AssetHierarchy> assetHierarchies;
    /**
     * The ID of the asset
     * 
     */
    private final @Nullable String assetId;
    /**
     * The ID of the asset model from which to create the asset.
     * 
     */
    private final @Nullable String assetModelId;
    /**
     * A unique, friendly name for the asset.
     * 
     */
    private final @Nullable String assetName;
    private final @Nullable List<AssetProperty> assetProperties;
    /**
     * A list of key-value pairs that contain metadata for the asset.
     * 
     */
    private final @Nullable List<AssetTag> tags;

    @CustomType.Constructor
    private GetAssetResult(
        @CustomType.Parameter("assetArn") @Nullable String assetArn,
        @CustomType.Parameter("assetHierarchies") @Nullable List<AssetHierarchy> assetHierarchies,
        @CustomType.Parameter("assetId") @Nullable String assetId,
        @CustomType.Parameter("assetModelId") @Nullable String assetModelId,
        @CustomType.Parameter("assetName") @Nullable String assetName,
        @CustomType.Parameter("assetProperties") @Nullable List<AssetProperty> assetProperties,
        @CustomType.Parameter("tags") @Nullable List<AssetTag> tags) {
        this.assetArn = assetArn;
        this.assetHierarchies = assetHierarchies;
        this.assetId = assetId;
        this.assetModelId = assetModelId;
        this.assetName = assetName;
        this.assetProperties = assetProperties;
        this.tags = tags;
    }

    /**
     * The ARN of the asset
     * 
    */
    public Optional<String> getAssetArn() {
        return Optional.ofNullable(this.assetArn);
    }
    public List<AssetHierarchy> getAssetHierarchies() {
        return this.assetHierarchies == null ? List.of() : this.assetHierarchies;
    }
    /**
     * The ID of the asset
     * 
    */
    public Optional<String> getAssetId() {
        return Optional.ofNullable(this.assetId);
    }
    /**
     * The ID of the asset model from which to create the asset.
     * 
    */
    public Optional<String> getAssetModelId() {
        return Optional.ofNullable(this.assetModelId);
    }
    /**
     * A unique, friendly name for the asset.
     * 
    */
    public Optional<String> getAssetName() {
        return Optional.ofNullable(this.assetName);
    }
    public List<AssetProperty> getAssetProperties() {
        return this.assetProperties == null ? List.of() : this.assetProperties;
    }
    /**
     * A list of key-value pairs that contain metadata for the asset.
     * 
    */
    public List<AssetTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String assetArn;
        private @Nullable List<AssetHierarchy> assetHierarchies;
        private @Nullable String assetId;
        private @Nullable String assetModelId;
        private @Nullable String assetName;
        private @Nullable List<AssetProperty> assetProperties;
        private @Nullable List<AssetTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetArn = defaults.assetArn;
    	      this.assetHierarchies = defaults.assetHierarchies;
    	      this.assetId = defaults.assetId;
    	      this.assetModelId = defaults.assetModelId;
    	      this.assetName = defaults.assetName;
    	      this.assetProperties = defaults.assetProperties;
    	      this.tags = defaults.tags;
        }

        public Builder assetArn(@Nullable String assetArn) {
            this.assetArn = assetArn;
            return this;
        }

        public Builder assetHierarchies(@Nullable List<AssetHierarchy> assetHierarchies) {
            this.assetHierarchies = assetHierarchies;
            return this;
        }

        public Builder assetId(@Nullable String assetId) {
            this.assetId = assetId;
            return this;
        }

        public Builder assetModelId(@Nullable String assetModelId) {
            this.assetModelId = assetModelId;
            return this;
        }

        public Builder assetName(@Nullable String assetName) {
            this.assetName = assetName;
            return this;
        }

        public Builder assetProperties(@Nullable List<AssetProperty> assetProperties) {
            this.assetProperties = assetProperties;
            return this;
        }

        public Builder tags(@Nullable List<AssetTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetAssetResult build() {
            return new GetAssetResult(assetArn, assetHierarchies, assetId, assetModelId, assetName, assetProperties, tags);
        }
    }
}
