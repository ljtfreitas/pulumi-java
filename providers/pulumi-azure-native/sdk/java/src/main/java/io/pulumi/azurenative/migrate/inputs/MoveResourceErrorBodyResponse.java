// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An error response from the Azure Migrate service.
 * 
 */
public final class MoveResourceErrorBodyResponse extends io.pulumi.resources.InvokeArgs {

    public static final MoveResourceErrorBodyResponse Empty = new MoveResourceErrorBodyResponse();

    /**
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     * 
     */
    @Import(name="code", required=true)
      private final String code;

    public String getCode() {
        return this.code;
    }

    /**
     * A list of additional details about the error.
     * 
     */
    @Import(name="details", required=true)
      private final List<MoveResourceErrorBodyResponse> details;

    public List<MoveResourceErrorBodyResponse> getDetails() {
        return this.details;
    }

    /**
     * A message describing the error, intended to be suitable for display in a user interface.
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * The target of the particular error. For example, the name of the property in error.
     * 
     */
    @Import(name="target", required=true)
      private final String target;

    public String getTarget() {
        return this.target;
    }

    public MoveResourceErrorBodyResponse(
        String code,
        List<MoveResourceErrorBodyResponse> details,
        String message,
        String target) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private MoveResourceErrorBodyResponse() {
        this.code = null;
        this.details = List.of();
        this.message = null;
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoveResourceErrorBodyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private List<MoveResourceErrorBodyResponse> details;
        private String message;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(MoveResourceErrorBodyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder details(List<MoveResourceErrorBodyResponse> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public MoveResourceErrorBodyResponse build() {
            return new MoveResourceErrorBodyResponse(code, details, message, target);
        }
    }
}
