// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Details of any error encountered on last collection attempt
 * 
 */
public final class ConnectorCollectionErrorInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectorCollectionErrorInfoResponse Empty = new ConnectorCollectionErrorInfoResponse();

    /**
     * Short error code
     * 
     */
    @InputImport(name="errorCode", required=true)
        private final String errorCode;

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * External Provider error message
     * 
     */
    @InputImport(name="errorInnerMessage", required=true)
        private final String errorInnerMessage;

    public String getErrorInnerMessage() {
        return this.errorInnerMessage;
    }

    /**
     * Detailed error message
     * 
     */
    @InputImport(name="errorMessage", required=true)
        private final String errorMessage;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Time the error started occurring (Last time error occurred in lastChecked)
     * 
     */
    @InputImport(name="errorStartTime", required=true)
        private final String errorStartTime;

    public String getErrorStartTime() {
        return this.errorStartTime;
    }

    public ConnectorCollectionErrorInfoResponse(
        String errorCode,
        String errorInnerMessage,
        String errorMessage,
        String errorStartTime) {
        this.errorCode = Objects.requireNonNull(errorCode, "expected parameter 'errorCode' to be non-null");
        this.errorInnerMessage = Objects.requireNonNull(errorInnerMessage, "expected parameter 'errorInnerMessage' to be non-null");
        this.errorMessage = Objects.requireNonNull(errorMessage, "expected parameter 'errorMessage' to be non-null");
        this.errorStartTime = Objects.requireNonNull(errorStartTime, "expected parameter 'errorStartTime' to be non-null");
    }

    private ConnectorCollectionErrorInfoResponse() {
        this.errorCode = null;
        this.errorInnerMessage = null;
        this.errorMessage = null;
        this.errorStartTime = null;
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

        public Builder setErrorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder setErrorInnerMessage(String errorInnerMessage) {
            this.errorInnerMessage = Objects.requireNonNull(errorInnerMessage);
            return this;
        }

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder setErrorStartTime(String errorStartTime) {
            this.errorStartTime = Objects.requireNonNull(errorStartTime);
            return this;
        }
        public ConnectorCollectionErrorInfoResponse build() {
            return new ConnectorCollectionErrorInfoResponse(errorCode, errorInnerMessage, errorMessage, errorStartTime);
        }
    }
}
