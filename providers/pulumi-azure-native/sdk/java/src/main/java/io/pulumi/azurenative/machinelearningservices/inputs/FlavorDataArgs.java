// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlavorDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlavorDataArgs Empty = new FlavorDataArgs();

    /**
     * Model flavor-specific data.
     * 
     */
    @InputImport(name="data")
        private final @Nullable Input<Map<String,String>> data;

    public Input<Map<String,String>> getData() {
        return this.data == null ? Input.empty() : this.data;
    }

    public FlavorDataArgs(@Nullable Input<Map<String,String>> data) {
        this.data = data;
    }

    private FlavorDataArgs() {
        this.data = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlavorDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> data;

        public Builder() {
    	      // Empty
        }

        public Builder(FlavorDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
        }

        public Builder setData(@Nullable Input<Map<String,String>> data) {
            this.data = data;
            return this;
        }

        public Builder setData(@Nullable Map<String,String> data) {
            this.data = Input.ofNullable(data);
            return this;
        }
        public FlavorDataArgs build() {
            return new FlavorDataArgs(data);
        }
    }
}
