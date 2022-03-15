// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A GitSourceContext denotes a particular revision in a third party Git repository (e.g., GitHub).
 * 
 */
public final class GitSourceContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final GitSourceContextArgs Empty = new GitSourceContextArgs();

    /**
     * Git commit hash.
     * 
     */
    @Import(name="revisionId")
      private final @Nullable Output<String> revisionId;

    public Output<String> getRevisionId() {
        return this.revisionId == null ? Output.empty() : this.revisionId;
    }

    /**
     * Git repository URL.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> getUrl() {
        return this.url == null ? Output.empty() : this.url;
    }

    public GitSourceContextArgs(
        @Nullable Output<String> revisionId,
        @Nullable Output<String> url) {
        this.revisionId = revisionId;
        this.url = url;
    }

    private GitSourceContextArgs() {
        this.revisionId = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitSourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> revisionId;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(GitSourceContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revisionId = defaults.revisionId;
    	      this.url = defaults.url;
        }

        public Builder revisionId(@Nullable Output<String> revisionId) {
            this.revisionId = revisionId;
            return this;
        }

        public Builder revisionId(@Nullable String revisionId) {
            this.revisionId = Output.ofNullable(revisionId);
            return this;
        }

        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = Output.ofNullable(url);
            return this;
        }
        public GitSourceContextArgs build() {
            return new GitSourceContextArgs(revisionId, url);
        }
    }
}
