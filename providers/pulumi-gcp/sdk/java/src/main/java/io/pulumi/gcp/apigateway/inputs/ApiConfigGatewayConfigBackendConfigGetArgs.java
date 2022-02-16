// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ApiConfigGatewayConfigBackendConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiConfigGatewayConfigBackendConfigGetArgs Empty = new ApiConfigGatewayConfigBackendConfigGetArgs();

    @InputImport(name="googleServiceAccount", required=true)
    private final Input<String> googleServiceAccount;

    public Input<String> getGoogleServiceAccount() {
        return this.googleServiceAccount;
    }

    public ApiConfigGatewayConfigBackendConfigGetArgs(Input<String> googleServiceAccount) {
        this.googleServiceAccount = Objects.requireNonNull(googleServiceAccount, "expected parameter 'googleServiceAccount' to be non-null");
    }

    private ApiConfigGatewayConfigBackendConfigGetArgs() {
        this.googleServiceAccount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigGatewayConfigBackendConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> googleServiceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigGatewayConfigBackendConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.googleServiceAccount = defaults.googleServiceAccount;
        }

        public Builder setGoogleServiceAccount(Input<String> googleServiceAccount) {
            this.googleServiceAccount = Objects.requireNonNull(googleServiceAccount);
            return this;
        }

        public Builder setGoogleServiceAccount(String googleServiceAccount) {
            this.googleServiceAccount = Input.of(Objects.requireNonNull(googleServiceAccount));
            return this;
        }

        public ApiConfigGatewayConfigBackendConfigGetArgs build() {
            return new ApiConfigGatewayConfigBackendConfigGetArgs(googleServiceAccount);
        }
    }
}