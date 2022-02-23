// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Data type and value of a parameter.
 * 
 */
public final class GoogleCloudChannelV1ValueResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudChannelV1ValueResponse Empty = new GoogleCloudChannelV1ValueResponse();

    /**
     * Represents a boolean value.
     * 
     */
    @InputImport(name="boolValue", required=true)
      private final Boolean boolValue;

    public Boolean getBoolValue() {
        return this.boolValue;
    }

    /**
     * Represents a double value.
     * 
     */
    @InputImport(name="doubleValue", required=true)
      private final Double doubleValue;

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * Represents an int64 value.
     * 
     */
    @InputImport(name="int64Value", required=true)
      private final String int64Value;

    public String getInt64Value() {
        return this.int64Value;
    }

    /**
     * Represents an 'Any' proto value.
     * 
     */
    @InputImport(name="protoValue", required=true)
      private final Map<String,String> protoValue;

    public Map<String,String> getProtoValue() {
        return this.protoValue;
    }

    /**
     * Represents a string value.
     * 
     */
    @InputImport(name="stringValue", required=true)
      private final String stringValue;

    public String getStringValue() {
        return this.stringValue;
    }

    public GoogleCloudChannelV1ValueResponse(
        Boolean boolValue,
        Double doubleValue,
        String int64Value,
        Map<String,String> protoValue,
        String stringValue) {
        this.boolValue = Objects.requireNonNull(boolValue, "expected parameter 'boolValue' to be non-null");
        this.doubleValue = Objects.requireNonNull(doubleValue, "expected parameter 'doubleValue' to be non-null");
        this.int64Value = Objects.requireNonNull(int64Value, "expected parameter 'int64Value' to be non-null");
        this.protoValue = Objects.requireNonNull(protoValue, "expected parameter 'protoValue' to be non-null");
        this.stringValue = Objects.requireNonNull(stringValue, "expected parameter 'stringValue' to be non-null");
    }

    private GoogleCloudChannelV1ValueResponse() {
        this.boolValue = null;
        this.doubleValue = null;
        this.int64Value = null;
        this.protoValue = Map.of();
        this.stringValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1ValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean boolValue;
        private Double doubleValue;
        private String int64Value;
        private Map<String,String> protoValue;
        private String stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1ValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boolValue = defaults.boolValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.int64Value = defaults.int64Value;
    	      this.protoValue = defaults.protoValue;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder setBoolValue(Boolean boolValue) {
            this.boolValue = Objects.requireNonNull(boolValue);
            return this;
        }

        public Builder setDoubleValue(Double doubleValue) {
            this.doubleValue = Objects.requireNonNull(doubleValue);
            return this;
        }

        public Builder setInt64Value(String int64Value) {
            this.int64Value = Objects.requireNonNull(int64Value);
            return this;
        }

        public Builder setProtoValue(Map<String,String> protoValue) {
            this.protoValue = Objects.requireNonNull(protoValue);
            return this;
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }
        public GoogleCloudChannelV1ValueResponse build() {
            return new GoogleCloudChannelV1ValueResponse(boolValue, doubleValue, int64Value, protoValue, stringValue);
        }
    }
}
