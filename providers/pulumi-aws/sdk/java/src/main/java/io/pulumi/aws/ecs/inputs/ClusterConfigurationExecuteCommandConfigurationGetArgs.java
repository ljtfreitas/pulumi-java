// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationLogConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterConfigurationExecuteCommandConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterConfigurationExecuteCommandConfigurationGetArgs Empty = new ClusterConfigurationExecuteCommandConfigurationGetArgs();

    /**
     * The AWS Key Management Service key ID to encrypt the data between the local client and the container.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * The log configuration for the results of the execute command actions Required when `logging` is `OVERRIDE`. Detailed below.
     * 
     */
    @Import(name="logConfiguration")
      private final @Nullable Output<ClusterConfigurationExecuteCommandConfigurationLogConfigurationGetArgs> logConfiguration;

    public Output<ClusterConfigurationExecuteCommandConfigurationLogConfigurationGetArgs> getLogConfiguration() {
        return this.logConfiguration == null ? Output.empty() : this.logConfiguration;
    }

    /**
     * The log setting to use for redirecting logs for your execute command results. Valid values are `NONE`, `DEFAULT`, and `OVERRIDE`.
     * 
     */
    @Import(name="logging")
      private final @Nullable Output<String> logging;

    public Output<String> getLogging() {
        return this.logging == null ? Output.empty() : this.logging;
    }

    public ClusterConfigurationExecuteCommandConfigurationGetArgs(
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<ClusterConfigurationExecuteCommandConfigurationLogConfigurationGetArgs> logConfiguration,
        @Nullable Output<String> logging) {
        this.kmsKeyId = kmsKeyId;
        this.logConfiguration = logConfiguration;
        this.logging = logging;
    }

    private ClusterConfigurationExecuteCommandConfigurationGetArgs() {
        this.kmsKeyId = Output.empty();
        this.logConfiguration = Output.empty();
        this.logging = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfigurationExecuteCommandConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<ClusterConfigurationExecuteCommandConfigurationLogConfigurationGetArgs> logConfiguration;
        private @Nullable Output<String> logging;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConfigurationExecuteCommandConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.logConfiguration = defaults.logConfiguration;
    	      this.logging = defaults.logging;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
            return this;
        }

        public Builder logConfiguration(@Nullable Output<ClusterConfigurationExecuteCommandConfigurationLogConfigurationGetArgs> logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        public Builder logConfiguration(@Nullable ClusterConfigurationExecuteCommandConfigurationLogConfigurationGetArgs logConfiguration) {
            this.logConfiguration = Output.ofNullable(logConfiguration);
            return this;
        }

        public Builder logging(@Nullable Output<String> logging) {
            this.logging = logging;
            return this;
        }

        public Builder logging(@Nullable String logging) {
            this.logging = Output.ofNullable(logging);
            return this;
        }
        public ClusterConfigurationExecuteCommandConfigurationGetArgs build() {
            return new ClusterConfigurationExecuteCommandConfigurationGetArgs(kmsKeyId, logConfiguration, logging);
        }
    }
}
