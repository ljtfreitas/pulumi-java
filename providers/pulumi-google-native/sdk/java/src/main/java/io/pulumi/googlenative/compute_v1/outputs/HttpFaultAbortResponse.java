// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class HttpFaultAbortResponse {
    /**
     * The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
     * 
     */
    private final Integer httpStatus;
    /**
     * The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * 
     */
    private final Double percentage;

    @CustomType.Constructor
    private HttpFaultAbortResponse(
        @CustomType.Parameter("httpStatus") Integer httpStatus,
        @CustomType.Parameter("percentage") Double percentage) {
        this.httpStatus = httpStatus;
        this.percentage = percentage;
    }

    /**
     * The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
     * 
    */
    public Integer getHttpStatus() {
        return this.httpStatus;
    }
    /**
     * The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * 
    */
    public Double getPercentage() {
        return this.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFaultAbortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer httpStatus;
        private Double percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFaultAbortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpStatus = defaults.httpStatus;
    	      this.percentage = defaults.percentage;
        }

        public Builder httpStatus(Integer httpStatus) {
            this.httpStatus = Objects.requireNonNull(httpStatus);
            return this;
        }

        public Builder percentage(Double percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }
        public HttpFaultAbortResponse build() {
            return new HttpFaultAbortResponse(httpStatus, percentage);
        }
    }
}
