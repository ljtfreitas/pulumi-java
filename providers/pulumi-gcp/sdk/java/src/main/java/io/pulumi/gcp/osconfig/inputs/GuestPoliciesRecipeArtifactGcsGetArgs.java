// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="bucket")
        private final @Nullable Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket == null ? Input.empty() : this.bucket;
    }

    /**
     * Must be provided if allowInsecure is false. Generation number of the Google Cloud Storage object.
     * https://storage.googleapis.com/my-bucket/foo/bar#1234567 this value would be 1234567.
     * 
     */
    @InputImport(name="generation")
        private final @Nullable Input<Integer> generation;

    public Input<Integer> getGeneration() {
        return this.generation == null ? Input.empty() : this.generation;
    }

    /**
     * Name of the Google Cloud Storage object. Given an example URL: https://storage.googleapis.com/my-bucket/foo/bar#1234567
     * this value would be foo/bar.
     * 
     */
    @InputImport(name="object")
        private final @Nullable Input<String> object;

    public Input<String> getObject() {
        return this.object == null ? Input.empty() : this.object;
    }

    public GuestPoliciesRecipeArtifactGcsGetArgs(
        @Nullable Input<String> bucket,
        @Nullable Input<Integer> generation,
        @Nullable Input<String> object) {
        this.bucket = bucket;
        this.generation = generation;
        this.object = object;
    }

    private GuestPoliciesRecipeArtifactGcsGetArgs() {
        this.bucket = Input.empty();
        this.generation = Input.empty();
        this.object = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeArtifactGcsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucket;
        private @Nullable Input<Integer> generation;
        private @Nullable Input<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeArtifactGcsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder setBucket(@Nullable Input<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = Input.ofNullable(bucket);
            return this;
        }

        public Builder setGeneration(@Nullable Input<Integer> generation) {
            this.generation = generation;
            return this;
        }

        public Builder setGeneration(@Nullable Integer generation) {
            this.generation = Input.ofNullable(generation);
            return this;
        }

        public Builder setObject(@Nullable Input<String> object) {
            this.object = object;
            return this;
        }

        public Builder setObject(@Nullable String object) {
            this.object = Input.ofNullable(object);
            return this;
        }
        public GuestPoliciesRecipeArtifactGcsGetArgs build() {
            return new GuestPoliciesRecipeArtifactGcsGetArgs(bucket, generation, object);
        }
    }
}
