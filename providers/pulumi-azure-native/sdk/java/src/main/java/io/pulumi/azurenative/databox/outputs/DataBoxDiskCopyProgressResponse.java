// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataBoxDiskCopyProgressResponse {
    /**
     * Bytes copied during the copy of disk.
     * 
     */
    private final Double bytesCopied;
    /**
     * Indicates the percentage completed for the copy of the disk.
     * 
     */
    private final Integer percentComplete;
    /**
     * The serial number of the disk
     * 
     */
    private final String serialNumber;
    /**
     * The Status of the copy
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"bytesCopied","percentComplete","serialNumber","status"})
    private DataBoxDiskCopyProgressResponse(
        Double bytesCopied,
        Integer percentComplete,
        String serialNumber,
        String status) {
        this.bytesCopied = Objects.requireNonNull(bytesCopied);
        this.percentComplete = Objects.requireNonNull(percentComplete);
        this.serialNumber = Objects.requireNonNull(serialNumber);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * Bytes copied during the copy of disk.
     * 
     */
    public Double getBytesCopied() {
        return this.bytesCopied;
    }
    /**
     * Indicates the percentage completed for the copy of the disk.
     * 
     */
    public Integer getPercentComplete() {
        return this.percentComplete;
    }
    /**
     * The serial number of the disk
     * 
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * The Status of the copy
     * 
     */
    public String getStatus() {
        return this.status;
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

        public Builder setBytesCopied(Double bytesCopied) {
            this.bytesCopied = Objects.requireNonNull(bytesCopied);
            return this;
        }

        public Builder setPercentComplete(Integer percentComplete) {
            this.percentComplete = Objects.requireNonNull(percentComplete);
            return this;
        }

        public Builder setSerialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public DataBoxDiskCopyProgressResponse build() {
            return new DataBoxDiskCopyProgressResponse(bytesCopied, percentComplete, serialNumber, status);
        }
    }
}
