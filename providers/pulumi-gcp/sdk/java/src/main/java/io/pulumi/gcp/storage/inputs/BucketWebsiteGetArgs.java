// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketWebsiteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketWebsiteGetArgs Empty = new BucketWebsiteGetArgs();

    /**
     * Behaves as the bucket's directory index where
     * missing objects are treated as potential directories.
     * 
     */
    @Import(name="mainPageSuffix")
      private final @Nullable Output<String> mainPageSuffix;

    public Output<String> getMainPageSuffix() {
        return this.mainPageSuffix == null ? Output.empty() : this.mainPageSuffix;
    }

    /**
     * The custom object to return when a requested
     * resource is not found.
     * 
     */
    @Import(name="notFoundPage")
      private final @Nullable Output<String> notFoundPage;

    public Output<String> getNotFoundPage() {
        return this.notFoundPage == null ? Output.empty() : this.notFoundPage;
    }

    public BucketWebsiteGetArgs(
        @Nullable Output<String> mainPageSuffix,
        @Nullable Output<String> notFoundPage) {
        this.mainPageSuffix = mainPageSuffix;
        this.notFoundPage = notFoundPage;
    }

    private BucketWebsiteGetArgs() {
        this.mainPageSuffix = Output.empty();
        this.notFoundPage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketWebsiteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> mainPageSuffix;
        private @Nullable Output<String> notFoundPage;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketWebsiteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mainPageSuffix = defaults.mainPageSuffix;
    	      this.notFoundPage = defaults.notFoundPage;
        }

        public Builder mainPageSuffix(@Nullable Output<String> mainPageSuffix) {
            this.mainPageSuffix = mainPageSuffix;
            return this;
        }

        public Builder mainPageSuffix(@Nullable String mainPageSuffix) {
            this.mainPageSuffix = Output.ofNullable(mainPageSuffix);
            return this;
        }

        public Builder notFoundPage(@Nullable Output<String> notFoundPage) {
            this.notFoundPage = notFoundPage;
            return this;
        }

        public Builder notFoundPage(@Nullable String notFoundPage) {
            this.notFoundPage = Output.ofNullable(notFoundPage);
            return this;
        }
        public BucketWebsiteGetArgs build() {
            return new BucketWebsiteGetArgs(mainPageSuffix, notFoundPage);
        }
    }
}
