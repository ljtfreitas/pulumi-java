// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.storagetransfer_v1.inputs.AwsAccessKeyResponse;
import java.lang.String;
import java.util.Objects;


/**
 * An AwsS3Data resource can be a data source, but not a data sink. In an AwsS3Data resource, an object's name is the S3 object's key name.
 * 
 */
public final class AwsS3DataResponse extends io.pulumi.resources.InvokeArgs {

    public static final AwsS3DataResponse Empty = new AwsS3DataResponse();

    /**
     * Input only. AWS access key used to sign the API requests to the AWS S3 bucket. Permissions on the bucket must be granted to the access ID of the AWS access key. For information on our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
     * 
     */
    @InputImport(name="awsAccessKey", required=true)
      private final AwsAccessKeyResponse awsAccessKey;

    public AwsAccessKeyResponse getAwsAccessKey() {
        return this.awsAccessKey;
    }

    /**
     * S3 Bucket name (see [Creating a bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-example.html)).
     * 
     */
    @InputImport(name="bucketName", required=true)
      private final String bucketName;

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with a '/'.
     * 
     */
    @InputImport(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * The Amazon Resource Name (ARN) of the role to support temporary credentials via `AssumeRoleWithWebIdentity`. For more information about ARNs, see [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the session using a `AssumeRoleWithWebIdentity` call for the provided role using the GoogleServiceAccount for this project.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    public AwsS3DataResponse(
        AwsAccessKeyResponse awsAccessKey,
        String bucketName,
        String path,
        String roleArn) {
        this.awsAccessKey = Objects.requireNonNull(awsAccessKey, "expected parameter 'awsAccessKey' to be non-null");
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private AwsS3DataResponse() {
        this.awsAccessKey = null;
        this.bucketName = null;
        this.path = null;
        this.roleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsS3DataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsAccessKeyResponse awsAccessKey;
        private String bucketName;
        private String path;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsS3DataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccessKey = defaults.awsAccessKey;
    	      this.bucketName = defaults.bucketName;
    	      this.path = defaults.path;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setAwsAccessKey(AwsAccessKeyResponse awsAccessKey) {
            this.awsAccessKey = Objects.requireNonNull(awsAccessKey);
            return this;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public AwsS3DataResponse build() {
            return new AwsS3DataResponse(awsAccessKey, bucketName, path, roleArn);
        }
    }
}
