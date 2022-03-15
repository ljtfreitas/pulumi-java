// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerBuildSourceStorageSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildSourceStorageSourceArgs Empty = new TriggerBuildSourceStorageSourceArgs();

    /**
     * Google Cloud Storage bucket containing the source.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * Google Cloud Storage generation for the object.
     * If the generation is omitted, the latest generation will be used
     * 
     */
    @Import(name="generation")
      private final @Nullable Output<String> generation;

    public Output<String> getGeneration() {
        return this.generation == null ? Output.empty() : this.generation;
    }

    /**
     * Google Cloud Storage object containing the source.
     * This object must be a gzipped archive file (.tar.gz) containing source to build.
     * 
     */
    @Import(name="object", required=true)
      private final Output<String> object;

    public Output<String> getObject() {
        return this.object;
    }

    public TriggerBuildSourceStorageSourceArgs(
        Output<String> bucket,
        @Nullable Output<String> generation,
        Output<String> object) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.generation = generation;
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private TriggerBuildSourceStorageSourceArgs() {
        this.bucket = Output.empty();
        this.generation = Output.empty();
        this.object = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildSourceStorageSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<String> generation;
        private Output<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildSourceStorageSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder generation(@Nullable Output<String> generation) {
            this.generation = generation;
            return this;
        }

        public Builder generation(@Nullable String generation) {
            this.generation = Output.ofNullable(generation);
            return this;
        }

        public Builder object(Output<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder object(String object) {
            this.object = Output.of(Objects.requireNonNull(object));
            return this;
        }
        public TriggerBuildSourceStorageSourceArgs build() {
            return new TriggerBuildSourceStorageSourceArgs(bucket, generation, object);
        }
    }
}
