// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApiConfigGatewayConfigBackendConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiConfigGatewayConfigBackendConfigGetArgs Empty = new ApiConfigGatewayConfigBackendConfigGetArgs();

    /**
     * Google Cloud IAM service account used to sign OIDC tokens for backends that have authentication configured
     * (https://cloud.google.com/service-infrastructure/docs/service-management/reference/rest/v1/services.configs#backend).
     * 
     */
    @Import(name="googleServiceAccount", required=true)
      private final Output<String> googleServiceAccount;

    public Output<String> getGoogleServiceAccount() {
        return this.googleServiceAccount;
    }

    public ApiConfigGatewayConfigBackendConfigGetArgs(Output<String> googleServiceAccount) {
        this.googleServiceAccount = Objects.requireNonNull(googleServiceAccount, "expected parameter 'googleServiceAccount' to be non-null");
    }

    private ApiConfigGatewayConfigBackendConfigGetArgs() {
        this.googleServiceAccount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigGatewayConfigBackendConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> googleServiceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigGatewayConfigBackendConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.googleServiceAccount = defaults.googleServiceAccount;
        }

        public Builder googleServiceAccount(Output<String> googleServiceAccount) {
            this.googleServiceAccount = Objects.requireNonNull(googleServiceAccount);
            return this;
        }

        public Builder googleServiceAccount(String googleServiceAccount) {
            this.googleServiceAccount = Output.of(Objects.requireNonNull(googleServiceAccount));
            return this;
        }
        public ApiConfigGatewayConfigBackendConfigGetArgs build() {
            return new ApiConfigGatewayConfigBackendConfigGetArgs(googleServiceAccount);
        }
    }
}
