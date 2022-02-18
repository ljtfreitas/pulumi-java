// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGlobalUserPersonalPreferencesResult {
    /**
     * Array of favorite lab resource ids
     * 
     */
    private final @Nullable List<String> favoriteLabResourceIds;
    /**
     * Id to be used by the cache orchestrator
     * 
     */
    private final @Nullable String id;

    @OutputCustomType.Constructor({"favoriteLabResourceIds","id"})
    private GetGlobalUserPersonalPreferencesResult(
        @Nullable List<String> favoriteLabResourceIds,
        @Nullable String id) {
        this.favoriteLabResourceIds = favoriteLabResourceIds;
        this.id = id;
    }

    /**
     * Array of favorite lab resource ids
     * 
     */
    public List<String> getFavoriteLabResourceIds() {
        return this.favoriteLabResourceIds == null ? List.of() : this.favoriteLabResourceIds;
    }
    /**
     * Id to be used by the cache orchestrator
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalUserPersonalPreferencesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> favoriteLabResourceIds;
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalUserPersonalPreferencesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.favoriteLabResourceIds = defaults.favoriteLabResourceIds;
    	      this.id = defaults.id;
        }

        public Builder setFavoriteLabResourceIds(@Nullable List<String> favoriteLabResourceIds) {
            this.favoriteLabResourceIds = favoriteLabResourceIds;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public GetGlobalUserPersonalPreferencesResult build() {
            return new GetGlobalUserPersonalPreferencesResult(favoriteLabResourceIds, id);
        }
    }
}
