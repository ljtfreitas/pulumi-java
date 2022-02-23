// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalarAutoscalingPolicyMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalarAutoscalingPolicyMetricArgs Empty = new AutoscalarAutoscalingPolicyMetricArgs();

    /**
     * A filter string to be used as the filter string for
     * a Stackdriver Monitoring TimeSeries.list API call.
     * This filter is used to select a specific TimeSeries for
     * the purpose of autoscaling and to determine whether the metric
     * is exporting per-instance or per-group data.
     * You can only use the AND operator for joining selectors.
     * You can only use direct equality comparison operator (=) without
     * any functions for each selector.
     * You can specify the metric in both the filter string and in the
     * metric field. However, if specified in both places, the metric must
     * be identical.
     * The monitored resource type determines what kind of values are
     * expected for the metric. If it is a gce_instance, the autoscaler
     * expects the metric to include a separate TimeSeries for each
     * instance in a group. In such a case, you cannot filter on resource
     * labels.
     * If the resource type is any other value, the autoscaler expects
     * this metric to contain values that apply to the entire autoscaled
     * instance group and resource label filtering can be performed to
     * point autoscaler at the correct TimeSeries to scale upon.
     * This is called a per-group metric for the purpose of autoscaling.
     * If not specified, the type defaults to gce_instance.
     * You should provide a filter that is selective enough to pick just
     * one TimeSeries for the autoscaled group or for each of the instances
     * (if you are using gce_instance resource type). If multiple
     * TimeSeries are returned upon the query execution, the autoscaler
     * will sum their respective values to obtain its scaling value.
     * 
     */
    @InputImport(name="filter")
        private final @Nullable Input<String> filter;

    public Input<String> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * If scaling is based on a per-group metric value that represents the
     * total amount of work to be done or resource usage, set this value to
     * an amount assigned for a single instance of the scaled group.
     * The autoscaler will keep the number of instances proportional to the
     * value of this metric, the metric itself should not change value due
     * to group resizing.
     * For example, a good metric to use with the target is
     * `pubsub.googleapis.com/subscription/num_undelivered_messages`
     * or a custom metric exporting the total number of requests coming to
     * your instances.
     * A bad example would be a metric exporting an average or median
     * latency, since this value can't include a chunk assignable to a
     * single instance, it could be better used with utilization_target
     * instead.
     * 
     */
    @InputImport(name="singleInstanceAssignment")
        private final @Nullable Input<Double> singleInstanceAssignment;

    public Input<Double> getSingleInstanceAssignment() {
        return this.singleInstanceAssignment == null ? Input.empty() : this.singleInstanceAssignment;
    }

    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @InputImport(name="target")
        private final @Nullable Input<Double> target;

    public Input<Double> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    /**
     * Defines how target utilization value is expressed for a
     * Stackdriver Monitoring metric.
     * Possible values are `GAUGE`, `DELTA_PER_SECOND`, and `DELTA_PER_MINUTE`.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public AutoscalarAutoscalingPolicyMetricArgs(
        @Nullable Input<String> filter,
        Input<String> name,
        @Nullable Input<Double> singleInstanceAssignment,
        @Nullable Input<Double> target,
        @Nullable Input<String> type) {
        this.filter = filter;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.singleInstanceAssignment = singleInstanceAssignment;
        this.target = target;
        this.type = type;
    }

    private AutoscalarAutoscalingPolicyMetricArgs() {
        this.filter = Input.empty();
        this.name = Input.empty();
        this.singleInstanceAssignment = Input.empty();
        this.target = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicyMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> filter;
        private Input<String> name;
        private @Nullable Input<Double> singleInstanceAssignment;
        private @Nullable Input<Double> target;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicyMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.singleInstanceAssignment = defaults.singleInstanceAssignment;
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        public Builder setFilter(@Nullable Input<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSingleInstanceAssignment(@Nullable Input<Double> singleInstanceAssignment) {
            this.singleInstanceAssignment = singleInstanceAssignment;
            return this;
        }

        public Builder setSingleInstanceAssignment(@Nullable Double singleInstanceAssignment) {
            this.singleInstanceAssignment = Input.ofNullable(singleInstanceAssignment);
            return this;
        }

        public Builder setTarget(@Nullable Input<Double> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable Double target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public AutoscalarAutoscalingPolicyMetricArgs build() {
            return new AutoscalarAutoscalingPolicyMetricArgs(filter, name, singleInstanceAssignment, target, type);
        }
    }
}
