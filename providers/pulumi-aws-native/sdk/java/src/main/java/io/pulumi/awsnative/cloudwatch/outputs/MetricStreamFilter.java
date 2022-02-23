// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudwatch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MetricStreamFilter {
    /**
     * Only metrics with Namespace matching this value will be streamed.
     * 
     */
    private final String namespace;

    @OutputCustomType.Constructor({"namespace"})
    private MetricStreamFilter(String namespace) {
        this.namespace = Objects.requireNonNull(namespace);
    }

    /**
     * Only metrics with Namespace matching this value will be streamed.
     * 
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStreamFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStreamFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public MetricStreamFilter build() {
            return new MetricStreamFilter(namespace);
        }
    }
}
