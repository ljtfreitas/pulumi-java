// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Error information in OData format.
 * 
 */
public final class ODataErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ODataErrorResponse Empty = new ODataErrorResponse();

    /**
     * The machine-readable description of the error, such as 'InvalidRequest' or 'InternalServerError'
     * 
     */
    @InputImport(name="code", required=true)
    private final String code;

    public String getCode() {
        return this.code;
    }

    /**
     * Inner errors that caused this error
     * 
     */
    @InputImport(name="details", required=true)
    private final List<ODataErrorResponse> details;

    public List<ODataErrorResponse> getDetails() {
        return this.details;
    }

    /**
     * The human-readable description of the error
     * 
     */
    @InputImport(name="message", required=true)
    private final String message;

    public String getMessage() {
        return this.message;
    }

    public ODataErrorResponse(
        String code,
        List<ODataErrorResponse> details,
        String message) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
    }

    private ODataErrorResponse() {
        this.code = null;
        this.details = List.of();
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ODataErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private List<ODataErrorResponse> details;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ODataErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(List<ODataErrorResponse> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public ODataErrorResponse build() {
            return new ODataErrorResponse(code, details, message);
        }
    }
}
