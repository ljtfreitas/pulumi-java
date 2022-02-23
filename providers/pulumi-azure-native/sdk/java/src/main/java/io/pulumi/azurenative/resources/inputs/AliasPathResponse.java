// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.azurenative.resources.inputs.AliasPathMetadataResponse;
import io.pulumi.azurenative.resources.inputs.AliasPatternResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The type of the paths for alias.
 * 
 */
public final class AliasPathResponse extends io.pulumi.resources.InvokeArgs {

    public static final AliasPathResponse Empty = new AliasPathResponse();

    /**
     * The API versions.
     * 
     */
    @InputImport(name="apiVersions")
        private final @Nullable List<String> apiVersions;

    public List<String> getApiVersions() {
        return this.apiVersions == null ? List.of() : this.apiVersions;
    }

    /**
     * The metadata of the alias path. If missing, fall back to the default metadata of the alias.
     * 
     */
    @InputImport(name="metadata", required=true)
        private final AliasPathMetadataResponse metadata;

    public AliasPathMetadataResponse getMetadata() {
        return this.metadata;
    }

    /**
     * The path of an alias.
     * 
     */
    @InputImport(name="path")
        private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    /**
     * The pattern for an alias path.
     * 
     */
    @InputImport(name="pattern")
        private final @Nullable AliasPatternResponse pattern;

    public Optional<AliasPatternResponse> getPattern() {
        return this.pattern == null ? Optional.empty() : Optional.ofNullable(this.pattern);
    }

    public AliasPathResponse(
        @Nullable List<String> apiVersions,
        AliasPathMetadataResponse metadata,
        @Nullable String path,
        @Nullable AliasPatternResponse pattern) {
        this.apiVersions = apiVersions;
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.path = path;
        this.pattern = pattern;
    }

    private AliasPathResponse() {
        this.apiVersions = List.of();
        this.metadata = null;
        this.path = null;
        this.pattern = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> apiVersions;
        private AliasPathMetadataResponse metadata;
        private @Nullable String path;
        private @Nullable AliasPatternResponse pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasPathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersions = defaults.apiVersions;
    	      this.metadata = defaults.metadata;
    	      this.path = defaults.path;
    	      this.pattern = defaults.pattern;
        }

        public Builder setApiVersions(@Nullable List<String> apiVersions) {
            this.apiVersions = apiVersions;
            return this;
        }

        public Builder setMetadata(AliasPathMetadataResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setPattern(@Nullable AliasPatternResponse pattern) {
            this.pattern = pattern;
            return this;
        }
        public AliasPathResponse build() {
            return new AliasPathResponse(apiVersions, metadata, path, pattern);
        }
    }
}
