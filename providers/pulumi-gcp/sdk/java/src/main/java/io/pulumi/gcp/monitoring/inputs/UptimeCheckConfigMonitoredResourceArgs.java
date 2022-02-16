// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class UptimeCheckConfigMonitoredResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigMonitoredResourceArgs Empty = new UptimeCheckConfigMonitoredResourceArgs();

    @InputImport(name="labels", required=true)
    private final Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public UptimeCheckConfigMonitoredResourceArgs(
        Input<Map<String,String>> labels,
        Input<String> type) {
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private UptimeCheckConfigMonitoredResourceArgs() {
        this.labels = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigMonitoredResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Map<String,String>> labels;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigMonitoredResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.type = defaults.type;
        }

        public Builder setLabels(Input<Map<String,String>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Input.of(Objects.requireNonNull(labels));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public UptimeCheckConfigMonitoredResourceArgs build() {
            return new UptimeCheckConfigMonitoredResourceArgs(labels, type);
        }
    }
}