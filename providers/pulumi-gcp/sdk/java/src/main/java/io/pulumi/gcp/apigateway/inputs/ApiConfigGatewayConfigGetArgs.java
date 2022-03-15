// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigBackendConfigGetArgs;
import java.util.Objects;


public final class ApiConfigGatewayConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiConfigGatewayConfigGetArgs Empty = new ApiConfigGatewayConfigGetArgs();

    /**
     * Backend settings that are applied to all backends of the Gateway.
     * Structure is documented below.
     * 
     */
    @Import(name="backendConfig", required=true)
      private final Output<ApiConfigGatewayConfigBackendConfigGetArgs> backendConfig;

    public Output<ApiConfigGatewayConfigBackendConfigGetArgs> getBackendConfig() {
        return this.backendConfig;
    }

    public ApiConfigGatewayConfigGetArgs(Output<ApiConfigGatewayConfigBackendConfigGetArgs> backendConfig) {
        this.backendConfig = Objects.requireNonNull(backendConfig, "expected parameter 'backendConfig' to be non-null");
    }

    private ApiConfigGatewayConfigGetArgs() {
        this.backendConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigGatewayConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ApiConfigGatewayConfigBackendConfigGetArgs> backendConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigGatewayConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendConfig = defaults.backendConfig;
        }

        public Builder backendConfig(Output<ApiConfigGatewayConfigBackendConfigGetArgs> backendConfig) {
            this.backendConfig = Objects.requireNonNull(backendConfig);
            return this;
        }

        public Builder backendConfig(ApiConfigGatewayConfigBackendConfigGetArgs backendConfig) {
            this.backendConfig = Output.of(Objects.requireNonNull(backendConfig));
            return this;
        }
        public ApiConfigGatewayConfigGetArgs build() {
            return new ApiConfigGatewayConfigGetArgs(backendConfig);
        }
    }
}
