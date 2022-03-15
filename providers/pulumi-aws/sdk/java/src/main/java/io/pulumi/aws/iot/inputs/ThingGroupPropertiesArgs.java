// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.aws.iot.inputs.ThingGroupPropertiesAttributePayloadArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThingGroupPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThingGroupPropertiesArgs Empty = new ThingGroupPropertiesArgs();

    /**
     * The Thing Group attributes. Defined below.
     * 
     */
    @Import(name="attributePayload")
      private final @Nullable Output<ThingGroupPropertiesAttributePayloadArgs> attributePayload;

    public Output<ThingGroupPropertiesAttributePayloadArgs> getAttributePayload() {
        return this.attributePayload == null ? Output.empty() : this.attributePayload;
    }

    /**
     * A description of the Thing Group.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    public ThingGroupPropertiesArgs(
        @Nullable Output<ThingGroupPropertiesAttributePayloadArgs> attributePayload,
        @Nullable Output<String> description) {
        this.attributePayload = attributePayload;
        this.description = description;
    }

    private ThingGroupPropertiesArgs() {
        this.attributePayload = Output.empty();
        this.description = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingGroupPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ThingGroupPropertiesAttributePayloadArgs> attributePayload;
        private @Nullable Output<String> description;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingGroupPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributePayload = defaults.attributePayload;
    	      this.description = defaults.description;
        }

        public Builder attributePayload(@Nullable Output<ThingGroupPropertiesAttributePayloadArgs> attributePayload) {
            this.attributePayload = attributePayload;
            return this;
        }

        public Builder attributePayload(@Nullable ThingGroupPropertiesAttributePayloadArgs attributePayload) {
            this.attributePayload = Output.ofNullable(attributePayload);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public ThingGroupPropertiesArgs build() {
            return new ThingGroupPropertiesArgs(attributePayload, description);
        }
    }
}
