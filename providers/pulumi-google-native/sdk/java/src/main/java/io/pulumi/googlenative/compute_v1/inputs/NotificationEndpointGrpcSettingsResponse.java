// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.DurationResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a gRPC setting that describes one gRPC notification endpoint and the retry duration attempting to send notification to this endpoint.
 * 
 */
public final class NotificationEndpointGrpcSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final NotificationEndpointGrpcSettingsResponse Empty = new NotificationEndpointGrpcSettingsResponse();

    /**
     * Optional. If specified, this field is used to set the authority header by the sender of notifications. See https://tools.ietf.org/html/rfc7540#section-8.1.2.3
     * 
     */
    @Import(name="authority", required=true)
      private final String authority;

    public String getAuthority() {
        return this.authority;
    }

    /**
     * Endpoint to which gRPC notifications are sent. This must be a valid gRPCLB DNS name.
     * 
     */
    @Import(name="endpoint", required=true)
      private final String endpoint;

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Optional. If specified, this field is used to populate the "name" field in gRPC requests.
     * 
     */
    @Import(name="payloadName", required=true)
      private final String payloadName;

    public String getPayloadName() {
        return this.payloadName;
    }

    /**
     * Optional. This field is used to configure how often to send a full update of all non-healthy backends. If unspecified, full updates are not sent. If specified, must be in the range between 600 seconds to 3600 seconds. Nanos are disallowed.
     * 
     */
    @Import(name="resendInterval", required=true)
      private final DurationResponse resendInterval;

    public DurationResponse getResendInterval() {
        return this.resendInterval;
    }

    /**
     * How much time (in seconds) is spent attempting notification retries until a successful response is received. Default is 30s. Limit is 20m (1200s). Must be a positive number.
     * 
     */
    @Import(name="retryDurationSec", required=true)
      private final Integer retryDurationSec;

    public Integer getRetryDurationSec() {
        return this.retryDurationSec;
    }

    public NotificationEndpointGrpcSettingsResponse(
        String authority,
        String endpoint,
        String payloadName,
        DurationResponse resendInterval,
        Integer retryDurationSec) {
        this.authority = Objects.requireNonNull(authority, "expected parameter 'authority' to be non-null");
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.payloadName = Objects.requireNonNull(payloadName, "expected parameter 'payloadName' to be non-null");
        this.resendInterval = Objects.requireNonNull(resendInterval, "expected parameter 'resendInterval' to be non-null");
        this.retryDurationSec = Objects.requireNonNull(retryDurationSec, "expected parameter 'retryDurationSec' to be non-null");
    }

    private NotificationEndpointGrpcSettingsResponse() {
        this.authority = null;
        this.endpoint = null;
        this.payloadName = null;
        this.resendInterval = null;
        this.retryDurationSec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationEndpointGrpcSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authority;
        private String endpoint;
        private String payloadName;
        private DurationResponse resendInterval;
        private Integer retryDurationSec;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationEndpointGrpcSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.endpoint = defaults.endpoint;
    	      this.payloadName = defaults.payloadName;
    	      this.resendInterval = defaults.resendInterval;
    	      this.retryDurationSec = defaults.retryDurationSec;
        }

        public Builder authority(String authority) {
            this.authority = Objects.requireNonNull(authority);
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder payloadName(String payloadName) {
            this.payloadName = Objects.requireNonNull(payloadName);
            return this;
        }

        public Builder resendInterval(DurationResponse resendInterval) {
            this.resendInterval = Objects.requireNonNull(resendInterval);
            return this;
        }

        public Builder retryDurationSec(Integer retryDurationSec) {
            this.retryDurationSec = Objects.requireNonNull(retryDurationSec);
            return this;
        }
        public NotificationEndpointGrpcSettingsResponse build() {
            return new NotificationEndpointGrpcSettingsResponse(authority, endpoint, payloadName, resendInterval, retryDurationSec);
        }
    }
}
