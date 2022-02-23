// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.EC2FleetTagSpecificationResourceType;
import io.pulumi.awsnative.ec2.inputs.EC2FleetTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetTagSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetTagSpecificationArgs Empty = new EC2FleetTagSpecificationArgs();

    @InputImport(name="resourceType")
        private final @Nullable Input<EC2FleetTagSpecificationResourceType> resourceType;

    public Input<EC2FleetTagSpecificationResourceType> getPropResourceType() {
        return this.resourceType == null ? Input.empty() : this.resourceType;
    }

    @InputImport(name="tags")
        private final @Nullable Input<List<EC2FleetTagArgs>> tags;

    public Input<List<EC2FleetTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public EC2FleetTagSpecificationArgs(
        @Nullable Input<EC2FleetTagSpecificationResourceType> resourceType,
        @Nullable Input<List<EC2FleetTagArgs>> tags) {
        this.resourceType = resourceType;
        this.tags = tags;
    }

    private EC2FleetTagSpecificationArgs() {
        this.resourceType = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetTagSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EC2FleetTagSpecificationResourceType> resourceType;
        private @Nullable Input<List<EC2FleetTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetTagSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.tags = defaults.tags;
        }

        public Builder setResourceType(@Nullable Input<EC2FleetTagSpecificationResourceType> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceType(@Nullable EC2FleetTagSpecificationResourceType resourceType) {
            this.resourceType = Input.ofNullable(resourceType);
            return this;
        }

        public Builder setTags(@Nullable Input<List<EC2FleetTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<EC2FleetTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public EC2FleetTagSpecificationArgs build() {
            return new EC2FleetTagSpecificationArgs(resourceType, tags);
        }
    }
}
