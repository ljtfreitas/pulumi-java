// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The storage account details.
 * 
 */
public final class StorageAccountResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageAccountResponse Empty = new StorageAccountResponse();

    /**
     * The ID of the storage account resource. Media Services relies on tables and queues as well as blobs, so the primary storage account must be a Standard Storage account (either Microsoft.ClassicStorage or Microsoft.Storage). Blob only storage accounts can be added as secondary storage accounts.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The type of the storage account.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public StorageAccountResponse(
        @Nullable String id,
        String type) {
        this.id = id;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private StorageAccountResponse() {
        this.id = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public StorageAccountResponse build() {
            return new StorageAccountResponse(id, type);
        }
    }
}
