// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorCollectionErrorInfoResponse {
    /**
     * Short error code
     * 
     */
    private final String errorCode;
    /**
     * External Provider error message
     * 
     */
    private final String errorInnerMessage;
    /**
     * Detailed error message
     * 
     */
    private final String errorMessage;
    /**
     * Time the error started occurring (Last time error occurred in lastChecked)
     * 
     */
    private final String errorStartTime;

    @CustomType.Constructor
    private ConnectorCollectionErrorInfoResponse(
        @CustomType.Parameter("errorCode") String errorCode,
        @CustomType.Parameter("errorInnerMessage") String errorInnerMessage,
        @CustomType.Parameter("errorMessage") String errorMessage,
        @CustomType.Parameter("errorStartTime") String errorStartTime) {
        this.errorCode = errorCode;
        this.errorInnerMessage = errorInnerMessage;
        this.errorMessage = errorMessage;
        this.errorStartTime = errorStartTime;
    }

    /**
     * Short error code
     * 
    */
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * External Provider error message
     * 
    */
    public String getErrorInnerMessage() {
        return this.errorInnerMessage;
    }
    /**
     * Detailed error message
     * 
    */
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * Time the error started occurring (Last time error occurred in lastChecked)
     * 
    */
    public String getErrorStartTime() {
        return this.errorStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCollectionErrorInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorCode;
        private String errorInnerMessage;
        private String errorMessage;
        private String errorStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorCollectionErrorInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.errorInnerMessage = defaults.errorInnerMessage;
    	      this.errorMessage = defaults.errorMessage;
    	      this.errorStartTime = defaults.errorStartTime;
        }

        public Builder errorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder errorInnerMessage(String errorInnerMessage) {
            this.errorInnerMessage = Objects.requireNonNull(errorInnerMessage);
            return this;
        }

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder errorStartTime(String errorStartTime) {
            this.errorStartTime = Objects.requireNonNull(errorStartTime);
            return this;
        }
        public ConnectorCollectionErrorInfoResponse build() {
            return new ConnectorCollectionErrorInfoResponse(errorCode, errorInnerMessage, errorMessage, errorStartTime);
        }
    }
}
