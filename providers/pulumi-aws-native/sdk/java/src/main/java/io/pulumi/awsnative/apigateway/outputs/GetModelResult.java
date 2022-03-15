// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetModelResult {
    /**
     * A description that identifies this model.
     * 
     */
    private final @Nullable String description;
    /**
     * The schema to use to transform data to one or more output formats. Specify null ({}) if you don't want to specify a schema.
     * 
     */
    private final @Nullable Object schema;

    @CustomType.Constructor
    private GetModelResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("schema") @Nullable Object schema) {
        this.description = description;
        this.schema = schema;
    }

    /**
     * A description that identifies this model.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The schema to use to transform data to one or more output formats. Specify null ({}) if you don't want to specify a schema.
     * 
    */
    public Optional<Object> getSchema() {
        return Optional.ofNullable(this.schema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Object schema;

        public Builder() {
    	      // Empty
        }

        public Builder(GetModelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.schema = defaults.schema;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder schema(@Nullable Object schema) {
            this.schema = schema;
            return this;
        }
        public GetModelResult build() {
            return new GetModelResult(description, schema);
        }
    }
}
