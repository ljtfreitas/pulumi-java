// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FileSourceInfoResponse {
    /**
     * File share ID.
     * 
     */
    private final String shareId;

    @OutputCustomType.Constructor({"shareId"})
    private FileSourceInfoResponse(String shareId) {
        this.shareId = Objects.requireNonNull(shareId);
    }

    /**
     * File share ID.
     * 
     */
    public String getShareId() {
        return this.shareId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSourceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String shareId;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSourceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shareId = defaults.shareId;
        }

        public Builder setShareId(String shareId) {
            this.shareId = Objects.requireNonNull(shareId);
            return this;
        }

        public FileSourceInfoResponse build() {
            return new FileSourceInfoResponse(shareId);
        }
    }
}
