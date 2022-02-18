// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AwsCredsAuthenticationDetailsPropertiesResponse {
    /**
     * The ID of the cloud account
     * 
     */
    private final String accountId;
    /**
     * State of the multi-cloud connector
     * 
     */
    private final String authenticationProvisioningState;
    /**
     * Connect to your cloud account, for AWS use either account credentials or role-based authentication. For GCP use account organization credentials.
     * Expected value is 'awsCreds'.
     * 
     */
    private final String authenticationType;
    /**
     * Public key element of the AWS credential object (write only)
     * 
     */
    private final String awsAccessKeyId;
    /**
     * Secret key element of the AWS credential object (write only)
     * 
     */
    private final String awsSecretAccessKey;
    /**
     * The permissions detected in the cloud account.
     * 
     */
    private final List<String> grantedPermissions;

    @OutputCustomType.Constructor({"accountId","authenticationProvisioningState","authenticationType","awsAccessKeyId","awsSecretAccessKey","grantedPermissions"})
    private AwsCredsAuthenticationDetailsPropertiesResponse(
        String accountId,
        String authenticationProvisioningState,
        String authenticationType,
        String awsAccessKeyId,
        String awsSecretAccessKey,
        List<String> grantedPermissions) {
        this.accountId = Objects.requireNonNull(accountId);
        this.authenticationProvisioningState = Objects.requireNonNull(authenticationProvisioningState);
        this.authenticationType = Objects.requireNonNull(authenticationType);
        this.awsAccessKeyId = Objects.requireNonNull(awsAccessKeyId);
        this.awsSecretAccessKey = Objects.requireNonNull(awsSecretAccessKey);
        this.grantedPermissions = Objects.requireNonNull(grantedPermissions);
    }

    /**
     * The ID of the cloud account
     * 
     */
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * State of the multi-cloud connector
     * 
     */
    public String getAuthenticationProvisioningState() {
        return this.authenticationProvisioningState;
    }
    /**
     * Connect to your cloud account, for AWS use either account credentials or role-based authentication. For GCP use account organization credentials.
     * Expected value is 'awsCreds'.
     * 
     */
    public String getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * Public key element of the AWS credential object (write only)
     * 
     */
    public String getAwsAccessKeyId() {
        return this.awsAccessKeyId;
    }
    /**
     * Secret key element of the AWS credential object (write only)
     * 
     */
    public String getAwsSecretAccessKey() {
        return this.awsSecretAccessKey;
    }
    /**
     * The permissions detected in the cloud account.
     * 
     */
    public List<String> getGrantedPermissions() {
        return this.grantedPermissions;
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

        public Builder setAccountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder setAuthenticationProvisioningState(String authenticationProvisioningState) {
            this.authenticationProvisioningState = Objects.requireNonNull(authenticationProvisioningState);
            return this;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setAwsAccessKeyId(String awsAccessKeyId) {
            this.awsAccessKeyId = Objects.requireNonNull(awsAccessKeyId);
            return this;
        }

        public Builder setAwsSecretAccessKey(String awsSecretAccessKey) {
            this.awsSecretAccessKey = Objects.requireNonNull(awsSecretAccessKey);
            return this;
        }

        public Builder setGrantedPermissions(List<String> grantedPermissions) {
            this.grantedPermissions = Objects.requireNonNull(grantedPermissions);
            return this;
        }

        public AwsCredsAuthenticationDetailsPropertiesResponse build() {
            return new AwsCredsAuthenticationDetailsPropertiesResponse(accountId, authenticationProvisioningState, authenticationType, awsAccessKeyId, awsSecretAccessKey, grantedPermissions);
        }
    }
}
