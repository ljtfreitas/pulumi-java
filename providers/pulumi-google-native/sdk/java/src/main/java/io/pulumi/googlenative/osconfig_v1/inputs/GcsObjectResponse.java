// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Cloud Storage object representation.
 * 
 */
public final class GcsObjectResponse extends io.pulumi.resources.InvokeArgs {

    public static final GcsObjectResponse Empty = new GcsObjectResponse();

    /**
     * Bucket of the Cloud Storage object.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    /**
     * Generation number of the Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change.
     * 
     */
    @InputImport(name="generationNumber", required=true)
      private final String generationNumber;

    public String getGenerationNumber() {
        return this.generationNumber;
    }

    /**
     * Name of the Cloud Storage object.
     * 
     */
    @InputImport(name="object", required=true)
      private final String object;

    public String getObject() {
        return this.object;
    }

    public GcsObjectResponse(
        String bucket,
        String generationNumber,
        String object) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.generationNumber = Objects.requireNonNull(generationNumber, "expected parameter 'generationNumber' to be non-null");
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private GcsObjectResponse() {
        this.bucket = null;
        this.generationNumber = null;
        this.object = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsObjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String generationNumber;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsObjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generationNumber = defaults.generationNumber;
    	      this.object = defaults.object;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setGenerationNumber(String generationNumber) {
            this.generationNumber = Objects.requireNonNull(generationNumber);
            return this;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public GcsObjectResponse build() {
            return new GcsObjectResponse(bucket, generationNumber, object);
        }
    }
}
