// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties pertaining to the UnknownTarget
 * 
 */
public final class UnknownTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UnknownTargetArgs Empty = new UnknownTargetArgs();

    /**
     * Dictionary of string->string pairs containing information about the Storage Target.
     * 
     */
    @InputImport(name="attributes")
        private final @Nullable Input<Map<String,String>> attributes;

    public Input<Map<String,String>> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    public UnknownTargetArgs(@Nullable Input<Map<String,String>> attributes) {
        this.attributes = attributes;
    }

    private UnknownTargetArgs() {
        this.attributes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UnknownTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> attributes;

        public Builder() {
    	      // Empty
        }

        public Builder(UnknownTargetArgs defaults) {
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
        public UnknownTargetArgs build() {
            return new UnknownTargetArgs(attributes);
        }
    }
}
