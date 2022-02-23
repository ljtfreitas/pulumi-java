// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RestApiEndpointConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestApiEndpointConfigurationGetArgs Empty = new RestApiEndpointConfigurationGetArgs();

    /**
     * A list of endpoint types. This resource currently only supports managing a single value. Valid values: `EDGE`, `REGIONAL` or `PRIVATE`. If unspecified, defaults to `EDGE`. Must be declared as `REGIONAL` in non-Commercial partitions. Refer to the [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/create-regional-api.html) for more information on the difference between edge-optimized and regional APIs.
     * 
     */
    @InputImport(name="types", required=true)
    private final Input<String> types;

    public Input<String> getTypes() {
        return this.types;
    }

    /**
     * Set of VPC Endpoint identifiers. It is only supported for `PRIVATE` endpoint type. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-endpoint-configuration` extension `vpcEndpointIds` property](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-endpoint-configuration.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     * 
     */
    @InputImport(name="vpcEndpointIds")
    private final @Nullable Input<List<String>> vpcEndpointIds;

    public Input<List<String>> getVpcEndpointIds() {
        return this.vpcEndpointIds == null ? Input.empty() : this.vpcEndpointIds;
    }

    public RestApiEndpointConfigurationGetArgs(
        Input<String> types,
        @Nullable Input<List<String>> vpcEndpointIds) {
        this.types = Objects.requireNonNull(types, "expected parameter 'types' to be non-null");
        this.vpcEndpointIds = vpcEndpointIds;
    }

    private RestApiEndpointConfigurationGetArgs() {
        this.types = Input.empty();
        this.vpcEndpointIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestApiEndpointConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> types;
        private @Nullable Input<List<String>> vpcEndpointIds;

        public Builder() {
    	      // Empty
        }

        public Builder(RestApiEndpointConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.types = defaults.types;
    	      this.vpcEndpointIds = defaults.vpcEndpointIds;
        }

        public Builder setTypes(Input<String> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }

        public Builder setTypes(String types) {
            this.types = Input.of(Objects.requireNonNull(types));
            return this;
        }

        public Builder setVpcEndpointIds(@Nullable Input<List<String>> vpcEndpointIds) {
            this.vpcEndpointIds = vpcEndpointIds;
            return this;
        }

        public Builder setVpcEndpointIds(@Nullable List<String> vpcEndpointIds) {
            this.vpcEndpointIds = Input.ofNullable(vpcEndpointIds);
            return this;
        }
        public RestApiEndpointConfigurationGetArgs build() {
            return new RestApiEndpointConfigurationGetArgs(types, vpcEndpointIds);
        }
    }
}
