// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRestApiEndpointConfiguration {
    private final List<String> types;
    private final List<String> vpcEndpointIds;

    @CustomType.Constructor
    private GetRestApiEndpointConfiguration(
        @CustomType.Parameter("types") List<String> types,
        @CustomType.Parameter("vpcEndpointIds") List<String> vpcEndpointIds) {
        this.types = types;
        this.vpcEndpointIds = vpcEndpointIds;
    }

    public List<String> getTypes() {
        return this.types;
    }
    public List<String> getVpcEndpointIds() {
        return this.vpcEndpointIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRestApiEndpointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> types;
        private List<String> vpcEndpointIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRestApiEndpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.types = defaults.types;
    	      this.vpcEndpointIds = defaults.vpcEndpointIds;
        }

        public Builder types(List<String> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }

        public Builder vpcEndpointIds(List<String> vpcEndpointIds) {
            this.vpcEndpointIds = Objects.requireNonNull(vpcEndpointIds);
            return this;
        }
        public GetRestApiEndpointConfiguration build() {
            return new GetRestApiEndpointConfiguration(types, vpcEndpointIds);
        }
    }
}
