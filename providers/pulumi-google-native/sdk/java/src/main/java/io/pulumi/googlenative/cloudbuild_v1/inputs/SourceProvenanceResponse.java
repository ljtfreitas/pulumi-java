// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudbuild_v1.inputs.RepoSourceResponse;
import io.pulumi.googlenative.cloudbuild_v1.inputs.StorageSourceManifestResponse;
import io.pulumi.googlenative.cloudbuild_v1.inputs.StorageSourceResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Provenance of the source. Ways to find the original source, or verify that some source was used for this build.
 * 
 */
public final class SourceProvenanceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceProvenanceResponse Empty = new SourceProvenanceResponse();

    /**
     * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. Note that `FileHashes` will only be populated if `BuildOptions` has requested a `SourceProvenanceHash`. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (`.tar.gz`), the `FileHash` will be for the single path to that file.
     * 
     */
    @Import(name="fileHashes", required=true)
      private final Map<String,String> fileHashes;

    public Map<String,String> getFileHashes() {
        return this.fileHashes;
    }

    /**
     * A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
     * 
     */
    @Import(name="resolvedRepoSource", required=true)
      private final RepoSourceResponse resolvedRepoSource;

    public RepoSourceResponse getResolvedRepoSource() {
        return this.resolvedRepoSource;
    }

    /**
     * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
     * 
     */
    @Import(name="resolvedStorageSource", required=true)
      private final StorageSourceResponse resolvedStorageSource;

    public StorageSourceResponse getResolvedStorageSource() {
        return this.resolvedStorageSource;
    }

    /**
     * A copy of the build's `source.storage_source_manifest`, if exists, with any revisions resolved. This feature is in Preview.
     * 
     */
    @Import(name="resolvedStorageSourceManifest", required=true)
      private final StorageSourceManifestResponse resolvedStorageSourceManifest;

    public StorageSourceManifestResponse getResolvedStorageSourceManifest() {
        return this.resolvedStorageSourceManifest;
    }

    public SourceProvenanceResponse(
        Map<String,String> fileHashes,
        RepoSourceResponse resolvedRepoSource,
        StorageSourceResponse resolvedStorageSource,
        StorageSourceManifestResponse resolvedStorageSourceManifest) {
        this.fileHashes = Objects.requireNonNull(fileHashes, "expected parameter 'fileHashes' to be non-null");
        this.resolvedRepoSource = Objects.requireNonNull(resolvedRepoSource, "expected parameter 'resolvedRepoSource' to be non-null");
        this.resolvedStorageSource = Objects.requireNonNull(resolvedStorageSource, "expected parameter 'resolvedStorageSource' to be non-null");
        this.resolvedStorageSourceManifest = Objects.requireNonNull(resolvedStorageSourceManifest, "expected parameter 'resolvedStorageSourceManifest' to be non-null");
    }

    private SourceProvenanceResponse() {
        this.fileHashes = Map.of();
        this.resolvedRepoSource = null;
        this.resolvedStorageSource = null;
        this.resolvedStorageSourceManifest = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceProvenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> fileHashes;
        private RepoSourceResponse resolvedRepoSource;
        private StorageSourceResponse resolvedStorageSource;
        private StorageSourceManifestResponse resolvedStorageSourceManifest;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceProvenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileHashes = defaults.fileHashes;
    	      this.resolvedRepoSource = defaults.resolvedRepoSource;
    	      this.resolvedStorageSource = defaults.resolvedStorageSource;
    	      this.resolvedStorageSourceManifest = defaults.resolvedStorageSourceManifest;
        }

        public Builder fileHashes(Map<String,String> fileHashes) {
            this.fileHashes = Objects.requireNonNull(fileHashes);
            return this;
        }

        public Builder resolvedRepoSource(RepoSourceResponse resolvedRepoSource) {
            this.resolvedRepoSource = Objects.requireNonNull(resolvedRepoSource);
            return this;
        }

        public Builder resolvedStorageSource(StorageSourceResponse resolvedStorageSource) {
            this.resolvedStorageSource = Objects.requireNonNull(resolvedStorageSource);
            return this;
        }

        public Builder resolvedStorageSourceManifest(StorageSourceManifestResponse resolvedStorageSourceManifest) {
            this.resolvedStorageSourceManifest = Objects.requireNonNull(resolvedStorageSourceManifest);
            return this;
        }
        public SourceProvenanceResponse build() {
            return new SourceProvenanceResponse(fileHashes, resolvedRepoSource, resolvedStorageSource, resolvedStorageSourceManifest);
        }
    }
}
