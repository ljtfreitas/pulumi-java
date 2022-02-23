// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThingGroupPropertiesAttributePayloadGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThingGroupPropertiesAttributePayloadGetArgs Empty = new ThingGroupPropertiesAttributePayloadGetArgs();

    /**
     * Key-value map.
     * 
     */
    @InputImport(name="attributes")
    private final @Nullable Input<Map<String,String>> attributes;

    public Input<Map<String,String>> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    public ThingGroupPropertiesAttributePayloadGetArgs(@Nullable Input<Map<String,String>> attributes) {
        this.attributes = attributes;
    }

    private ThingGroupPropertiesAttributePayloadGetArgs() {
        this.attributes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingGroupPropertiesAttributePayloadGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> attributes;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingGroupPropertiesAttributePayloadGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
        }

        public Builder setAttributes(@Nullable Input<Map<String,String>> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributes(@Nullable Map<String,String> attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }
        public ThingGroupPropertiesAttributePayloadGetArgs build() {
            return new ThingGroupPropertiesAttributePayloadGetArgs(attributes);
        }
    }
}
