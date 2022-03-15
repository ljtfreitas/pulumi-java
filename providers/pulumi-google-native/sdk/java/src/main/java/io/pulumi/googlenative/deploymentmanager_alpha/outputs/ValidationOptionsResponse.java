// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ValidationOptionsResponse {
    /**
     * Customize how deployment manager will validate the resource against schema errors.
     * 
     */
    private final String schemaValidation;
    /**
     * Specify what to do with extra properties when executing a request.
     * 
     */
    private final String undeclaredProperties;

    @CustomType.Constructor
    private ValidationOptionsResponse(
        @CustomType.Parameter("schemaValidation") String schemaValidation,
        @CustomType.Parameter("undeclaredProperties") String undeclaredProperties) {
        this.schemaValidation = schemaValidation;
        this.undeclaredProperties = undeclaredProperties;
    }

    /**
     * Customize how deployment manager will validate the resource against schema errors.
     * 
    */
    public String getSchemaValidation() {
        return this.schemaValidation;
    }
    /**
     * Specify what to do with extra properties when executing a request.
     * 
    */
    public String getUndeclaredProperties() {
        return this.undeclaredProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String schemaValidation;
        private String undeclaredProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schemaValidation = defaults.schemaValidation;
    	      this.undeclaredProperties = defaults.undeclaredProperties;
        }

        public Builder schemaValidation(String schemaValidation) {
            this.schemaValidation = Objects.requireNonNull(schemaValidation);
            return this;
        }

        public Builder undeclaredProperties(String undeclaredProperties) {
            this.undeclaredProperties = Objects.requireNonNull(undeclaredProperties);
            return this;
        }
        public ValidationOptionsResponse build() {
            return new ValidationOptionsResponse(schemaValidation, undeclaredProperties);
        }
    }
}
