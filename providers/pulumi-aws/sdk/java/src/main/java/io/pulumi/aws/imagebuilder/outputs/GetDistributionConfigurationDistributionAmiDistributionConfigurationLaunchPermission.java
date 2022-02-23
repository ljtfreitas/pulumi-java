// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission {
    /**
     * Set of EC2 launch permission user groups.
     * 
     */
    private final List<String> userGroups;
    /**
     * Set of AWS Account identifiers.
     * 
     */
    private final List<String> userIds;

    @OutputCustomType.Constructor({"userGroups","userIds"})
    private GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission(
        List<String> userGroups,
        List<String> userIds) {
        this.userGroups = Objects.requireNonNull(userGroups);
        this.userIds = Objects.requireNonNull(userIds);
    }

    /**
     * Set of EC2 launch permission user groups.
     * 
     */
    public List<String> getUserGroups() {
        return this.userGroups;
    }
    /**
     * Set of AWS Account identifiers.
     * 
     */
    public List<String> getUserIds() {
        return this.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> userGroups;
        private List<String> userIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userGroups = defaults.userGroups;
    	      this.userIds = defaults.userIds;
        }

        public Builder setUserGroups(List<String> userGroups) {
            this.userGroups = Objects.requireNonNull(userGroups);
            return this;
        }

        public Builder setUserIds(List<String> userIds) {
            this.userIds = Objects.requireNonNull(userIds);
            return this;
        }
        public GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission build() {
            return new GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission(userGroups, userIds);
        }
    }
}