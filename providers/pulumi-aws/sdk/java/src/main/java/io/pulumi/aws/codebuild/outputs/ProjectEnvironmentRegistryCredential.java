// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ProjectEnvironmentRegistryCredential {
    /**
     * ARN or name of credentials created using AWS Secrets Manager.
     * 
     */
    private final String credential;
    /**
     * Service that created the credentials to access a private Docker registry. Valid value: `SECRETS_MANAGER` (AWS Secrets Manager).
     * 
     */
    private final String credentialProvider;

    @CustomType.Constructor
    private ProjectEnvironmentRegistryCredential(
        @CustomType.Parameter("credential") String credential,
        @CustomType.Parameter("credentialProvider") String credentialProvider) {
        this.credential = credential;
        this.credentialProvider = credentialProvider;
    }

    /**
     * ARN or name of credentials created using AWS Secrets Manager.
     * 
    */
    public String getCredential() {
        return this.credential;
    }
    /**
     * Service that created the credentials to access a private Docker registry. Valid value: `SECRETS_MANAGER` (AWS Secrets Manager).
     * 
    */
    public String getCredentialProvider() {
        return this.credentialProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectEnvironmentRegistryCredential defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String credential;
        private String credentialProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectEnvironmentRegistryCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.credentialProvider = defaults.credentialProvider;
        }

        public Builder credential(String credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }

        public Builder credentialProvider(String credentialProvider) {
            this.credentialProvider = Objects.requireNonNull(credentialProvider);
            return this;
        }
        public ProjectEnvironmentRegistryCredential build() {
            return new ProjectEnvironmentRegistryCredential(credential, credentialProvider);
        }
    }
}
