// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ThingGroupPropertiesAttributePayload {
    /**
     * Key-value map.
     * 
     */
    private final @Nullable Map<String,String> attributes;

    @OutputCustomType.Constructor({"attributes"})
    private ThingGroupPropertiesAttributePayload(@Nullable Map<String,String> attributes) {
        this.attributes = attributes;
    }

    /**
     * Key-value map.
     * 
     */
    public Map<String,String> getAttributes() {
        return this.attributes == null ? Map.of() : this.attributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingGroupPropertiesAttributePayload defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> attributes;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingGroupPropertiesAttributePayload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
        }

        public Builder setAttributes(@Nullable Map<String,String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public ThingGroupPropertiesAttributePayload build() {
            return new ThingGroupPropertiesAttributePayload(attributes);
        }
    }
}
