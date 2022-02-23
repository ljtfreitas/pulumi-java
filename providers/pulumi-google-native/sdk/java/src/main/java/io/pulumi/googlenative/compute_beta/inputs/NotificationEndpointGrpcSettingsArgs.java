// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.DurationArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a gRPC setting that describes one gRPC notification endpoint and the retry duration attempting to send notification to this endpoint.
 * 
 */
public final class NotificationEndpointGrpcSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationEndpointGrpcSettingsArgs Empty = new NotificationEndpointGrpcSettingsArgs();

    /**
     * Optional. If specified, this field is used to set the authority header by the sender of notifications. See https://tools.ietf.org/html/rfc7540#section-8.1.2.3
     * 
     */
    @InputImport(name="authority")
      private final @Nullable Input<String> authority;

    public Input<String> getAuthority() {
        return this.authority == null ? Input.empty() : this.authority;
    }

    /**
     * Endpoint to which gRPC notifications are sent. This must be a valid gRPCLB DNS name.
     * 
     */
    @InputImport(name="endpoint")
      private final @Nullable Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    /**
     * Optional. If specified, this field is used to populate the "name" field in gRPC requests.
     * 
     */
    @InputImport(name="payloadName")
      private final @Nullable Input<String> payloadName;

    public Input<String> getPayloadName() {
        return this.payloadName == null ? Input.empty() : this.payloadName;
    }

    /**
     * Optional. This field is used to configure how often to send a full update of all non-healthy backends. If unspecified, full updates are not sent. If specified, must be in the range between 600 seconds to 3600 seconds. Nanos are disallowed.
     * 
     */
    @InputImport(name="resendInterval")
      private final @Nullable Input<DurationArgs> resendInterval;

    public Input<DurationArgs> getResendInterval() {
        return this.resendInterval == null ? Input.empty() : this.resendInterval;
    }

    /**
     * How much time (in seconds) is spent attempting notification retries until a successful response is received. Default is 30s. Limit is 20m (1200s). Must be a positive number.
     * 
     */
    @InputImport(name="retryDurationSec")
      private final @Nullable Input<Integer> retryDurationSec;

    public Input<Integer> getRetryDurationSec() {
        return this.retryDurationSec == null ? Input.empty() : this.retryDurationSec;
    }

    public NotificationEndpointGrpcSettingsArgs(
        @Nullable Input<String> authority,
        @Nullable Input<String> endpoint,
        @Nullable Input<String> payloadName,
        @Nullable Input<DurationArgs> resendInterval,
        @Nullable Input<Integer> retryDurationSec) {
        this.authority = authority;
        this.endpoint = endpoint;
        this.payloadName = payloadName;
        this.resendInterval = resendInterval;
        this.retryDurationSec = retryDurationSec;
    }

    private NotificationEndpointGrpcSettingsArgs() {
        this.authority = Input.empty();
        this.endpoint = Input.empty();
        this.payloadName = Input.empty();
        this.resendInterval = Input.empty();
        this.retryDurationSec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationEndpointGrpcSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authority;
        private @Nullable Input<String> endpoint;
        private @Nullable Input<String> payloadName;
        private @Nullable Input<DurationArgs> resendInterval;
        private @Nullable Input<Integer> retryDurationSec;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationEndpointGrpcSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.endpoint = defaults.endpoint;
    	      this.payloadName = defaults.payloadName;
    	      this.resendInterval = defaults.resendInterval;
    	      this.retryDurationSec = defaults.retryDurationSec;
        }

        public Builder setAuthority(@Nullable Input<String> authority) {
            this.authority = authority;
            return this;
        }

        public Builder setAuthority(@Nullable String authority) {
            this.authority = Input.ofNullable(authority);
            return this;
        }

        public Builder setEndpoint(@Nullable Input<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder setPayloadName(@Nullable Input<String> payloadName) {
            this.payloadName = payloadName;
            return this;
        }

        public Builder setPayloadName(@Nullable String payloadName) {
            this.payloadName = Input.ofNullable(payloadName);
            return this;
        }

        public Builder setResendInterval(@Nullable Input<DurationArgs> resendInterval) {
            this.resendInterval = resendInterval;
            return this;
        }

        public Builder setResendInterval(@Nullable DurationArgs resendInterval) {
            this.resendInterval = Input.ofNullable(resendInterval);
            return this;
        }

        public Builder setRetryDurationSec(@Nullable Input<Integer> retryDurationSec) {
            this.retryDurationSec = retryDurationSec;
            return this;
        }

        public Builder setRetryDurationSec(@Nullable Integer retryDurationSec) {
            this.retryDurationSec = Input.ofNullable(retryDurationSec);
            return this;
        }
        public NotificationEndpointGrpcSettingsArgs build() {
            return new NotificationEndpointGrpcSettingsArgs(authority, endpoint, payloadName, resendInterval, retryDurationSec);
        }
    }
}
