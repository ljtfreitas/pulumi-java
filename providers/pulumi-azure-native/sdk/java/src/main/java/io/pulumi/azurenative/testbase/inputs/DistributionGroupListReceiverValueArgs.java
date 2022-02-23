// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The user object receiver value.
 * 
 */
public final class DistributionGroupListReceiverValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionGroupListReceiverValueArgs Empty = new DistributionGroupListReceiverValueArgs();

    /**
     * The list of distribution groups.
     * 
     */
    @InputImport(name="distributionGroups")
        private final @Nullable Input<List<String>> distributionGroups;

    public Input<List<String>> getDistributionGroups() {
        return this.distributionGroups == null ? Input.empty() : this.distributionGroups;
    }

    public DistributionGroupListReceiverValueArgs(@Nullable Input<List<String>> distributionGroups) {
        this.distributionGroups = distributionGroups;
    }

    private DistributionGroupListReceiverValueArgs() {
        this.distributionGroups = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionGroupListReceiverValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> distributionGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionGroupListReceiverValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionGroups = defaults.distributionGroups;
        }

        public Builder setDistributionGroups(@Nullable Input<List<String>> distributionGroups) {
            this.distributionGroups = distributionGroups;
            return this;
        }

        public Builder setDistributionGroups(@Nullable List<String> distributionGroups) {
            this.distributionGroups = Input.ofNullable(distributionGroups);
            return this;
        }
        public DistributionGroupListReceiverValueArgs build() {
            return new DistributionGroupListReceiverValueArgs(distributionGroups);
        }
    }
}
