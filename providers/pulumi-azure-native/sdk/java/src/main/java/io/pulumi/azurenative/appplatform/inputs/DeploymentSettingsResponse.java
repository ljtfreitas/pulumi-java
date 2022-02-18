// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Deployment settings payload
 * 
 */
public final class DeploymentSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeploymentSettingsResponse Empty = new DeploymentSettingsResponse();

    /**
     * Required CPU, basic tier should be 1, standard tier should be in range (1, 4)
     * 
     */
    @InputImport(name="cpu")
    private final @Nullable Integer cpu;

    public Optional<Integer> getCpu() {
        return this.cpu == null ? Optional.empty() : Optional.ofNullable(this.cpu);
    }

    /**
     * Collection of environment variables
     * 
     */
    @InputImport(name="environmentVariables")
    private final @Nullable Map<String,String> environmentVariables;

    public Map<String,String> getEnvironmentVariables() {
        return this.environmentVariables == null ? Map.of() : this.environmentVariables;
    }

    /**
     * JVM parameter
     * 
     */
    @InputImport(name="jvmOptions")
    private final @Nullable String jvmOptions;

    public Optional<String> getJvmOptions() {
        return this.jvmOptions == null ? Optional.empty() : Optional.ofNullable(this.jvmOptions);
    }

    /**
     * Required Memory size in GB, basic tier should be in range (1, 2), standard tier should be in range (1, 8)
     * 
     */
    @InputImport(name="memoryInGB")
    private final @Nullable Integer memoryInGB;

    public Optional<Integer> getMemoryInGB() {
        return this.memoryInGB == null ? Optional.empty() : Optional.ofNullable(this.memoryInGB);
    }

    /**
     * The path to the .NET executable relative to zip root
     * 
     */
    @InputImport(name="netCoreMainEntryPath")
    private final @Nullable String netCoreMainEntryPath;

    public Optional<String> getNetCoreMainEntryPath() {
        return this.netCoreMainEntryPath == null ? Optional.empty() : Optional.ofNullable(this.netCoreMainEntryPath);
    }

    /**
     * Runtime version
     * 
     */
    @InputImport(name="runtimeVersion")
    private final @Nullable String runtimeVersion;

    public Optional<String> getRuntimeVersion() {
        return this.runtimeVersion == null ? Optional.empty() : Optional.ofNullable(this.runtimeVersion);
    }

    public DeploymentSettingsResponse(
        @Nullable Integer cpu,
        @Nullable Map<String,String> environmentVariables,
        @Nullable String jvmOptions,
        @Nullable Integer memoryInGB,
        @Nullable String netCoreMainEntryPath,
        @Nullable String runtimeVersion) {
        this.cpu = cpu == null ? 1 : cpu;
        this.environmentVariables = environmentVariables;
        this.jvmOptions = jvmOptions;
        this.memoryInGB = memoryInGB == null ? 1 : memoryInGB;
        this.netCoreMainEntryPath = netCoreMainEntryPath;
        this.runtimeVersion = runtimeVersion == null ? "Java_8" : runtimeVersion;
    }

    private DeploymentSettingsResponse() {
        this.cpu = null;
        this.environmentVariables = Map.of();
        this.jvmOptions = null;
        this.memoryInGB = null;
        this.netCoreMainEntryPath = null;
        this.runtimeVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer cpu;
        private @Nullable Map<String,String> environmentVariables;
        private @Nullable String jvmOptions;
        private @Nullable Integer memoryInGB;
        private @Nullable String netCoreMainEntryPath;
        private @Nullable String runtimeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.jvmOptions = defaults.jvmOptions;
    	      this.memoryInGB = defaults.memoryInGB;
    	      this.netCoreMainEntryPath = defaults.netCoreMainEntryPath;
    	      this.runtimeVersion = defaults.runtimeVersion;
        }

        public Builder setCpu(@Nullable Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setJvmOptions(@Nullable String jvmOptions) {
            this.jvmOptions = jvmOptions;
            return this;
        }

        public Builder setMemoryInGB(@Nullable Integer memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }

        public Builder setNetCoreMainEntryPath(@Nullable String netCoreMainEntryPath) {
            this.netCoreMainEntryPath = netCoreMainEntryPath;
            return this;
        }

        public Builder setRuntimeVersion(@Nullable String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }

        public DeploymentSettingsResponse build() {
            return new DeploymentSettingsResponse(cpu, environmentVariables, jvmOptions, memoryInGB, netCoreMainEntryPath, runtimeVersion);
        }
    }
}
