// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowLookoutMetricsDestinationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowLookoutMetricsDestinationPropertiesArgs Empty = new FlowLookoutMetricsDestinationPropertiesArgs();

    @InputImport(name="object")
        private final @Nullable Input<String> object;

    public Input<String> getObject() {
        return this.object == null ? Input.empty() : this.object;
    }

    public FlowLookoutMetricsDestinationPropertiesArgs(@Nullable Input<String> object) {
        this.object = object;
    }

    private FlowLookoutMetricsDestinationPropertiesArgs() {
        this.object = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowLookoutMetricsDestinationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowLookoutMetricsDestinationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder setObject(@Nullable Input<String> object) {
            this.object = object;
            return this;
        }

        public Builder setObject(@Nullable String object) {
            this.object = Input.ofNullable(object);
            return this;
        }
        public FlowLookoutMetricsDestinationPropertiesArgs build() {
            return new FlowLookoutMetricsDestinationPropertiesArgs(object);
        }
    }
}
