// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StorageAccountPropertiesResponse {
    /**
     * The resource ID of the storage account.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private StorageAccountPropertiesResponse(@CustomType.Parameter("id") String id) {
        this.id = id;
    }

    /**
     * The resource ID of the storage account.
     * 
    */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public StorageAccountPropertiesResponse build() {
            return new StorageAccountPropertiesResponse(id);
        }
    }
}
