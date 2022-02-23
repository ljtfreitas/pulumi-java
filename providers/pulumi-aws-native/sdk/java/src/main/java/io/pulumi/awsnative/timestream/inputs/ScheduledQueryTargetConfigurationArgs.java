// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.inputs;

import io.pulumi.awsnative.timestream.inputs.ScheduledQueryTimestreamConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Configuration of target store where scheduled query results are written to.
 * 
 */
public final class ScheduledQueryTargetConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledQueryTargetConfigurationArgs Empty = new ScheduledQueryTargetConfigurationArgs();

    @InputImport(name="timestreamConfiguration", required=true)
        private final Input<ScheduledQueryTimestreamConfigurationArgs> timestreamConfiguration;

    public Input<ScheduledQueryTimestreamConfigurationArgs> getTimestreamConfiguration() {
        return this.timestreamConfiguration;
    }

    public ScheduledQueryTargetConfigurationArgs(Input<ScheduledQueryTimestreamConfigurationArgs> timestreamConfiguration) {
        this.timestreamConfiguration = Objects.requireNonNull(timestreamConfiguration, "expected parameter 'timestreamConfiguration' to be non-null");
    }

    private ScheduledQueryTargetConfigurationArgs() {
        this.timestreamConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryTargetConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ScheduledQueryTimestreamConfigurationArgs> timestreamConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryTargetConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timestreamConfiguration = defaults.timestreamConfiguration;
        }

        public Builder setTimestreamConfiguration(Input<ScheduledQueryTimestreamConfigurationArgs> timestreamConfiguration) {
            this.timestreamConfiguration = Objects.requireNonNull(timestreamConfiguration);
            return this;
        }

        public Builder setTimestreamConfiguration(ScheduledQueryTimestreamConfigurationArgs timestreamConfiguration) {
            this.timestreamConfiguration = Input.of(Objects.requireNonNull(timestreamConfiguration));
            return this;
        }
        public ScheduledQueryTargetConfigurationArgs build() {
            return new ScheduledQueryTargetConfigurationArgs(timestreamConfiguration);
        }
    }
}
