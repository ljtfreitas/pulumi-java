// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class ServerEndpointRecallErrorResponse {
    /**
     * Count of occurences of the error
     * 
     */
    private final Double count;
    /**
     * Error code (HResult)
     * 
     */
    private final Integer errorCode;

    @OutputCustomType.Constructor({"count","errorCode"})
    private ServerEndpointRecallErrorResponse(
        Double count,
        Integer errorCode) {
        this.count = Objects.requireNonNull(count);
        this.errorCode = Objects.requireNonNull(errorCode);
    }

    /**
     * Count of occurences of the error
     * 
     */
    public Double getCount() {
        return this.count;
    }
    /**
     * Error code (HResult)
     * 
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerEndpointRecallErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double count;
        private Integer errorCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerEndpointRecallErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.errorCode = defaults.errorCode;
        }

        public Builder setCount(Double count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setErrorCode(Integer errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }
        public ServerEndpointRecallErrorResponse build() {
            return new ServerEndpointRecallErrorResponse(count, errorCode);
        }
    }
}
