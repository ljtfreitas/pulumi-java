// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to specify one track property condition
 * 
 */
public final class TrackPropertyConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final TrackPropertyConditionResponse Empty = new TrackPropertyConditionResponse();

    /**
     * Track property condition operation
     * 
     */
    @Import(name="operation", required=true)
      private final String operation;

    public String getOperation() {
        return this.operation;
    }

    /**
     * Track property type
     * 
     */
    @Import(name="property", required=true)
      private final String property;

    public String getProperty() {
        return this.property;
    }

    /**
     * Track property value
     * 
     */
    @Import(name="value")
      private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public TrackPropertyConditionResponse(
        String operation,
        String property,
        @Nullable String value) {
        this.operation = Objects.requireNonNull(operation, "expected parameter 'operation' to be non-null");
        this.property = Objects.requireNonNull(property, "expected parameter 'property' to be non-null");
        this.value = value;
    }

    private TrackPropertyConditionResponse() {
        this.operation = null;
        this.property = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrackPropertyConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operation;
        private String property;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TrackPropertyConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operation = defaults.operation;
    	      this.property = defaults.property;
    	      this.value = defaults.value;
        }

        public Builder operation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder property(String property) {
            this.property = Objects.requireNonNull(property);
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public TrackPropertyConditionResponse build() {
            return new TrackPropertyConditionResponse(operation, property, value);
        }
    }
}
