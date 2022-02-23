// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The zip file information for a zip deployment.
 * 
 */
public final class ZipInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ZipInfoArgs Empty = new ZipInfoArgs();

    /**
     * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
     * 
     */
    @InputImport(name="filesCount")
      private final @Nullable Input<Integer> filesCount;

    public Input<Integer> getFilesCount() {
        return this.filesCount == null ? Input.empty() : this.filesCount;
    }

    /**
     * URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form 'http(s)://storage.googleapis.com//'.
     * 
     */
    @InputImport(name="sourceUrl")
      private final @Nullable Input<String> sourceUrl;

    public Input<String> getSourceUrl() {
        return this.sourceUrl == null ? Input.empty() : this.sourceUrl;
    }

    public ZipInfoArgs(
        @Nullable Input<Integer> filesCount,
        @Nullable Input<String> sourceUrl) {
        this.filesCount = filesCount;
        this.sourceUrl = sourceUrl;
    }

    private ZipInfoArgs() {
        this.filesCount = Input.empty();
        this.sourceUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZipInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> filesCount;
        private @Nullable Input<String> sourceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ZipInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesCount = defaults.filesCount;
    	      this.sourceUrl = defaults.sourceUrl;
        }

        public Builder setFilesCount(@Nullable Input<Integer> filesCount) {
            this.filesCount = filesCount;
            return this;
        }

        public Builder setFilesCount(@Nullable Integer filesCount) {
            this.filesCount = Input.ofNullable(filesCount);
            return this;
        }

        public Builder setSourceUrl(@Nullable Input<String> sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }

        public Builder setSourceUrl(@Nullable String sourceUrl) {
            this.sourceUrl = Input.ofNullable(sourceUrl);
            return this;
        }
        public ZipInfoArgs build() {
            return new ZipInfoArgs(filesCount, sourceUrl);
        }
    }
}
