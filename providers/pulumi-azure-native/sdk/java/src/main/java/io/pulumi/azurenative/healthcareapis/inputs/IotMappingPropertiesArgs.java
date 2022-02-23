// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The mapping content.
 * 
 */
public final class IotMappingPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IotMappingPropertiesArgs Empty = new IotMappingPropertiesArgs();

    /**
     * The mapping.
     * 
     */
    @InputImport(name="content")
        private final @Nullable Input<Object> content;

    public Input<Object> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    public IotMappingPropertiesArgs(@Nullable Input<Object> content) {
        this.content = content;
    }

    private IotMappingPropertiesArgs() {
        this.content = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotMappingPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> content;

        public Builder() {
    	      // Empty
        }

        public Builder(IotMappingPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
        }

        public Builder setContent(@Nullable Input<Object> content) {
            this.content = content;
            return this;
        }

        public Builder setContent(@Nullable Object content) {
            this.content = Input.ofNullable(content);
            return this;
        }
        public IotMappingPropertiesArgs build() {
            return new IotMappingPropertiesArgs(content);
        }
    }
}
