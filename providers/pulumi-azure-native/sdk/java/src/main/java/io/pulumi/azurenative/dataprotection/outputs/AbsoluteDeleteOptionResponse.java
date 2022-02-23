// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AbsoluteDeleteOptionResponse {
    /**
     * Duration of deletion after given timespan
     * 
     */
    private final String duration;
    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'AbsoluteDeleteOption'.
     * 
     */
    private final String objectType;

    @OutputCustomType.Constructor({"duration","objectType"})
    private AbsoluteDeleteOptionResponse(
        String duration,
        String objectType) {
        this.duration = Objects.requireNonNull(duration);
        this.objectType = Objects.requireNonNull(objectType);
    }

    /**
     * Duration of deletion after given timespan
     * 
     */
    public String getDuration() {
        return this.duration;
    }
    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'AbsoluteDeleteOption'.
     * 
     */
    public String getObjectType() {
        return this.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AbsoluteDeleteOptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private String objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(AbsoluteDeleteOptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.objectType = defaults.objectType;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public AbsoluteDeleteOptionResponse build() {
            return new AbsoluteDeleteOptionResponse(duration, objectType);
        }
    }
}
