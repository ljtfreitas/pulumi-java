// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


/**
 * Object to define the number of days after creation.
 * 
 */
public final class DateAfterCreationResponse extends io.pulumi.resources.InvokeArgs {

    public static final DateAfterCreationResponse Empty = new DateAfterCreationResponse();

    /**
     * Value indicating the age in days after creation
     * 
     */
    @InputImport(name="daysAfterCreationGreaterThan", required=true)
        private final Double daysAfterCreationGreaterThan;

    public Double getDaysAfterCreationGreaterThan() {
        return this.daysAfterCreationGreaterThan;
    }

    public DateAfterCreationResponse(Double daysAfterCreationGreaterThan) {
        this.daysAfterCreationGreaterThan = Objects.requireNonNull(daysAfterCreationGreaterThan, "expected parameter 'daysAfterCreationGreaterThan' to be non-null");
    }

    private DateAfterCreationResponse() {
        this.daysAfterCreationGreaterThan = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DateAfterCreationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double daysAfterCreationGreaterThan;

        public Builder() {
    	      // Empty
        }

        public Builder(DateAfterCreationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysAfterCreationGreaterThan = defaults.daysAfterCreationGreaterThan;
        }

        public Builder setDaysAfterCreationGreaterThan(Double daysAfterCreationGreaterThan) {
            this.daysAfterCreationGreaterThan = Objects.requireNonNull(daysAfterCreationGreaterThan);
            return this;
        }
        public DateAfterCreationResponse build() {
            return new DateAfterCreationResponse(daysAfterCreationGreaterThan);
        }
    }
}
