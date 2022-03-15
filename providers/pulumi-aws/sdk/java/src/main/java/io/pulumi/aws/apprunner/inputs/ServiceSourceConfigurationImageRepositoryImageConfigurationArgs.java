// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceSourceConfigurationImageRepositoryImageConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceSourceConfigurationImageRepositoryImageConfigurationArgs Empty = new ServiceSourceConfigurationImageRepositoryImageConfigurationArgs();

    /**
     * The port that your application listens to in the container. Defaults to `"8080"`.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<String> port;

    public Output<String> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * Environment variables available to your running App Runner service. A map of key/value pairs. Keys with a prefix of `AWSAPPRUNNER` are reserved for system use and aren't valid.
     * 
     */
    @Import(name="runtimeEnvironmentVariables")
      private final @Nullable Output<Map<String,String>> runtimeEnvironmentVariables;

    public Output<Map<String,String>> getRuntimeEnvironmentVariables() {
        return this.runtimeEnvironmentVariables == null ? Output.empty() : this.runtimeEnvironmentVariables;
    }

    /**
     * A command App Runner runs to start the application in the source image. If specified, this command overrides the Docker image’s default start command.
     * 
     */
    @Import(name="startCommand")
      private final @Nullable Output<String> startCommand;

    public Output<String> getStartCommand() {
        return this.startCommand == null ? Output.empty() : this.startCommand;
    }

    public ServiceSourceConfigurationImageRepositoryImageConfigurationArgs(
        @Nullable Output<String> port,
        @Nullable Output<Map<String,String>> runtimeEnvironmentVariables,
        @Nullable Output<String> startCommand) {
        this.port = port;
        this.runtimeEnvironmentVariables = runtimeEnvironmentVariables;
        this.startCommand = startCommand;
    }

    private ServiceSourceConfigurationImageRepositoryImageConfigurationArgs() {
        this.port = Output.empty();
        this.runtimeEnvironmentVariables = Output.empty();
        this.startCommand = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationImageRepositoryImageConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> port;
        private @Nullable Output<Map<String,String>> runtimeEnvironmentVariables;
        private @Nullable Output<String> startCommand;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfigurationImageRepositoryImageConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.runtimeEnvironmentVariables = defaults.runtimeEnvironmentVariables;
    	      this.startCommand = defaults.startCommand;
        }

        public Builder port(@Nullable Output<String> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable String port) {
            this.port = Output.ofNullable(port);
            return this;
        }

        public Builder runtimeEnvironmentVariables(@Nullable Output<Map<String,String>> runtimeEnvironmentVariables) {
            this.runtimeEnvironmentVariables = runtimeEnvironmentVariables;
            return this;
        }

        public Builder runtimeEnvironmentVariables(@Nullable Map<String,String> runtimeEnvironmentVariables) {
            this.runtimeEnvironmentVariables = Output.ofNullable(runtimeEnvironmentVariables);
            return this;
        }

        public Builder startCommand(@Nullable Output<String> startCommand) {
            this.startCommand = startCommand;
            return this;
        }

        public Builder startCommand(@Nullable String startCommand) {
            this.startCommand = Output.ofNullable(startCommand);
            return this;
        }
        public ServiceSourceConfigurationImageRepositoryImageConfigurationArgs build() {
            return new ServiceSourceConfigurationImageRepositoryImageConfigurationArgs(port, runtimeEnvironmentVariables, startCommand);
        }
    }
}
