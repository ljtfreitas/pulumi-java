// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Execution using a private Cloud Build pool.
 * 
 */
public final class PrivatePoolResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivatePoolResponse Empty = new PrivatePoolResponse();

    /**
     * Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified, a default bucket located in the same region will be used.
     * 
     */
    @Import(name="artifactStorage", required=true)
      private final String artifactStorage;

    public String getArtifactStorage() {
        return this.artifactStorage;
    }

    /**
     * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    @Import(name="serviceAccount", required=true)
      private final String serviceAccount;

    public String getServiceAccount() {
        return this.serviceAccount;
    }

    /**
     * Resource name of the Cloud Build worker pool to use. The format is `projects/{project}/locations/{location}/workerPools/{pool}`.
     * 
     */
    @Import(name="workerPool", required=true)
      private final String workerPool;

    public String getWorkerPool() {
        return this.workerPool;
    }

    public PrivatePoolResponse(
        String artifactStorage,
        String serviceAccount,
        String workerPool) {
        this.artifactStorage = Objects.requireNonNull(artifactStorage, "expected parameter 'artifactStorage' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.workerPool = Objects.requireNonNull(workerPool, "expected parameter 'workerPool' to be non-null");
    }

    private PrivatePoolResponse() {
        this.artifactStorage = null;
        this.serviceAccount = null;
        this.workerPool = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivatePoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactStorage;
        private String serviceAccount;
        private String workerPool;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivatePoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactStorage = defaults.artifactStorage;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.workerPool = defaults.workerPool;
        }

        public Builder artifactStorage(String artifactStorage) {
            this.artifactStorage = Objects.requireNonNull(artifactStorage);
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder workerPool(String workerPool) {
            this.workerPool = Objects.requireNonNull(workerPool);
            return this;
        }
        public PrivatePoolResponse build() {
            return new PrivatePoolResponse(artifactStorage, serviceAccount, workerPool);
        }
    }
}
