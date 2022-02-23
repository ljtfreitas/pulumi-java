// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.notebooks_v1.inputs.ContainerImageArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the selection and configuration of software inside the runtime. The properties to set on runtime. Properties keys are specified in `key:value` format, for example: * `idle_shutdown: true` * `idle_shutdown_timeout: 180` * `enable_health_monitoring: true`
 * 
 */
public final class RuntimeSoftwareConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeSoftwareConfigArgs Empty = new RuntimeSoftwareConfigArgs();

    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we'll automatically choose from official GPU drivers.
     * 
     */
    @InputImport(name="customGpuDriverPath")
      private final @Nullable Input<String> customGpuDriverPath;

    public Input<String> getCustomGpuDriverPath() {
        return this.customGpuDriverPath == null ? Input.empty() : this.customGpuDriverPath;
    }

    /**
     * Verifies core internal services are running. Default: True
     * 
     */
    @InputImport(name="enableHealthMonitoring")
      private final @Nullable Input<Boolean> enableHealthMonitoring;

    public Input<Boolean> getEnableHealthMonitoring() {
        return this.enableHealthMonitoring == null ? Input.empty() : this.enableHealthMonitoring;
    }

    /**
     * Runtime will automatically shutdown after idle_shutdown_time. Default: True
     * 
     */
    @InputImport(name="idleShutdown")
      private final @Nullable Input<Boolean> idleShutdown;

    public Input<Boolean> getIdleShutdown() {
        return this.idleShutdown == null ? Input.empty() : this.idleShutdown;
    }

    /**
     * Time in minutes to wait before shutting down runtime. Default: 180 minutes
     * 
     */
    @InputImport(name="idleShutdownTimeout")
      private final @Nullable Input<Integer> idleShutdownTimeout;

    public Input<Integer> getIdleShutdownTimeout() {
        return this.idleShutdownTimeout == null ? Input.empty() : this.idleShutdownTimeout;
    }

    /**
     * Install Nvidia Driver automatically.
     * 
     */
    @InputImport(name="installGpuDriver")
      private final @Nullable Input<Boolean> installGpuDriver;

    public Input<Boolean> getInstallGpuDriver() {
        return this.installGpuDriver == null ? Input.empty() : this.installGpuDriver;
    }

    /**
     * Optional. Use a list of container images to use as Kernels in the notebook instance.
     * 
     */
    @InputImport(name="kernels")
      private final @Nullable Input<List<ContainerImageArgs>> kernels;

    public Input<List<ContainerImageArgs>> getKernels() {
        return this.kernels == null ? Input.empty() : this.kernels;
    }

    /**
     * Cron expression in UTC timezone, used to schedule instance auto upgrade. Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * 
     */
    @InputImport(name="notebookUpgradeSchedule")
      private final @Nullable Input<String> notebookUpgradeSchedule;

    public Input<String> getNotebookUpgradeSchedule() {
        return this.notebookUpgradeSchedule == null ? Input.empty() : this.notebookUpgradeSchedule;
    }

    /**
     * Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`).
     * 
     */
    @InputImport(name="postStartupScript")
      private final @Nullable Input<String> postStartupScript;

    public Input<String> getPostStartupScript() {
        return this.postStartupScript == null ? Input.empty() : this.postStartupScript;
    }

    public RuntimeSoftwareConfigArgs(
        @Nullable Input<String> customGpuDriverPath,
        @Nullable Input<Boolean> enableHealthMonitoring,
        @Nullable Input<Boolean> idleShutdown,
        @Nullable Input<Integer> idleShutdownTimeout,
        @Nullable Input<Boolean> installGpuDriver,
        @Nullable Input<List<ContainerImageArgs>> kernels,
        @Nullable Input<String> notebookUpgradeSchedule,
        @Nullable Input<String> postStartupScript) {
        this.customGpuDriverPath = customGpuDriverPath;
        this.enableHealthMonitoring = enableHealthMonitoring;
        this.idleShutdown = idleShutdown;
        this.idleShutdownTimeout = idleShutdownTimeout;
        this.installGpuDriver = installGpuDriver;
        this.kernels = kernels;
        this.notebookUpgradeSchedule = notebookUpgradeSchedule;
        this.postStartupScript = postStartupScript;
    }

    private RuntimeSoftwareConfigArgs() {
        this.customGpuDriverPath = Input.empty();
        this.enableHealthMonitoring = Input.empty();
        this.idleShutdown = Input.empty();
        this.idleShutdownTimeout = Input.empty();
        this.installGpuDriver = Input.empty();
        this.kernels = Input.empty();
        this.notebookUpgradeSchedule = Input.empty();
        this.postStartupScript = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeSoftwareConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customGpuDriverPath;
        private @Nullable Input<Boolean> enableHealthMonitoring;
        private @Nullable Input<Boolean> idleShutdown;
        private @Nullable Input<Integer> idleShutdownTimeout;
        private @Nullable Input<Boolean> installGpuDriver;
        private @Nullable Input<List<ContainerImageArgs>> kernels;
        private @Nullable Input<String> notebookUpgradeSchedule;
        private @Nullable Input<String> postStartupScript;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeSoftwareConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customGpuDriverPath = defaults.customGpuDriverPath;
    	      this.enableHealthMonitoring = defaults.enableHealthMonitoring;
    	      this.idleShutdown = defaults.idleShutdown;
    	      this.idleShutdownTimeout = defaults.idleShutdownTimeout;
    	      this.installGpuDriver = defaults.installGpuDriver;
    	      this.kernels = defaults.kernels;
    	      this.notebookUpgradeSchedule = defaults.notebookUpgradeSchedule;
    	      this.postStartupScript = defaults.postStartupScript;
        }

        public Builder setCustomGpuDriverPath(@Nullable Input<String> customGpuDriverPath) {
            this.customGpuDriverPath = customGpuDriverPath;
            return this;
        }

        public Builder setCustomGpuDriverPath(@Nullable String customGpuDriverPath) {
            this.customGpuDriverPath = Input.ofNullable(customGpuDriverPath);
            return this;
        }

        public Builder setEnableHealthMonitoring(@Nullable Input<Boolean> enableHealthMonitoring) {
            this.enableHealthMonitoring = enableHealthMonitoring;
            return this;
        }

        public Builder setEnableHealthMonitoring(@Nullable Boolean enableHealthMonitoring) {
            this.enableHealthMonitoring = Input.ofNullable(enableHealthMonitoring);
            return this;
        }

        public Builder setIdleShutdown(@Nullable Input<Boolean> idleShutdown) {
            this.idleShutdown = idleShutdown;
            return this;
        }

        public Builder setIdleShutdown(@Nullable Boolean idleShutdown) {
            this.idleShutdown = Input.ofNullable(idleShutdown);
            return this;
        }

        public Builder setIdleShutdownTimeout(@Nullable Input<Integer> idleShutdownTimeout) {
            this.idleShutdownTimeout = idleShutdownTimeout;
            return this;
        }

        public Builder setIdleShutdownTimeout(@Nullable Integer idleShutdownTimeout) {
            this.idleShutdownTimeout = Input.ofNullable(idleShutdownTimeout);
            return this;
        }

        public Builder setInstallGpuDriver(@Nullable Input<Boolean> installGpuDriver) {
            this.installGpuDriver = installGpuDriver;
            return this;
        }

        public Builder setInstallGpuDriver(@Nullable Boolean installGpuDriver) {
            this.installGpuDriver = Input.ofNullable(installGpuDriver);
            return this;
        }

        public Builder setKernels(@Nullable Input<List<ContainerImageArgs>> kernels) {
            this.kernels = kernels;
            return this;
        }

        public Builder setKernels(@Nullable List<ContainerImageArgs> kernels) {
            this.kernels = Input.ofNullable(kernels);
            return this;
        }

        public Builder setNotebookUpgradeSchedule(@Nullable Input<String> notebookUpgradeSchedule) {
            this.notebookUpgradeSchedule = notebookUpgradeSchedule;
            return this;
        }

        public Builder setNotebookUpgradeSchedule(@Nullable String notebookUpgradeSchedule) {
            this.notebookUpgradeSchedule = Input.ofNullable(notebookUpgradeSchedule);
            return this;
        }

        public Builder setPostStartupScript(@Nullable Input<String> postStartupScript) {
            this.postStartupScript = postStartupScript;
            return this;
        }

        public Builder setPostStartupScript(@Nullable String postStartupScript) {
            this.postStartupScript = Input.ofNullable(postStartupScript);
            return this;
        }
        public RuntimeSoftwareConfigArgs build() {
            return new RuntimeSoftwareConfigArgs(customGpuDriverPath, enableHealthMonitoring, idleShutdown, idleShutdownTimeout, installGpuDriver, kernels, notebookUpgradeSchedule, postStartupScript);
        }
    }
}
