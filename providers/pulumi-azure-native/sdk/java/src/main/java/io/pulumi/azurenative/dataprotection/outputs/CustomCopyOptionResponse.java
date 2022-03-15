// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomCopyOptionResponse {
    /**
     * Data copied after given timespan
     * 
     */
    private final @Nullable String duration;
    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'CustomCopyOption'.
     * 
     */
    private final String objectType;

    @CustomType.Constructor
    private CustomCopyOptionResponse(
        @CustomType.Parameter("duration") @Nullable String duration,
        @CustomType.Parameter("objectType") String objectType) {
        this.duration = duration;
        this.objectType = objectType;
    }

    /**
     * Data copied after given timespan
     * 
    */
    public Optional<String> getDuration() {
        return Optional.ofNullable(this.duration);
    }
    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'CustomCopyOption'.
     * 
    */
    public String getObjectType() {
        return this.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomCopyOptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String duration;
        private String objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomCopyOptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.objectType = defaults.objectType;
        }

        public Builder duration(@Nullable String duration) {
            this.duration = duration;
            return this;
        }

        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public CustomCopyOptionResponse build() {
            return new CustomCopyOptionResponse(duration, objectType);
        }
    }
}
