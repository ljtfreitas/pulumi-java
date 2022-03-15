// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
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

    @CustomType.Constructor
    private GetDomainCognitoOption(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("identityPoolId") String identityPoolId,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("userPoolId") String userPoolId) {
        this.enabled = enabled;
        this.identityPoolId = identityPoolId;
        this.roleArn = roleArn;
        this.userPoolId = userPoolId;
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

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder identityPoolId(String identityPoolId) {
            this.identityPoolId = Objects.requireNonNull(identityPoolId);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder userPoolId(String userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }
        public GetDomainCognitoOption build() {
            return new GetDomainCognitoOption(enabled, identityPoolId, roleArn, userPoolId);
        }
    }
}
