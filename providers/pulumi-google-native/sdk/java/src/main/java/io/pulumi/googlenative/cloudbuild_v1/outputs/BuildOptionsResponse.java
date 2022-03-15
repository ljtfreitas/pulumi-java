// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudbuild_v1.outputs.PoolOptionResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.VolumeResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BuildOptionsResponse {
    /**
     * Requested disk size for the VM that runs the build. Note that this is *NOT* "disk free"; some of the space will be used by the operating system and build utilities. Also note that this is the minimum disk size that will be allocated for the build -- the build may run with a larger disk than requested. At present, the maximum disk size is 1000GB; builds that request more than the maximum are rejected with an error.
     * 
     */
    private final String diskSizeGb;
    /**
     * Option to specify whether or not to apply bash style string operations to the substitutions. NOTE: this is always enabled for triggered builds and cannot be overridden in the build configuration file.
     * 
     */
    private final Boolean dynamicSubstitutions;
    /**
     * A list of global environment variable definitions that will exist for all build steps in this build. If a variable is defined in both globally and in a build step, the variable will use the build step value. The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
     * 
     */
    private final List<String> env;
    /**
     * Option to define build log streaming behavior to Google Cloud Storage.
     * 
     */
    private final String logStreamingOption;
    /**
     * Option to specify the logging mode, which determines if and where build logs are stored.
     * 
     */
    private final String logging;
    /**
     * Compute Engine machine type on which to run the build.
     * 
     */
    private final String machineType;
    /**
     * Optional. Specification for execution on a `WorkerPool`. See [running builds in a private pool](https://cloud.google.com/build/docs/private-pools/run-builds-in-private-pool) for more information.
     * 
     */
    private final PoolOptionResponse pool;
    /**
     * Requested verifiability options.
     * 
     */
    private final String requestedVerifyOption;
    /**
     * A list of global environment variables, which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build's `Secret`. These variables will be available to all build steps in this build.
     * 
     */
    private final List<String> secretEnv;
    /**
     * Requested hash for SourceProvenance.
     * 
     */
    private final List<String> sourceProvenanceHash;
    /**
     * Option to specify behavior when there is an error in the substitution checks. NOTE: this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden in the build configuration file.
     * 
     */
    private final String substitutionOption;
    /**
     * Global list of volumes to mount for ALL build steps Each volume is created as an empty volume prior to starting the build process. Upon completion of the build, volumes and their contents are discarded. Global volume names and paths cannot conflict with the volumes defined a build step. Using a global volume in a build with only one step is not valid as it is indicative of a build request with an incorrect configuration.
     * 
     */
    private final List<VolumeResponse> volumes;
    /**
     * This field deprecated; please use `pool.name` instead.
     * 
     */
    private final String workerPool;

    @CustomType.Constructor
    private BuildOptionsResponse(
        @CustomType.Parameter("diskSizeGb") String diskSizeGb,
        @CustomType.Parameter("dynamicSubstitutions") Boolean dynamicSubstitutions,
        @CustomType.Parameter("env") List<String> env,
        @CustomType.Parameter("logStreamingOption") String logStreamingOption,
        @CustomType.Parameter("logging") String logging,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("pool") PoolOptionResponse pool,
        @CustomType.Parameter("requestedVerifyOption") String requestedVerifyOption,
        @CustomType.Parameter("secretEnv") List<String> secretEnv,
        @CustomType.Parameter("sourceProvenanceHash") List<String> sourceProvenanceHash,
        @CustomType.Parameter("substitutionOption") String substitutionOption,
        @CustomType.Parameter("volumes") List<VolumeResponse> volumes,
        @CustomType.Parameter("workerPool") String workerPool) {
        this.diskSizeGb = diskSizeGb;
        this.dynamicSubstitutions = dynamicSubstitutions;
        this.env = env;
        this.logStreamingOption = logStreamingOption;
        this.logging = logging;
        this.machineType = machineType;
        this.pool = pool;
        this.requestedVerifyOption = requestedVerifyOption;
        this.secretEnv = secretEnv;
        this.sourceProvenanceHash = sourceProvenanceHash;
        this.substitutionOption = substitutionOption;
        this.volumes = volumes;
        this.workerPool = workerPool;
    }

    /**
     * Requested disk size for the VM that runs the build. Note that this is *NOT* "disk free"; some of the space will be used by the operating system and build utilities. Also note that this is the minimum disk size that will be allocated for the build -- the build may run with a larger disk than requested. At present, the maximum disk size is 1000GB; builds that request more than the maximum are rejected with an error.
     * 
    */
    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Option to specify whether or not to apply bash style string operations to the substitutions. NOTE: this is always enabled for triggered builds and cannot be overridden in the build configuration file.
     * 
    */
    public Boolean getDynamicSubstitutions() {
        return this.dynamicSubstitutions;
    }
    /**
     * A list of global environment variable definitions that will exist for all build steps in this build. If a variable is defined in both globally and in a build step, the variable will use the build step value. The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
     * 
    */
    public List<String> getEnv() {
        return this.env;
    }
    /**
     * Option to define build log streaming behavior to Google Cloud Storage.
     * 
    */
    public String getLogStreamingOption() {
        return this.logStreamingOption;
    }
    /**
     * Option to specify the logging mode, which determines if and where build logs are stored.
     * 
    */
    public String getLogging() {
        return this.logging;
    }
    /**
     * Compute Engine machine type on which to run the build.
     * 
    */
    public String getMachineType() {
        return this.machineType;
    }
    /**
     * Optional. Specification for execution on a `WorkerPool`. See [running builds in a private pool](https://cloud.google.com/build/docs/private-pools/run-builds-in-private-pool) for more information.
     * 
    */
    public PoolOptionResponse getPool() {
        return this.pool;
    }
    /**
     * Requested verifiability options.
     * 
    */
    public String getRequestedVerifyOption() {
        return this.requestedVerifyOption;
    }
    /**
     * A list of global environment variables, which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build's `Secret`. These variables will be available to all build steps in this build.
     * 
    */
    public List<String> getSecretEnv() {
        return this.secretEnv;
    }
    /**
     * Requested hash for SourceProvenance.
     * 
    */
    public List<String> getSourceProvenanceHash() {
        return this.sourceProvenanceHash;
    }
    /**
     * Option to specify behavior when there is an error in the substitution checks. NOTE: this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden in the build configuration file.
     * 
    */
    public String getSubstitutionOption() {
        return this.substitutionOption;
    }
    /**
     * Global list of volumes to mount for ALL build steps Each volume is created as an empty volume prior to starting the build process. Upon completion of the build, volumes and their contents are discarded. Global volume names and paths cannot conflict with the volumes defined a build step. Using a global volume in a build with only one step is not valid as it is indicative of a build request with an incorrect configuration.
     * 
    */
    public List<VolumeResponse> getVolumes() {
        return this.volumes;
    }
    /**
     * This field deprecated; please use `pool.name` instead.
     * 
    */
    public String getWorkerPool() {
        return this.workerPool;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskSizeGb;
        private Boolean dynamicSubstitutions;
        private List<String> env;
        private String logStreamingOption;
        private String logging;
        private String machineType;
        private PoolOptionResponse pool;
        private String requestedVerifyOption;
        private List<String> secretEnv;
        private List<String> sourceProvenanceHash;
        private String substitutionOption;
        private List<VolumeResponse> volumes;
        private String workerPool;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.dynamicSubstitutions = defaults.dynamicSubstitutions;
    	      this.env = defaults.env;
    	      this.logStreamingOption = defaults.logStreamingOption;
    	      this.logging = defaults.logging;
    	      this.machineType = defaults.machineType;
    	      this.pool = defaults.pool;
    	      this.requestedVerifyOption = defaults.requestedVerifyOption;
    	      this.secretEnv = defaults.secretEnv;
    	      this.sourceProvenanceHash = defaults.sourceProvenanceHash;
    	      this.substitutionOption = defaults.substitutionOption;
    	      this.volumes = defaults.volumes;
    	      this.workerPool = defaults.workerPool;
        }

        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder dynamicSubstitutions(Boolean dynamicSubstitutions) {
            this.dynamicSubstitutions = Objects.requireNonNull(dynamicSubstitutions);
            return this;
        }

        public Builder env(List<String> env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder logStreamingOption(String logStreamingOption) {
            this.logStreamingOption = Objects.requireNonNull(logStreamingOption);
            return this;
        }

        public Builder logging(String logging) {
            this.logging = Objects.requireNonNull(logging);
            return this;
        }

        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder pool(PoolOptionResponse pool) {
            this.pool = Objects.requireNonNull(pool);
            return this;
        }

        public Builder requestedVerifyOption(String requestedVerifyOption) {
            this.requestedVerifyOption = Objects.requireNonNull(requestedVerifyOption);
            return this;
        }

        public Builder secretEnv(List<String> secretEnv) {
            this.secretEnv = Objects.requireNonNull(secretEnv);
            return this;
        }

        public Builder sourceProvenanceHash(List<String> sourceProvenanceHash) {
            this.sourceProvenanceHash = Objects.requireNonNull(sourceProvenanceHash);
            return this;
        }

        public Builder substitutionOption(String substitutionOption) {
            this.substitutionOption = Objects.requireNonNull(substitutionOption);
            return this;
        }

        public Builder volumes(List<VolumeResponse> volumes) {
            this.volumes = Objects.requireNonNull(volumes);
            return this;
        }

        public Builder workerPool(String workerPool) {
            this.workerPool = Objects.requireNonNull(workerPool);
            return this;
        }
        public BuildOptionsResponse build() {
            return new BuildOptionsResponse(diskSizeGb, dynamicSubstitutions, env, logStreamingOption, logging, machineType, pool, requestedVerifyOption, secretEnv, sourceProvenanceHash, substitutionOption, volumes, workerPool);
        }
    }
}
