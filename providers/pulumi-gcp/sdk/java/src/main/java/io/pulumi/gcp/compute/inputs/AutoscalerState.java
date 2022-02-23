// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalerState extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalerState Empty = new AutoscalerState();

    /**
     * The configuration parameters for the autoscaling algorithm. You can
     * define one or more of the policies for an autoscaler: cpuUtilization,
     * customMetricUtilizations, and loadBalancingUtilization.
     * If none of these are specified, the default will be to autoscale based
     * on cpuUtilization to 0.6 or 60%.
     * Structure is documented below.
     * 
     */
    @InputImport(name="autoscalingPolicy")
        private final @Nullable Input<AutoscalerAutoscalingPolicyGetArgs> autoscalingPolicy;

    public Input<AutoscalerAutoscalingPolicyGetArgs> getAutoscalingPolicy() {
        return this.autoscalingPolicy == null ? Input.empty() : this.autoscalingPolicy;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @InputImport(name="creationTimestamp")
        private final @Nullable Input<String> creationTimestamp;

    public Input<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Input.empty() : this.creationTimestamp;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
        private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @InputImport(name="target")
        private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    /**
     * URL of the zone where the instance group resides.
     * 
     */
    @InputImport(name="zone")
        private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public AutoscalerState(
        @Nullable Input<AutoscalerAutoscalingPolicyGetArgs> autoscalingPolicy,
        @Nullable Input<String> creationTimestamp,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> selfLink,
        @Nullable Input<String> target,
        @Nullable Input<String> zone) {
        this.autoscalingPolicy = autoscalingPolicy;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.name = name;
        this.project = project;
        this.selfLink = selfLink;
        this.target = target;
        this.zone = zone;
    }

    private AutoscalerState() {
        this.autoscalingPolicy = Input.empty();
        this.creationTimestamp = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.selfLink = Input.empty();
        this.target = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutoscalerAutoscalingPolicyGetArgs> autoscalingPolicy;
        private @Nullable Input<String> creationTimestamp;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<String> target;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.target = defaults.target;
    	      this.zone = defaults.zone;
        }

        public Builder setAutoscalingPolicy(@Nullable Input<AutoscalerAutoscalingPolicyGetArgs> autoscalingPolicy) {
            this.autoscalingPolicy = autoscalingPolicy;
            return this;
        }

        public Builder setAutoscalingPolicy(@Nullable AutoscalerAutoscalingPolicyGetArgs autoscalingPolicy) {
            this.autoscalingPolicy = Input.ofNullable(autoscalingPolicy);
            return this;
        }

        public Builder setCreationTimestamp(@Nullable Input<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder setCreationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Input.ofNullable(creationTimestamp);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setTarget(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public AutoscalerState build() {
            return new AutoscalerState(autoscalingPolicy, creationTimestamp, description, name, project, selfLink, target, zone);
        }
    }
}
