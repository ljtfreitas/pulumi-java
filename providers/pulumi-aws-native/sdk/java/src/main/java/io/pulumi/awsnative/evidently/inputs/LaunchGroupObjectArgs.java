// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchGroupObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchGroupObjectArgs Empty = new LaunchGroupObjectArgs();

    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="feature", required=true)
        private final Input<String> feature;

    public Input<String> getFeature() {
        return this.feature;
    }

    @InputImport(name="groupName", required=true)
        private final Input<String> groupName;

    public Input<String> getGroupName() {
        return this.groupName;
    }

    @InputImport(name="variation", required=true)
        private final Input<String> variation;

    public Input<String> getVariation() {
        return this.variation;
    }

    public LaunchGroupObjectArgs(
        @Nullable Input<String> description,
        Input<String> feature,
        Input<String> groupName,
        Input<String> variation) {
        this.description = description;
        this.feature = Objects.requireNonNull(feature, "expected parameter 'feature' to be non-null");
        this.groupName = Objects.requireNonNull(groupName, "expected parameter 'groupName' to be non-null");
        this.variation = Objects.requireNonNull(variation, "expected parameter 'variation' to be non-null");
    }

    private LaunchGroupObjectArgs() {
        this.description = Input.empty();
        this.feature = Input.empty();
        this.groupName = Input.empty();
        this.variation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchGroupObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> feature;
        private Input<String> groupName;
        private Input<String> variation;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchGroupObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.feature = defaults.feature;
    	      this.groupName = defaults.groupName;
    	      this.variation = defaults.variation;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFeature(Input<String> feature) {
            this.feature = Objects.requireNonNull(feature);
            return this;
        }

        public Builder setFeature(String feature) {
            this.feature = Input.of(Objects.requireNonNull(feature));
            return this;
        }

        public Builder setGroupName(Input<String> groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }

        public Builder setGroupName(String groupName) {
            this.groupName = Input.of(Objects.requireNonNull(groupName));
            return this;
        }

        public Builder setVariation(Input<String> variation) {
            this.variation = Objects.requireNonNull(variation);
            return this;
        }

        public Builder setVariation(String variation) {
            this.variation = Input.of(Objects.requireNonNull(variation));
            return this;
        }
        public LaunchGroupObjectArgs build() {
            return new LaunchGroupObjectArgs(description, feature, groupName, variation);
        }
    }
}
