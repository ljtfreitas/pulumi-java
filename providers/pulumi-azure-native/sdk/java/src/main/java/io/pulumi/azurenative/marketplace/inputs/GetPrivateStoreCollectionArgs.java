// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateStoreCollectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateStoreCollectionArgs Empty = new GetPrivateStoreCollectionArgs();

    /**
     * The collection ID
     * 
     */
    @Import(name="collectionId", required=true)
      private final String collectionId;

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * The store ID - must use the tenant ID
     * 
     */
    @Import(name="privateStoreId", required=true)
      private final String privateStoreId;

    public String getPrivateStoreId() {
        return this.privateStoreId;
    }

    public GetPrivateStoreCollectionArgs(
        String collectionId,
        String privateStoreId) {
        this.collectionId = Objects.requireNonNull(collectionId, "expected parameter 'collectionId' to be non-null");
        this.privateStoreId = Objects.requireNonNull(privateStoreId, "expected parameter 'privateStoreId' to be non-null");
    }

    private GetPrivateStoreCollectionArgs() {
        this.collectionId = null;
        this.privateStoreId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateStoreCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String collectionId;
        private String privateStoreId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateStoreCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionId = defaults.collectionId;
    	      this.privateStoreId = defaults.privateStoreId;
        }

        public Builder collectionId(String collectionId) {
            this.collectionId = Objects.requireNonNull(collectionId);
            return this;
        }

        public Builder privateStoreId(String privateStoreId) {
            this.privateStoreId = Objects.requireNonNull(privateStoreId);
            return this;
        }
        public GetPrivateStoreCollectionArgs build() {
            return new GetPrivateStoreCollectionArgs(collectionId, privateStoreId);
        }
    }
}
