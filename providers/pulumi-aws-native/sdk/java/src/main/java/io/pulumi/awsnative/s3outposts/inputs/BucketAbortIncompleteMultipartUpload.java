// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3Outposts will wait before permanently removing all parts of the upload.
 * 
 */
public final class BucketAbortIncompleteMultipartUpload extends io.pulumi.resources.InvokeArgs {

    public static final BucketAbortIncompleteMultipartUpload Empty = new BucketAbortIncompleteMultipartUpload();

    /**
     * Specifies the number of days after which Amazon S3Outposts aborts an incomplete multipart upload.
     * 
     */
    @Import(name="daysAfterInitiation", required=true)
      private final Integer daysAfterInitiation;

    public Integer getDaysAfterInitiation() {
        return this.daysAfterInitiation;
    }

    public BucketAbortIncompleteMultipartUpload(Integer daysAfterInitiation) {
        this.daysAfterInitiation = Objects.requireNonNull(daysAfterInitiation, "expected parameter 'daysAfterInitiation' to be non-null");
    }

    private BucketAbortIncompleteMultipartUpload() {
        this.daysAfterInitiation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAbortIncompleteMultipartUpload defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer daysAfterInitiation;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAbortIncompleteMultipartUpload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysAfterInitiation = defaults.daysAfterInitiation;
        }

        public Builder daysAfterInitiation(Integer daysAfterInitiation) {
            this.daysAfterInitiation = Objects.requireNonNull(daysAfterInitiation);
            return this;
        }
        public BucketAbortIncompleteMultipartUpload build() {
            return new BucketAbortIncompleteMultipartUpload(daysAfterInitiation);
        }
    }
}
