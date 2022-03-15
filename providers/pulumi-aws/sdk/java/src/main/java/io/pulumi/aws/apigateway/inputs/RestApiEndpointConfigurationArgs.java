// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RestApiEndpointConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestApiEndpointConfigurationArgs Empty = new RestApiEndpointConfigurationArgs();

    /**
     * A list of endpoint types. This resource currently only supports managing a single value. Valid values: `EDGE`, `REGIONAL` or `PRIVATE`. If unspecified, defaults to `EDGE`. Must be declared as `REGIONAL` in non-Commercial partitions. Refer to the [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/create-regional-api.html) for more information on the difference between edge-optimized and regional APIs.
     * 
     */
    @Import(name="types", required=true)
      private final Output<String> types;

    public Output<String> getTypes() {
        return this.types;
    }

    /**
     * Set of VPC Endpoint identifiers. It is only supported for `PRIVATE` endpoint type. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-endpoint-configuration` extension `vpcEndpointIds` property](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-endpoint-configuration.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     * 
     */
    @Import(name="vpcEndpointIds")
      private final @Nullable Output<List<String>> vpcEndpointIds;

    public Output<List<String>> getVpcEndpointIds() {
        return this.vpcEndpointIds == null ? Output.empty() : this.vpcEndpointIds;
    }

    public RestApiEndpointConfigurationArgs(
        Output<String> types,
        @Nullable Output<List<String>> vpcEndpointIds) {
        this.types = Objects.requireNonNull(types, "expected parameter 'types' to be non-null");
        this.vpcEndpointIds = vpcEndpointIds;
    }

    private RestApiEndpointConfigurationArgs() {
        this.types = Output.empty();
        this.vpcEndpointIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestApiEndpointConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> types;
        private @Nullable Output<List<String>> vpcEndpointIds;

        public Builder() {
    	      // Empty
        }

        public Builder(RestApiEndpointConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.types = defaults.types;
    	      this.vpcEndpointIds = defaults.vpcEndpointIds;
        }

        public Builder types(Output<String> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }

        public Builder types(String types) {
            this.types = Output.of(Objects.requireNonNull(types));
            return this;
        }

        public Builder vpcEndpointIds(@Nullable Output<List<String>> vpcEndpointIds) {
            this.vpcEndpointIds = vpcEndpointIds;
            return this;
        }

        public Builder vpcEndpointIds(@Nullable List<String> vpcEndpointIds) {
            this.vpcEndpointIds = Output.ofNullable(vpcEndpointIds);
            return this;
        }
        public RestApiEndpointConfigurationArgs build() {
            return new RestApiEndpointConfigurationArgs(types, vpcEndpointIds);
        }
    }
}
