// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Different types of filters supported and its values.
 * 
 */
public final class FilterablePropertyResponse extends io.pulumi.resources.InvokeArgs {

    public static final FilterablePropertyResponse Empty = new FilterablePropertyResponse();

    /**
     * Values to be filtered.
     * 
     */
    @InputImport(name="supportedValues", required=true)
      private final List<String> supportedValues;

    public List<String> getSupportedValues() {
        return this.supportedValues;
    }

    /**
     * Type of product filter.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public FilterablePropertyResponse(
        List<String> supportedValues,
        String type) {
        this.supportedValues = Objects.requireNonNull(supportedValues, "expected parameter 'supportedValues' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FilterablePropertyResponse() {
        this.supportedValues = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterablePropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> supportedValues;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterablePropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.supportedValues = defaults.supportedValues;
    	      this.type = defaults.type;
        }

        public Builder setSupportedValues(List<String> supportedValues) {
            this.supportedValues = Objects.requireNonNull(supportedValues);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FilterablePropertyResponse build() {
            return new FilterablePropertyResponse(supportedValues, type);
        }
    }
}
