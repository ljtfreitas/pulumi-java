// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AzureResourceDetailsResponse {
    /**
     * Azure resource Id of the assessed resource
     * 
     */
    private final String id;
    /**
     * The platform where the assessed resource resides
     * Expected value is 'Azure'.
     * 
     */
    private final String source;

    @CustomType.Constructor
    private AzureResourceDetailsResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("source") String source) {
        this.id = id;
        this.source = source;
    }

    /**
     * Azure resource Id of the assessed resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The platform where the assessed resource resides
     * Expected value is 'Azure'.
     * 
    */
    public String getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureResourceDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureResourceDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.source = defaults.source;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public AzureResourceDetailsResponse build() {
            return new AzureResourceDetailsResponse(id, source);
        }
    }
}
