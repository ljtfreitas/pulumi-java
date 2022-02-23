// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


public final class BucketPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketPolicyArgs Empty = new BucketPolicyArgs();

    /**
     * The Amazon Resource Name (ARN) of the specified bucket.
     * 
     */
    @InputImport(name="bucket", required=true)
        private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * A policy document containing permissions to add to the specified bucket.
     * 
     */
    @InputImport(name="policyDocument", required=true)
        private final Input<Object> policyDocument;

    public Input<Object> getPolicyDocument() {
        return this.policyDocument;
    }

    public BucketPolicyArgs(
        Input<String> bucket,
        Input<Object> policyDocument) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.policyDocument = Objects.requireNonNull(policyDocument, "expected parameter 'policyDocument' to be non-null");
    }

    private BucketPolicyArgs() {
        this.bucket = Input.empty();
        this.policyDocument = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private Input<Object> policyDocument;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.policyDocument = defaults.policyDocument;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setPolicyDocument(Input<Object> policyDocument) {
            this.policyDocument = Objects.requireNonNull(policyDocument);
            return this;
        }

        public Builder setPolicyDocument(Object policyDocument) {
            this.policyDocument = Input.of(Objects.requireNonNull(policyDocument));
            return this;
        }
        public BucketPolicyArgs build() {
            return new BucketPolicyArgs(bucket, policyDocument);
        }
    }
}
