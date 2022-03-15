// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.CompositePathResponse;
import io.pulumi.azurenative.documentdb.outputs.ExcludedPathResponse;
import io.pulumi.azurenative.documentdb.outputs.IncludedPathResponse;
import io.pulumi.azurenative.documentdb.outputs.SpatialSpecResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IndexingPolicyResponse {
    /**
     * Indicates if the indexing policy is automatic
     * 
     */
    private final @Nullable Boolean automatic;
    /**
     * List of composite path list
     * 
     */
    private final @Nullable List<List<CompositePathResponse>> compositeIndexes;
    /**
     * List of paths to exclude from indexing
     * 
     */
    private final @Nullable List<ExcludedPathResponse> excludedPaths;
    /**
     * List of paths to include in the indexing
     * 
     */
    private final @Nullable List<IncludedPathResponse> includedPaths;
    /**
     * Indicates the indexing mode.
     * 
     */
    private final @Nullable String indexingMode;
    /**
     * List of spatial specifics
     * 
     */
    private final @Nullable List<SpatialSpecResponse> spatialIndexes;

    @CustomType.Constructor
    private IndexingPolicyResponse(
        @CustomType.Parameter("automatic") @Nullable Boolean automatic,
        @CustomType.Parameter("compositeIndexes") @Nullable List<List<CompositePathResponse>> compositeIndexes,
        @CustomType.Parameter("excludedPaths") @Nullable List<ExcludedPathResponse> excludedPaths,
        @CustomType.Parameter("includedPaths") @Nullable List<IncludedPathResponse> includedPaths,
        @CustomType.Parameter("indexingMode") @Nullable String indexingMode,
        @CustomType.Parameter("spatialIndexes") @Nullable List<SpatialSpecResponse> spatialIndexes) {
        this.automatic = automatic;
        this.compositeIndexes = compositeIndexes;
        this.excludedPaths = excludedPaths;
        this.includedPaths = includedPaths;
        this.indexingMode = indexingMode;
        this.spatialIndexes = spatialIndexes;
    }

    /**
     * Indicates if the indexing policy is automatic
     * 
    */
    public Optional<Boolean> getAutomatic() {
        return Optional.ofNullable(this.automatic);
    }
    /**
     * List of composite path list
     * 
    */
    public List<List<CompositePathResponse>> getCompositeIndexes() {
        return this.compositeIndexes == null ? List.of() : this.compositeIndexes;
    }
    /**
     * List of paths to exclude from indexing
     * 
    */
    public List<ExcludedPathResponse> getExcludedPaths() {
        return this.excludedPaths == null ? List.of() : this.excludedPaths;
    }
    /**
     * List of paths to include in the indexing
     * 
    */
    public List<IncludedPathResponse> getIncludedPaths() {
        return this.includedPaths == null ? List.of() : this.includedPaths;
    }
    /**
     * Indicates the indexing mode.
     * 
    */
    public Optional<String> getIndexingMode() {
        return Optional.ofNullable(this.indexingMode);
    }
    /**
     * List of spatial specifics
     * 
    */
    public List<SpatialSpecResponse> getSpatialIndexes() {
        return this.spatialIndexes == null ? List.of() : this.spatialIndexes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean automatic;
        private @Nullable List<List<CompositePathResponse>> compositeIndexes;
        private @Nullable List<ExcludedPathResponse> excludedPaths;
        private @Nullable List<IncludedPathResponse> includedPaths;
        private @Nullable String indexingMode;
        private @Nullable List<SpatialSpecResponse> spatialIndexes;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatic = defaults.automatic;
    	      this.compositeIndexes = defaults.compositeIndexes;
    	      this.excludedPaths = defaults.excludedPaths;
    	      this.includedPaths = defaults.includedPaths;
    	      this.indexingMode = defaults.indexingMode;
    	      this.spatialIndexes = defaults.spatialIndexes;
        }

        public Builder automatic(@Nullable Boolean automatic) {
            this.automatic = automatic;
            return this;
        }

        public Builder compositeIndexes(@Nullable List<List<CompositePathResponse>> compositeIndexes) {
            this.compositeIndexes = compositeIndexes;
            return this;
        }

        public Builder excludedPaths(@Nullable List<ExcludedPathResponse> excludedPaths) {
            this.excludedPaths = excludedPaths;
            return this;
        }

        public Builder includedPaths(@Nullable List<IncludedPathResponse> includedPaths) {
            this.includedPaths = includedPaths;
            return this;
        }

        public Builder indexingMode(@Nullable String indexingMode) {
            this.indexingMode = indexingMode;
            return this;
        }

        public Builder spatialIndexes(@Nullable List<SpatialSpecResponse> spatialIndexes) {
            this.spatialIndexes = spatialIndexes;
            return this;
        }
        public IndexingPolicyResponse build() {
            return new IndexingPolicyResponse(automatic, compositeIndexes, excludedPaths, includedPaths, indexingMode, spatialIndexes);
        }
    }
}
