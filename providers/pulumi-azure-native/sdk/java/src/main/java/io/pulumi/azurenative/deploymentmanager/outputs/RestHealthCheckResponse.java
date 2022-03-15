// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.azurenative.deploymentmanager.outputs.RestRequestResponse;
import io.pulumi.azurenative.deploymentmanager.outputs.RestResponseResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RestHealthCheckResponse {
    /**
     * A unique name for this check.
     * 
     */
    private final String name;
    /**
     * The request to the health provider.
     * 
     */
    private final RestRequestResponse request;
    /**
     * The expected response from the health provider. If no expected response is provided, the default is to expect the received response to have an HTTP status code of 200 OK.
     * 
     */
    private final @Nullable RestResponseResponse response;

    @CustomType.Constructor
    private RestHealthCheckResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("request") RestRequestResponse request,
        @CustomType.Parameter("response") @Nullable RestResponseResponse response) {
        this.name = name;
        this.request = request;
        this.response = response;
    }

    /**
     * A unique name for this check.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The request to the health provider.
     * 
    */
    public RestRequestResponse getRequest() {
        return this.request;
    }
    /**
     * The expected response from the health provider. If no expected response is provided, the default is to expect the received response to have an HTTP status code of 200 OK.
     * 
    */
    public Optional<RestResponseResponse> getResponse() {
        return Optional.ofNullable(this.response);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestHealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private RestRequestResponse request;
        private @Nullable RestResponseResponse response;

        public Builder() {
    	      // Empty
        }

        public Builder(RestHealthCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder request(RestRequestResponse request) {
            this.request = Objects.requireNonNull(request);
            return this;
        }

        public Builder response(@Nullable RestResponseResponse response) {
            this.response = response;
            return this;
        }
        public RestHealthCheckResponse build() {
            return new RestHealthCheckResponse(name, request, response);
        }
    }
}
