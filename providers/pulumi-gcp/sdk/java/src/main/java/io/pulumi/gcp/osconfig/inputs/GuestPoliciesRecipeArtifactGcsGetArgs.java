// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeArtifactGcsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeArtifactGcsGetArgs Empty = new GuestPoliciesRecipeArtifactGcsGetArgs();

    /**
     * Bucket of the Google Cloud Storage object. Given an example URL: https://storage.googleapis.com/my-bucket/foo/bar#1234567
     * this value would be my-bucket.
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Output.empty() : this.bucket;
    }

    /**
     * Must be provided if allowInsecure is false. Generation number of the Google Cloud Storage object.
     * https://storage.googleapis.com/my-bucket/foo/bar#1234567 this value would be 1234567.
     * 
     */
    @Import(name="generation")
      private final @Nullable Output<Integer> generation;

    public Output<Integer> getGeneration() {
        return this.generation == null ? Output.empty() : this.generation;
    }

    /**
     * Name of the Google Cloud Storage object. Given an example URL: https://storage.googleapis.com/my-bucket/foo/bar#1234567
     * this value would be foo/bar.
     * 
     */
    @Import(name="object")
      private final @Nullable Output<String> object;

    public Output<String> getObject() {
        return this.object == null ? Output.empty() : this.object;
    }

    public GuestPoliciesRecipeArtifactGcsGetArgs(
        @Nullable Output<String> bucket,
        @Nullable Output<Integer> generation,
        @Nullable Output<String> object) {
        this.bucket = bucket;
        this.generation = generation;
        this.object = object;
    }

    private GuestPoliciesRecipeArtifactGcsGetArgs() {
        this.bucket = Output.empty();
        this.generation = Output.empty();
        this.object = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeArtifactGcsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucket;
        private @Nullable Output<Integer> generation;
        private @Nullable Output<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeArtifactGcsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder bucket(@Nullable String bucket) {
            this.bucket = Output.ofNullable(bucket);
            return this;
        }

        public Builder generation(@Nullable Output<Integer> generation) {
            this.generation = generation;
            return this;
        }

        public Builder generation(@Nullable Integer generation) {
            this.generation = Output.ofNullable(generation);
            return this;
        }

        public Builder object(@Nullable Output<String> object) {
            this.object = object;
            return this;
        }

        public Builder object(@Nullable String object) {
            this.object = Output.ofNullable(object);
            return this;
        }
        public GuestPoliciesRecipeArtifactGcsGetArgs build() {
            return new GuestPoliciesRecipeArtifactGcsGetArgs(bucket, generation, object);
        }
    }
}
