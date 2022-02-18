// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;


/**
 * The Amazon S3 settings needed for the interim Amazon S3 when copying from Amazon Redshift with unload. With this, data from Amazon Redshift source will be unloaded into S3 first and then copied into the targeted sink from the interim S3.
 * 
 */
public final class RedshiftUnloadSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RedshiftUnloadSettingsArgs Empty = new RedshiftUnloadSettingsArgs();

    /**
     * The bucket of the interim Amazon S3 which will be used to store the unloaded data from Amazon Redshift source. The bucket must be in the same region as the Amazon Redshift source. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="bucketName", required=true)
    private final Input<Object> bucketName;

    public Input<Object> getBucketName() {
        return this.bucketName;
    }

    /**
     * The name of the Amazon S3 linked service which will be used for the unload operation when copying from the Amazon Redshift source.
     * 
     */
    @InputImport(name="s3LinkedServiceName", required=true)
    private final Input<LinkedServiceReferenceArgs> s3LinkedServiceName;

    public Input<LinkedServiceReferenceArgs> getS3LinkedServiceName() {
        return this.s3LinkedServiceName;
    }

    public RedshiftUnloadSettingsArgs(
        Input<Object> bucketName,
        Input<LinkedServiceReferenceArgs> s3LinkedServiceName) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.s3LinkedServiceName = Objects.requireNonNull(s3LinkedServiceName, "expected parameter 's3LinkedServiceName' to be non-null");
    }

    private RedshiftUnloadSettingsArgs() {
        this.bucketName = Input.empty();
        this.s3LinkedServiceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedshiftUnloadSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Object> bucketName;
        private Input<LinkedServiceReferenceArgs> s3LinkedServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(RedshiftUnloadSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.s3LinkedServiceName = defaults.s3LinkedServiceName;
        }

        public Builder setBucketName(Input<Object> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setBucketName(Object bucketName) {
            this.bucketName = Input.of(Objects.requireNonNull(bucketName));
            return this;
        }

        public Builder setS3LinkedServiceName(Input<LinkedServiceReferenceArgs> s3LinkedServiceName) {
            this.s3LinkedServiceName = Objects.requireNonNull(s3LinkedServiceName);
            return this;
        }

        public Builder setS3LinkedServiceName(LinkedServiceReferenceArgs s3LinkedServiceName) {
            this.s3LinkedServiceName = Input.of(Objects.requireNonNull(s3LinkedServiceName));
            return this;
        }

        public RedshiftUnloadSettingsArgs build() {
            return new RedshiftUnloadSettingsArgs(bucketName, s3LinkedServiceName);
        }
    }
}
