// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * AWS cloud account connector based credentials, the credentials is composed of access key ID and secret key, for more details, refer to <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_create.html">Creating an IAM User in Your AWS Account (write only)</a>
 * 
 */
public final class AwsCredsAuthenticationDetailsPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AwsCredsAuthenticationDetailsPropertiesResponse Empty = new AwsCredsAuthenticationDetailsPropertiesResponse();

    /**
     * The ID of the cloud account
     * 
     */
    @Import(name="accountId", required=true)
      private final String accountId;

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * State of the multi-cloud connector
     * 
     */
    @Import(name="authenticationProvisioningState", required=true)
      private final String authenticationProvisioningState;

    public String getAuthenticationProvisioningState() {
        return this.authenticationProvisioningState;
    }

    /**
     * Connect to your cloud account, for AWS use either account credentials or role-based authentication. For GCP use account organization credentials.
     * Expected value is 'awsCreds'.
     * 
     */
    @Import(name="authenticationType", required=true)
      private final String authenticationType;

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Public key element of the AWS credential object (write only)
     * 
     */
    @Import(name="awsAccessKeyId", required=true)
      private final String awsAccessKeyId;

    public String getAwsAccessKeyId() {
        return this.awsAccessKeyId;
    }

    /**
     * Secret key element of the AWS credential object (write only)
     * 
     */
    @Import(name="awsSecretAccessKey", required=true)
      private final String awsSecretAccessKey;

    public String getAwsSecretAccessKey() {
        return this.awsSecretAccessKey;
    }

    /**
     * The permissions detected in the cloud account.
     * 
     */
    @Import(name="grantedPermissions", required=true)
      private final List<String> grantedPermissions;

    public List<String> getGrantedPermissions() {
        return this.grantedPermissions;
    }

    public AwsCredsAuthenticationDetailsPropertiesResponse(
        String accountId,
        String authenticationProvisioningState,
        String authenticationType,
        String awsAccessKeyId,
        String awsSecretAccessKey,
        List<String> grantedPermissions) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.authenticationProvisioningState = Objects.requireNonNull(authenticationProvisioningState, "expected parameter 'authenticationProvisioningState' to be non-null");
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.awsAccessKeyId = Objects.requireNonNull(awsAccessKeyId, "expected parameter 'awsAccessKeyId' to be non-null");
        this.awsSecretAccessKey = Objects.requireNonNull(awsSecretAccessKey, "expected parameter 'awsSecretAccessKey' to be non-null");
        this.grantedPermissions = Objects.requireNonNull(grantedPermissions, "expected parameter 'grantedPermissions' to be non-null");
    }

    private AwsCredsAuthenticationDetailsPropertiesResponse() {
        this.accountId = null;
        this.authenticationProvisioningState = null;
        this.authenticationType = null;
        this.awsAccessKeyId = null;
        this.awsSecretAccessKey = null;
        this.grantedPermissions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsCredsAuthenticationDetailsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String authenticationProvisioningState;
        private String authenticationType;
        private String awsAccessKeyId;
        private String awsSecretAccessKey;
        private List<String> grantedPermissions;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsCredsAuthenticationDetailsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.authenticationProvisioningState = defaults.authenticationProvisioningState;
    	      this.authenticationType = defaults.authenticationType;
    	      this.awsAccessKeyId = defaults.awsAccessKeyId;
    	      this.awsSecretAccessKey = defaults.awsSecretAccessKey;
    	      this.grantedPermissions = defaults.grantedPermissions;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder authenticationProvisioningState(String authenticationProvisioningState) {
            this.authenticationProvisioningState = Objects.requireNonNull(authenticationProvisioningState);
            return this;
        }

        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder awsAccessKeyId(String awsAccessKeyId) {
            this.awsAccessKeyId = Objects.requireNonNull(awsAccessKeyId);
            return this;
        }

        public Builder awsSecretAccessKey(String awsSecretAccessKey) {
            this.awsSecretAccessKey = Objects.requireNonNull(awsSecretAccessKey);
            return this;
        }

        public Builder grantedPermissions(List<String> grantedPermissions) {
            this.grantedPermissions = Objects.requireNonNull(grantedPermissions);
            return this;
        }
        public AwsCredsAuthenticationDetailsPropertiesResponse build() {
            return new AwsCredsAuthenticationDetailsPropertiesResponse(accountId, authenticationProvisioningState, authenticationType, awsAccessKeyId, awsSecretAccessKey, grantedPermissions);
        }
    }
}
