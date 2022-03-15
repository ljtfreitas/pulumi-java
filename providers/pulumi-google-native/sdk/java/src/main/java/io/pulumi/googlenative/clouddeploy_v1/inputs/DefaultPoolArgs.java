// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Execution using the default Cloud Build pool.
 * 
 */
public final class DefaultPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultPoolArgs Empty = new DefaultPoolArgs();

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
     * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    public DefaultPoolArgs(
        @Nullable Output<String> artifactStorage,
        @Nullable Output<String> serviceAccount) {
        this.artifactStorage = artifactStorage;
        this.serviceAccount = serviceAccount;
    }

    private DefaultPoolArgs() {
        this.artifactStorage = Output.empty();
        this.serviceAccount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> artifactStorage;
        private @Nullable Output<String> serviceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactStorage = defaults.artifactStorage;
    	      this.serviceAccount = defaults.serviceAccount;
        }

        public Builder artifactStorage(@Nullable Output<String> artifactStorage) {
            this.artifactStorage = artifactStorage;
            return this;
        }

        public Builder artifactStorage(@Nullable String artifactStorage) {
            this.artifactStorage = Output.ofNullable(artifactStorage);
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
        public DefaultPoolArgs build() {
            return new DefaultPoolArgs(artifactStorage, serviceAccount);
        }
    }
}
