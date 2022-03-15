// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class OptionResponse {
    /**
     * The option's name. For protobuf built-in options (options defined in descriptor.proto), this is the short name. For example, `"map_entry"`. For custom options, it should be the fully-qualified name. For example, `"google.api.http"`.
     * 
     */
    private final String name;
    /**
     * The option's value packed in an Any message. If the value is a primitive, the corresponding wrapper type defined in google/protobuf/wrappers.proto should be used. If the value is an enum, it should be stored as an int32 value using the google.protobuf.Int32Value type.
     * 
     */
    private final Map<String,String> value;

    @CustomType.Constructor
    private OptionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") Map<String,String> value) {
        this.name = name;
        this.value = value;
    }

    /**
     * The option's name. For protobuf built-in options (options defined in descriptor.proto), this is the short name. For example, `"map_entry"`. For custom options, it should be the fully-qualified name. For example, `"google.api.http"`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The option's value packed in an Any message. If the value is a primitive, the corresponding wrapper type defined in google/protobuf/wrappers.proto should be used. If the value is an enum, it should be stored as an int32 value using the google.protobuf.Int32Value type.
     * 
    */
    public Map<String,String> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Map<String,String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder value(Map<String,String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public OptionResponse build() {
            return new OptionResponse(name, value);
        }
    }
}
