// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.outputs;

import io.pulumi.aws.autoscaling.outputs.GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecification;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GroupMixedInstancesPolicyLaunchTemplateOverride {
    /**
     * Override the instance type in the Launch Template.
     * 
     */
    private final @Nullable String instanceType;
    /**
     * Override the instance launch template specification in the Launch Template.
     * 
     */
    private final @Nullable GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecification launchTemplateSpecification;
    /**
     * The number of capacity units, which gives the instance type a proportional weight to other instance types.
     * 
     */
    private final @Nullable String weightedCapacity;

    @OutputCustomType.Constructor({"instanceType","launchTemplateSpecification","weightedCapacity"})
    private GroupMixedInstancesPolicyLaunchTemplateOverride(
        @Nullable String instanceType,
        @Nullable GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecification launchTemplateSpecification,
        @Nullable String weightedCapacity) {
        this.instanceType = instanceType;
        this.launchTemplateSpecification = launchTemplateSpecification;
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * Override the instance type in the Launch Template.
     * 
     */
    public Optional<String> getInstanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * Override the instance launch template specification in the Launch Template.
     * 
     */
    public Optional<GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecification> getLaunchTemplateSpecification() {
        return Optional.ofNullable(this.launchTemplateSpecification);
    }
    /**
     * The number of capacity units, which gives the instance type a proportional weight to other instance types.
     * 
     */
    public Optional<String> getWeightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMixedInstancesPolicyLaunchTemplateOverride defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String instanceType;
        private @Nullable GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecification launchTemplateSpecification;
        private @Nullable String weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMixedInstancesPolicyLaunchTemplateOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.launchTemplateSpecification = defaults.launchTemplateSpecification;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setLaunchTemplateSpecification(@Nullable GroupMixedInstancesPolicyLaunchTemplateOverrideLaunchTemplateSpecification launchTemplateSpecification) {
            this.launchTemplateSpecification = launchTemplateSpecification;
            return this;
        }

        public Builder setWeightedCapacity(@Nullable String weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public GroupMixedInstancesPolicyLaunchTemplateOverride build() {
            return new GroupMixedInstancesPolicyLaunchTemplateOverride(instanceType, launchTemplateSpecification, weightedCapacity);
        }
    }
}
