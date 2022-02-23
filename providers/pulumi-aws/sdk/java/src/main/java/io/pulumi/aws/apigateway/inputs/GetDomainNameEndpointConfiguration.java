// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetDomainNameEndpointConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainNameEndpointConfiguration Empty = new GetDomainNameEndpointConfiguration();

    /**
     * List of endpoint types.
     * 
     */
    @InputImport(name="types", required=true)
    private final List<String> types;

    public List<String> getTypes() {
        return this.types;
    }

    public GetDomainNameEndpointConfiguration(List<String> types) {
        this.types = Objects.requireNonNull(types, "expected parameter 'types' to be non-null");
    }

    private GetDomainNameEndpointConfiguration() {
        this.types = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainNameEndpointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> types;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainNameEndpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.types = defaults.types;
        }

        public Builder setTypes(List<String> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }
        public GetDomainNameEndpointConfiguration build() {
            return new GetDomainNameEndpointConfiguration(types);
        }
    }
}
