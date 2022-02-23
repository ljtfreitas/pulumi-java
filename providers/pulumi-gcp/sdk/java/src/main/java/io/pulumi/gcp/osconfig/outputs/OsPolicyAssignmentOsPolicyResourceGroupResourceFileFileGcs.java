// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcs {
    /**
     * Required. Bucket of the Cloud Storage object.
     * 
     */
    private final String bucket;
    /**
     * Generation number of the Cloud Storage object.
     * 
     */
    private final @Nullable Integer generation;
    /**
     * Required. Name of the Cloud Storage object.
     * 
     */
    private final String object;

    @OutputCustomType.Constructor({"bucket","generation","object"})
    private OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcs(
        String bucket,
        @Nullable Integer generation,
        String object) {
        this.bucket = Objects.requireNonNull(bucket);
        this.generation = generation;
        this.object = Objects.requireNonNull(object);
    }

    /**
     * Required. Bucket of the Cloud Storage object.
     * 
     */
    public String getBucket() {
        return this.bucket;
    }
    /**
     * Generation number of the Cloud Storage object.
     * 
     */
    public Optional<Integer> getGeneration() {
        return Optional.ofNullable(this.generation);
    }
    /**
     * Required. Name of the Cloud Storage object.
     * 
     */
    public String getObject() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable Integer generation;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setGeneration(@Nullable Integer generation) {
            this.generation = generation;
            return this;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcs(bucket, generation, object);
        }
    }
}
