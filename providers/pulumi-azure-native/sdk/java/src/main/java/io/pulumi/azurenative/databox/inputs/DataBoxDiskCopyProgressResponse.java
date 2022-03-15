// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * DataBox Disk Copy Progress
 * 
 */
public final class DataBoxDiskCopyProgressResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataBoxDiskCopyProgressResponse Empty = new DataBoxDiskCopyProgressResponse();

    /**
     * Bytes copied during the copy of disk.
     * 
     */
    @Import(name="bytesCopied", required=true)
      private final Double bytesCopied;

    public Double getBytesCopied() {
        return this.bytesCopied;
    }

    /**
     * Indicates the percentage completed for the copy of the disk.
     * 
     */
    @Import(name="percentComplete", required=true)
      private final Integer percentComplete;

    public Integer getPercentComplete() {
        return this.percentComplete;
    }

    /**
     * The serial number of the disk
     * 
     */
    @Import(name="serialNumber", required=true)
      private final String serialNumber;

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * The Status of the copy
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    public DataBoxDiskCopyProgressResponse(
        Double bytesCopied,
        Integer percentComplete,
        String serialNumber,
        String status) {
        this.bytesCopied = Objects.requireNonNull(bytesCopied, "expected parameter 'bytesCopied' to be non-null");
        this.percentComplete = Objects.requireNonNull(percentComplete, "expected parameter 'percentComplete' to be non-null");
        this.serialNumber = Objects.requireNonNull(serialNumber, "expected parameter 'serialNumber' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private DataBoxDiskCopyProgressResponse() {
        this.bytesCopied = null;
        this.percentComplete = null;
        this.serialNumber = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxDiskCopyProgressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double bytesCopied;
        private Integer percentComplete;
        private String serialNumber;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxDiskCopyProgressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytesCopied = defaults.bytesCopied;
    	      this.percentComplete = defaults.percentComplete;
    	      this.serialNumber = defaults.serialNumber;
    	      this.status = defaults.status;
        }

        public Builder bytesCopied(Double bytesCopied) {
            this.bytesCopied = Objects.requireNonNull(bytesCopied);
            return this;
        }

        public Builder percentComplete(Integer percentComplete) {
            this.percentComplete = Objects.requireNonNull(percentComplete);
            return this;
        }

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public DataBoxDiskCopyProgressResponse build() {
            return new DataBoxDiskCopyProgressResponse(bytesCopied, percentComplete, serialNumber, status);
        }
    }
}
