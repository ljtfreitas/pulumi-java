// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDomainCognitoOption {
    /**
     * Whether node to node encryption is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * The Cognito Identity pool used by the domain.
     * 
     */
    private final String identityPoolId;
    /**
     * The IAM Role with the AmazonESCognitoAccess policy attached.
     * 
     */
    private final String roleArn;
    /**
     * The Cognito User pool used by the domain.
     * 
     */
    private final String userPoolId;

    @OutputCustomType.Constructor({"enabled","identityPoolId","roleArn","userPoolId"})
    private GetDomainCognitoOption(
        Boolean enabled,
        String identityPoolId,
        String roleArn,
        String userPoolId) {
        this.enabled = Objects.requireNonNull(enabled);
        this.identityPoolId = Objects.requireNonNull(identityPoolId);
        this.roleArn = Objects.requireNonNull(roleArn);
        this.userPoolId = Objects.requireNonNull(userPoolId);
    }

    /**
     * Whether node to node encryption is enabled.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The Cognito Identity pool used by the domain.
     * 
     */
    public String getIdentityPoolId() {
        return this.identityPoolId;
    }
    /**
     * The IAM Role with the AmazonESCognitoAccess policy attached.
     * 
     */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * The Cognito User pool used by the domain.
     * 
     */
    public String getUserPoolId() {
        return this.userPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainCognitoOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String identityPoolId;
        private String roleArn;
        private String userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainCognitoOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.identityPoolId = defaults.identityPoolId;
    	      this.roleArn = defaults.roleArn;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setIdentityPoolId(String identityPoolId) {
            this.identityPoolId = Objects.requireNonNull(identityPoolId);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setUserPoolId(String userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }
        public GetDomainCognitoOption build() {
            return new GetDomainCognitoOption(enabled, identityPoolId, roleArn, userPoolId);
        }
    }
}
