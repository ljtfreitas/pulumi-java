// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * This structure defines the metrics that will be streamed.
 * 
 */
public final class MetricStreamFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricStreamFilterArgs Empty = new MetricStreamFilterArgs();

    /**
     * Only metrics with Namespace matching this value will be streamed.
     * 
     */
    @Import(name="namespace", required=true)
      private final Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace;
    }

    public MetricStreamFilterArgs(Output<String> namespace) {
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private MetricStreamFilterArgs() {
        this.namespace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStreamFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStreamFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder namespace(Output<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Output.of(Objects.requireNonNull(namespace));
            return this;
        }
        public MetricStreamFilterArgs build() {
            return new MetricStreamFilterArgs(namespace);
        }
    }
}
