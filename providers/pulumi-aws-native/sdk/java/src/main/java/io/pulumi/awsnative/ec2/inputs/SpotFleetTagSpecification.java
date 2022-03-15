// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.SpotFleetTagSpecificationResourceType;
import io.pulumi.awsnative.ec2.inputs.SpotFleetTag;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetTagSpecification extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetTagSpecification Empty = new SpotFleetTagSpecification();

    @Import(name="resourceType")
      private final @Nullable SpotFleetTagSpecificationResourceType resourceType;

    public Optional<SpotFleetTagSpecificationResourceType> getPropResourceType() {
        return this.resourceType == null ? Optional.empty() : Optional.ofNullable(this.resourceType);
    }

    @Import(name="tags")
      private final @Nullable List<SpotFleetTag> tags;

    public List<SpotFleetTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public SpotFleetTagSpecification(
        @Nullable SpotFleetTagSpecificationResourceType resourceType,
        @Nullable List<SpotFleetTag> tags) {
        this.resourceType = resourceType;
        this.tags = tags;
    }

    private SpotFleetTagSpecification() {
        this.resourceType = null;
        this.tags = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetTagSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SpotFleetTagSpecificationResourceType resourceType;
        private @Nullable List<SpotFleetTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetTagSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.tags = defaults.tags;
        }

        public Builder resourceType(@Nullable SpotFleetTagSpecificationResourceType resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder tags(@Nullable List<SpotFleetTag> tags) {
            this.tags = tags;
            return this;
        }
        public SpotFleetTagSpecification build() {
            return new SpotFleetTagSpecification(resourceType, tags);
        }
    }
}
