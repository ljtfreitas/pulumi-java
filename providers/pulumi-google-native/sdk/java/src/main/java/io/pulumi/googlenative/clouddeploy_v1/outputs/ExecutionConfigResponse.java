// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.clouddeploy_v1.outputs.DefaultPoolResponse;
import io.pulumi.googlenative.clouddeploy_v1.outputs.PrivatePoolResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ExecutionConfigResponse {
    /**
     * Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified, a default bucket located in the same region will be used.
     * 
     */
    private final String artifactStorage;
    /**
     * Optional. Use default Cloud Build pool.
     * 
     */
    private final DefaultPoolResponse defaultPool;
    /**
     * Optional. Use private Cloud Build pool.
     * 
     */
    private final PrivatePoolResponse privatePool;
    /**
     * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    private final String serviceAccount;
    /**
     * Usages when this configuration should be applied.
     * 
     */
    private final List<String> usages;
    /**
     * Optional. The resource name of the `WorkerPool`, with the format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. If this optional field is unspecified, the default Cloud Build pool will be used.
     * 
     */
    private final String workerPool;

    @CustomType.Constructor
    private ExecutionConfigResponse(
        @CustomType.Parameter("artifactStorage") String artifactStorage,
        @CustomType.Parameter("defaultPool") DefaultPoolResponse defaultPool,
        @CustomType.Parameter("privatePool") PrivatePoolResponse privatePool,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("usages") List<String> usages,
        @CustomType.Parameter("workerPool") String workerPool) {
        this.artifactStorage = artifactStorage;
        this.defaultPool = defaultPool;
        this.privatePool = privatePool;
        this.serviceAccount = serviceAccount;
        this.usages = usages;
        this.workerPool = workerPool;
    }

    /**
     * Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified, a default bucket located in the same region will be used.
     * 
    */
    public String getArtifactStorage() {
        return this.artifactStorage;
    }
    /**
     * Optional. Use default Cloud Build pool.
     * 
    */
    public DefaultPoolResponse getDefaultPool() {
        return this.defaultPool;
    }
    /**
     * Optional. Use private Cloud Build pool.
     * 
    */
    public PrivatePoolResponse getPrivatePool() {
        return this.privatePool;
    }
    /**
     * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Usages when this configuration should be applied.
     * 
    */
    public List<String> getUsages() {
        return this.usages;
    }
    /**
     * Optional. The resource name of the `WorkerPool`, with the format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. If this optional field is unspecified, the default Cloud Build pool will be used.
     * 
    */
    public String getWorkerPool() {
        return this.workerPool;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactStorage;
        private DefaultPoolResponse defaultPool;
        private PrivatePoolResponse privatePool;
        private String serviceAccount;
        private List<String> usages;
        private String workerPool;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactStorage = defaults.artifactStorage;
    	      this.defaultPool = defaults.defaultPool;
    	      this.privatePool = defaults.privatePool;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.usages = defaults.usages;
    	      this.workerPool = defaults.workerPool;
        }

        public Builder artifactStorage(String artifactStorage) {
            this.artifactStorage = Objects.requireNonNull(artifactStorage);
            return this;
        }

        public Builder defaultPool(DefaultPoolResponse defaultPool) {
            this.defaultPool = Objects.requireNonNull(defaultPool);
            return this;
        }

        public Builder privatePool(PrivatePoolResponse privatePool) {
            this.privatePool = Objects.requireNonNull(privatePool);
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder usages(List<String> usages) {
            this.usages = Objects.requireNonNull(usages);
            return this;
        }

        public Builder workerPool(String workerPool) {
            this.workerPool = Objects.requireNonNull(workerPool);
            return this;
        }
        public ExecutionConfigResponse build() {
            return new ExecutionConfigResponse(artifactStorage, defaultPool, privatePool, serviceAccount, usages, workerPool);
        }
    }
}
