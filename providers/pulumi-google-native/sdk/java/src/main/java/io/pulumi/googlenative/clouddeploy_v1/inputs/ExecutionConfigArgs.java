// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.clouddeploy_v1.enums.ExecutionConfigUsagesItem;
import io.pulumi.googlenative.clouddeploy_v1.inputs.DefaultPoolArgs;
import io.pulumi.googlenative.clouddeploy_v1.inputs.PrivatePoolArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration of the environment to use when calling Skaffold.
 * 
 */
public final class ExecutionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecutionConfigArgs Empty = new ExecutionConfigArgs();

    /**
     * Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified, a default bucket located in the same region will be used.
     * 
     */
    @InputImport(name="artifactStorage")
      private final @Nullable Input<String> artifactStorage;

    public Input<String> getArtifactStorage() {
        return this.artifactStorage == null ? Input.empty() : this.artifactStorage;
    }

    /**
     * Optional. Use default Cloud Build pool.
     * 
     */
    @InputImport(name="defaultPool")
      private final @Nullable Input<DefaultPoolArgs> defaultPool;

    public Input<DefaultPoolArgs> getDefaultPool() {
        return this.defaultPool == null ? Input.empty() : this.defaultPool;
    }

    /**
     * Optional. Use private Cloud Build pool.
     * 
     */
    @InputImport(name="privatePool")
      private final @Nullable Input<PrivatePoolArgs> privatePool;

    public Input<PrivatePoolArgs> getPrivatePool() {
        return this.privatePool == null ? Input.empty() : this.privatePool;
    }

    /**
     * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Usages when this configuration should be applied.
     * 
     */
    @InputImport(name="usages", required=true)
      private final Input<List<ExecutionConfigUsagesItem>> usages;

    public Input<List<ExecutionConfigUsagesItem>> getUsages() {
        return this.usages;
    }

    /**
     * Optional. The resource name of the `WorkerPool`, with the format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. If this optional field is unspecified, the default Cloud Build pool will be used.
     * 
     */
    @InputImport(name="workerPool")
      private final @Nullable Input<String> workerPool;

    public Input<String> getWorkerPool() {
        return this.workerPool == null ? Input.empty() : this.workerPool;
    }

    public ExecutionConfigArgs(
        @Nullable Input<String> artifactStorage,
        @Nullable Input<DefaultPoolArgs> defaultPool,
        @Nullable Input<PrivatePoolArgs> privatePool,
        @Nullable Input<String> serviceAccount,
        Input<List<ExecutionConfigUsagesItem>> usages,
        @Nullable Input<String> workerPool) {
        this.artifactStorage = artifactStorage;
        this.defaultPool = defaultPool;
        this.privatePool = privatePool;
        this.serviceAccount = serviceAccount;
        this.usages = Objects.requireNonNull(usages, "expected parameter 'usages' to be non-null");
        this.workerPool = workerPool;
    }

    private ExecutionConfigArgs() {
        this.artifactStorage = Input.empty();
        this.defaultPool = Input.empty();
        this.privatePool = Input.empty();
        this.serviceAccount = Input.empty();
        this.usages = Input.empty();
        this.workerPool = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> artifactStorage;
        private @Nullable Input<DefaultPoolArgs> defaultPool;
        private @Nullable Input<PrivatePoolArgs> privatePool;
        private @Nullable Input<String> serviceAccount;
        private Input<List<ExecutionConfigUsagesItem>> usages;
        private @Nullable Input<String> workerPool;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactStorage = defaults.artifactStorage;
    	      this.defaultPool = defaults.defaultPool;
    	      this.privatePool = defaults.privatePool;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.usages = defaults.usages;
    	      this.workerPool = defaults.workerPool;
        }

        public Builder setArtifactStorage(@Nullable Input<String> artifactStorage) {
            this.artifactStorage = artifactStorage;
            return this;
        }

        public Builder setArtifactStorage(@Nullable String artifactStorage) {
            this.artifactStorage = Input.ofNullable(artifactStorage);
            return this;
        }

        public Builder setDefaultPool(@Nullable Input<DefaultPoolArgs> defaultPool) {
            this.defaultPool = defaultPool;
            return this;
        }

        public Builder setDefaultPool(@Nullable DefaultPoolArgs defaultPool) {
            this.defaultPool = Input.ofNullable(defaultPool);
            return this;
        }

        public Builder setPrivatePool(@Nullable Input<PrivatePoolArgs> privatePool) {
            this.privatePool = privatePool;
            return this;
        }

        public Builder setPrivatePool(@Nullable PrivatePoolArgs privatePool) {
            this.privatePool = Input.ofNullable(privatePool);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setUsages(Input<List<ExecutionConfigUsagesItem>> usages) {
            this.usages = Objects.requireNonNull(usages);
            return this;
        }

        public Builder setUsages(List<ExecutionConfigUsagesItem> usages) {
            this.usages = Input.of(Objects.requireNonNull(usages));
            return this;
        }

        public Builder setWorkerPool(@Nullable Input<String> workerPool) {
            this.workerPool = workerPool;
            return this;
        }

        public Builder setWorkerPool(@Nullable String workerPool) {
            this.workerPool = Input.ofNullable(workerPool);
            return this;
        }
        public ExecutionConfigArgs build() {
            return new ExecutionConfigArgs(artifactStorage, defaultPool, privatePool, serviceAccount, usages, workerPool);
        }
    }
}
