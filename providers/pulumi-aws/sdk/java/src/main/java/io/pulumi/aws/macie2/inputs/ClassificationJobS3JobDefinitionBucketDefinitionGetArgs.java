// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ClassificationJobS3JobDefinitionBucketDefinitionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionBucketDefinitionGetArgs Empty = new ClassificationJobS3JobDefinitionBucketDefinitionGetArgs();

    /**
     * The unique identifier for the AWS account that owns the buckets.
     * 
     */
    @InputImport(name="accountId", required=true)
    private final Input<String> accountId;

    public Input<String> getAccountId() {
        return this.accountId;
    }

    /**
     * An array that lists the names of the buckets.
     * 
     */
    @InputImport(name="buckets", required=true)
    private final Input<List<String>> buckets;

    public Input<List<String>> getBuckets() {
        return this.buckets;
    }

    public ClassificationJobS3JobDefinitionBucketDefinitionGetArgs(
        Input<String> accountId,
        Input<List<String>> buckets) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.buckets = Objects.requireNonNull(buckets, "expected parameter 'buckets' to be non-null");
    }

    private ClassificationJobS3JobDefinitionBucketDefinitionGetArgs() {
        this.accountId = Input.empty();
        this.buckets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionBucketDefinitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountId;
        private Input<List<String>> buckets;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionBucketDefinitionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.buckets = defaults.buckets;
        }

        public Builder setAccountId(Input<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Input.of(Objects.requireNonNull(accountId));
            return this;
        }

        public Builder setBuckets(Input<List<String>> buckets) {
            this.buckets = Objects.requireNonNull(buckets);
            return this;
        }

        public Builder setBuckets(List<String> buckets) {
            this.buckets = Input.of(Objects.requireNonNull(buckets));
            return this;
        }
        public ClassificationJobS3JobDefinitionBucketDefinitionGetArgs build() {
            return new ClassificationJobS3JobDefinitionBucketDefinitionGetArgs(accountId, buckets);
        }
    }
}
