// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterConfigurationExecuteCommandConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterConfigurationExecuteCommandConfigurationArgs Empty = new ClusterConfigurationExecuteCommandConfigurationArgs();

    /**
     * The AWS Key Management Service key ID to encrypt the data between the local client and the container.
     * 
     */
    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * The log configuration for the results of the execute command actions Required when `logging` is `OVERRIDE`. Detailed below.
     * 
     */
    @InputImport(name="logConfiguration")
    private final @Nullable Input<ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs> logConfiguration;

    public Input<ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs> getLogConfiguration() {
        return this.logConfiguration == null ? Input.empty() : this.logConfiguration;
    }

    /**
     * The log setting to use for redirecting logs for your execute command results. Valid values are `NONE`, `DEFAULT`, and `OVERRIDE`.
     * 
     */
    @InputImport(name="logging")
    private final @Nullable Input<String> logging;

    public Input<String> getLogging() {
        return this.logging == null ? Input.empty() : this.logging;
    }

    public ClusterConfigurationExecuteCommandConfigurationArgs(
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs> logConfiguration,
        @Nullable Input<String> logging) {
        this.kmsKeyId = kmsKeyId;
        this.logConfiguration = logConfiguration;
        this.logging = logging;
    }

    private ClusterConfigurationExecuteCommandConfigurationArgs() {
        this.kmsKeyId = Input.empty();
        this.logConfiguration = Input.empty();
        this.logging = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfigurationExecuteCommandConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs> logConfiguration;
        private @Nullable Input<String> logging;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConfigurationExecuteCommandConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.logConfiguration = defaults.logConfiguration;
    	      this.logging = defaults.logging;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setLogConfiguration(@Nullable Input<ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs> logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        public Builder setLogConfiguration(@Nullable ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs logConfiguration) {
            this.logConfiguration = Input.ofNullable(logConfiguration);
            return this;
        }

        public Builder setLogging(@Nullable Input<String> logging) {
            this.logging = logging;
            return this;
        }

        public Builder setLogging(@Nullable String logging) {
            this.logging = Input.ofNullable(logging);
            return this;
        }
        public ClusterConfigurationExecuteCommandConfigurationArgs build() {
            return new ClusterConfigurationExecuteCommandConfigurationArgs(kmsKeyId, logConfiguration, logging);
        }
    }
}
