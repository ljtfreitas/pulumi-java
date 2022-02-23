// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies an artifact available as a Google Cloud Storage object.
 * 
 */
public final class SoftwareRecipeArtifactGcsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SoftwareRecipeArtifactGcsResponse Empty = new SoftwareRecipeArtifactGcsResponse();

    /**
     * Bucket of the Google Cloud Storage object. Given an example URL: `https://storage.googleapis.com/my-bucket/foo/bar#1234567` this value would be `my-bucket`.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    /**
     * Must be provided if allow_insecure is false. Generation number of the Google Cloud Storage object. `https://storage.googleapis.com/my-bucket/foo/bar#1234567` this value would be `1234567`.
     * 
     */
    @InputImport(name="generation", required=true)
      private final String generation;

    public String getGeneration() {
        return this.generation;
    }

    /**
     * Name of the Google Cloud Storage object. As specified [here] (https://cloud.google.com/storage/docs/naming#objectnames) Given an example URL: `https://storage.googleapis.com/my-bucket/foo/bar#1234567` this value would be `foo/bar`.
     * 
     */
    @InputImport(name="object", required=true)
      private final String object;

    public String getObject() {
        return this.object;
    }

    public SoftwareRecipeArtifactGcsResponse(
        String bucket,
        String generation,
        String object) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.generation = Objects.requireNonNull(generation, "expected parameter 'generation' to be non-null");
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private SoftwareRecipeArtifactGcsResponse() {
        this.bucket = null;
        this.generation = null;
        this.object = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeArtifactGcsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String generation;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeArtifactGcsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setGeneration(String generation) {
            this.generation = Objects.requireNonNull(generation);
            return this;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public SoftwareRecipeArtifactGcsResponse build() {
            return new SoftwareRecipeArtifactGcsResponse(bucket, generation, object);
        }
    }
}
