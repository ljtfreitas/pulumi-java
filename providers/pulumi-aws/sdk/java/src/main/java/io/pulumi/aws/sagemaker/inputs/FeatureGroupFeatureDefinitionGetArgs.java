// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureGroupFeatureDefinitionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureGroupFeatureDefinitionGetArgs Empty = new FeatureGroupFeatureDefinitionGetArgs();

    /**
     * The name of a feature. `feature_name` cannot be any of the following: `is_deleted`, `write_time`, `api_invocation_time`.
     * 
     */
    @InputImport(name="featureName")
    private final @Nullable Input<String> featureName;

    public Input<String> getFeatureName() {
        return this.featureName == null ? Input.empty() : this.featureName;
    }

    /**
     * The value type of a feature. Valid values are `Integral`, `Fractional`, or `String`.
     * 
     */
    @InputImport(name="featureType")
    private final @Nullable Input<String> featureType;

    public Input<String> getFeatureType() {
        return this.featureType == null ? Input.empty() : this.featureType;
    }

    public FeatureGroupFeatureDefinitionGetArgs(
        @Nullable Input<String> featureName,
        @Nullable Input<String> featureType) {
        this.featureName = featureName;
        this.featureType = featureType;
    }

    private FeatureGroupFeatureDefinitionGetArgs() {
        this.featureName = Input.empty();
        this.featureType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupFeatureDefinitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> featureName;
        private @Nullable Input<String> featureType;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupFeatureDefinitionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureName = defaults.featureName;
    	      this.featureType = defaults.featureType;
        }

        public Builder setFeatureName(@Nullable Input<String> featureName) {
            this.featureName = featureName;
            return this;
        }

        public Builder setFeatureName(@Nullable String featureName) {
            this.featureName = Input.ofNullable(featureName);
            return this;
        }

        public Builder setFeatureType(@Nullable Input<String> featureType) {
            this.featureType = featureType;
            return this;
        }

        public Builder setFeatureType(@Nullable String featureType) {
            this.featureType = Input.ofNullable(featureType);
            return this;
        }
        public FeatureGroupFeatureDefinitionGetArgs build() {
            return new FeatureGroupFeatureDefinitionGetArgs(featureName, featureType);
        }
    }
}
