// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The Amazon Resource Name (ARN) of the AWS IAM role that is used to access an Amazon S3 bucket.
 * 
 */
public final class LocationS3S3ConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationS3S3ConfigArgs Empty = new LocationS3S3ConfigArgs();

    /**
     * The ARN of the IAM role of the Amazon S3 bucket.
     * 
     */
    @InputImport(name="bucketAccessRoleArn", required=true)
        private final Input<String> bucketAccessRoleArn;

    public Input<String> getBucketAccessRoleArn() {
        return this.bucketAccessRoleArn;
    }

    public LocationS3S3ConfigArgs(Input<String> bucketAccessRoleArn) {
        this.bucketAccessRoleArn = Objects.requireNonNull(bucketAccessRoleArn, "expected parameter 'bucketAccessRoleArn' to be non-null");
    }

    private LocationS3S3ConfigArgs() {
        this.bucketAccessRoleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationS3S3ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucketAccessRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationS3S3ConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketAccessRoleArn = defaults.bucketAccessRoleArn;
        }

        public Builder setBucketAccessRoleArn(Input<String> bucketAccessRoleArn) {
            this.bucketAccessRoleArn = Objects.requireNonNull(bucketAccessRoleArn);
            return this;
        }

        public Builder setBucketAccessRoleArn(String bucketAccessRoleArn) {
            this.bucketAccessRoleArn = Input.of(Objects.requireNonNull(bucketAccessRoleArn));
            return this;
        }
        public LocationS3S3ConfigArgs build() {
            return new LocationS3S3ConfigArgs(bucketAccessRoleArn);
        }
    }
}
