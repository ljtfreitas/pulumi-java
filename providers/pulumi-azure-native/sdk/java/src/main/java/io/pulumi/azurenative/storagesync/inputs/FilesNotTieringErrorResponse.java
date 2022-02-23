// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


/**
 * Files not tiering error object
 * 
 */
public final class FilesNotTieringErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final FilesNotTieringErrorResponse Empty = new FilesNotTieringErrorResponse();

    /**
     * Error code (HResult)
     * 
     */
    @InputImport(name="errorCode", required=true)
        private final Integer errorCode;

    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * Count of files with this error
     * 
     */
    @InputImport(name="fileCount", required=true)
        private final Double fileCount;

    public Double getFileCount() {
        return this.fileCount;
    }

    public FilesNotTieringErrorResponse(
        Integer errorCode,
        Double fileCount) {
        this.errorCode = Objects.requireNonNull(errorCode, "expected parameter 'errorCode' to be non-null");
        this.fileCount = Objects.requireNonNull(fileCount, "expected parameter 'fileCount' to be non-null");
    }

    private FilesNotTieringErrorResponse() {
        this.errorCode = null;
        this.fileCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilesNotTieringErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer errorCode;
        private Double fileCount;

        public Builder() {
    	      // Empty
        }

        public Builder(FilesNotTieringErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.fileCount = defaults.fileCount;
        }

        public Builder setErrorCode(Integer errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder setFileCount(Double fileCount) {
            this.fileCount = Objects.requireNonNull(fileCount);
            return this;
        }
        public FilesNotTieringErrorResponse build() {
            return new FilesNotTieringErrorResponse(errorCode, fileCount);
        }
    }
}
