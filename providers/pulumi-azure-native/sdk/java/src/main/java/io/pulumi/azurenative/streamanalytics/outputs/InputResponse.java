// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.azurenative.streamanalytics.outputs.ReferenceInputPropertiesResponse;
import io.pulumi.azurenative.streamanalytics.outputs.StreamInputPropertiesResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InputResponse {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource name
     * 
     */
    private final @Nullable String name;
    /**
     * The properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable Either<ReferenceInputPropertiesResponse,StreamInputPropertiesResponse> properties;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private InputResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("properties") @Nullable Either<ReferenceInputPropertiesResponse,StreamInputPropertiesResponse> properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<Either<ReferenceInputPropertiesResponse,StreamInputPropertiesResponse>> getProperties() {
        return Optional.ofNullable(this.properties);
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String name;
        private @Nullable Either<ReferenceInputPropertiesResponse,StreamInputPropertiesResponse> properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder properties(@Nullable Either<ReferenceInputPropertiesResponse,StreamInputPropertiesResponse> properties) {
            this.properties = properties;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public InputResponse build() {
            return new InputResponse(id, name, properties, type);
        }
    }
}
