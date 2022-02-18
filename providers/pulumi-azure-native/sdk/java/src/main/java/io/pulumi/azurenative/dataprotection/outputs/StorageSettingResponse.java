// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageSettingResponse {
    /**
     * Gets or sets the type of the datastore.
     * 
     */
    private final @Nullable String datastoreType;
    /**
     * Gets or sets the type.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"datastoreType","type"})
    private StorageSettingResponse(
        @Nullable String datastoreType,
        @Nullable String type) {
        this.datastoreType = datastoreType;
        this.type = type;
    }

    /**
     * Gets or sets the type of the datastore.
     * 
     */
    public Optional<String> getDatastoreType() {
        return Optional.ofNullable(this.datastoreType);
    }
    /**
     * Gets or sets the type.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datastoreType;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreType = defaults.datastoreType;
    	      this.type = defaults.type;
        }

        public Builder setDatastoreType(@Nullable String datastoreType) {
            this.datastoreType = datastoreType;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public StorageSettingResponse build() {
            return new StorageSettingResponse(datastoreType, type);
        }
    }
}
