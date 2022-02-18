// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.azurenative.streamanalytics.outputs.ReferenceInputPropertiesResponse;
import io.pulumi.azurenative.streamanalytics.outputs.StreamInputPropertiesResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInputResult {
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
    private final Either<ReferenceInputPropertiesResponse,StreamInputPropertiesResponse> properties;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","properties","type"})
    private GetInputResult(
        String id,
        @Nullable String name,
        Either<ReferenceInputPropertiesResponse,StreamInputPropertiesResponse> properties,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = name;
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
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
    public Either<ReferenceInputPropertiesResponse,StreamInputPropertiesResponse> getProperties() {
        return this.properties;
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

    public static Builder builder(GetInputResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String name;
        private Either<ReferenceInputPropertiesResponse,StreamInputPropertiesResponse> properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInputResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProperties(Either<ReferenceInputPropertiesResponse,StreamInputPropertiesResponse> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetInputResult build() {
            return new GetInputResult(id, name, properties, type);
        }
    }
}
