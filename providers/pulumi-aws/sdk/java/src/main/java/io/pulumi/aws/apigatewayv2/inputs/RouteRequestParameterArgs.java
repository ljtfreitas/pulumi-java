// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class RouteRequestParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteRequestParameterArgs Empty = new RouteRequestParameterArgs();

    /**
     * Request parameter key. This is a [request data mapping parameter](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-data-mapping.html#websocket-mapping-request-parameters).
     * 
     */
    @Import(name="requestParameterKey", required=true)
      private final Output<String> requestParameterKey;

    public Output<String> getRequestParameterKey() {
        return this.requestParameterKey;
    }

    /**
     * Boolean whether or not the parameter is required.
     * 
     */
    @Import(name="required", required=true)
      private final Output<Boolean> required;

    public Output<Boolean> getRequired() {
        return this.required;
    }

    public RouteRequestParameterArgs(
        Output<String> requestParameterKey,
        Output<Boolean> required) {
        this.requestParameterKey = Objects.requireNonNull(requestParameterKey, "expected parameter 'requestParameterKey' to be non-null");
        this.required = Objects.requireNonNull(required, "expected parameter 'required' to be non-null");
    }

    private RouteRequestParameterArgs() {
        this.requestParameterKey = Output.empty();
        this.required = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteRequestParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> requestParameterKey;
        private Output<Boolean> required;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteRequestParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestParameterKey = defaults.requestParameterKey;
    	      this.required = defaults.required;
        }

        public Builder requestParameterKey(Output<String> requestParameterKey) {
            this.requestParameterKey = Objects.requireNonNull(requestParameterKey);
            return this;
        }

        public Builder requestParameterKey(String requestParameterKey) {
            this.requestParameterKey = Output.of(Objects.requireNonNull(requestParameterKey));
            return this;
        }

        public Builder required(Output<Boolean> required) {
            this.required = Objects.requireNonNull(required);
            return this;
        }

        public Builder required(Boolean required) {
            this.required = Output.of(Objects.requireNonNull(required));
            return this;
        }
        public RouteRequestParameterArgs build() {
            return new RouteRequestParameterArgs(requestParameterKey, required);
        }
    }
}
