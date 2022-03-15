// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MetricStreamExcludeFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricStreamExcludeFilterArgs Empty = new MetricStreamExcludeFilterArgs();

    /**
     * Name of the metric namespace in the filter.
     * 
     */
    @Import(name="namespace", required=true)
      private final Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace;
    }

    public MetricStreamExcludeFilterArgs(Output<String> namespace) {
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private MetricStreamExcludeFilterArgs() {
        this.namespace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStreamExcludeFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStreamExcludeFilterArgs defaults) {
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
        public MetricStreamExcludeFilterArgs build() {
            return new MetricStreamExcludeFilterArgs(namespace);
        }
    }
}
