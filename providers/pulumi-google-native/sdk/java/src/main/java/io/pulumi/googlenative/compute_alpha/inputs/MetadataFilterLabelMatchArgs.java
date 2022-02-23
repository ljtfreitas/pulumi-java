// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MetadataFilter label name value pairs that are expected to match corresponding labels presented as metadata to the load balancer.
 * 
 */
public final class MetadataFilterLabelMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataFilterLabelMatchArgs Empty = new MetadataFilterLabelMatchArgs();

    /**
     * Name of metadata label. The name can have a maximum length of 1024 characters and must be at least 1 character long.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The value of the label must match the specified value. value can have a maximum length of 1024 characters.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public MetadataFilterLabelMatchArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> value) {
        this.name = name;
        this.value = value;
    }

    private MetadataFilterLabelMatchArgs() {
        this.name = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataFilterLabelMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataFilterLabelMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public MetadataFilterLabelMatchArgs build() {
            return new MetadataFilterLabelMatchArgs(name, value);
        }
    }
}
