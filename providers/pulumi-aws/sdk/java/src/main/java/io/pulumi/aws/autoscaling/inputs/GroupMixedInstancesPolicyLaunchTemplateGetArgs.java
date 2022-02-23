// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs;
import io.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupMixedInstancesPolicyLaunchTemplateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupMixedInstancesPolicyLaunchTemplateGetArgs Empty = new GroupMixedInstancesPolicyLaunchTemplateGetArgs();

    /**
     * Override the instance launch template specification in the Launch Template.
     * 
     */
    @InputImport(name="launchTemplateSpecification", required=true)
    private final Input<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs> launchTemplateSpecification;

    public Input<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs> getLaunchTemplateSpecification() {
        return this.launchTemplateSpecification;
    }

    /**
     * List of nested arguments provides the ability to specify multiple instance types. This will override the same parameter in the launch template. For on-demand instances, Auto Scaling considers the order of preference of instance types to launch based on the order specified in the overrides list. Defined below.
     * 
     */
    @InputImport(name="overrides")
    private final @Nullable Input<List<GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs>> overrides;

    public Input<List<GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs>> getOverrides() {
        return this.overrides == null ? Input.empty() : this.overrides;
    }

    public GroupMixedInstancesPolicyLaunchTemplateGetArgs(
        Input<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs> launchTemplateSpecification,
        @Nullable Input<List<GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs>> overrides) {
        this.launchTemplateSpecification = Objects.requireNonNull(launchTemplateSpecification, "expected parameter 'launchTemplateSpecification' to be non-null");
        this.overrides = overrides;
    }

    private GroupMixedInstancesPolicyLaunchTemplateGetArgs() {
        this.launchTemplateSpecification = Input.empty();
        this.overrides = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMixedInstancesPolicyLaunchTemplateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs> launchTemplateSpecification;
        private @Nullable Input<List<GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs>> overrides;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMixedInstancesPolicyLaunchTemplateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateSpecification = defaults.launchTemplateSpecification;
    	      this.overrides = defaults.overrides;
        }

        public Builder setLaunchTemplateSpecification(Input<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs> launchTemplateSpecification) {
            this.launchTemplateSpecification = Objects.requireNonNull(launchTemplateSpecification);
            return this;
        }

        public Builder setLaunchTemplateSpecification(GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs launchTemplateSpecification) {
            this.launchTemplateSpecification = Input.of(Objects.requireNonNull(launchTemplateSpecification));
            return this;
        }

        public Builder setOverrides(@Nullable Input<List<GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs>> overrides) {
            this.overrides = overrides;
            return this;
        }

        public Builder setOverrides(@Nullable List<GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs> overrides) {
            this.overrides = Input.ofNullable(overrides);
            return this;
        }
        public GroupMixedInstancesPolicyLaunchTemplateGetArgs build() {
            return new GroupMixedInstancesPolicyLaunchTemplateGetArgs(launchTemplateSpecification, overrides);
        }
    }
}