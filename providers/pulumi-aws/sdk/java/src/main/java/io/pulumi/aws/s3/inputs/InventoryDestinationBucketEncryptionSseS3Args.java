// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import java.util.Objects;


public final class InventoryDestinationBucketEncryptionSseS3Args extends io.pulumi.resources.ResourceArgs {

    public static final InventoryDestinationBucketEncryptionSseS3Args Empty = new InventoryDestinationBucketEncryptionSseS3Args();

    public InventoryDestinationBucketEncryptionSseS3Args() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryDestinationBucketEncryptionSseS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryDestinationBucketEncryptionSseS3Args defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public InventoryDestinationBucketEncryptionSseS3Args build() {
            return new InventoryDestinationBucketEncryptionSseS3Args();
        }
    }
}
