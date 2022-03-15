// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * LocalCopy defines how a remote file should be copied to and from the VM.
 * 
 */
public final class LocalCopyResponse extends io.pulumi.resources.InvokeArgs {

    public static final LocalCopyResponse Empty = new LocalCopyResponse();

    /**
     * The name of the disk where this parameter is located. Can be the name of one of the disks specified in the Resources field, or "boot", which represents the Docker instance's boot disk and has a mount point of `/`.
     * 
     */
    @Import(name="disk", required=true)
      private final String disk;

    public String getDisk() {
        return this.disk;
    }

    /**
     * The path within the user's docker container where this input should be localized to and from, relative to the specified disk's mount point. For example: file.txt,
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    public LocalCopyResponse(
        String disk,
        String path) {
        this.disk = Objects.requireNonNull(disk, "expected parameter 'disk' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private LocalCopyResponse() {
        this.disk = null;
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalCopyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String disk;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalCopyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disk = defaults.disk;
    	      this.path = defaults.path;
        }

        public Builder disk(String disk) {
            this.disk = Objects.requireNonNull(disk);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public LocalCopyResponse build() {
            return new LocalCopyResponse(disk, path);
        }
    }
}
