// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FileSystemBackupPolicy extends io.pulumi.resources.InvokeArgs {

    public static final FileSystemBackupPolicy Empty = new FileSystemBackupPolicy();

    @Import(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    public FileSystemBackupPolicy(String status) {
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private FileSystemBackupPolicy() {
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemBackupPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemBackupPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public FileSystemBackupPolicy build() {
            return new FileSystemBackupPolicy(status);
        }
    }
}
