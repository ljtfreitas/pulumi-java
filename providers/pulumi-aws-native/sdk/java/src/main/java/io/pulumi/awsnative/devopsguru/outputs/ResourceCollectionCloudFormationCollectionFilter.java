// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devopsguru.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ResourceCollectionCloudFormationCollectionFilter {
    /**
     * An array of CloudFormation stack names.
     * 
     */
    private final @Nullable List<String> stackNames;

    @CustomType.Constructor
    private ResourceCollectionCloudFormationCollectionFilter(@CustomType.Parameter("stackNames") @Nullable List<String> stackNames) {
        this.stackNames = stackNames;
    }

    /**
     * An array of CloudFormation stack names.
     * 
    */
    public List<String> getStackNames() {
        return this.stackNames == null ? List.of() : this.stackNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceCollectionCloudFormationCollectionFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> stackNames;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceCollectionCloudFormationCollectionFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stackNames = defaults.stackNames;
        }

        public Builder stackNames(@Nullable List<String> stackNames) {
            this.stackNames = stackNames;
            return this;
        }
        public ResourceCollectionCloudFormationCollectionFilter build() {
            return new ResourceCollectionCloudFormationCollectionFilter(stackNames);
        }
    }
}
