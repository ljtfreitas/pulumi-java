// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuntimeSoftwareConfig {
    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we'll automatically choose from official GPU drivers.
     * 
     */
    private final @Nullable String customGpuDriverPath;
    /**
     * Verifies core internal services are running. Default: True.
     * 
     */
    private final @Nullable Boolean enableHealthMonitoring;
    /**
     * Runtime will automatically shutdown after idle_shutdown_time.
     * Default: True
     * 
     */
    private final @Nullable Boolean idleShutdown;
    /**
     * Time in minutes to wait before shuting down runtime.
     * Default: 180 minutes
     * 
     */
    private final @Nullable Integer idleShutdownTimeout;
    /**
     * Install Nvidia Driver automatically.
     * 
     */
    private final @Nullable Boolean installGpuDriver;
    /**
     * Cron expression in UTC timezone for schedule instance auto upgrade.
     * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * 
     */
    private final @Nullable String notebookUpgradeSchedule;
    /**
     * Path to a Bash script that automatically runs after a notebook instance
     * fully boots up. The path must be a URL or
     * Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    private final @Nullable String postStartupScript;

    @OutputCustomType.Constructor({"customGpuDriverPath","enableHealthMonitoring","idleShutdown","idleShutdownTimeout","installGpuDriver","notebookUpgradeSchedule","postStartupScript"})
    private RuntimeSoftwareConfig(
        @Nullable String customGpuDriverPath,
        @Nullable Boolean enableHealthMonitoring,
        @Nullable Boolean idleShutdown,
        @Nullable Integer idleShutdownTimeout,
        @Nullable Boolean installGpuDriver,
        @Nullable String notebookUpgradeSchedule,
        @Nullable String postStartupScript) {
        this.customGpuDriverPath = customGpuDriverPath;
        this.enableHealthMonitoring = enableHealthMonitoring;
        this.idleShutdown = idleShutdown;
        this.idleShutdownTimeout = idleShutdownTimeout;
        this.installGpuDriver = installGpuDriver;
        this.notebookUpgradeSchedule = notebookUpgradeSchedule;
        this.postStartupScript = postStartupScript;
    }

    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we'll automatically choose from official GPU drivers.
     * 
     */
    public Optional<String> getCustomGpuDriverPath() {
        return Optional.ofNullable(this.customGpuDriverPath);
    }
    /**
     * Verifies core internal services are running. Default: True.
     * 
     */
    public Optional<Boolean> getEnableHealthMonitoring() {
        return Optional.ofNullable(this.enableHealthMonitoring);
    }
    /**
     * Runtime will automatically shutdown after idle_shutdown_time.
     * Default: True
     * 
     */
    public Optional<Boolean> getIdleShutdown() {
        return Optional.ofNullable(this.idleShutdown);
    }
    /**
     * Time in minutes to wait before shuting down runtime.
     * Default: 180 minutes
     * 
     */
    public Optional<Integer> getIdleShutdownTimeout() {
        return Optional.ofNullable(this.idleShutdownTimeout);
    }
    /**
     * Install Nvidia Driver automatically.
     * 
     */
    public Optional<Boolean> getInstallGpuDriver() {
        return Optional.ofNullable(this.installGpuDriver);
    }
    /**
     * Cron expression in UTC timezone for schedule instance auto upgrade.
     * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * 
     */
    public Optional<String> getNotebookUpgradeSchedule() {
        return Optional.ofNullable(this.notebookUpgradeSchedule);
    }
    /**
     * Path to a Bash script that automatically runs after a notebook instance
     * fully boots up. The path must be a URL or
     * Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    public Optional<String> getPostStartupScript() {
        return Optional.ofNullable(this.postStartupScript);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeSoftwareConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customGpuDriverPath;
        private @Nullable Boolean enableHealthMonitoring;
        private @Nullable Boolean idleShutdown;
        private @Nullable Integer idleShutdownTimeout;
        private @Nullable Boolean installGpuDriver;
        private @Nullable String notebookUpgradeSchedule;
        private @Nullable String postStartupScript;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeSoftwareConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customGpuDriverPath = defaults.customGpuDriverPath;
    	      this.enableHealthMonitoring = defaults.enableHealthMonitoring;
    	      this.idleShutdown = defaults.idleShutdown;
    	      this.idleShutdownTimeout = defaults.idleShutdownTimeout;
    	      this.installGpuDriver = defaults.installGpuDriver;
    	      this.notebookUpgradeSchedule = defaults.notebookUpgradeSchedule;
    	      this.postStartupScript = defaults.postStartupScript;
        }

        public Builder setCustomGpuDriverPath(@Nullable String customGpuDriverPath) {
            this.customGpuDriverPath = customGpuDriverPath;
            return this;
        }

        public Builder setEnableHealthMonitoring(@Nullable Boolean enableHealthMonitoring) {
            this.enableHealthMonitoring = enableHealthMonitoring;
            return this;
        }

        public Builder setIdleShutdown(@Nullable Boolean idleShutdown) {
            this.idleShutdown = idleShutdown;
            return this;
        }

        public Builder setIdleShutdownTimeout(@Nullable Integer idleShutdownTimeout) {
            this.idleShutdownTimeout = idleShutdownTimeout;
            return this;
        }

        public Builder setInstallGpuDriver(@Nullable Boolean installGpuDriver) {
            this.installGpuDriver = installGpuDriver;
            return this;
        }

        public Builder setNotebookUpgradeSchedule(@Nullable String notebookUpgradeSchedule) {
            this.notebookUpgradeSchedule = notebookUpgradeSchedule;
            return this;
        }

        public Builder setPostStartupScript(@Nullable String postStartupScript) {
            this.postStartupScript = postStartupScript;
            return this;
        }
        public RuntimeSoftwareConfig build() {
            return new RuntimeSoftwareConfig(customGpuDriverPath, enableHealthMonitoring, idleShutdown, idleShutdownTimeout, installGpuDriver, notebookUpgradeSchedule, postStartupScript);
        }
    }
}
