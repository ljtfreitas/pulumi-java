// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionGetArgs Empty = new DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionGetArgs();

    /**
     * Set of EC2 launch permission user groups to assign. Use `all` to distribute a public AMI.
     * 
     */
    @Import(name="userGroups")
      private final @Nullable Output<List<String>> userGroups;

    public Output<List<String>> getUserGroups() {
        return this.userGroups == null ? Output.empty() : this.userGroups;
    }

    /**
     * Set of AWS Account identifiers to assign.
     * 
     */
    @Import(name="userIds")
      private final @Nullable Output<List<String>> userIds;

    public Output<List<String>> getUserIds() {
        return this.userIds == null ? Output.empty() : this.userIds;
    }

    public DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionGetArgs(
        @Nullable Output<List<String>> userGroups,
        @Nullable Output<List<String>> userIds) {
        this.userGroups = userGroups;
        this.userIds = userIds;
    }

    private DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionGetArgs() {
        this.userGroups = Output.empty();
        this.userIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> userGroups;
        private @Nullable Output<List<String>> userIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userGroups = defaults.userGroups;
    	      this.userIds = defaults.userIds;
        }

        public Builder userGroups(@Nullable Output<List<String>> userGroups) {
            this.userGroups = userGroups;
            return this;
        }

        public Builder userGroups(@Nullable List<String> userGroups) {
            this.userGroups = Output.ofNullable(userGroups);
            return this;
        }

        public Builder userIds(@Nullable Output<List<String>> userIds) {
            this.userIds = userIds;
            return this;
        }

        public Builder userIds(@Nullable List<String> userIds) {
            this.userIds = Output.ofNullable(userIds);
            return this;
        }
        public DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionGetArgs build() {
            return new DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionGetArgs(userGroups, userIds);
        }
    }
}
