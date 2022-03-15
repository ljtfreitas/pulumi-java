// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ExportTimePeriodResponse {
    /**
     * The start date for export data.
     * 
     */
    private final String from;
    /**
     * The end date for export data.
     * 
     */
    private final String to;

    @CustomType.Constructor
    private ExportTimePeriodResponse(
        @CustomType.Parameter("from") String from,
        @CustomType.Parameter("to") String to) {
        this.from = from;
        this.to = to;
    }

    /**
     * The start date for export data.
     * 
    */
    public String getFrom() {
        return this.from;
    }
    /**
     * The end date for export data.
     * 
    */
    public String getTo() {
        return this.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportTimePeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String from;
        private String to;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportTimePeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        public Builder from(String from) {
            this.from = Objects.requireNonNull(from);
            return this;
        }

        public Builder to(String to) {
            this.to = Objects.requireNonNull(to);
            return this;
        }
        public ExportTimePeriodResponse build() {
            return new ExportTimePeriodResponse(from, to);
        }
    }
}
