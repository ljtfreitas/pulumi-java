// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionAutoscalerAutoscalingPolicyMetric {
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
    private final @Nullable String filter;
    /**
     * The identifier for this object. Format specified above.
     * 
     */
    private final String name;
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
    private final @Nullable Double singleInstanceAssignment;
    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    private final @Nullable Double target;
    /**
     * Defines how target utilization value is expressed for a
     * Stackdriver Monitoring metric.
     * Possible values are `GAUGE`, `DELTA_PER_SECOND`, and `DELTA_PER_MINUTE`.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private RegionAutoscalerAutoscalingPolicyMetric(
        @CustomType.Parameter("filter") @Nullable String filter,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("singleInstanceAssignment") @Nullable Double singleInstanceAssignment,
        @CustomType.Parameter("target") @Nullable Double target,
        @CustomType.Parameter("type") @Nullable String type) {
        this.filter = filter;
        this.name = name;
        this.singleInstanceAssignment = singleInstanceAssignment;
        this.target = target;
        this.type = type;
    }

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
    public Optional<String> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * The identifier for this object. Format specified above.
     * 
    */
    public String getName() {
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
    public Optional<Double> getSingleInstanceAssignment() {
        return Optional.ofNullable(this.singleInstanceAssignment);
    }
    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
    */
    public Optional<Double> getTarget() {
        return Optional.ofNullable(this.target);
    }
    /**
     * Defines how target utilization value is expressed for a
     * Stackdriver Monitoring metric.
     * Possible values are `GAUGE`, `DELTA_PER_SECOND`, and `DELTA_PER_MINUTE`.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionAutoscalerAutoscalingPolicyMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filter;
        private String name;
        private @Nullable Double singleInstanceAssignment;
        private @Nullable Double target;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionAutoscalerAutoscalingPolicyMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.singleInstanceAssignment = defaults.singleInstanceAssignment;
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder singleInstanceAssignment(@Nullable Double singleInstanceAssignment) {
            this.singleInstanceAssignment = singleInstanceAssignment;
            return this;
        }

        public Builder target(@Nullable Double target) {
            this.target = target;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public RegionAutoscalerAutoscalingPolicyMetric build() {
            return new RegionAutoscalerAutoscalingPolicyMetric(filter, name, singleInstanceAssignment, target, type);
        }
    }
}
