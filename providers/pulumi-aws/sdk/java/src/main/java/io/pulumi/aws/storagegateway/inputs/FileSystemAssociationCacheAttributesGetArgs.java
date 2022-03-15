// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileSystemAssociationCacheAttributesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemAssociationCacheAttributesGetArgs Empty = new FileSystemAssociationCacheAttributesGetArgs();

    /**
     * Refreshes a file share's cache by using Time To Live (TTL).
     * TTL is the length of time since the last refresh after which access to the directory would cause the file gateway
     * to first refresh that directory's contents from the Amazon S3 bucket. Valid Values: `0` or `300` to `2592000` seconds (5 minutes to 30 days). Defaults to `0`
     * 
     */
    @Import(name="cacheStaleTimeoutInSeconds")
      private final @Nullable Output<Integer> cacheStaleTimeoutInSeconds;

    public Output<Integer> getCacheStaleTimeoutInSeconds() {
        return this.cacheStaleTimeoutInSeconds == null ? Output.empty() : this.cacheStaleTimeoutInSeconds;
    }

    public FileSystemAssociationCacheAttributesGetArgs(@Nullable Output<Integer> cacheStaleTimeoutInSeconds) {
        this.cacheStaleTimeoutInSeconds = cacheStaleTimeoutInSeconds;
    }

    private FileSystemAssociationCacheAttributesGetArgs() {
        this.cacheStaleTimeoutInSeconds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemAssociationCacheAttributesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> cacheStaleTimeoutInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemAssociationCacheAttributesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheStaleTimeoutInSeconds = defaults.cacheStaleTimeoutInSeconds;
        }

        public Builder cacheStaleTimeoutInSeconds(@Nullable Output<Integer> cacheStaleTimeoutInSeconds) {
            this.cacheStaleTimeoutInSeconds = cacheStaleTimeoutInSeconds;
            return this;
        }

        public Builder cacheStaleTimeoutInSeconds(@Nullable Integer cacheStaleTimeoutInSeconds) {
            this.cacheStaleTimeoutInSeconds = Output.ofNullable(cacheStaleTimeoutInSeconds);
            return this;
        }
        public FileSystemAssociationCacheAttributesGetArgs build() {
            return new FileSystemAssociationCacheAttributesGetArgs(cacheStaleTimeoutInSeconds);
        }
    }
}
