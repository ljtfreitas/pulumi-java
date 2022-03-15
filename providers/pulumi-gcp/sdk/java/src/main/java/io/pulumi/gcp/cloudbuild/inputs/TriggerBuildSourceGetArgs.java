// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceRepoSourceGetArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceStorageSourceGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerBuildSourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildSourceGetArgs Empty = new TriggerBuildSourceGetArgs();

    /**
     * Location of the source in a Google Cloud Source Repository.
     * Structure is documented below.
     * 
     */
    @Import(name="repoSource")
      private final @Nullable Output<TriggerBuildSourceRepoSourceGetArgs> repoSource;

    public Output<TriggerBuildSourceRepoSourceGetArgs> getRepoSource() {
        return this.repoSource == null ? Output.empty() : this.repoSource;
    }

    /**
     * Location of the source in an archive file in Google Cloud Storage.
     * Structure is documented below.
     * 
     */
    @Import(name="storageSource")
      private final @Nullable Output<TriggerBuildSourceStorageSourceGetArgs> storageSource;

    public Output<TriggerBuildSourceStorageSourceGetArgs> getStorageSource() {
        return this.storageSource == null ? Output.empty() : this.storageSource;
    }

    public TriggerBuildSourceGetArgs(
        @Nullable Output<TriggerBuildSourceRepoSourceGetArgs> repoSource,
        @Nullable Output<TriggerBuildSourceStorageSourceGetArgs> storageSource) {
        this.repoSource = repoSource;
        this.storageSource = storageSource;
    }

    private TriggerBuildSourceGetArgs() {
        this.repoSource = Output.empty();
        this.storageSource = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TriggerBuildSourceRepoSourceGetArgs> repoSource;
        private @Nullable Output<TriggerBuildSourceStorageSourceGetArgs> storageSource;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildSourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repoSource = defaults.repoSource;
    	      this.storageSource = defaults.storageSource;
        }

        public Builder repoSource(@Nullable Output<TriggerBuildSourceRepoSourceGetArgs> repoSource) {
            this.repoSource = repoSource;
            return this;
        }

        public Builder repoSource(@Nullable TriggerBuildSourceRepoSourceGetArgs repoSource) {
            this.repoSource = Output.ofNullable(repoSource);
            return this;
        }

        public Builder storageSource(@Nullable Output<TriggerBuildSourceStorageSourceGetArgs> storageSource) {
            this.storageSource = storageSource;
            return this;
        }

        public Builder storageSource(@Nullable TriggerBuildSourceStorageSourceGetArgs storageSource) {
            this.storageSource = Output.ofNullable(storageSource);
            return this;
        }
        public TriggerBuildSourceGetArgs build() {
            return new TriggerBuildSourceGetArgs(repoSource, storageSource);
        }
    }
}
