// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.enums.SupportedFilterTypes;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Different types of filters supported and its values.
 * 
 */
public final class FilterableProperty extends io.pulumi.resources.InvokeArgs {

    public static final FilterableProperty Empty = new FilterableProperty();

    /**
     * Values to be filtered.
     * 
     */
    @Import(name="supportedValues", required=true)
      private final List<String> supportedValues;

    public List<String> getSupportedValues() {
        return this.supportedValues;
    }

    /**
     * Type of product filter.
     * 
     */
    @Import(name="type", required=true)
      private final Either<String,SupportedFilterTypes> type;

    public Either<String,SupportedFilterTypes> getType() {
        return this.type;
    }

    public FilterableProperty(
        List<String> supportedValues,
        Either<String,SupportedFilterTypes> type) {
        this.supportedValues = Objects.requireNonNull(supportedValues, "expected parameter 'supportedValues' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FilterableProperty() {
        this.supportedValues = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterableProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> supportedValues;
        private Either<String,SupportedFilterTypes> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterableProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.supportedValues = defaults.supportedValues;
    	      this.type = defaults.type;
        }

        public Builder supportedValues(List<String> supportedValues) {
            this.supportedValues = Objects.requireNonNull(supportedValues);
            return this;
        }

        public Builder type(Either<String,SupportedFilterTypes> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FilterableProperty build() {
            return new FilterableProperty(supportedValues, type);
        }
    }
}
