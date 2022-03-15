// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FlowDatadogSourceProperties extends io.pulumi.resources.InvokeArgs {

    public static final FlowDatadogSourceProperties Empty = new FlowDatadogSourceProperties();

    @Import(name="object", required=true)
      private final String object;

    public String getObject() {
        return this.object;
    }

    public FlowDatadogSourceProperties(String object) {
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowDatadogSourceProperties() {
        this.object = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDatadogSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDatadogSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public FlowDatadogSourceProperties build() {
            return new FlowDatadogSourceProperties(object);
        }
    }
}
