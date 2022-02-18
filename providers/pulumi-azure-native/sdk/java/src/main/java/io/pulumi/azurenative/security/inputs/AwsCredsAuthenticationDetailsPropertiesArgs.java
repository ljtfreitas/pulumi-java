// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * AWS cloud account connector based credentials, the credentials is composed of access key ID and secret key, for more details, refer to <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_create.html">Creating an IAM User in Your AWS Account (write only)</a>
 * 
 */
public final class AwsCredsAuthenticationDetailsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsCredsAuthenticationDetailsPropertiesArgs Empty = new AwsCredsAuthenticationDetailsPropertiesArgs();

    /**
     * Connect to your cloud account, for AWS use either account credentials or role-based authentication. For GCP use account organization credentials.
     * Expected value is 'awsCreds'.
     * 
     */
    @InputImport(name="authenticationType", required=true)
    private final Input<String> authenticationType;

    public Input<String> getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Public key element of the AWS credential object (write only)
     * 
     */
    @InputImport(name="awsAccessKeyId", required=true)
    private final Input<String> awsAccessKeyId;

    public Input<String> getAwsAccessKeyId() {
        return this.awsAccessKeyId;
    }

    /**
     * Secret key element of the AWS credential object (write only)
     * 
     */
    @InputImport(name="awsSecretAccessKey", required=true)
    private final Input<String> awsSecretAccessKey;

    public Input<String> getAwsSecretAccessKey() {
        return this.awsSecretAccessKey;
    }

    public AwsCredsAuthenticationDetailsPropertiesArgs(
        Input<String> authenticationType,
        Input<String> awsAccessKeyId,
        Input<String> awsSecretAccessKey) {
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.awsAccessKeyId = Objects.requireNonNull(awsAccessKeyId, "expected parameter 'awsAccessKeyId' to be non-null");
        this.awsSecretAccessKey = Objects.requireNonNull(awsSecretAccessKey, "expected parameter 'awsSecretAccessKey' to be non-null");
    }

    private AwsCredsAuthenticationDetailsPropertiesArgs() {
        this.authenticationType = Input.empty();
        this.awsAccessKeyId = Input.empty();
        this.awsSecretAccessKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsCredsAuthenticationDetailsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authenticationType;
        private Input<String> awsAccessKeyId;
        private Input<String> awsSecretAccessKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsCredsAuthenticationDetailsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.awsAccessKeyId = defaults.awsAccessKeyId;
    	      this.awsSecretAccessKey = defaults.awsSecretAccessKey;
        }

        public Builder setAuthenticationType(Input<String> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Input.of(Objects.requireNonNull(authenticationType));
            return this;
        }

        public Builder setAwsAccessKeyId(Input<String> awsAccessKeyId) {
            this.awsAccessKeyId = Objects.requireNonNull(awsAccessKeyId);
            return this;
        }

        public Builder setAwsAccessKeyId(String awsAccessKeyId) {
            this.awsAccessKeyId = Input.of(Objects.requireNonNull(awsAccessKeyId));
            return this;
        }

        public Builder setAwsSecretAccessKey(Input<String> awsSecretAccessKey) {
            this.awsSecretAccessKey = Objects.requireNonNull(awsSecretAccessKey);
            return this;
        }

        public Builder setAwsSecretAccessKey(String awsSecretAccessKey) {
            this.awsSecretAccessKey = Input.of(Objects.requireNonNull(awsSecretAccessKey));
            return this;
        }

        public AwsCredsAuthenticationDetailsPropertiesArgs build() {
            return new AwsCredsAuthenticationDetailsPropertiesArgs(authenticationType, awsAccessKeyId, awsSecretAccessKey);
        }
    }
}
