// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="artifactStorage")
      private final @Nullable Output<String> artifactStorage;

    public Output<String> getArtifactStorage() {
        return this.artifactStorage == null ? Output.empty() : this.artifactStorage;
    }

    /**
     * Optional. Use default Cloud Build pool.
     * 
     */
    @Import(name="defaultPool")
      private final @Nullable Output<DefaultPoolArgs> defaultPool;

    public Output<DefaultPoolArgs> getDefaultPool() {
        return this.defaultPool == null ? Output.empty() : this.defaultPool;
    }

    /**
     * Optional. Use private Cloud Build pool.
     * 
     */
    @Import(name="privatePool")
      private final @Nullable Output<PrivatePoolArgs> privatePool;

    public Output<PrivatePoolArgs> getPrivatePool() {
        return this.privatePool == null ? Output.empty() : this.privatePool;
    }

    /**
     * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    /**
     * Usages when this configuration should be applied.
     * 
     */
    @Import(name="usages", required=true)
      private final Output<List<ExecutionConfigUsagesItem>> usages;

    public Output<List<ExecutionConfigUsagesItem>> getUsages() {
        return this.usages;
    }

    /**
     * Optional. The resource name of the `WorkerPool`, with the format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. If this optional field is unspecified, the default Cloud Build pool will be used.
     * 
     */
    @Import(name="workerPool")
      private final @Nullable Output<String> workerPool;

    public Output<String> getWorkerPool() {
        return this.workerPool == null ? Output.empty() : this.workerPool;
    }

    public ExecutionConfigArgs(
        @Nullable Output<String> artifactStorage,
        @Nullable Output<DefaultPoolArgs> defaultPool,
        @Nullable Output<PrivatePoolArgs> privatePool,
        @Nullable Output<String> serviceAccount,
        Output<List<ExecutionConfigUsagesItem>> usages,
        @Nullable Output<String> workerPool) {
        this.artifactStorage = artifactStorage;
        this.defaultPool = defaultPool;
        this.privatePool = privatePool;
        this.serviceAccount = serviceAccount;
        this.usages = Objects.requireNonNull(usages, "expected parameter 'usages' to be non-null");
        this.workerPool = workerPool;
    }

    private ExecutionConfigArgs() {
        this.artifactStorage = Output.empty();
        this.defaultPool = Output.empty();
        this.privatePool = Output.empty();
        this.serviceAccount = Output.empty();
        this.usages = Output.empty();
        this.workerPool = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> artifactStorage;
        private @Nullable Output<DefaultPoolArgs> defaultPool;
        private @Nullable Output<PrivatePoolArgs> privatePool;
        private @Nullable Output<String> serviceAccount;
        private Output<List<ExecutionConfigUsagesItem>> usages;
        private @Nullable Output<String> workerPool;

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

        public Builder artifactStorage(@Nullable Output<String> artifactStorage) {
            this.artifactStorage = artifactStorage;
            return this;
        }

        public Builder artifactStorage(@Nullable String artifactStorage) {
            this.artifactStorage = Output.ofNullable(artifactStorage);
            return this;
        }

        public Builder defaultPool(@Nullable Output<DefaultPoolArgs> defaultPool) {
            this.defaultPool = defaultPool;
            return this;
        }

        public Builder defaultPool(@Nullable DefaultPoolArgs defaultPool) {
            this.defaultPool = Output.ofNullable(defaultPool);
            return this;
        }

        public Builder privatePool(@Nullable Output<PrivatePoolArgs> privatePool) {
            this.privatePool = privatePool;
            return this;
        }

        public Builder privatePool(@Nullable PrivatePoolArgs privatePool) {
            this.privatePool = Output.ofNullable(privatePool);
            return this;
        }

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Output.ofNullable(serviceAccount);
            return this;
        }

        public Builder usages(Output<List<ExecutionConfigUsagesItem>> usages) {
            this.usages = Objects.requireNonNull(usages);
            return this;
        }

        public Builder usages(List<ExecutionConfigUsagesItem> usages) {
            this.usages = Output.of(Objects.requireNonNull(usages));
            return this;
        }

        public Builder workerPool(@Nullable Output<String> workerPool) {
            this.workerPool = workerPool;
            return this;
        }

        public Builder workerPool(@Nullable String workerPool) {
            this.workerPool = Output.ofNullable(workerPool);
            return this;
        }
        public ExecutionConfigArgs build() {
            return new ExecutionConfigArgs(artifactStorage, defaultPool, privatePool, serviceAccount, usages, workerPool);
        }
    }
}
