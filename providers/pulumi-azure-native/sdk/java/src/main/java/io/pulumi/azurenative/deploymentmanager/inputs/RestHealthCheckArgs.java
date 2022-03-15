// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.RestRequestArgs;
import io.pulumi.azurenative.deploymentmanager.inputs.RestResponseArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A REST based health check
 * 
 */
public final class RestHealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestHealthCheckArgs Empty = new RestHealthCheckArgs();

    /**
     * A unique name for this check.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The request to the health provider.
     * 
     */
    @Import(name="request", required=true)
      private final Output<RestRequestArgs> request;

    public Output<RestRequestArgs> getRequest() {
        return this.request;
    }

    /**
     * The expected response from the health provider. If no expected response is provided, the default is to expect the received response to have an HTTP status code of 200 OK.
     * 
     */
    @Import(name="response")
      private final @Nullable Output<RestResponseArgs> response;

    public Output<RestResponseArgs> getResponse() {
        return this.response == null ? Output.empty() : this.response;
    }

    public RestHealthCheckArgs(
        Output<String> name,
        Output<RestRequestArgs> request,
        @Nullable Output<RestResponseArgs> response) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.request = Objects.requireNonNull(request, "expected parameter 'request' to be non-null");
        this.response = response;
    }

    private RestHealthCheckArgs() {
        this.name = Output.empty();
        this.request = Output.empty();
        this.response = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<RestRequestArgs> request;
        private @Nullable Output<RestResponseArgs> response;

        public Builder() {
    	      // Empty
        }

        public Builder(RestHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder request(Output<RestRequestArgs> request) {
            this.request = Objects.requireNonNull(request);
            return this;
        }

        public Builder request(RestRequestArgs request) {
            this.request = Output.of(Objects.requireNonNull(request));
            return this;
        }

        public Builder response(@Nullable Output<RestResponseArgs> response) {
            this.response = response;
            return this;
        }

        public Builder response(@Nullable RestResponseArgs response) {
            this.response = Output.ofNullable(response);
            return this;
        }
        public RestHealthCheckArgs build() {
            return new RestHealthCheckArgs(name, request, response);
        }
    }
}
