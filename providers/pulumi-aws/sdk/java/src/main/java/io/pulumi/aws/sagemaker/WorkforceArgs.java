// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.WorkforceCognitoConfigArgs;
import io.pulumi.aws.sagemaker.inputs.WorkforceOidcConfigArgs;
import io.pulumi.aws.sagemaker.inputs.WorkforceSourceIpConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkforceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkforceArgs Empty = new WorkforceArgs();

    /**
     * Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single Amazon Cognito user pool. Conflicts with `oidc_config`. see Cognito Config details below.
     * 
     */
    @InputImport(name="cognitoConfig")
    private final @Nullable Input<WorkforceCognitoConfigArgs> cognitoConfig;

    public Input<WorkforceCognitoConfigArgs> getCognitoConfig() {
        return this.cognitoConfig == null ? Input.empty() : this.cognitoConfig;
    }

    /**
     * Use this parameter to configure a private workforce using your own OIDC Identity Provider. Conflicts with `cognito_config`. see OIDC Config details below.
     * 
     */
    @InputImport(name="oidcConfig")
    private final @Nullable Input<WorkforceOidcConfigArgs> oidcConfig;

    public Input<WorkforceOidcConfigArgs> getOidcConfig() {
        return this.oidcConfig == null ? Input.empty() : this.oidcConfig;
    }

    /**
     * A list of IP address ranges Used to create an allow list of IP addresses for a private workforce. By default, a workforce isn't restricted to specific IP addresses. see Source Ip Config details below.
     * 
     */
    @InputImport(name="sourceIpConfig")
    private final @Nullable Input<WorkforceSourceIpConfigArgs> sourceIpConfig;

    public Input<WorkforceSourceIpConfigArgs> getSourceIpConfig() {
        return this.sourceIpConfig == null ? Input.empty() : this.sourceIpConfig;
    }

    /**
     * The name of the Workforce (must be unique).
     * 
     */
    @InputImport(name="workforceName", required=true)
    private final Input<String> workforceName;

    public Input<String> getWorkforceName() {
        return this.workforceName;
    }

    public WorkforceArgs(
        @Nullable Input<WorkforceCognitoConfigArgs> cognitoConfig,
        @Nullable Input<WorkforceOidcConfigArgs> oidcConfig,
        @Nullable Input<WorkforceSourceIpConfigArgs> sourceIpConfig,
        Input<String> workforceName) {
        this.cognitoConfig = cognitoConfig;
        this.oidcConfig = oidcConfig;
        this.sourceIpConfig = sourceIpConfig;
        this.workforceName = Objects.requireNonNull(workforceName, "expected parameter 'workforceName' to be non-null");
    }

    private WorkforceArgs() {
        this.cognitoConfig = Input.empty();
        this.oidcConfig = Input.empty();
        this.sourceIpConfig = Input.empty();
        this.workforceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkforceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WorkforceCognitoConfigArgs> cognitoConfig;
        private @Nullable Input<WorkforceOidcConfigArgs> oidcConfig;
        private @Nullable Input<WorkforceSourceIpConfigArgs> sourceIpConfig;
        private Input<String> workforceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkforceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cognitoConfig = defaults.cognitoConfig;
    	      this.oidcConfig = defaults.oidcConfig;
    	      this.sourceIpConfig = defaults.sourceIpConfig;
    	      this.workforceName = defaults.workforceName;
        }

        public Builder setCognitoConfig(@Nullable Input<WorkforceCognitoConfigArgs> cognitoConfig) {
            this.cognitoConfig = cognitoConfig;
            return this;
        }

        public Builder setCognitoConfig(@Nullable WorkforceCognitoConfigArgs cognitoConfig) {
            this.cognitoConfig = Input.ofNullable(cognitoConfig);
            return this;
        }

        public Builder setOidcConfig(@Nullable Input<WorkforceOidcConfigArgs> oidcConfig) {
            this.oidcConfig = oidcConfig;
            return this;
        }

        public Builder setOidcConfig(@Nullable WorkforceOidcConfigArgs oidcConfig) {
            this.oidcConfig = Input.ofNullable(oidcConfig);
            return this;
        }

        public Builder setSourceIpConfig(@Nullable Input<WorkforceSourceIpConfigArgs> sourceIpConfig) {
            this.sourceIpConfig = sourceIpConfig;
            return this;
        }

        public Builder setSourceIpConfig(@Nullable WorkforceSourceIpConfigArgs sourceIpConfig) {
            this.sourceIpConfig = Input.ofNullable(sourceIpConfig);
            return this;
        }

        public Builder setWorkforceName(Input<String> workforceName) {
            this.workforceName = Objects.requireNonNull(workforceName);
            return this;
        }

        public Builder setWorkforceName(String workforceName) {
            this.workforceName = Input.of(Objects.requireNonNull(workforceName));
            return this;
        }
        public WorkforceArgs build() {
            return new WorkforceArgs(cognitoConfig, oidcConfig, sourceIpConfig, workforceName);
        }
    }
}