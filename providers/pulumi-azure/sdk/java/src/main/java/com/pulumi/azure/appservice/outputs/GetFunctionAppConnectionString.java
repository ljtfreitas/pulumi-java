// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFunctionAppConnectionString {
    /**
     * @return The name of the Function App resource.
     * 
     */
    private final String name;
    /**
     * @return The identity type of the Managed Identity assigned to the Function App.
     * 
     */
    private final String type;
    /**
     * @return The value for the Connection String.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetFunctionAppConnectionString(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    /**
     * @return The name of the Function App resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The identity type of the Managed Identity assigned to the Function App.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The value for the Connection String.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionAppConnectionString defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionAppConnectionString defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetFunctionAppConnectionString build() {
            return new GetFunctionAppConnectionString(name, type, value);
        }
    }
}
