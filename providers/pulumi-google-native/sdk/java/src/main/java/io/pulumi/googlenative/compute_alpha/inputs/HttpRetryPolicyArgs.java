// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.DurationArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The retry policy associates with HttpRouteRule
 * 
 */
public final class HttpRetryPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpRetryPolicyArgs Empty = new HttpRetryPolicyArgs();

    /**
     * Specifies the allowed number retries. This number must be > 0. If not specified, defaults to 1.
     * 
     */
    @InputImport(name="numRetries")
      private final @Nullable Input<Integer> numRetries;

    public Input<Integer> getNumRetries() {
        return this.numRetries == null ? Input.empty() : this.numRetries;
    }

    /**
     * Specifies a non-zero timeout per retry attempt. If not specified, will use the timeout set in the HttpRouteAction field. If timeout in the HttpRouteAction field is not set, this field uses the largest timeout among all backend services associated with the route. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @InputImport(name="perTryTimeout")
      private final @Nullable Input<DurationArgs> perTryTimeout;

    public Input<DurationArgs> getPerTryTimeout() {
        return this.perTryTimeout == null ? Input.empty() : this.perTryTimeout;
    }

    /**
     * Specifies one or more conditions when this retry policy applies. Valid values are: - 5xx: retry is attempted if the instance or endpoint responds with any 5xx response code, or if the instance or endpoint does not respond at all. For example, disconnects, reset, read timeout, connection failure, and refused streams. - gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504. - connect-failure: a retry is attempted on failures connecting to the instance or endpoint. For example, connection timeouts. - retriable-4xx: a retry is attempted if the instance or endpoint responds with a 4xx response code. The only error that you can retry is error code 409. - refused-stream: a retry is attempted if the instance or endpoint resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: a retry is attempted if the gRPC status code in the response header is set to cancelled. - deadline-exceeded: a retry is attempted if the gRPC status code in the response header is set to deadline-exceeded. - internal: a retry is attempted if the gRPC status code in the response header is set to internal. - resource-exhausted: a retry is attempted if the gRPC status code in the response header is set to resource-exhausted. - unavailable: a retry is attempted if the gRPC status code in the response header is set to unavailable. Only the following codes are supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true. - cancelled - deadline-exceeded - internal - resource-exhausted - unavailable
     * 
     */
    @InputImport(name="retryConditions")
      private final @Nullable Input<List<String>> retryConditions;

    public Input<List<String>> getRetryConditions() {
        return this.retryConditions == null ? Input.empty() : this.retryConditions;
    }

    public HttpRetryPolicyArgs(
        @Nullable Input<Integer> numRetries,
        @Nullable Input<DurationArgs> perTryTimeout,
        @Nullable Input<List<String>> retryConditions) {
        this.numRetries = numRetries;
        this.perTryTimeout = perTryTimeout;
        this.retryConditions = retryConditions;
    }

    private HttpRetryPolicyArgs() {
        this.numRetries = Input.empty();
        this.perTryTimeout = Input.empty();
        this.retryConditions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRetryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> numRetries;
        private @Nullable Input<DurationArgs> perTryTimeout;
        private @Nullable Input<List<String>> retryConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRetryPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numRetries = defaults.numRetries;
    	      this.perTryTimeout = defaults.perTryTimeout;
    	      this.retryConditions = defaults.retryConditions;
        }

        public Builder setNumRetries(@Nullable Input<Integer> numRetries) {
            this.numRetries = numRetries;
            return this;
        }

        public Builder setNumRetries(@Nullable Integer numRetries) {
            this.numRetries = Input.ofNullable(numRetries);
            return this;
        }

        public Builder setPerTryTimeout(@Nullable Input<DurationArgs> perTryTimeout) {
            this.perTryTimeout = perTryTimeout;
            return this;
        }

        public Builder setPerTryTimeout(@Nullable DurationArgs perTryTimeout) {
            this.perTryTimeout = Input.ofNullable(perTryTimeout);
            return this;
        }

        public Builder setRetryConditions(@Nullable Input<List<String>> retryConditions) {
            this.retryConditions = retryConditions;
            return this;
        }

        public Builder setRetryConditions(@Nullable List<String> retryConditions) {
            this.retryConditions = Input.ofNullable(retryConditions);
            return this;
        }
        public HttpRetryPolicyArgs build() {
            return new HttpRetryPolicyArgs(numRetries, perTryTimeout, retryConditions);
        }
    }
}
