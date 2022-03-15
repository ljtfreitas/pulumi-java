// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs Empty = new ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs();

    /**
     * Describes the execution property groups.
     * 
     */
    @Import(name="propertyGroups", required=true)
      private final Output<List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs>> propertyGroups;

    public Output<List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs>> getPropertyGroups() {
        return this.propertyGroups;
    }

    public ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs(Output<List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs>> propertyGroups) {
        this.propertyGroups = Objects.requireNonNull(propertyGroups, "expected parameter 'propertyGroups' to be non-null");
    }

    private ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs() {
        this.propertyGroups = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs>> propertyGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propertyGroups = defaults.propertyGroups;
        }

        public Builder propertyGroups(Output<List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs>> propertyGroups) {
            this.propertyGroups = Objects.requireNonNull(propertyGroups);
            return this;
        }

        public Builder propertyGroups(List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs> propertyGroups) {
            this.propertyGroups = Output.of(Objects.requireNonNull(propertyGroups));
            return this;
        }
        public ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs build() {
            return new ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs(propertyGroups);
        }
    }
}
